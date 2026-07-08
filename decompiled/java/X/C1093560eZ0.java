package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.room.BizStrategy;

/* JADX INFO: renamed from: X.0eZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093560eZ0 {
    public static AbstractC1093440eYo LIZ(final C0VMZ c0vmz, final C0VMV c0vmv) {
        Integer numValueOf;
        C0VMQ c0vmq = c0vmz.LIZLLL;
        if (c0vmq != null) {
            numValueOf = Integer.valueOf(c0vmq.LIZJ);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        if (numValueOf.intValue() == 2) {
            return new C1093540eYy(c0vmz, c0vmv);
        }
        if (numValueOf.intValue() == 1) {
            return new AbstractC1093440eYo(c0vmz, c0vmv) { // from class: X.0eYx
                public final C0VMV LJ;

                @Override // X.AbstractC1093440eYo
                public final void LJFF() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", scene=");
                    C796430VMb c796430VMb = this.LIZ.LIZJ;
                    sbLIZ.append(c796430VMb != null ? c796430VMb.LIZIZ : null);
                    sbLIZ.append(", strategyKey=");
                    C796430VMb c796430VMb2 = this.LIZ.LIZJ;
                    sbLIZ.append(c796430VMb2 != null ? c796430VMb2.LIZJ : null);
                    C227400uG.LIZ("CelStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1092770eXj interfaceC1092770eXjLIZ = this.LJ.LIZ(this.LIZIZ);
                    if (interfaceC1092770eXjLIZ != null) {
                        interfaceC1092770eXjLIZ.LIZ();
                    }
                    BizStrategy bizStrategy = this.LIZ.LIZIZ;
                    if (bizStrategy != null) {
                        LIZLLL(bizStrategy.action);
                        C1093270eYX.LIZIZ(this, bizStrategy.triggerEvent, bizStrategy.tickerEventName, Long.valueOf((long) bizStrategy.tickerInterval));
                    }
                }

                @Override // X.AbstractC1093440eYo
                public final void LJI() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stop strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", scene=");
                    C796430VMb c796430VMb = this.LIZ.LIZJ;
                    sbLIZ.append(c796430VMb != null ? c796430VMb.LIZIZ : null);
                    C227400uG.LIZ("CelStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1093440eYo
                public final void LIZIZ(C473440IhS c473440IhS) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("emitEvent strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", event=");
                    sbLIZ.append(c473440IhS.LJ);
                    C227400uG.LIZ("CelStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                    super.LIZIZ(c473440IhS);
                    LIZJ(this.LIZ.LIZJ, c473440IhS);
                }

                {
                    this.LJ = c0vmv;
                }

                @Override // X.AbstractC1093440eYo
                public final void LIZJ(C796430VMb c796430VMb, C473440IhS c473440IhS) {
                    String str;
                    String str2;
                    String strName;
                    C1093150eYL c1093150eYL;
                    Map<String, Object> linkedHashMap;
                    TTMOutput.ReturnType type;
                    Object data;
                    String msg;
                    EnumC1093260eYW enumC1093260eYW;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("execute strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", scene=");
                    sbLIZ.append(c796430VMb.LIZIZ);
                    sbLIZ.append(", event=");
                    String str3 = null;
                    if (c473440IhS != null) {
                        str = c473440IhS.LJ;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    C227400uG.LIZ("CelStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                    HashMap map = new HashMap(c796430VMb.LJFF);
                    C0VMQ c0vmq2 = this.LIZ.LIZLLL;
                    if (c0vmq2 != null) {
                        str2 = c0vmq2.LIZ;
                    } else {
                        str2 = null;
                    }
                    map.put("strategy_name", str2);
                    map.put(Scene.SCENE_SERVICE, c796430VMb.LIZIZ);
                    if (c473440IhS != null && (enumC1093260eYW = c473440IhS.LIZIZ) != null) {
                        strName = enumC1093260eYW.name();
                    } else {
                        strName = null;
                    }
                    map.put("event_source", strName);
                    C0VMQ c0vmq3 = this.LIZ.LIZLLL;
                    if (c0vmq3 != null) {
                        if (c473440IhS != null) {
                            linkedHashMap = c473440IhS.LIZ();
                        } else {
                            linkedHashMap = new LinkedHashMap<>();
                        }
                        try {
                            if (c0vmq3.LIZLLL.length() == 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("empty ttm content for package=");
                                sbLIZ2.append(c0vmq3.LIZ);
                                c1093150eYL = new C1093150eYL(false, null, C2188811AlT.LIZIZ(sbLIZ2), null, 10);
                            } else {
                                byte[] bArrProcessTTMRuleByteCode = TTMStrategyCenter.getInstance().processTTMRuleByteCode(c0vmq3.LIZLLL, TTMStrategyCenter.getInstance().getTTMStrategyCenterExtendFuncAddress());
                                if (bArrProcessTTMRuleByteCode.length == 0) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("decoded ttm bytecode is empty for package=");
                                    sbLIZ3.append(c0vmq3.LIZ);
                                    c1093150eYL = new C1093150eYL(false, null, C2188811AlT.LIZIZ(sbLIZ3), null, 10);
                                } else {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : map.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        Object value = entry.getValue();
                                        if (str4.length() != 0 && value != null) {
                                            if (!(value instanceof List) && !(value instanceof Map) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof String) && (value instanceof Number)) {
                                                value = Integer.valueOf(((Number) value).intValue());
                                            }
                                            linkedHashMap2.put(str4, value);
                                        }
                                    }
                                    for (Map.Entry<String, Object> entry2 : linkedHashMap.entrySet()) {
                                        String key = entry2.getKey();
                                        Object value2 = entry2.getValue();
                                        if (key.length() != 0 && value2 != null) {
                                            if (!(value2 instanceof List) && !(value2 instanceof Map) && !(value2 instanceof Integer) && !(value2 instanceof Float) && !(value2 instanceof String) && (value2 instanceof Number)) {
                                                value2 = Integer.valueOf(((Number) value2).intValue());
                                            }
                                            linkedHashMap2.put(key, value2);
                                        }
                                    }
                                    TTMInput tTMInput = new TTMInput();
                                    tTMInput.machineCodeByte = bArrProcessTTMRuleByteCode;
                                    tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
                                    tTMInput.paramData = new TTMParamData((Map<String, Object>) linkedHashMap2);
                                    TTMOutput tTMOutputRunTTMRuleWithBinData = TTMStrategyCenter.getInstance().runTTMRuleWithBinData(tTMInput);
                                    if (tTMOutputRunTTMRuleWithBinData != null) {
                                        type = tTMOutputRunTTMRuleWithBinData.getType();
                                    } else {
                                        type = null;
                                    }
                                    if (type == TTMOutput.ReturnType.ERROR) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("ttm execute failed for package=");
                                        String str5 = c0vmq3.LIZ;
                                        String str6 = "";
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        sbLIZ4.append(str5);
                                        sbLIZ4.append(": ");
                                        if (tTMOutputRunTTMRuleWithBinData != null && (msg = tTMOutputRunTTMRuleWithBinData.getMsg()) != null) {
                                            str6 = msg;
                                        }
                                        sbLIZ4.append(str6);
                                        c1093150eYL = new C1093150eYL(false, null, C2188811AlT.LIZIZ(sbLIZ4), null, 10);
                                    } else {
                                        String str7 = c796430VMb.LIZIZ;
                                        String str8 = c796430VMb.LIZJ;
                                        if (tTMOutputRunTTMRuleWithBinData != null) {
                                            data = tTMOutputRunTTMRuleWithBinData.getData();
                                        } else {
                                            data = null;
                                        }
                                        c1093150eYL = new C1093150eYL(true, new C1093140eYK(str7, str8, data), null, linkedHashMap, 4);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            String message = th.getMessage();
                            if (message == null) {
                                message = th.toString();
                            }
                            c1093150eYL = new C1093150eYL(false, null, message, null, 10);
                        }
                    } else {
                        c1093150eYL = new C1093150eYL(false, null, "packageInfo is null", null, 10);
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("execute result success=");
                    sbLIZ5.append(Boolean.valueOf(c1093150eYL.LIZ));
                    sbLIZ5.append(" error=");
                    sbLIZ5.append(c1093150eYL.LIZJ);
                    C227400uG.LIZ("CelStrategyEngine", C2188811AlT.LIZIZ(sbLIZ5));
                    if (c1093150eYL.LIZ) {
                        LIZ(c1093150eYL, this.LJ);
                        C796430VMb c796430VMb2 = this.LIZ.LIZJ;
                        String str9 = c796430VMb2.LIZIZ;
                        String str10 = c796430VMb2.LIZJ;
                        if (c473440IhS != null) {
                            str3 = c473440IhS.LJ;
                        }
                        C1093620eZ6.LIZJ(new C1093610eZ5(str9, str10, str3));
                        return;
                    }
                    InterfaceC1092770eXj interfaceC1092770eXjLIZ = this.LJ.LIZ(this.LIZIZ);
                    if (interfaceC1092770eXjLIZ != null) {
                        interfaceC1092770eXjLIZ.LIZJ(new C477840IoY(-1, c1093150eYL.LIZJ));
                    }
                    C796430VMb c796430VMb3 = this.LIZ.LIZJ;
                    String str11 = c796430VMb3.LIZIZ;
                    String str12 = c796430VMb3.LIZJ;
                    if (c473440IhS != null) {
                        str3 = c473440IhS.LJ;
                    }
                    C1093620eZ6.LIZJ(new C1093610eZ5(str11, str12, str3, -1, c1093150eYL.LIZJ));
                }
            };
        }
        if (numValueOf.intValue() == 3) {
            return new AbstractC1093440eYo(c0vmz, c0vmv) { // from class: X.0eYz
                public final C0VMV LJ;

                @Override // X.AbstractC1093440eYo
                public final void LJFF() {
                    C796430VMb c796430VMb;
                    C796430VMb c796430VMb2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", scene=");
                    C0VMZ c0vmz2 = this.LIZ;
                    String str = null;
                    sbLIZ.append((c0vmz2 == null || (c796430VMb2 = c0vmz2.LIZJ) == null) ? null : c796430VMb2.LIZIZ);
                    sbLIZ.append(", strategyKey=");
                    C0VMZ c0vmz3 = this.LIZ;
                    if (c0vmz3 != null && (c796430VMb = c0vmz3.LIZJ) != null) {
                        str = c796430VMb.LIZJ;
                    }
                    sbLIZ.append(str);
                    C227400uG.LIZ("ServerStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1092770eXj interfaceC1092770eXjLIZ = this.LJ.LIZ(this.LIZIZ);
                    if (interfaceC1092770eXjLIZ != null) {
                        interfaceC1092770eXjLIZ.LIZ();
                    }
                    BizStrategy bizStrategy = this.LIZ.LIZIZ;
                    if (bizStrategy != null) {
                        LIZLLL(bizStrategy.action);
                        C1093270eYX.LIZIZ(this, bizStrategy.triggerEvent, bizStrategy.tickerEventName, Long.valueOf((long) bizStrategy.tickerInterval));
                    }
                }

                @Override // X.AbstractC1093440eYo
                public final void LJI() {
                    C796430VMb c796430VMb;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stop strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", scene=");
                    C0VMZ c0vmz2 = this.LIZ;
                    sbLIZ.append((c0vmz2 == null || (c796430VMb = c0vmz2.LIZJ) == null) ? null : c796430VMb.LIZIZ);
                    C227400uG.LIZ("ServerStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1093440eYo
                public final void LIZIZ(C473440IhS c473440IhS) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("emitEvent strategyId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", event=");
                    sbLIZ.append(c473440IhS.LJ);
                    C227400uG.LIZ("ServerStrategyEngine", C2188811AlT.LIZIZ(sbLIZ));
                    super.LIZIZ(c473440IhS);
                    LIZJ(this.LIZ.LIZJ, c473440IhS);
                }

                {
                    this.LJ = c0vmv;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[PHI: r1
                  0x0049: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v6 java.lang.String) binds: [B:15:0x0047, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractC1093440eYo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZJ(X.C796430VMb r9, X.C473440IhS r10) {
                    /*
                        r8 = this;
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "execute strategyId="
                        r1.append(r0)
                        java.lang.String r0 = r8.LIZIZ
                        r1.append(r0)
                        java.lang.String r0 = ", scene="
                        r1.append(r0)
                        java.lang.String r0 = r9.LIZIZ
                        r1.append(r0)
                        java.lang.String r0 = ", event="
                        r1.append(r0)
                        r4 = 0
                        if (r10 == 0) goto L79
                        java.lang.String r0 = r10.LJ
                    L22:
                        r1.append(r0)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "ServerStrategyEngine"
                        X.C227400uG.LIZ(r0, r1)
                        if (r10 == 0) goto L73
                        java.util.Map r7 = r10.LIZ()
                    L34:
                        X.0eYL r6 = new X.0eYL
                        X.0eYK r5 = new X.0eYK
                        X.0VMZ r3 = r8.LIZ
                        java.lang.String r2 = ""
                        if (r3 == 0) goto L46
                        X.0VMb r0 = r3.LIZJ
                        if (r0 == 0) goto L46
                        java.lang.String r1 = r0.LIZIZ
                        if (r1 != 0) goto L49
                    L46:
                        r1 = r2
                        if (r3 == 0) goto L52
                    L49:
                        X.0VMb r0 = r3.LIZJ
                        if (r0 == 0) goto L52
                        java.lang.String r0 = r0.LIZJ
                        if (r0 == 0) goto L52
                        r2 = r0
                    L52:
                        r5.<init>(r1, r2, r4)
                        r0 = 1
                        r6.<init>(r0, r5, r4, r7)
                        X.0VMV r0 = r8.LJ
                        r8.LIZ(r6, r0)
                        X.0eZ5 r2 = new X.0eZ5
                        X.0VMZ r0 = r8.LIZ
                        X.0VMb r0 = r0.LIZJ
                        java.lang.String r1 = r0.LIZIZ
                        java.lang.String r0 = r0.LIZJ
                        if (r10 == 0) goto L6c
                        java.lang.String r4 = r10.LJ
                    L6c:
                        r2.<init>(r1, r0, r4)
                        X.C1093620eZ6.LIZJ(r2)
                        return
                    L73:
                        java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                        r7.<init>()
                        goto L34
                    L79:
                        r0 = r4
                        goto L22
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1093550eYz.LIZJ(X.0VMb, X.0IhS):void");
                }
            };
        }
        if (numValueOf.intValue() != 4) {
            return null;
        }
        return new C1093520eYw(c0vmz, c0vmv);
    }
}
