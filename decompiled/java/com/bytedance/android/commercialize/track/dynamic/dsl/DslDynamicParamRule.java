package com.bytedance.android.commercialize.track.dynamic.dsl;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class DslDynamicParamRule {

    @C09CT("add_rule")
    public final Map<String, Object> addRule;

    @C09CT("dynamic_params")
    public final List<DslEventDynamicParamRule> dynamicParams;

    @C09CT("match_rule")
    public final String matchRule;

    public DslDynamicParamRule(String str, Map<String, ? extends Object> map, List<DslEventDynamicParamRule> list) {
        this.matchRule = str;
        this.addRule = map;
        this.dynamicParams = list;
    }
}
