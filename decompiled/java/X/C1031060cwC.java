package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.0cwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031060cwC {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C1031060cwC LIZ = new C1031060cwC();
    public static final C01GW LJ = C452501pT.LIZIZ(new C1031130cwJ());

    public static C1031050cwB LIZJ() {
        return (C1031050cwB) LJ.getValue();
    }

    public static void LJ() {
        TopViewJsonManager topViewJsonManager;
        SharedPreferences sharedPreferences;
        C1018150cbN c1018150cbNLIZJ = C1018150cbN.LIZJ();
        if (C1018150cbN.LIZJ == null) {
            c1018150cbNLIZJ.getClass();
            return;
        }
        c1018150cbNLIZJ.getClass();
        if (C1018150cbN.LJI() || (sharedPreferences = (topViewJsonManager = C1018150cbN.LIZJ).LIZJ) == null || !sharedPreferences.getBoolean("awesome_splash_preload_json", false)) {
            return;
        }
        topViewJsonManager.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(android.content.Context r5) {
        /*
            X.0cs9 r0 = X.C1031100cwG.LIZ()
            r4 = 0
            if (r0 == 0) goto L19
            boolean r1 = r0.LJJIIJZLJL()
            r0 = 1
            if (r1 != r0) goto L19
        Le:
            r3 = 0
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate r1 = com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate.INSTANCE
            java.lang.String r0 = "Don't show the normal open screen Reason: the trace function is turned on"
            r1.ordinarySplashLog(r0, r3)
            return r4
        L19:
            r0 = 0
            goto Le
        L1b:
            if (r5 != 0) goto L25
            com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate r1 = com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate.INSTANCE
            java.lang.String r0 = "Don't show the normal open screen Reason: context == null"
            r1.ordinarySplashLog(r0, r3)
            return r4
        L25:
            boolean r0 = X.C1035180d2q.LIZ
            if (r0 == 0) goto L33
            X.C1035180d2q.LIZ = r4
            com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate r1 = com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate.INSTANCE
            java.lang.String r0 = "Don’t show the normal open screen Reason: Come in from the notification point, don’t show the ad"
            r1.ordinarySplashLog(r0, r3)
            return r4
        L33:
            X.C2212241BiA.LIZIZ(r5)
            X.1Bi5 r0 = X.C2212241BiA.LIZIZ
            if (r0 != 0) goto L42
            com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate r1 = com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate.INSTANCE
            java.lang.String r0 = "Don’t show the normal open screen Reason: splashAdManager is empty"
            r1.ordinarySplashLog(r0, r3)
            return r4
        L42:
            X.C2212191Bi5.LIZIZ()
            X.1Bi7 r1 = new X.1Bi7
            r1.<init>()
            java.lang.String r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity._pnsPageId
            X.0cw5 r2 = new X.0cw5
            r2.<init>()
            r1.LIZ = r2
            X.C1030680cva.LJIIJJI = r3
            X.C1030680cva.LJIIL = r4
            X.1BjH r1 = r1.LIZ(r5)
            X.0cwD r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity.LLILLJJLI
            boolean r0 = r0.LIZ(r5, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1031060cwC.LJI(android.content.Context):boolean");
    }

    public final void LIZ(Context context) {
        if (C288590BSv.LIZ()) {
            C1031050cwB c1031050cwBLIZJ = LIZJ();
            if (c1031050cwBLIZJ.LIZ(context, true, false, true)) {
                synchronized (c1031050cwBLIZJ) {
                    try {
                        LIZ.getClass();
                        if (!LIZJ) {
                            if (C2238381CjE.LIZ()) {
                                LJ();
                            }
                            C1031090cwF.LIZ("get_splash_manager");
                            C2212241BiA.LIZIZ(context);
                            C1031090cwF.LIZIZ("get_splash_manager");
                            C1031090cwF.LIZ("has_splash_ad");
                            LIZLLL = C1031050cwB.LIZIZ(context, true, true);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("coldPreload hasSplash = ");
                            sbLIZ.append(LIZLLL);
                            c1031050cwBLIZJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            C1031090cwF.LIZIZ("has_splash_ad");
                            LIZJ = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        LIZIZ(context);
    }

    public final boolean LIZIZ(Context context) {
        if (LIZJ) {
            return LIZLLL;
        }
        synchronized (this) {
            try {
                if (!LIZJ) {
                    if (C2238381CjE.LIZ()) {
                        LIZ.getClass();
                        LJ();
                    }
                    C1031090cwF.LIZ("get_splash_manager");
                    C2212241BiA.LIZIZ(context);
                    C1031090cwF.LIZIZ("get_splash_manager");
                    C1031090cwF.LIZ("has_splash_ad");
                    LIZ.getClass();
                    boolean zLIZLLL = LIZLLL(context, true);
                    LIZLLL = zLIZLLL;
                    if (zLIZLLL && ((Boolean) C302760Btq.LIZIZ.getValue()).booleanValue()) {
                        C1030920cvy.LIZIZ();
                    }
                    C1031090cwF.LIZIZ("has_splash_ad");
                    LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZLLL;
    }

    public static boolean LIZLLL(Context context, boolean z) {
        if ((!ComplianceServiceProvider.LJIILJJIL().LJII(null)) || C786410Ut5.N3(context) == null) {
            return false;
        }
        C2212241BiA.LIZIZ(context);
        C2212241BiA.LIZIZ.getClass();
        C2212231Bi9.LJJIJIIJI = z ? 1 : 0;
        C2212241BiA.LIZIZ(context);
        return C2212241BiA.LIZIZ.LIZLLL();
    }

    public final boolean LJFF(int i, Context context) {
        boolean zLJI;
        InterfaceC1028550cs9 interfaceC1028550cs9LIZ;
        if (C288590BSv.LIZ()) {
            return LIZJ().LJI(i, context);
        }
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            if (!LIZIZ) {
                C1035180d2q.LIZ = false;
                C1035180d2q.LIZLLL = false;
                C1035180d2q.LIZIZ = false;
            } else {
                LIZIZ = false;
                if (!C1035180d2q.LIZIZ && (context instanceof Activity)) {
                    if (!(context instanceof NormalSplashAdActivity) && (((interfaceC1028550cs9LIZ = C1031100cwG.LIZ()) == null || !interfaceC1028550cs9LIZ.isActivityAwemeAuthorize((Activity) context)) && LIZLLL(context, false))) {
                        zLJI = LJI(context);
                        C1035180d2q.LIZLLL = zLJI;
                    }
                } else {
                    C1035180d2q.LIZ = false;
                    C1035180d2q.LIZLLL = false;
                    zLJI = false;
                }
                C1035180d2q.LIZIZ = false;
                return zLJI;
            }
            return false;
        }
        if (!C2212241BiA.LJFF() || !LIZIZ(context)) {
            return false;
        }
        return LJI(context);
    }
}
