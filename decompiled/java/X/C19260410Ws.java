package X;

import android.content.Context;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import java.util.Set;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19260410Ws {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static final C19260410Ws LIZ = new C19260410Ws();
    public static final Keva LIZIZ = Keva.getRepo("tpc_consent");
    public static boolean LJ = true;
    public static String LJFF = "";
    public static boolean LJI = true;
    public static String LJIILJJIL = "";
    public static final C01GW LJIILL = C452501pT.LIZIZ(new C19260910Wx());
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(406));
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(407));

    public final synchronized void LJIIJJI() {
        if (Keva.getRepo("appsflyer_repo").getBoolean("is_appsflyer_id_has_reported", false)) {
            return;
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        C844470XAv.LIZ.getClass();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(C844470XAv.LIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("af_id", appsFlyerUID);
        C20684815ws.LJIILLIIL("appsflyer_id_init", c2344009Gk.LIZ);
        Keva.getRepo("appsflyer_repo").storeBoolean("is_appsflyer_id_has_reported", true);
    }

    public final synchronized void LJIIL() {
        if (LIZLLL && LJIILIIL) {
            if (LJIIL) {
                return;
            }
            AppsFlyerLib.getInstance().anonymizeUser(LJ);
            LJIIL = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(LJ ? 1 : 0, "anonymize_user");
            c2344009Gk.LIZJ(LJIIIZ ? 1 : 0, "is_fail_default");
            C20684815ws.LJIILLIIL("set_af_anonymize_status", c2344009Gk.LIZ);
        }
    }

    public static final long LIZIZ() {
        return ((Number) LJIILLIIL.getValue()).longValue();
    }

    public static final long LIZJ() {
        return ((Number) LJIIZILJ.getValue()).longValue();
    }

    public static String LIZLLL() {
        if (LJIILJJIL.length() == 0) {
            LJIILJJIL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        }
        return LJIILJJIL;
    }

    public static String LJ() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "persist.sys.cota.carrier");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final boolean LJFF() {
        return Keva.getRepo("appsflyer_repo").getBoolean("is_appsflyer_first_launch", true);
    }

    public static boolean LJIIIZ() {
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"GB", "CH"});
        String strLIZLLL = LIZLLL();
        C19315910hZ.LIZ.getClass();
        return C19315910hZ.LJIIIIZZ.contains(strLIZLLL) && !setLJLIIL.contains(strLIZLLL);
    }

    public static final synchronized void LJIILIIL() {
        if (((Boolean) C17980072k.LIZIZ.getValue()).booleanValue() || ((Boolean) AnonymousClass0730.LIZ.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.10Wv
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppsFlyerStartTrackingUtil@b2a5.tryStartTracking$1");
                    try {
                        C19260410Ws.LIZ.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppsFlyerStartTrackingUtil@b2a5.tryStartTracking$1");
                }
            });
        } else {
            LIZ.LIZ();
        }
    }

    public final void LIZ() throws Throwable {
        if (LJII || !LIZJ) {
            return;
        }
        if (LJIIJJI || !C1514430pVp.LJ()) {
            if (LJI() || LIZLLL) {
                final Context contextLJFF = C2214201BlK.LJFF();
                if (contextLJFF == null) {
                    C844470XAv.LIZ.getClass();
                    contextLJFF = C844470XAv.LIZ();
                }
                if (!LJIIIZ() && !LJIIIIZZ()) {
                    LJIIJJI();
                    LJIIJ(contextLJFF, false);
                } else {
                    if (LJII()) {
                        LJIIJJI();
                        LJIIJ(contextLJFF, LJIIIZ());
                        return;
                    }
                    ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.10UY
                        @Override // X.InterfaceC1915870zxJ
                        public final void LIZ(EnumC1876780ywG enumC1876780ywG) throws Throwable {
                            if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                                C19260410Ws.LIZ.LJIIJJI();
                                C19260410Ws.LJIIJ(contextLJFF, C19260410Ws.LJIIIZ());
                                ComplianceServiceProvider.LJIILJJIL().LJIIIZ(this);
                            }
                        }
                    });
                    String strLIZLLL = LIZLLL();
                    C19315910hZ.LIZ.getClass();
                    if (C19315910hZ.LJIIIIZZ.contains(strLIZLLL)) {
                        return;
                    }
                    LJIIJJI();
                }
            }
        }
    }

    public static boolean LJI() {
        return ((IStrategyCenterService) ServiceManager.get().getService(IStrategyCenterService.class)).LJIIIZ();
    }

    public static boolean LJII() {
        boolean zLJII = ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("region", LIZLLL());
        c2344009Gk.LIZJ(zLJII ? 1 : 0, "has_consent");
        C20684815ws.LJIILLIIL("appsflyer_consent", c2344009Gk.LIZ);
        return zLJII;
    }

    public static boolean LJIIIIZZ() {
        return LJI() ? ((IStrategyCenterService) ServiceManager.get().getService(IStrategyCenterService.class)).LJI().contains(LIZLLL()) : LJI;
    }

    public static void LJIIJ(Context context, boolean z) throws Throwable {
        String curUserId;
        if (z) {
            AppsFlyerConsent appsFlyerConsentLLJLLL = C2204961BRm.LLJLLL(AppsFlyerConsent.Companion, true, true, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhOijBBKk2yX8oD01J2v3ATtzaUe4mtLHXUL", null));
            C20144713rx c20144713rx = new C20144713rx(939524115);
            C837720Wte.LIZ("AppsFlyer", "setConsentData", c20144713rx, new C0WGW(appsFlyerConsentLLJLLL, c20144713rx));
        } else {
            AppsFlyerConsent appsFlyerConsentForNonGDPRUser = AppsFlyerConsent.Companion.forNonGDPRUser();
            C20144713rx c20144713rx2 = new C20144713rx(939524114);
            C837720Wte.LIZ("AppsFlyer", "setConsentData", c20144713rx2, new C0WGW(appsFlyerConsentForNonGDPRUser, c20144713rx2));
        }
        C10SW.LIZ.getClass();
        C10SW.LIZLLL("request_send");
        try {
            if (!C10EU.LJIILIIL()) {
                LJIIIIZZ = SystemClock.uptimeMillis();
                AppsFlyerLib.getInstance().start(context, null, new AppsFlyerRequestListener() { // from class: X.10Ww
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public final void onSuccess() {
                        C19260410Ws.LJIILIIL = true;
                        C19260410Ws.LIZ.LJIIL();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("response_code", "200");
                        C20684815ws.LJIILLIIL("appsflyer_start_feedback", c2344009Gk.LIZ);
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public final void onError(int i, String str) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i, "response_code");
                        c2344009Gk.LJIIIIZZ("error_description", str);
                        C20684815ws.LJIILLIIL("appsflyer_start_feedback", c2344009Gk.LIZ);
                    }
                });
            } else {
                AppsFlyerLib.getInstance().stop(true, context);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJII = true;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(LJIIIIZZ() ? 1 : 0, "delay_af_start");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_gdpr_user");
        c2344009Gk.LIZJ(LJII() ? 1 : 0, "has_consent");
        c2344009Gk.LJIIIIZZ("country", LJFF);
        c2344009Gk.LJIIIIZZ("region", LIZLLL());
        c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0, "is_login");
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } else {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        c2344009Gk.LIZJ(LJI() ? 1 : 0, "is_client_side_delay");
        C20684815ws.LJIILLIIL("appsflyer_start", c2344009Gk.LIZ);
    }
}
