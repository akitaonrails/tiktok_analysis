package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767860w6a {
    public static final C1767860w6a LIZ = new C1767860w6a();

    public static BcmParams LIZJ(String str) {
        if (C7879035x.LIZLLL()) {
            if (str == null) {
                return null;
            }
            BcmParams bcmParams = new BcmParams();
            bcmParams.put(new Pair<>("btm_unit_params", C2097908Jt.LIZJ(new Pair("bcm_nova_delivery_id", str))));
            return bcmParams;
        }
        if (str == null) {
            return null;
        }
        try {
            BcmParams bcmParams2 = new BcmParams();
            bcmParams2.put(new Pair<>("btm_unit_params", C2097908Jt.LIZJ(new Pair("bcm_nova_delivery_id", str))));
            return bcmParams2;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static BcmParams LIZLLL(ReachCfgDataForMall reachCfgDataForMall) {
        if (C7879035x.LIZLLL()) {
            LIZ.getClass();
            String strLJII = LJII(reachCfgDataForMall);
            BcmParams bcmParams = new BcmParams();
            bcmParams.put(new Pair<>("bcm_nova_delivery_id", strLJII));
            Map<String, ? extends Object> mapLJ = LJ(reachCfgDataForMall);
            if (mapLJ != null) {
                bcmParams.merge(mapLJ);
            }
            return bcmParams;
        }
        try {
            LIZ.getClass();
            String strLJII2 = LJII(reachCfgDataForMall);
            BcmParams bcmParams2 = new BcmParams();
            bcmParams2.put(new Pair<>("bcm_nova_delivery_id", strLJII2));
            Map<String, ? extends Object> mapLJ2 = LJ(reachCfgDataForMall);
            if (mapLJ2 != null) {
                bcmParams2.merge(mapLJ2);
            }
            return bcmParams2;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall r4) {
        /*
            boolean r0 = X.C7879035x.LIZLLL()
            java.lang.String r3 = "entrance_bubble_params"
            java.lang.String r1 = "bcm_standard_track"
            r2 = 0
            if (r0 == 0) goto L51
            if (r4 == 0) goto L2b
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r4.reachCfgData
            if (r0 == 0) goto L2b
            com.google.gson.n r0 = r0.daParamsV2
        L13:
            if (r0 == 0) goto L2d
            com.google.gson.n r0 = r0.LJJIJ(r3)
            if (r0 == 0) goto L4d
            java.lang.String r1 = X.C2399609ak.LIZJ(r0, r1)
            if (r1 == 0) goto L4d
            X.0w7R r0 = X.C1768390w7R.LIZ
            r0.getClass()
            java.util.Map r0 = X.C1768390w7R.LIZIZ(r1)
            return r0
        L2b:
            r0 = r2
            goto L13
        L2d:
            if (r4 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r4.reachCfgData
            if (r0 == 0) goto L4d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.daParams
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L4d
            X.0w7R r0 = X.C1768390w7R.LIZ
            r0.getClass()
            java.util.Map r0 = X.C1768390w7R.LIZIZ(r1)
            return r0
        L4d:
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L51:
            if (r4 == 0) goto L5a
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r4.reachCfgData     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r0 == 0) goto L5a
            com.google.gson.n r0 = r0.daParamsV2     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L73
            com.google.gson.n r0 = r0.LJJIJ(r3)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r0 == 0) goto L93
            java.lang.String r1 = X.C2399609ak.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r1 == 0) goto L93
            X.0w7R r0 = X.C1768390w7R.LIZ     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            r0.getClass()     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            java.util.Map r0 = X.C1768390w7R.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            return r0
        L73:
            if (r4 == 0) goto L93
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r4.reachCfgData     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r0 == 0) goto L93
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.daParams     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r0 == 0) goto L93
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            if (r1 == 0) goto L93
            X.0w7R r0 = X.C1768390w7R.LIZ     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            r0.getClass()     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            java.util.Map r0 = X.C1768390w7R.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            return r0
        L93:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L97 java.util.concurrent.CancellationException -> La7
            goto Lac
        L97:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.C1AF0.LJ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r2
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767860w6a.LJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.Fragment LJFF(X.C19EG r4) {
        /*
            boolean r0 = X.C7879035x.LIZLLL()
            r3 = 0
            if (r0 == 0) goto L2c
            if (r4 == 0) goto L22
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r4)
            if (r0 == 0) goto L22
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r2 = X.C0DMM.LIZ(r0)
        L13:
            if (r2 == 0) goto L20
            androidx.fragment.app.Fragment r1 = r2.h62()
        L19:
            if (r1 == 0) goto L24
            boolean r0 = r1 instanceof X.InterfaceC1593630rZZ
            if (r0 != 0) goto L24
            return r1
        L20:
            r1 = r3
            goto L19
        L22:
            r2 = r3
            goto L13
        L24:
            if (r2 == 0) goto L2b
            androidx.fragment.app.Fragment r3 = r2.tK0()
            return r3
        L2b:
            return r3
        L2c:
            if (r4 == 0) goto L39
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r4)     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L60
            if (r0 == 0) goto L39
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r2 = X.C0DMM.LIZ(r0)     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L60
            goto L3a
        L39:
            r2 = r3
        L3a:
            if (r2 == 0) goto L41
            androidx.fragment.app.Fragment r1 = r2.h62()     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L60
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 == 0) goto L49
            boolean r0 = r1 instanceof X.InterfaceC1593630rZZ     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L60
            if (r0 != 0) goto L49
            return r1
        L49:
            if (r2 == 0) goto L65
            androidx.fragment.app.Fragment r3 = r2.tK0()     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L60
            return r3
        L50:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.C1AF0.LJ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767860w6a.LJFF(X.19EG):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r4) {
        /*
            X.00zU r3 = new X.00zU
            r3.<init>()
            if (r4 == 0) goto L18
            com.google.gson.n r2 = r4.daParamsV2
            if (r2 == 0) goto L2c
            r0 = 1
        Lc:
            java.lang.String r1 = "nova_delivery_id"
            if (r0 == 0) goto L1d
            if (r2 == 0) goto L2a
            java.lang.String r1 = X.C2399609ak.LIZJ(r2, r1)
        L16:
            r3.element = r1
        L18:
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.daParams
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L2a
            goto L16
        L2a:
            r1 = 0
            goto L16
        L2c:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767860w6a.LJI(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData):java.lang.String");
    }

    public static String LJII(ReachCfgDataForMall reachCfgDataForMall) {
        ReachCfgData reachCfgData;
        if (reachCfgDataForMall != null && (reachCfgData = reachCfgDataForMall.reachCfgData) != null) {
            LIZ.getClass();
            String strLJI = LJI(reachCfgData);
            if (strLJI != null) {
                return strLJI;
            }
            return "7407261272313479440";
        }
        return "7407261272313479440";
    }

    public static C1740600vOc LIZIZ(C19EG c19eg, boolean z, EnumC1768230w7B enumC1768230w7B, BcmParams bcmParams) {
        EnumC1741590vQD enumC1741590vQD;
        String strLIZIZ;
        EnumC1741590vQD enumC1741590vQD2;
        EnumC1741590vQD enumC1741590vQD3;
        String strLIZIZ2;
        EnumC1741590vQD enumC1741590vQD4;
        if (C7879035x.LIZLLL()) {
            if (enumC1768230w7B != null) {
                int i = C1768220w7A.LIZ[enumC1768230w7B.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (z) {
                                enumC1741590vQD4 = EnumC1741590vQD.BOTTOM_TAB_REDDOT;
                            } else {
                                enumC1741590vQD4 = EnumC1741590vQD.TOP_TAB_REDDOT;
                            }
                            String dCode = enumC1741590vQD4.getDCode();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                            sbLIZ.append('.');
                            sbLIZ.append(dCode);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                        sbLIZ2.append('.');
                        sbLIZ2.append(EnumC1741590vQD.BOTTOM_TAB_ICON.getDCode());
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } else {
                    if (z) {
                        enumC1741590vQD3 = EnumC1741590vQD.BOTTOM_TAB_BUBBLE;
                    } else {
                        enumC1741590vQD3 = EnumC1741590vQD.TOP_TAB_BUBBLE;
                    }
                    String dCode2 = enumC1741590vQD3.getDCode();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                    sbLIZ3.append('.');
                    sbLIZ3.append(dCode2);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                LIZ.getClass();
                Fragment fragmentLJFF = LJFF(c19eg);
                if (fragmentLJFF != null) {
                    C21244318Bt c21244318Bt = new C21244318Bt();
                    c21244318Bt.LIZ = strLIZIZ2;
                    c21244318Bt.LIZIZ = PageFinder.via(fragmentLJFF);
                    c21244318Bt.LIZJ = bcmParams;
                    return new C1740600vOc(c21244318Bt, null);
                }
                IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
                if (iEcUgBtmService != null) {
                    iEcUgBtmService.LIZIZ(EnumC1741430vPx.SHOP_TAB, EnumC1741440vPy.SHOP_TAB, EnumC683940QsC.FRAGMENT_NULL.getMsg());
                }
                return null;
            }
            return null;
        }
        if (enumC1768230w7B != null) {
            try {
                int i2 = C1768220w7A.LIZ[enumC1768230w7B.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (!z) {
                                enumC1741590vQD2 = EnumC1741590vQD.TOP_TAB_REDDOT;
                            } else {
                                enumC1741590vQD2 = EnumC1741590vQD.BOTTOM_TAB_REDDOT;
                            }
                            String dCode3 = enumC1741590vQD2.getDCode();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                            sbLIZ4.append('.');
                            sbLIZ4.append(dCode3);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                        sbLIZ5.append('.');
                        sbLIZ5.append(EnumC1741590vQD.BOTTOM_TAB_ICON.getDCode());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    }
                } else {
                    if (!z) {
                        enumC1741590vQD = EnumC1741590vQD.TOP_TAB_BUBBLE;
                    } else {
                        enumC1741590vQD = EnumC1741590vQD.BOTTOM_TAB_BUBBLE;
                    }
                    String dCode4 = enumC1741590vQD.getDCode();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(EnumC1741450vPz.SHOP_TAB.getCCode());
                    sbLIZ6.append('.');
                    sbLIZ6.append(dCode4);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                }
                LIZ.getClass();
                Fragment fragmentLJFF2 = LJFF(c19eg);
                if (fragmentLJFF2 != null) {
                    C21244318Bt c21244318Bt2 = new C21244318Bt();
                    c21244318Bt2.LIZ = strLIZIZ;
                    c21244318Bt2.LIZIZ = PageFinder.via(fragmentLJFF2);
                    c21244318Bt2.LIZJ = bcmParams;
                    return new C1740600vOc(c21244318Bt2, null);
                }
                IEcUgBtmService iEcUgBtmService2 = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
                if (iEcUgBtmService2 != null) {
                    iEcUgBtmService2.LIZIZ(EnumC1741430vPx.SHOP_TAB, EnumC1741440vPy.SHOP_TAB, EnumC683940QsC.FRAGMENT_NULL.getMsg());
                }
                return null;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb A[Catch: all -> 0x02b1, CancellationException -> 0x02f1, TryCatch #2 {CancellationException -> 0x02f1, all -> 0x02b1, blocks: (B:54:0x0166, B:56:0x016e, B:58:0x0174, B:76:0x0226, B:78:0x022c, B:80:0x0232, B:82:0x0238, B:89:0x0247, B:91:0x024d, B:93:0x0259, B:96:0x0261, B:97:0x0266, B:99:0x026b, B:101:0x0280, B:103:0x028f, B:86:0x023f, B:60:0x0195, B:74:0x0209, B:75:0x020b, B:66:0x01a6, B:67:0x01a9, B:71:0x01cd, B:72:0x01cf, B:70:0x01ca, B:73:0x01eb), top: B:115:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1740600vOc LIZ(X.C19EG r13, boolean r14, java.util.Map r15, X.EnumC1768230w7B r16, com.bytedance.android.bcm.api.model.BcmParams r17) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767860w6a.LIZ(X.19EG, boolean, java.util.Map, X.0w7B, com.bytedance.android.bcm.api.model.BcmParams):X.0vOc");
    }
}
