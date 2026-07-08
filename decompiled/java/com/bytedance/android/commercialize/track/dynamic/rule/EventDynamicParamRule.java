package com.bytedance.android.commercialize.track.dynamic.rule;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class EventDynamicParamRule {

    @C09CT("analytic_data_source")
    public final Boolean analyticDataSource;

    @C09CT("attribute_hierarchy")
    public final String attributeHierarchy;

    @C09CT("biz_param_key")
    public final String bizParamKey;

    @C09CT("biz_scene")
    public final String bizScene;

    @C09CT("data_source")
    public final String dataSource;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_type")
    public final String paramType;

    public EventDynamicParamRule(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.paramName = str;
        this.paramType = str2;
        this.bizScene = str3;
        this.bizParamKey = str4;
        this.analyticDataSource = bool;
        this.dataSource = str5;
        this.attributeHierarchy = str6;
    }
}
