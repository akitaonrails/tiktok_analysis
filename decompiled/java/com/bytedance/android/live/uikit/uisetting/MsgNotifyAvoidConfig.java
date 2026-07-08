package com.bytedance.android.live.uikit.uisetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyAvoidConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new MsgNotifyAvoidConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("component_rule_list")
    public List<MsgNotifyComponentAvoidRule> componentRuleList;

    @C09CT("component_rule_list_v2")
    public List<MsgNotifyComponentAvoidRuleV2> componentRuleListV2;

    public MsgNotifyAvoidConfig() {
        this(null, null);
    }

    public final List<MsgNotifyComponentAvoidRule> getComponentRuleList() {
        return this.componentRuleList;
    }

    public final List<MsgNotifyComponentAvoidRuleV2> getComponentRuleListV2() {
        return this.componentRuleListV2;
    }

    public final void setComponentRuleList(List<MsgNotifyComponentAvoidRule> list) {
        this.componentRuleList = list;
    }

    public final void setComponentRuleListV2(List<MsgNotifyComponentAvoidRuleV2> list) {
        this.componentRuleListV2 = list;
    }

    public MsgNotifyAvoidConfig(List<MsgNotifyComponentAvoidRule> list, List<MsgNotifyComponentAvoidRuleV2> list2) {
        this.componentRuleList = list;
        this.componentRuleListV2 = list2;
    }
}
