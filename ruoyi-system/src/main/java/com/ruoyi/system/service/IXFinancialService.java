package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.XFinancial;

/**
 * 收入支出Service接口
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
public interface IXFinancialService 
{
    /**
     * 查询收入支出
     * 
     * @param id 收入支出主键
     * @return 收入支出
     */
    public XFinancial selectXFinancialById(Long id);

    /**
     * 查询收入支出列表
     * 
     * @param xFinancial 收入支出
     * @return 收入支出集合
     */
    public List<XFinancial> selectXFinancialList(XFinancial xFinancial);

    /**
     * 新增收入支出
     * 
     * @param xFinancial 收入支出
     * @return 结果
     */
    public int insertXFinancial(XFinancial xFinancial);

    /**
     * 修改收入支出
     * 
     * @param xFinancial 收入支出
     * @return 结果
     */
    public int updateXFinancial(XFinancial xFinancial);

    /**
     * 批量删除收入支出
     * 
     * @param ids 需要删除的收入支出主键集合
     * @return 结果
     */
    public int deleteXFinancialByIds(String ids);

    /**
     * 删除收入支出信息
     * 
     * @param id 收入支出主键
     * @return 结果
     */
    public int deleteXFinancialById(Long id);
}
