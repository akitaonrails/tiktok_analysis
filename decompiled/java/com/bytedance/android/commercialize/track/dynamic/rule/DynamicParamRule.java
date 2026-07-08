package com.bytedance.android.commercialize.track.dynamic.rule;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class DynamicParamRule {

    @C09CT("dynamic_params")
    public final List<EventDynamicParamRule> eventDynamicParamRules;

    @C09CT("match_rule")
    public final String matchRule;

    public DynamicParamRule(String str, List<EventDynamicParamRule> list) {
        this.matchRule = str;
        this.eventDynamicParamRules = list;
    }
}
