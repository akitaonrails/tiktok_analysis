package com.bytedance.android.live.dynamicstrategy.strategy;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class WeightRuleStrategy extends Strategy {

    @C09CT("rules")
    public List<WeightRule> rules = new ArrayList();

    @C09CT("scores")
    public List<Score> scores = new ArrayList();

    public static final class Score {

        @C09CT("range_floor")
        public int range_floor;

        @C09CT("result")
        public String result;

        public Score() {
            this(50, "");
        }

        public Score(int i, String str) {
            this.range_floor = i;
            this.result = str;
        }
    }

    public static final class WeightRule {

        @C09CT("expression")
        public String expression;

        @C09CT("score")
        public int score;

        @C09CT("weight")
        public float weight;

        public WeightRule() {
            this("", 0.0f, 0);
        }

        public WeightRule(String str, float f, int i) {
            this.expression = str;
            this.weight = f;
            this.score = i;
        }
    }
}
