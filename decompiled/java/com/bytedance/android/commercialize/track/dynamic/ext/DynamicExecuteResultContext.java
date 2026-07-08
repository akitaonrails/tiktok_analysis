package com.bytedance.android.commercialize.track.dynamic.ext;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class DynamicExecuteResultContext {

    @C09CT("total_time_cost")
    public final Double elapsedDuration;

    @C09CT("param_execute_result")
    public final Map<String, ParamExecuteResultContext> executeResults;

    @C09CT("match_rule")
    public final String matchRule;

    public DynamicExecuteResultContext(String str, Double d, Map<String, ParamExecuteResultContext> map) {
        this.matchRule = str;
        this.elapsedDuration = d;
        this.executeResults = map;
    }
}
