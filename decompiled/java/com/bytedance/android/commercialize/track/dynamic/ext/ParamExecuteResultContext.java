package com.bytedance.android.commercialize.track.dynamic.ext;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ParamExecuteResultContext {

    @C09CT("data_hierarchy_time")
    public final Double dataHierarchyTime;

    @C09CT("dynamic_value")
    public final Object dynamicValue;

    @C09CT("total_time_cost")
    public final Double elapsedDuration;

    @C09CT("err_msg")
    public final String errMsg;

    @C09CT("execute_result")
    public final String executeResult;

    @C09CT("get_data_time")
    public final Double getDataTime;

    public ParamExecuteResultContext(String str, Object obj, Double d, Double d2, Double d3, String str2) {
        this.executeResult = str;
        this.dynamicValue = obj;
        this.elapsedDuration = d;
        this.getDataTime = d2;
        this.dataHierarchyTime = d3;
        this.errMsg = str2;
    }
}
