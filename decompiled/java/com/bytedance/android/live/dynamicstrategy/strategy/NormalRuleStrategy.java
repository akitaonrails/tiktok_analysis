package com.bytedance.android.live.dynamicstrategy.strategy;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalRuleStrategy extends Strategy {

    @C09CT("rules")
    public List<CommonRule> rules = new ArrayList();

    public static final class CommonRule {

        @C09CT("expression")
        public String expression;

        @C09CT("order")
        public int order;

        @C09CT("result_dict")
        public Map<String, String> result_dict;

        @C09CT("result_value")
        public String result_value;

        @C09CT("rule_id")
        public int rule_id;

        public CommonRule() {
            this(0, "", 0, "", C2097608Jq.LJ());
        }

        public final String toString() {
            return String.valueOf(this.expression);
        }

        public CommonRule(int i, String str, int i2, String str2, Map<String, String> map) {
            this.rule_id = i;
            this.expression = str;
            this.order = i2;
            this.result_value = str2;
            this.result_dict = map;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.name);
        sbLIZ.append(" decision_key:");
        sbLIZ.append(this.decisionKey);
        sbLIZ.append(" rules:");
        sbLIZ.append(this.rules);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
