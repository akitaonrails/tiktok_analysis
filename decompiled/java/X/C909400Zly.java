package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.StrategyInitializer;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyConfigurationConfig;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.im.strategy.storage.StrategyConfigDataTypeAdapterFactory;
import com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService;
import com.ss.android.ugc.aweme.im.strategy.track.data.SCPQueryData;
import com.ss.android.ugc.aweme.im.strategy.track.data.SCPTrackNode;
import com.ss.android.ugc.aweme.im.strategy.track.data.SCPTrackTree;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS41S1110000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909400Zly implements IStrategyPlatformService {
    public static final C909400Zly LIZIZ = new C909400Zly();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C909660ZmO());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C909640ZmM());
    public static final C01GW LJ = C452501pT.LIZIZ(new C909650ZmN());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C909620ZmK());

    public static boolean LJIIJJI() {
        C0I0B.LJFF.LIZJ();
        if (C894660Z7w.LIZLLL()) {
            return true;
        }
        C0ZMY.LIZ.getClass();
        return ((StrategyConfigurationConfig) C0ZMY.LIZJ.getValue()).debugLog;
    }

    public static C909410Zlz LJIILJJIL() {
        return (C909410Zlz) LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final C0ZMZ LJIIIZ() {
        return new C0ZMZ();
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final StrategyInitializer LJFF() {
        return StrategyInitializer.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final StrategyConfigDataTypeAdapterFactory LJIIIIZZ() {
        return StrategyConfigDataTypeAdapterFactory.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final boolean LIZ(EnumC909380Zlw enumC909380Zlw) {
        C909410Zlz c909410ZlzLJIILJJIL = LJIILJJIL();
        if (!c909410ZlzLJIILJJIL.LJ().containsKey(enumC909380Zlw.getKey()) && !c909410ZlzLJIILJJIL.LIZJ().contains(enumC909380Zlw.getKey())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final void LJII(EnumC2215611Bnb enumC2215611Bnb) {
        ((ConcurrentHashMap) C2215511BnR.LIZ).put(enumC2215611Bnb, C346060DhU.LIZ);
    }

    public final void LJIILL(String str) {
        if (str.length() != 0) {
            Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT);
        }
        ((ConcurrentHashMap) ((C909040ZlO) LJFF.getValue()).LIZ.getValue()).clear();
        getClass();
        LJIILLIIL(str, LJIILJJIL());
    }

    public final void LJIILLIIL(String str, C909410Zlz c909410Zlz) {
        if (!c909410Zlz.LJ) {
            synchronized (this) {
                try {
                    if (!c909410Zlz.LJ) {
                        C909410Zlz.LJI(c909410Zlz, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static IBusinessConfig LJIILIIL(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO) {
        Map mapLIZLLL;
        SCPTrackTree sCPTrackTree;
        Pair pair;
        List<? extends IBusinessConfig> listSingletonList;
        List listSingletonList2;
        if (LJIIJJI()) {
            C051M.LJ(interfaceC898340ZMa, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C909460Zm4 c909460Zm4 = (C909460Zm4) LIZLLL.getValue();
        DecisionTree decisionTree = LJIILJJIL().LJ().get(enumC909380Zlw.getKey());
        SCPTrackNode sCPTrackNode = null;
        if (decisionTree == null || (mapLIZLLL = C909410Zlz.LIZLLL(LJIILJJIL(), enumC909380Zlw.getKey())) == null) {
            return null;
        }
        if (c909460Zm4.LIZ != null) {
            sCPTrackTree = new SCPTrackTree(null, null, null);
        } else {
            sCPTrackTree = null;
        }
        DecisionNode decisionNode = decisionTree.root;
        if (decisionNode != null) {
            if (sCPTrackTree != null) {
                sCPTrackTree.root = new SCPTrackNode(null, null, null, null, null, null, null, null);
                sCPTrackNode = sCPTrackTree.root;
            }
            Pair pairLIZIZ = C909460Zm4.LIZIZ(decisionNode, interfaceC1707406mO, interfaceC898340ZMa, sCPTrackNode);
            String str = (String) pairLIZIZ.getFirst();
            boolean zBooleanValue = ((Boolean) pairLIZIZ.getSecond()).booleanValue();
            if (str == null || str.length() == 0) {
                str = decisionTree.defaultConfigName;
            }
            pair = new Pair(str, Boolean.valueOf(zBooleanValue));
        } else {
            LIZIZ.getClass();
            LJIIJJI();
            pair = new Pair(decisionTree.defaultConfigName, Boolean.FALSE);
        }
        Pair pair2 = new Pair(mapLIZLLL.get(pair.getFirst()), Boolean.valueOf(((Boolean) pair.getSecond()).booleanValue()));
        if (sCPTrackTree != null) {
            try {
                IBusinessConfig iBusinessConfig = (IBusinessConfig) pair2.getFirst();
                if (iBusinessConfig != null) {
                    listSingletonList = Collections.singletonList(iBusinessConfig);
                } else {
                    listSingletonList = null;
                }
                sCPTrackTree.result = listSingletonList;
                sCPTrackTree.type = 1;
                ISCPTrackService iSCPTrackService = c909460Zm4.LIZ;
                if (iSCPTrackService != null) {
                    iSCPTrackService.LIZ(sCPTrackTree);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        IBusinessConfig iBusinessConfig2 = (IBusinessConfig) pair2.getFirst();
        boolean zBooleanValue2 = ((Boolean) pair2.getSecond()).booleanValue();
        C0I0B.LJFF.LIZJ();
        if (C894660Z7w.LIZLLL() && C909610ZmJ.LIZ().LIZIZ()) {
            ISCPTrackService iSCPTrackServiceLIZ = C909610ZmJ.LIZ();
            DecisionTree decisionTree2 = LJIILJJIL().LJ().get(enumC909380Zlw.getKey());
            if (iBusinessConfig2 != null) {
                listSingletonList2 = Collections.singletonList(iBusinessConfig2);
            } else {
                listSingletonList2 = null;
            }
            iSCPTrackServiceLIZ.LIZ(new SCPQueryData(enumC909380Zlw, decisionTree2, interfaceC1707406mO, interfaceC898340ZMa, C909410Zlz.LIZLLL(LJIILJJIL(), enumC909380Zlw.getKey()), listSingletonList2, System.currentTimeMillis(), 1));
        }
        LJIIJJI();
        String key = enumC909380Zlw.getKey();
        String strLIZJ = interfaceC898340ZMa.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        C0ZMW.LIZIZ(key, strLIZJ, "single", System.currentTimeMillis() - jCurrentTimeMillis, zBooleanValue2);
        return iBusinessConfig2;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Map<String, C0ZMF> LJIIJ(EnumC909380Zlw enumC909380Zlw, String str, boolean z) {
        ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZIZ().LIZIZ("scp_resource", enumC909380Zlw.getKey(), null, LJIILJJIL().LJ().containsKey(enumC909380Zlw.getKey()), null, null);
        String key = enumC909380Zlw.getKey();
        C909410Zlz c909410ZlzLJIILJJIL = LJIILJJIL();
        AwS41S1110000_14 awS41S1110000_14 = new AwS41S1110000_14(enumC909380Zlw, str, z, 2);
        LJIILLIIL(str, c909410ZlzLJIILJJIL);
        if (!c909410ZlzLJIILJJIL.LIZJ().contains(key)) {
            awS41S1110000_14.invoke(key, str);
            return C2097608Jq.LJ();
        }
        Map<String, C0ZMF> mapLIZLLL = C909410Zlz.LIZLLL(c909410ZlzLJIILJJIL, key);
        if ((mapLIZLLL instanceof Map) && mapLIZLLL != null) {
            return mapLIZLLL;
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC909380Zlw r13, java.lang.String r14, boolean r15, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends X.C0ZMF>> r16) {
        /*
            r12 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C909500Zm8
            if (r0 == 0) goto L82
            r3 = r4
            X.0Zm8 r3 = (X.C909500Zm8) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L88
            X.C155000ia.LIZIZ(r1)
        L24:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0Zlz r0 = LJIILJJIL()
            r12.LJIILLIIL(r14, r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService> r0 = com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService r0 = (com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService) r0
            X.0Z2l r5 = r0.LIZIZ()
            java.lang.String r6 = "scp_resource"
            java.lang.String r7 = r13.getKey()
            r8 = 0
            X.0Zlz r0 = LJIILJJIL()
            java.util.Map r1 = r0.LJ()
            java.lang.String r0 = r13.getKey()
            boolean r9 = r1.containsKey(r0)
            r10 = r8
            r11 = r8
            r5.LIZIZ(r6, r7, r8, r9, r10, r11)
            if (r15 == 0) goto L90
            X.0Zlz r0 = LJIILJJIL()
            java.util.Set r1 = r0.LIZJ()
            java.lang.String r0 = r13.getKey()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L90
            java.util.List r1 = java.util.Collections.singletonList(r13)
            r3.LLILLL = r4
            java.lang.String r0 = "auto_retry"
            java.lang.Object r0 = r12.LJIIL(r1, r14, r0, r3)
            if (r0 != r2) goto L24
            return r2
        L82:
            X.0Zm8 r3 = new X.0Zm8
            r3.<init>(r12, r4)
            goto L14
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            X.0Zlz r1 = LJIILJJIL()
            java.lang.String r0 = r13.getKey()
            java.util.Map r1 = X.C909410Zlz.LIZLLL(r1, r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto La2
            if (r1 != 0) goto La6
        La2:
            java.util.Map r1 = X.C2097608Jq.LJ()
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909400Zly.LIZJ(X.0Zlw, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.util.List<? extends X.EnumC909380Zlw> r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C909510Zm9
            if (r0 == 0) goto L3d
            r4 = r9
            X.0Zm9 r4 = (X.C909510Zm9) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3
            if (r3 == 0) goto L2f
            int r0 = r3.status_code
            if (r0 != 0) goto L2f
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2f:
            r1 = 0
            goto L2a
        L31:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LJIIL(r6, r7, r8, r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0Zm9 r4 = new X.0Zm9
            r4.<init>(r5, r9)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909400Zly.LJI(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.util.List<? extends X.EnumC909380Zlw> r36, java.lang.String r37, java.lang.String r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.strategy.StrategyConfigData> r39) {
        /*
            Method dump skipped, instruction units count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909400Zly.LJIIL(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final IBusinessConfig LJ(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z) {
        getClass();
        LJIILLIIL(str, LJIILJJIL());
        ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZIZ().LIZIZ("scp_resource", enumC909380Zlw.getKey(), null, LJIILJJIL().LJ().containsKey(enumC909380Zlw.getKey()), null, null);
        if (z && !LJIILJJIL().LJ().containsKey(enumC909380Zlw.getKey())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C909430Zm1(enumC909380Zlw, str, null), 3);
            LJIIJJI();
            return null;
        }
        return LJIILIIL(enumC909380Zlw, interfaceC898340ZMa, interfaceC1707406mO);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC909380Zlw r20, X.InterfaceC898340ZMa r21, X.InterfaceC1707406mO r22, java.lang.String r23, boolean r24, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.strategy.IBusinessConfig>> r25) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909400Zly.LIZIZ(X.0Zlw, X.0ZMa, X.06mO, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC909380Zlw r18, X.InterfaceC898340ZMa r19, X.InterfaceC1707406mO r20, java.lang.String r21, boolean r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.strategy.IBusinessConfig> r23) {
        /*
            r17 = this;
            r7 = r18
            r6 = r19
            r5 = r20
            r4 = r23
            boolean r0 = r4 instanceof X.C909470Zm5
            r8 = r17
            if (r0 == 0) goto L9f
            r3 = r4
            X.0Zm5 r3 = (X.C909470Zm5) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L1c:
            java.lang.Object r1 = r3.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r9 = 1
            if (r0 == 0) goto L3a
            if (r0 != r9) goto La6
            X.06mO r5 = r3.LLILLL
            X.0ZMa r6 = r3.LLILLJJLI
            X.0Zlw r7 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L32:
            LJIIJJI()
        L35:
            com.ss.android.ugc.aweme.im.strategy.IBusinessConfig r0 = LJIILIIL(r7, r6, r5)
            return r0
        L3a:
            X.C155000ia.LIZIZ(r1)
            r8.getClass()
            X.0Zlz r0 = LJIILJJIL()
            r4 = r21
            r8.LJIILLIIL(r4, r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService> r0 = com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService r0 = (com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService) r0
            X.0Z2l r10 = r0.LIZIZ()
            java.lang.String r11 = "scp_resource"
            java.lang.String r12 = r7.getKey()
            r13 = 0
            X.0Zlz r0 = LJIILJJIL()
            java.util.Map r1 = r0.LJ()
            java.lang.String r0 = r7.getKey()
            boolean r14 = r1.containsKey(r0)
            r15 = r13
            r16 = r13
            r10.LIZIZ(r11, r12, r13, r14, r15, r16)
            if (r22 == 0) goto L35
            X.0Zlz r0 = LJIILJJIL()
            java.util.Map r1 = r0.LJ()
            java.lang.String r0 = r7.getKey()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L35
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r3.LL = r7
            r3.LLILLJJLI = r6
            r3.LLILLL = r5
            r3.LLILZLL = r9
            java.lang.String r0 = "auto_retry"
            java.lang.Object r0 = r8.LJIIL(r1, r4, r0, r3)
            if (r0 != r2) goto L32
            return r2
        L9f:
            X.0Zm5 r3 = new X.0Zm5
            r3.<init>(r8, r4)
            goto L1c
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909400Zly.LIZLLL(X.0Zlw, X.0ZMa, X.06mO, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
