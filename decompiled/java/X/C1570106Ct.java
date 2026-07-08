package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1570106Ct {
    public static final C1570706Cz LJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public static final C1570106Ct LJI;
    public final Function0<Keva> LIZ;
    public final C054G LIZIZ;
    public final AFwS229S0000000_2 LIZJ;
    public volatile C1598406Nq LIZLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06Cz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1570106Ct.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJ = new Object() { // from class: X.06Cz
        };
        LJI = new C1570106Ct(null);
    }

    public C1570106Ct() {
        this(null);
    }

    public C1570106Ct(Object obj) {
        this.LIZ = AFwS187S0000000_2.get$arr$(95);
        C1598406Nq c1598406Nq = this.LIZLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZLLL = c1598406Nq;
                }
            }
        }
        this.LIZIZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LIZJ = AFwS229S0000000_2.get$arr$(28);
    }

    public static String LIZ(String str) {
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakDataLJIIIIZZ != null && C1567806Bw.LJFF(streakDataLJIIIIZZ)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("egg_exposed_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJ(String str) {
        String sceneName;
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakDataLJIIIIZZ != null && C1567806Bw.LJFF(streakDataLJIIIIZZ)) {
            sceneName = EnumC12986056i.STREAK_PET_ACTION_BAR_PET.getSceneName();
        } else {
            sceneName = EnumC12986056i.STREAK_PET_ACTION_BAR_HATCHING.getSceneName();
        }
        return C306990C1p.LIZ(sceneName);
    }

    public final InterfaceC12999056v LIZIZ(final String str) {
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakDataLJIIIIZZ != null && C1567806Bw.LJFF(streakDataLJIIIIZZ)) {
            IFrequencyControlSyncService iFrequencyControlSyncService = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null);
            if (iFrequencyControlSyncService != null) {
                return iFrequencyControlSyncService.LIZ(EnumC12986056i.STREAK_PET_ACTION_BAR_PET.getSceneName(), new AnonymousClass0547(str) { // from class: X.06Cw
                    public final String LIZ;
                    public final /* synthetic */ String LIZJ;

                    @Override // X.AnonymousClass0547
                    public final String getTaskId() {
                        return this.LIZ;
                    }

                    @Override // X.AnonymousClass0547
                    public final void LIZ(InterfaceC12999056v interfaceC12999056v) {
                        long jCurrentTimeMillis;
                        long jCurrentTimeMillis2;
                        C1570106Ct c1570106Ct = this.LIZIZ;
                        String str2 = this.LIZJ;
                        c1570106Ct.getClass();
                        int iLIZJ = this.LIZIZ.LIZJ(C1570106Ct.LIZ(str2));
                        String str3 = this.LIZJ;
                        for (int i = 0; i < iLIZJ; i++) {
                            EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
                            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                            if (iMHostApi != null) {
                                jCurrentTimeMillis = iMHostApi.LIZIZ();
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                            if (iMHostApi2 != null) {
                                jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                            } else {
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                            }
                            interfaceC12999056v.LJ(enumC12995056r, str3, jCurrentTimeMillis, jCurrentTimeMillis2);
                        }
                    }

                    {
                        this.LIZJ = str;
                        this.LIZIZ.getClass();
                        this.LIZ = C1570106Ct.LIZ(str);
                    }
                });
            }
            return null;
        }
        IFrequencyControlSyncService iFrequencyControlSyncService2 = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null);
        if (iFrequencyControlSyncService2 != null) {
            return iFrequencyControlSyncService2.LIZ(EnumC12986056i.STREAK_PET_ACTION_BAR_HATCHING.getSceneName(), new AnonymousClass0547(str) { // from class: X.06Cx
                public final String LIZ;
                public final /* synthetic */ String LIZJ;

                @Override // X.AnonymousClass0547
                public final String getTaskId() {
                    return this.LIZ;
                }

                @Override // X.AnonymousClass0547
                public final void LIZ(InterfaceC12999056v interfaceC12999056v) {
                    long jCurrentTimeMillis;
                    long jCurrentTimeMillis2;
                    C1570106Ct c1570106Ct = this.LIZIZ;
                    String str2 = this.LIZJ;
                    c1570106Ct.getClass();
                    int iLIZJ = this.LIZIZ.LIZJ(C1570106Ct.LIZ(str2));
                    String str3 = this.LIZJ;
                    for (int i = 0; i < iLIZJ; i++) {
                        EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
                        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi != null) {
                            jCurrentTimeMillis = iMHostApi.LIZIZ();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi2 != null) {
                            jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                        } else {
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                        interfaceC12999056v.LJ(enumC12995056r, str3, jCurrentTimeMillis, jCurrentTimeMillis2);
                    }
                }

                {
                    this.LIZJ = str;
                    this.LIZIZ.getClass();
                    this.LIZ = C1570106Ct.LIZ(str);
                }
            });
        }
        return null;
    }

    public final int LIZJ(String str) {
        return this.LIZ.invoke().getInt(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = LJ(r7)
            r5 = 32
            r4 = 1
            if (r0 == 0) goto L48
            X.056v r3 = r6.LIZIZ(r7)
            if (r3 == 0) goto L46
            X.056r r2 = X.EnumC12995056r.SHOW
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi> r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi) r0
            if (r0 == 0) goto L41
            long r0 = r0.LIZIZ()
        L1f:
            boolean r0 = r3.LIZIZ(r2, r7, r0)
            if (r0 != r4) goto L46
        L25:
            boolean r0 = X.C1590806Ks.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "StreakPetAcbButtonExposeRepository hitExposeCountLimit [SDK] "
            r1.append(r0)
            r1.append(r7)
            r1.append(r5)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590806Ks.LIZ(r0)
            return r4
        L41:
            long r0 = java.lang.System.currentTimeMillis()
            goto L1f
        L46:
            r4 = 0
            goto L25
        L48:
            java.lang.String r3 = LIZ(r7)
            int r2 = r6.LIZJ(r3)
            boolean r0 = X.C1590806Ks.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "StreakPetAcbButtonExposeRepository hitExposeCountLimit "
            r1.append(r0)
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590806Ks.LIZ(r0)
            kotlin.jvm.internal.AFwS229S0000000_2 r0 = r6.LIZJ
            java.lang.Object r0 = r0.invoke(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 >= r0) goto L7a
            r4 = 0
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1570106Ct.LIZLLL(java.lang.String):boolean");
    }
}
