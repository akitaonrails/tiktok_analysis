package com.bytedance.android.live.dynamicstrategy.strategy;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class CommonRuleStrategy extends Strategy {

    @C09CT("rules")
    public List<Rule> rules = new ArrayList();

    @C09CT("scores")
    public List<WeightRuleStrategy.Score> scores = new ArrayList();

    public static final class Rule {

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

        @C09CT("score")
        public int score;

        @C09CT("weight")
        public float weight;

        public Rule() {
            this("", 0.0f, 0, 0, 0, "", C2097608Jq.LJ());
        }

        public Rule(String str, float f, int i, int i2, int i3, String str2, Map<String, String> map) {
            this.expression = str;
            this.weight = f;
            this.score = i;
            this.rule_id = i2;
            this.order = i3;
            this.result_value = str2;
            this.result_dict = map;
        }
    }
}
