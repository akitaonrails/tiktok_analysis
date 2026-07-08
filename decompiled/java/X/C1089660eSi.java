package X;

import Y.AComparatorS36S0000000_17;
import com.bytedance.android.live.dynamicstrategy.strategy.CommonRuleStrategy;
import com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy;
import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089660eSi {
    public static final Map<String, Strategy> LIZ = new LinkedHashMap();
    public static final List<InterfaceC1089800eSw> LIZIZ;
    public static final List<InterfaceC1089670eSj> LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        LIZJ = arrayList2;
        final C1089720eSo c1089720eSo = new C1089720eSo();
        arrayList.add(new InterfaceC1089800eSw(c1089720eSo) { // from class: X.0eT6
            public final InterfaceC1089790eSv LIZ;

            {
                this.LIZ = c1089720eSo;
            }

            public final Strategy LIZIZ(String str) {
                CommonRuleStrategy commonRuleStrategy;
                NormalRuleStrategy normalRuleStrategy = null;
                try {
                    commonRuleStrategy = (CommonRuleStrategy) C19748512Ol.LIZIZ.LJII(str, CommonRuleStrategy.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1089790eSv interfaceC1089790eSv = this.LIZ;
                    if (interfaceC1089790eSv != null) {
                        e.toString();
                        interfaceC1089790eSv.LIZIZ();
                    }
                }
                if (commonRuleStrategy == null || commonRuleStrategy.name.length() == 0 || commonRuleStrategy.type.length() == 0) {
                    commonRuleStrategy = null;
                }
                if ((commonRuleStrategy instanceof CommonRuleStrategy) && commonRuleStrategy != null) {
                    String str2 = commonRuleStrategy.type;
                    if (Intrinsics.LJFF(str2, "weight")) {
                        WeightRuleStrategy weightRuleStrategy = new WeightRuleStrategy();
                        weightRuleStrategy.name = commonRuleStrategy.name;
                        weightRuleStrategy.type = commonRuleStrategy.type;
                        weightRuleStrategy.relativeFactors = commonRuleStrategy.relativeFactors;
                        weightRuleStrategy.defaultValue = commonRuleStrategy.defaultValue;
                        weightRuleStrategy.version = commonRuleStrategy.version;
                        weightRuleStrategy.decisionKey = commonRuleStrategy.decisionKey;
                        List<CommonRuleStrategy.Rule> list = commonRuleStrategy.rules;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (CommonRuleStrategy.Rule rule : list) {
                            arrayList3.add(new WeightRuleStrategy.WeightRule(rule.expression, rule.weight, rule.score));
                        }
                        weightRuleStrategy.rules = new ArrayList(arrayList3);
                        weightRuleStrategy.scores = commonRuleStrategy.scores;
                        return weightRuleStrategy;
                    }
                    if (Intrinsics.LJFF(str2, "rule")) {
                        normalRuleStrategy = new NormalRuleStrategy();
                        normalRuleStrategy.name = commonRuleStrategy.name;
                        normalRuleStrategy.type = commonRuleStrategy.type;
                        normalRuleStrategy.relativeFactors = commonRuleStrategy.relativeFactors;
                        normalRuleStrategy.conditionFactors = commonRuleStrategy.conditionFactors;
                        normalRuleStrategy.defaultValue = commonRuleStrategy.defaultValue;
                        normalRuleStrategy.version = commonRuleStrategy.version;
                        normalRuleStrategy.decisionKey = commonRuleStrategy.decisionKey;
                        List<CommonRuleStrategy.Rule> list2 = commonRuleStrategy.rules;
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (CommonRuleStrategy.Rule rule2 : list2) {
                            arrayList4.add(new NormalRuleStrategy.CommonRule(rule2.rule_id, rule2.expression, rule2.order, rule2.result_value, rule2.result_dict));
                        }
                        normalRuleStrategy.rules = new ArrayList(arrayList4);
                    }
                }
                return normalRuleStrategy;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[PHI: r1
              0x0055: PHI (r1v5 com.bytedance.android.live.dynamicstrategy.strategy.Strategy) = 
              (r1v4 com.bytedance.android.live.dynamicstrategy.strategy.Strategy)
              (r1v9 com.bytedance.android.live.dynamicstrategy.strategy.Strategy)
             binds: [B:12:0x0026, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE], RETURN] */
            @Override // X.InterfaceC1089800eSw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.bytedance.android.live.dynamicstrategy.strategy.Strategy LIZ(java.lang.String r4, java.lang.String r5) {
                /*
                    r3 = this;
                    r2 = 0
                    boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L66
                    if (r0 == 0) goto Lc
                    com.bytedance.android.live.dynamicstrategy.strategy.Strategy r0 = r3.LIZIZ(r4)     // Catch: java.lang.Exception -> L66
                    return r0
                Lc:
                    java.lang.String r0 = "weight"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Exception -> L66
                    if (r0 == 0) goto L38
                    com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Exception -> L29
                    java.lang.Class<com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy> r0 = com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy.class
                    java.lang.Object r1 = r1.LJII(r4, r0)     // Catch: java.lang.Exception -> L29
                    com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy r1 = (com.bytedance.android.live.dynamicstrategy.strategy.WeightRuleStrategy) r1     // Catch: java.lang.Exception -> L29
                    if (r1 == 0) goto L65
                    java.lang.String r0 = r1.name     // Catch: java.lang.Exception -> L66
                    int r0 = r0.length()     // Catch: java.lang.Exception -> L66
                    if (r0 != 0) goto L55
                    return r2
                L29:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Exception -> L66
                    X.0eSv r0 = r3.LIZ     // Catch: java.lang.Exception -> L66
                    if (r0 == 0) goto L65
                    r1.toString()     // Catch: java.lang.Exception -> L66
                    r0.LIZIZ()     // Catch: java.lang.Exception -> L66
                    return r2
                L38:
                    java.lang.String r0 = "rule"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Exception -> L66
                    if (r0 == 0) goto L65
                    com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Exception -> L56
                    java.lang.Class<com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy> r0 = com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy.class
                    java.lang.Object r1 = r1.LJII(r4, r0)     // Catch: java.lang.Exception -> L56
                    com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy r1 = (com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy) r1     // Catch: java.lang.Exception -> L56
                    if (r1 == 0) goto L65
                    java.lang.String r0 = r1.name     // Catch: java.lang.Exception -> L66
                    int r0 = r0.length()     // Catch: java.lang.Exception -> L66
                    if (r0 != 0) goto L55
                    return r2
                L55:
                    return r1
                L56:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Exception -> L66
                    X.0eSv r0 = r3.LIZ     // Catch: java.lang.Exception -> L66
                    if (r0 == 0) goto L65
                    r1.toString()     // Catch: java.lang.Exception -> L66
                    r0.LIZIZ()     // Catch: java.lang.Exception -> L66
                    return r2
                L65:
                    return r2
                L66:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "parse strategy error, strategyStr = "
                    r1.append(r0)
                    r1.append(r4)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C0J6C.LIZ(r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1089900eT6.LIZ(java.lang.String, java.lang.String):com.bytedance.android.live.dynamicstrategy.strategy.Strategy");
            }
        });
        arrayList2.add(new InterfaceC1089670eSj() { // from class: X.0eT8
            @Override // X.InterfaceC1089670eSj
            public final boolean LIZIZ(Strategy strategy) {
                return strategy instanceof WeightRuleStrategy;
            }

            @Override // X.InterfaceC1089670eSj
            public final C1089610eSd LIZ(Strategy strategy, Map map) {
                final boolean z;
                WeightRuleStrategy.Score next;
                final String str;
                final boolean z2 = true;
                if (!(strategy instanceof WeightRuleStrategy)) {
                    final String str2 = strategy.defaultValue;
                    return new C1089610eSd(str2, z2) { // from class: X.0eTB
                    };
                }
                ArrayList arrayList3 = new ArrayList();
                WeightRuleStrategy weightRuleStrategy = (WeightRuleStrategy) strategy;
                float f = 0.0f;
                float f2 = 0.0f;
                for (WeightRuleStrategy.WeightRule weightRule : weightRuleStrategy.rules) {
                    if (Intrinsics.LJFF(C1089930eT9.LIZ(strategy.decisionKey, weightRule.expression, map), Boolean.TRUE)) {
                        float f3 = weightRule.score;
                        float f4 = weightRule.weight;
                        f2 += f3 * f4;
                        f += f4;
                        arrayList3.add(weightRule);
                    }
                }
                if (!arrayList3.isEmpty() && f > 0.0f) {
                    float f5 = f2 / f;
                    Iterator<WeightRuleStrategy.Score> it2 = weightRuleStrategy.scores.iterator();
                    while (true) {
                        z = false;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (f5 >= next.range_floor) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    WeightRuleStrategy.Score score = next;
                    if (score != null && (str = score.result) != null) {
                        return new C1089610eSd(str, z) { // from class: X.0eTB
                        };
                    }
                    final String str3 = strategy.defaultValue;
                    return new C1089610eSd(str3, z2) { // from class: X.0eTB
                    };
                }
                final String str4 = strategy.defaultValue;
                return new C1089610eSd(str4, z2) { // from class: X.0eTB
                };
            }
        });
        arrayList2.add(new InterfaceC1089670eSj() { // from class: X.0eT7
            public static void LIZLLL(String str) {
                if (str != null) {
                    C0J6C.LIZ(str);
                }
            }

            @Override // X.InterfaceC1089670eSj
            public final boolean LIZIZ(Strategy strategy) {
                return strategy instanceof NormalRuleStrategy;
            }

            @Override // X.InterfaceC1089670eSj
            public final C1089610eSd LIZ(Strategy strategy, Map<String, ? extends Object> map) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("key: ");
                    sbLIZ.append((String) entry.getKey());
                    sbLIZ.append("  value: ");
                    sbLIZ.append(entry.getValue());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("execute strategy strategy is ");
                sbLIZ2.append(strategy.decisionKey);
                sbLIZ2.append(" features = ");
                sbLIZ2.append((Object) sb);
                C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (!(strategy instanceof NormalRuleStrategy)) {
                    return new C1089610eSd(strategy.defaultValue, true);
                }
                NormalRuleStrategy normalRuleStrategy = (NormalRuleStrategy) strategy;
                C13LP.LJLLLL(new AComparatorS36S0000000_17(16), normalRuleStrategy.rules);
                for (NormalRuleStrategy.CommonRule commonRule : normalRuleStrategy.rules) {
                    float f = strategy.version;
                    if (f != 1.0f && f != 0.0f) {
                        if (f != 2.0f) {
                            continue;
                        } else {
                            int i = strategy.resultType;
                            if (i == 0) {
                                if (LIZJ(strategy.decisionKey, commonRule, map)) {
                                    return new C1089940eTA(commonRule.result_value);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strategy.decisionKey);
                                sbLIZ3.append("rule miss, default value is ");
                                sbLIZ3.append(strategy.defaultValue);
                                LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
                            } else if (i == 1) {
                                if (LIZJ(strategy.decisionKey, commonRule, map)) {
                                    return new C1089940eTA(commonRule.result_value, commonRule.result_dict, false);
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(strategy.decisionKey);
                                sbLIZ4.append("rule miss, default value is ");
                                sbLIZ4.append(strategy.defaultValue);
                                LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
                            } else if (i == 2) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                if (LIZJ(strategy.decisionKey, commonRule, map)) {
                                    linkedHashMap.putAll(commonRule.result_dict);
                                }
                                if (!linkedHashMap.isEmpty()) {
                                    return new C1089940eTA(strategy.defaultValue, linkedHashMap, true);
                                }
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(strategy.decisionKey);
                                sbLIZ5.append(" rule miss, default value is ");
                                sbLIZ5.append(strategy.defaultValue);
                                LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                            } else {
                                continue;
                            }
                        }
                    } else {
                        if (LIZJ(strategy.decisionKey, commonRule, map)) {
                            return new C1089940eTA(commonRule.result_value);
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(strategy.decisionKey);
                        sbLIZ6.append(" rule miss, default value is ");
                        sbLIZ6.append(strategy.defaultValue);
                        LIZLLL(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strategy.decisionKey);
                sbLIZ7.append(" rule miss, default value is ");
                sbLIZ7.append(strategy.defaultValue);
                LIZLLL(C2188811AlT.LIZIZ(sbLIZ7));
                return new C1089940eTA(strategy.defaultValue, strategy.defaultResultDict, true);
            }

            public static boolean LIZJ(String str, NormalRuleStrategy.CommonRule commonRule, Map map) {
                return Intrinsics.LJFF(C1089930eT9.LIZ(str, commonRule.expression, map), Boolean.TRUE);
            }
        });
        arrayList2.add(new InterfaceC1089670eSj() { // from class: X.0eSh
            @Override // X.InterfaceC1089670eSj
            public final boolean LIZIZ(Strategy strategy) {
                return strategy instanceof C1089770eSt;
            }

            @Override // X.InterfaceC1089670eSj
            public final C1089610eSd LIZ(Strategy strategy, Map<String, ? extends Object> map) {
                return new C1280304zh(map);
            }
        });
    }

    public static final Strategy LIZIZ(String str, String str2) {
        Strategy strategy = (Strategy) ((LinkedHashMap) LIZ).get(str);
        if (strategy != null) {
            return strategy;
        }
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            Strategy strategyLIZ = ((InterfaceC1089800eSw) it2.next()).LIZ(str, str2);
            if (strategyLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse strategy success, strategy is = ");
                sbLIZ.append(strategyLIZ.decisionKey);
                C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                LIZ.put(str, strategyLIZ);
                return strategyLIZ;
            }
        }
        return null;
    }

    public static final C1089610eSd LIZ(Strategy strategy, Map<String, Object> map, String str) {
        boolean z;
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                map.put("trigger_feature", "notrigger");
            } else {
                map.put("trigger_feature", str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute strategy error, strategy = ");
            sbLIZ.append(strategy);
            sbLIZ.append(", error = ");
            sbLIZ.append(e);
            C0J6C.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (InterfaceC1089670eSj interfaceC1089670eSj : (ArrayList) LIZJ) {
            if (interfaceC1089670eSj.LIZIZ(strategy)) {
                return interfaceC1089670eSj.LIZ(strategy, map);
            }
            return new C1089610eSd(strategy.defaultValue, strategy.defaultResultDict, true);
        }
        return new C1089610eSd(strategy.defaultValue, strategy.defaultResultDict, true);
    }
}
