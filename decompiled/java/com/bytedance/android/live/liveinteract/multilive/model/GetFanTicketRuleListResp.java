package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFanTicketRuleListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class FanTicketRuleInfo {

        @C09CT("rule_type")
        public long ruleType;

        @C09CT("rule_weight")
        public long ruleWeight;

        @C09CT("rule_weight_max_value")
        public long ruleWeightMaxValue;
    }

    public static final class ResponseData {

        @C09CT("fan_ticket_rule_infos")
        public List<FanTicketRuleInfo> fanTicketRuleInfos = new ArrayList();

        @C09CT("rule_append_text")
        public String ruleAppendText = "";
    }
}
