package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.18BP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BP {
    public static final C18BP LIZ = new C18BP();

    public final C21244118Br LJ(int i, String str, List list) {
        Object objLIZLLL;
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        C21246818Cs c21246818CsLJFF = c21248618Dk.LJFF(str);
        if (c21246818CsLJFF != null && (objLIZLLL = C21248618Dk.LIZLLL(c21246818CsLJFF.LIZJ)) != null) {
            c21248618Dk.getClass();
            PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZLLL);
            if (pageInfoLJIIIIZZ != null) {
                return LJFF(LIZ, pageInfoLJIIIIZZ, list, i, null, true, false, 32);
            }
        }
        getClass();
        return LIZJ(str, list, i, null, false);
    }

    public static C21244118Br LIZJ(String str, List list, int i, C21244118Br c21244118Br, boolean z) {
        C1766940w56 c1766940w56;
        BcmParams bcmParams;
        BcmParams bcmParams2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        C21244118Br c21244118Br2 = c21244118Br;
        if (c21244118Br2 == null) {
            c21244118Br2 = new C21244118Br();
        }
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String str7 = null;
            if (str6 == null) {
                break;
            }
            jSONArray.put(str6);
            if (Intrinsics.LJFF(C18C3.LJI(str6), "a0.b0.c0.d0") || c21244118Br2.LIZ.size() >= i) {
                break;
            }
            String strLIZIZ = BtmServiceImpl.INSTANCE.getChainRecorderExp().LIZIZ(str6);
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            C21246818Cs c21246818CsLJFF = c21248618Dk.LJFF(str6);
            List<C1766940w56> list2 = c21244118Br2.LIZ;
            AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
            C212369188x c212369188xLIZJ = AnonymousClass1891.LIZJ(str6);
            if (c21246818CsLJFF != null) {
                str2 = c21246818CsLJFF.LIZ;
            } else {
                str2 = null;
            }
            if (!C18CS.LIZ.LIZJ().LJI()) {
                str3 = null;
            } else {
                C21246818Cs c21246818CsLJFF2 = c21248618Dk.LJFF(str6);
                if (c21246818CsLJFF2 == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str3 = c21246818CsLJFF2.LJIIIIZZ;
                }
            }
            boolean zLJFF = Intrinsics.LJFF(C18C3.LJI(strLIZIZ), "a0.b0.c0.d0");
            if (c21246818CsLJFF != null) {
                str4 = c21246818CsLJFF.LJIIIZ;
                str5 = c21246818CsLJFF.LJIIJ;
                str7 = c21246818CsLJFF.LJIILIIL;
            } else {
                str4 = null;
                str5 = null;
            }
            list2.add(LJI(str6, c212369188xLIZJ, str2, list, str3, zLJFF, str4, str5, str7, z));
            str6 = strLIZIZ;
        }
        C21246718Cr.LIZ.getClass();
        if (C18CS.LIZ.LIZJ().LJIJ().LIZ() == 1) {
            if (C18CS.LIZ.LIZJ().LJIJ().LIZIZ() == 1) {
                long j = 0;
                if (C21246718Cr.LJ > 0) {
                    c1766940w56 = new C1766940w56(null, "a2270.b89863.c0.d0", null, null, null, null, null, null, null);
                    C1766990w5B c1766990w5B = new C1766990w5B();
                    long jLJJJJL = C18D5.LIZ().LJJJJL() - C21246718Cr.LJ;
                    if (jLJJJJL >= 0) {
                        j = jLJJJJL;
                    }
                    long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    if (j2 > 10) {
                        bcmParams = new BcmParams();
                        bcmParams.put("hot_start_link_interval", j2);
                    } else {
                        bcmParams = new BcmParams();
                    }
                    c1766990w5B.LIZIZ = bcmParams;
                    BcmParams bcmParams3 = C21246718Cr.LIZLLL;
                    if (bcmParams3 != null && (bcmParams2 = c1766990w5B.LIZIZ) != null) {
                        bcmParams2.merge(bcmParams3);
                    }
                    c1766940w56.LJIIIZ = c1766990w5B;
                    c21244118Br2.LIZ.add(c1766940w56);
                }
            } else if (C21246718Cr.LJII) {
                c1766940w56 = new C1766940w56(null, "a2270.b89863.c0.d0", null, null, null, null, null, null, null);
                BcmParams bcmParams4 = C21246718Cr.LIZLLL;
                if (bcmParams4 != null) {
                    C1766990w5B c1766990w5B2 = new C1766990w5B();
                    c1766990w5B2.LIZIZ = bcmParams4.copy();
                    c1766940w56.LJIIIZ = c1766990w5B2;
                }
                c21244118Br2.LIZ.add(c1766940w56);
            }
        }
        C18CK.LIZ("BcmChainProvider_getBcmRawChainByBtmId", new C116800cQ(list, jSONArray), false);
        return c21244118Br2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C21244118Br LIZ(com.bytedance.android.btm.api.model.PageFinder r15, java.util.List<java.lang.String> r16, int r17, boolean r18, X.C18BU r19) {
        /*
            r14 = this;
            r2 = r19
            r9 = r17
            if (r9 > 0) goto L8
            r9 = 20
        L8:
            if (r2 != 0) goto Lf
            X.18BU r2 = new X.18BU
            r2.<init>()
        Lf:
            r5 = 0
            r10 = r15
            if (r10 == 0) goto L2a
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L2a
            X.18Dk r1 = X.C21248618Dk.LIZ
            X.18B9 r0 = X.C18B9.LIZ
            java.lang.Object r0 = X.C18B9.LIZ(r10)
            r1.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r7 = X.C21248618Dk.LJIIIIZZ(r0)
            if (r7 != 0) goto L41
        L2a:
            java.lang.String r0 = X.C18BA.LIZ(r10)
            r2.LIZIZ = r0
            X.18BX r0 = X.C18BX.TOP_PAGE
            r2.LIZ = r0
            X.18Dk r1 = X.C21248618Dk.LIZ
            java.lang.Object r0 = X.C18CJ.LIZ()
            r1.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r7 = X.C21248618Dk.LJIIIIZZ(r0)
        L41:
            r4 = 1
            r12 = r18
            r8 = r16
            r6 = r14
            if (r7 == 0) goto L62
            java.lang.String r0 = r7.getPageBtm()
            if (r0 == 0) goto L58
            int r0 = r7.getStep()
            if (r0 <= r4) goto L58
            r7.getBtmPre()
        L58:
            r11 = 0
            r13 = 16
            X.18Br r0 = LJFF(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.LIZIZ = r2
            return r0
        L62:
            r2.LIZ = r5
            com.bytedance.android.btm.impl.setting.BtmSettingModel r0 = X.C18CS.LIZ
            com.bytedance.android.btm.impl.setting.FeatureModel r3 = r0.LIZJ()
            r3.getClass()
            int r0 = r3.lastBtmIdSwitch
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "last_btmId_switch"
            java.lang.Object r1 = X.C1972007ny.LIZIZ(r3, r0, r1)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L7e
            r5 = r1
        L7e:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La6
            int r1 = r5.intValue()
        L86:
            r3.lastBtmIdSwitch = r1
            r0 = 0
            if (r1 != r4) goto Lb1
            r2.LIZLLL = r4
            java.lang.String r1 = X.C18CJ.LJ
            if (r1 == 0) goto La9
            int r0 = r1.length()
            if (r0 == 0) goto La9
            r6.getClass()
            r0 = 0
            X.18Br r1 = LIZJ(r1, r8, r9, r0, r12)
            X.18BX r0 = X.C18BX.LAST_BTM_ID
            r2.LIZ = r0
            r1.LIZIZ = r2
            return r1
        La6:
            int r1 = r3.lastBtmIdSwitch
            goto L86
        La9:
            X.18Br r1 = new X.18Br
            r1.<init>()
            r1.LIZIZ = r2
            return r1
        Lb1:
            r2.LIZLLL = r0
            X.18Br r0 = new X.18Br
            r0.<init>()
            r0.LIZIZ = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18BP.LIZ(com.bytedance.android.btm.api.model.PageFinder, java.util.List, int, boolean, X.18BU):X.18Br");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r16
      0x0092: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v4 java.lang.String) binds: [B:23:0x0090, B:21:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21244118Br LJFF(X.C18BP r16, com.bytedance.android.btm.impl.page.model.PageInfo r17, java.util.List r18, int r19, com.bytedance.android.btm.api.model.PageFinder r20, boolean r21, boolean r22, int r23) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18BP.LJFF(X.18BP, com.bytedance.android.btm.impl.page.model.PageInfo, java.util.List, int, com.bytedance.android.btm.api.model.PageFinder, boolean, boolean, int):X.18Br");
    }

    public static C1766940w56 LJI(String str, C212369188x c212369188x, String str2, List list, String str3, boolean z, String str4, String str5, String str6, boolean z2) {
        String strLIZJ;
        int iIntValue;
        BcmParams bcmParams;
        BcmParams bcmParams2;
        BcmParams bcmParams3;
        String str7 = str5;
        String str8 = str4;
        boolean z3 = true;
        if (C18CS.LIZ.LIZJ().LJIIJ() != 1) {
            strLIZJ = C18C3.LIZJ(str);
        } else {
            strLIZJ = null;
        }
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "add_debug_to_bcm_chain", Integer.valueOf(featureModelLIZJ.addDebugToBcmChain));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = featureModelLIZJ.addDebugToBcmChain;
        }
        featureModelLIZJ.addDebugToBcmChain = iIntValue;
        boolean z4 = false;
        if (iIntValue != 1) {
            z3 = false;
        }
        String strLJI = C18C3.LJI(str);
        if (z3) {
            z4 = z;
        }
        Boolean boolValueOf = Boolean.valueOf(z4);
        if (!z3) {
            str8 = null;
            str7 = null;
        }
        C1766940w56 c1766940w56 = new C1766940w56(strLIZJ, strLJI, str2, str3, boolValueOf, str8, str7, Boolean.FALSE, str6);
        if (c212369188x != null) {
            BcmParams bcmParams4 = new BcmParams();
            BcmParams bcmParams5 = new BcmParams();
            BcmParams bcmParams6 = new BcmParams();
            for (Object obj : list) {
                Map<String, ? extends BcmParams> map = c212369188x.LIZ;
                if (map != null) {
                    bcmParams = map.get(obj);
                } else {
                    bcmParams = null;
                }
                bcmParams4.merge(bcmParams);
                Map<String, ? extends BcmParams> map2 = c212369188x.LIZIZ;
                if (map2 != null) {
                    bcmParams2 = map2.get(obj);
                } else {
                    bcmParams2 = null;
                }
                bcmParams5.merge(bcmParams2);
                if (z2) {
                    Map<String, ? extends BcmParams> map3 = c212369188x.LIZJ;
                    if (map3 != null) {
                        bcmParams3 = map3.get(obj);
                    } else {
                        bcmParams3 = null;
                    }
                    bcmParams6.merge(bcmParams3);
                }
            }
            C1766990w5B c1766990w5B = new C1766990w5B();
            c1766990w5B.LIZ = bcmParams4;
            c1766990w5B.LIZIZ = bcmParams5;
            c1766990w5B.LIZJ = bcmParams6;
            c1766940w56.LJIIIZ = c1766990w5B;
        }
        return c1766940w56;
    }
}
