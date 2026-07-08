package X;

import Y.ACallableS420S0100000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.sdk.account.csrf.CsrfMonitorInterceptor;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import com.bytedance.sdk.account.region.TTPDomain;
import com.bytedance.sdk.account.region.TTPSettingsObject;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.account.TTAccountInit;
import com.ss.android.account.leak.LeakInterceptor;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.account.model.PushChallengeInfoMsg;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.account.network.AgeVerificationNewUserInterceptor;
import com.ss.android.ugc.aweme.account.network.CloudIDInterceptor;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.network.StandaloneAidInterceptor;
import com.ss.android.ugc.aweme.account.network.ttp.TTPInterceptorWrapper;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.InterceptorService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XNY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XNY implements IAccountService {
    public volatile AccountUserService LIZ;
    public RnAndH5Service LIZIZ;
    public IBindService LIZJ;
    public PasswordService LIZLLL;
    public ProAccountService LJ;
    public InterceptorService LJFF;
    public LoginMethodService LJI;
    public TwoStepVerificationService LJII;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final AtomicInteger LJIIIZ = new AtomicInteger(0);
    public final AtomicReference<ILoginService> LJIIJ = new AtomicReference<>(null);
    public final Object LJIIJJI = new Object();
    public final C0XGG LJIIL = new C0XN9() { // from class: X.0XGG
        @Override // X.C0XN9
        public final void LJI(C0XGH c0xgh) {
            IAutoLoginService iAutoLoginService;
            int i = c0xgh.LIZ;
            if (i == 2) {
                C823050WQl.LIZIZ().execute(new ARunnableS92S0000000_13(23));
                if (!TextUtils.isEmpty(c0xgh.LIZIZ)) {
                    C01GW<C0XA3> c01gw = C0XA3.LIZIZ;
                    C842840X4o.LIZ().LJFF(c0xgh.LIZIZ);
                    return;
                }
                return;
            }
            if (i != 3 || !C846430XIj.LIZIZ() || (iAutoLoginService = (IAutoLoginService) PluggableExtentionKt.pluggableSpi(IAutoLoginService.class)) == null) {
                return;
            }
            iAutoLoginService.cancelTimeoutFor2SVOrIDVScene();
        }
    };

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final boolean LIZ() {
        return this.LJIIIIZZ.get();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String LJ() {
        C848230XPh c848230XPh = C848230XPh.LL;
        return C848230XPh.LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XJx] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0XJy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0XKE] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0XK7] */
    @Override // com.ss.android.ugc.aweme.IAccountService
    public final C0XKE LJIILJJIL() {
        final C0XK9 c0xk9 = new C0XK9(new C0XK0() { // from class: X.0XJx
            @Override // X.C0XK0
            public final C0XK1 LIZ(C0XK5 c0xk5, Request request, C0X52 c0x52) {
                Boolean boolLIZIZ;
                Boolean boolLIZIZ2;
                C0X1W<Boolean> c0x1w = new C0X1W<Boolean>(request) { // from class: X.0XJu
                    public final Request LJ;

                    @Override // X.C0X1W, X.InterfaceC841670X0b
                    public final Object LIZ() {
                        if (this.LJ.getUrl().contains("/passport/user/check_email_registered") || this.LJ.getUrl().contains("/passport/email/register/v2/")) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_method", C0XQ7.LIZJ().getLoginMobEnterMethod());
                            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                            C20684815ws.LJIILLIIL("slide_verification_response", c2344009Gk.LIZ);
                        }
                        return Boolean.TRUE;
                    }

                    @Override // X.C0X1W, X.InterfaceC841670X0b
                    public final Object LIZIZ() {
                        if (this.LJ.getUrl().contains("/passport/user/check_email_registered") || this.LJ.getUrl().contains("/passport/email/register/v2/")) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_method", C0XQ7.LIZJ().getLoginMobEnterMethod());
                            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "2");
                            C20684815ws.LJIILLIIL("slide_verification_response", c2344009Gk.LIZ);
                        }
                        return Boolean.FALSE;
                    }

                    {
                        this.LJ = request;
                    }
                };
                try {
                    if (c0x1w.LJFF(c0xk5.LIZ.LIZJ)) {
                        if (c0x1w.LIZIZ) {
                            boolLIZIZ2 = c0x1w.LIZ();
                        } else {
                            boolLIZIZ2 = c0x1w.LIZIZ();
                        }
                        if (boolLIZIZ2.booleanValue()) {
                            return new C0XK1(true, true);
                        }
                    }
                    if (c0x1w.LIZLLL(c0xk5.LIZ.LIZ)) {
                        if (c0x1w.LIZIZ) {
                            boolLIZIZ = c0x1w.LIZ();
                        } else {
                            boolLIZIZ = c0x1w.LIZIZ();
                        }
                        if (boolLIZIZ.booleanValue()) {
                            return new C0XK1(true, true);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return C0XK0.LIZIZ;
            }
        });
        final ?? r0 = new C0XK0(c0xk9) { // from class: X.0XJy
            /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.C0XK0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0XK1 LIZ(X.C0XK5 r11, com.bytedance.retrofit2.client.Request r12, X.C0X52<?> r13) {
                /*
                    Method dump skipped, instruction units count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C846840XJy.LIZ(X.0XK5, com.bytedance.retrofit2.client.Request, X.0X52):X.0XK1");
            }
        };
        final ?? r1 = new C0XK0(r0) { // from class: X.0XK7
            @Override // X.C0XK0
            public final C0XK1 LIZ(C0XK5 c0xk5, Request request, C0X52<?> c0x52) {
                String str;
                C0XK8 c0xk8 = c0xk5.LIZ;
                if (c0xk8 != null && c0xk8.LIZ == 3003001 && c0xk8 != null && (str = c0xk8.LIZIZ) != null && str.length() != 0) {
                    C15O7.LIZIZ(new ACallableS420S0100000_13(c0xk5, 10), C15O7.LJIIIIZZ, null);
                }
                return C0XK0.LIZIZ;
            }
        };
        return new C0XK0(r1) { // from class: X.0XKE
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
            @Override // X.C0XK0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0XK1 LIZ(X.C0XK5 r17, com.bytedance.retrofit2.client.Request r18, X.C0X52<?> r19) {
                /*
                    Method dump skipped, instruction units count: 536
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XKE.LIZ(X.0XK5, com.bytedance.retrofit2.client.Request, X.0X52):X.0XK1");
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0XNo] */
    public final void LJIILLIIL() {
        C0XQ5.LIZIZ = this;
        C19724912Fj.LIZ(BindOrModifyPhoneActivity.class, "aweme://bind/mobile/");
        C848000XOk c848000XOk = new C848000XOk();
        if (C847740XNk.LIZ == null) {
            synchronized (C847740XNk.class) {
                try {
                    if (C847740XNk.LIZ == null) {
                        C847740XNk.LIZ = new C847740XNk();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C847740XNk.LIZ.getClass();
        C1198304mT.LIZ.put("account-sdk-core", new C847810XNr() { // from class: X.0XNq
        });
        Collections.addAll(C1860907Qp.LIZIZ, new InterfaceC845990XGr() { // from class: X.0XNZ
            public static boolean LIZ;
            public static boolean LIZIZ = true;

            /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
            /* JADX WARN: Type inference failed for: r0v16, types: [X.0XOJ] */
            /* JADX WARN: Type inference failed for: r1v5, types: [X.0XOJ] */
            @Override // X.InterfaceC845990XGr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r6, org.json.JSONObject r7) {
                /*
                    r5 = this;
                    if (r7 != 0) goto L3
                    return
                L3:
                    boolean r0 = X.C0XNZ.LIZ
                    if (r0 != 0) goto L6a
                    r4 = 0
                    java.lang.String r0 = "com.bytedance.bdturing.reflect.VersionUtils"
                    java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L25
                    java.lang.String r1 = "getVersionName"
                    java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L25
                    java.lang.reflect.Method r2 = r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L25
                    java.lang.Object r1 = r3.newInstance()     // Catch: java.lang.Throwable -> L25
                    java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L25
                    java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L25
                    java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L25
                    goto L2b
                L25:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r3 = ""
                L2b:
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    r2 = 1
                    if (r0 != 0) goto L44
                    X.0XOJ r1 = new X.0XOJ
                    java.lang.String r0 = "3.1.0"
                    r1.<init>(r0)
                    X.0XOJ r0 = new X.0XOJ
                    r0.<init>(r3)
                    int r0 = r1.compareTo(r0)
                    if (r0 <= 0) goto L45
                L44:
                    r4 = 1
                L45:
                    X.C0XNZ.LIZIZ = r4
                    if (r4 == 0) goto L68
                    X.0XNe r0 = X.C847680XNe.LIZ()
                    X.0XNo r0 = r0.LIZ
                    if (r0 == 0) goto L68
                    X.0XNe r0 = X.C847680XNe.LIZ()
                    X.0XNo r0 = r0.LIZ
                    r0.getClass()
                    X.0Wg7 r0 = com.ss.android.account.TTAccountInit.LIZ()
                    r0.getClass()
                    java.lang.String r1 = "CaptchaErrorHandler"
                    java.lang.String r0 = "The verification code SDK is not connected or the version is too low. Please upgrade the verification code SDK to version 3.1.0 or above!"
                    X.C0XFF.LIZIZ(r1, r0)
                L68:
                    X.C0XNZ.LIZ = r2
                L6a:
                    java.lang.String r2 = "verify_center_decision_conf"
                    java.lang.String r1 = r7.optString(r2)
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 == 0) goto L83
                    java.lang.String r0 = "data"
                    org.json.JSONObject r0 = r7.optJSONObject(r0)
                    if (r0 == 0) goto L96
                    java.lang.String r1 = r0.optString(r2)
                L83:
                    X.C847680XNe.LIZ()
                    boolean r0 = X.C0XNZ.LIZIZ
                    if (r0 == 0) goto L95
                    r0 = 1104(0x450, float:1.547E-42)
                    if (r6 == r0) goto L95
                    r0 = 1105(0x451, float:1.548E-42)
                    if (r6 == r0) goto L95
                    android.text.TextUtils.isEmpty(r1)
                L95:
                    return
                L96:
                    r1 = 0
                    goto L83
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XNZ.LIZ(int, org.json.JSONObject):void");
            }
        });
        TTAccountInit.LIZIZ = c848000XOk;
        TTAccountInit.LIZ();
        C847490XMl c847490XMlLIZ = C310970CGx.LIZ(C848000XOk.LIZ());
        if (c847490XMlLIZ != null) {
            ((ConcurrentHashMap) C847650XNb.LIZ).put(InterfaceC847750XNl.class, c847490XMlLIZ);
        }
        TTAccountInit.LIZIZ.getClass();
        if (C847650XNb.LIZ(InterfaceC847760XNm.class) == null) {
            ((ConcurrentHashMap) C847650XNb.LIZ).put(InterfaceC847760XNm.class, new InterfaceC847760XNm() { // from class: X.0XII
                @Override // X.InterfaceC847760XNm
                public final void LIZ(JSONObject jSONObject) {
                    TTAccountInit.LIZIZ.getClass();
                    new C837540WtM().LIZ("passport_third_party_oauth_result", jSONObject);
                }
            });
        }
        TTAccountInit.LIZIZ.getClass();
        C847680XNe.LIZ().LIZ = new AbstractC847790XNp() { // from class: X.0XNo
        };
        C0XFF.LIZIZ("TTAccountInit", "force disable IBdTruing is not recommend");
        TTAccountInit.LIZIZ.getClass();
        C847690XNf.LIZ().LIZ = new Object() { // from class: X.0XNs
        };
        C847820XNs c847820XNs = C847690XNf.LIZ().LIZ;
        TTAccountInit.LIZ();
        C848000XOk.LIZ();
        c847820XNs.getClass();
        TTAccountInit.LIZIZ.getClass();
        try {
            Class.forName("com.ss.android.account.token.TTTokenUtils").getMethod("addTokenInterceptor", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception th) {
        }
        Handler handler = TTAccountInit.LIZ;
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, handler, new Runnable() { // from class: X.0VzJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTAccountInit@9c68.init$2");
                try {
                    C808470VnZ.LIZIZ(InterfaceC815680VzC.class, C845420XEm.LJJZ());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTAccountInit@9c68.init$2");
            }
        });
        if (C2104208Me.LIZ(C848000XOk.LIZ())) {
            C786410Ut5.LJLJJI(2001, 60000L, handler);
        }
        C847400XMc.LJFF = new C0XN4(c848000XOk);
        C847400XMc.LJI = new C0XN5(c848000XOk);
        TTAccountInit.LIZIZ.getClass();
        C847400XMc.LJ = false;
        C847400XMc.LJII = new C0XNF() { // from class: X.0XNg
        };
        C847400XMc.LJIIIIZZ = new C0XNE() { // from class: X.0XNh
        };
        TTAccountInit.LIZJ = new C0XFG() { // from class: X.0XNi
        };
        C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C0XPY.LIZIZ);
        Keva repo = Keva.getRepo("first_time_isLogin");
        if (repo.getBoolean("isFirstTime", true)) {
            c0xo0LIZLLL.LLJZIJLIL = C848230XPh.LL.LJI();
            SharedPreferences.Editor editorEdit = c0xo0LIZLLL.LLLJL.edit();
            editorEdit.putBoolean("is_login", c0xo0LIZLLL.LLJZIJLIL);
            editorEdit.apply();
            repo.storeBoolean("isFirstTime", false);
        }
        C2203431BLp.LIZIZ.LJI(50000, 1, new InterfaceC486470J5x() { // from class: X.0XOH
            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                try {
                    PushChallengeInfoMsg pushChallengeInfoMsg = (PushChallengeInfoMsg) JsonParseUtils.LIZLLL(PushChallengeInfoMsg.class, new String(wsChannelMsg.LIZ()));
                    String strOptString = new JSONObject(pushChallengeInfoMsg.extra).optString("ticket");
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJFF().handlePushChallengeInfo(strOptString, pushChallengeInfoMsg.url);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        Application application = C0XPY.LIZIZ;
        C2487409ou.LIZJ(new Runnable() { // from class: X.0XNa
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IdvSdkActivityHelper@b335.setCurrActivity$1");
                try {
                    Activity topActivity = ActivityStack.getTopActivity();
                    if (topActivity != null) {
                        C0XP1.LIZ.getClass();
                        C0XP1.LIZLLL = new WeakReference<>(topActivity);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IdvSdkActivityHelper@b335.setCurrActivity$1");
            }
        });
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0XNd
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                C0XP1.LIZ.getClass();
                C0XP1.LIZLLL = new WeakReference<>(activity);
            }
        });
        C0XP1 c0xp1 = C0XP1.LIZ;
        final Application application2 = C0XPY.LIZIZ;
        c0xp1.getClass();
        C1494230ozF.LIZIZ("x-tt-verify-idv-decision-conf", new C08XE() { // from class: X.0XP0
            @Override // X.C08XE
            public final C1494320ozO LIZIZ(Map<String, List<String>> map) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                List<String> list = map.get("x-tt-verify-idv-decision-conf");
                if (list != null) {
                    Context context = application2;
                    Semaphore semaphore = C0XP1.LIZJ;
                    if (semaphore.tryAcquire()) {
                        C0XP1.LIZ.getClass();
                        final IDVDecisionConf iDVDecisionConf = (IDVDecisionConf) GsonProtectorUtils.fromJson((Gson) C0XP1.LIZIZ.getValue(), (String) ListProtector.get(list, 0), IDVDecisionConf.class);
                        C0XP1.LIZ(context, new C0XP6() { // from class: X.0XP2
                            @Override // X.C0XP6
                            public final void LIZ() {
                                countDownLatch.countDown();
                            }

                            @Override // X.C0XP6
                            public final void LIZIZ(EnumC110300bN enumC110300bN) {
                                boolean z;
                                boolean z2 = true;
                                if (enumC110300bN == EnumC110300bN.SUCCESS) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                AtomicBoolean atomicBoolean3 = atomicBoolean;
                                if (!z || !iDVDecisionConf.needReplay) {
                                    z2 = false;
                                }
                                atomicBoolean3.set(z2);
                                atomicBoolean2.set(z);
                                linkedHashMap.put("x-tt-passport-ticket", iDVDecisionConf.passportTicket);
                            }
                        }, iDVDecisionConf);
                        try {
                            try {
                                countDownLatch.await();
                                semaphore.release();
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C0XP1.LIZJ.release();
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C0XP1.LIZJ.release();
                            throw th2;
                        }
                    }
                }
                return new C1494320ozO(atomicBoolean.get(), !atomicBoolean2.get(), linkedHashMap);
            }
        });
        C1515120pWw.LIZIZ(AccountRetrofitInetcept.LL);
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
        if (iPNSChangeRegionService != null) {
            C1515120pWw.LIZIZ(iPNSChangeRegionService.LJIIJ());
        }
        C1515120pWw.LIZIZ(new TTPInterceptorWrapper(new C0XH6() { // from class: X.0XNc
            public static final TTPSettingsObject LIZIZ;

            static {
                Map<String, TTPDomain> map = TTPSettingsObject.LIZ;
                LIZIZ = TTPSettingsObject.LIZJ;
            }

            @Override // X.C0XH6
            public final TTPSettingsObject get() {
                TTPSettingsObject tTPSettingsObject = C1851107Mv.LIZ;
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                TTPSettingsObject tTPSettingsObject2 = C1851107Mv.LIZ;
                TTPSettingsObject tTPSettingsObject3 = (TTPSettingsObject) c0c64LJIILLIIL.LJJIIJ(true, "login_assurance_region_config", 31744, TTPSettingsObject.class, tTPSettingsObject2, 1);
                if (tTPSettingsObject3 != null) {
                    tTPSettingsObject2 = tTPSettingsObject3;
                }
                if (tTPSettingsObject2.disabled) {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    TTPSettingsObject tTPSettingsObject4 = LIZIZ;
                    tTPSettingsObject2 = (TTPSettingsObject) settingsManagerLIZLLL.LJIIIIZZ("ttp_login_assurance_config", TTPSettingsObject.class, tTPSettingsObject4);
                    if (tTPSettingsObject2 == null) {
                        return tTPSettingsObject4;
                    }
                }
                return tTPSettingsObject2;
            }
        }));
        C1515120pWw.LIZIZ(new LeakInterceptor());
        C1515120pWw.LIZIZ(AgeVerificationNewUserInterceptor.LL);
        IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi(IGeoBlockingService.class);
        if (iGeoBlockingService != null) {
            C1515120pWw.LIZIZ(iGeoBlockingService.LIZ());
        }
        C1515120pWw.LIZIZ(StandaloneAidInterceptor.LL);
        C1515120pWw.LIZIZ(CsrfMonitorInterceptor.LL);
        C1515120pWw.LIZIZ(CloudIDInterceptor.LL);
        C597060NbM.LIZ();
        C847860XNw.LIZ();
        c0xo0LIZLLL.LIZ(this.LJIIL);
        C0XFF.LIZ("M2LoginService", "init account sdk");
    }

    public final void LJIIZILJ() {
        if (this.LJIIIZ.get() == 2 || this.LJIIIZ.get() == 1 || !this.LJIIIZ.compareAndSet(0, 1)) {
            return;
        }
        try {
            synchronized (this.LJIIJJI) {
                try {
                    if (this.LJIIIZ.get() == 2) {
                        return;
                    }
                    LJIILLIIL();
                    this.LJIIIZ.set(2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJIIIZ.set(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String getStoreRegionUpperCase() {
        String str = C20250114Lj.LJ;
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.US);
        }
        String strLJII = ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJII();
        Locale locale = Locale.ROOT;
        String upperCase = strLJII.toUpperCase(locale);
        if (!TextUtils.isEmpty(upperCase)) {
            return upperCase;
        }
        String upperCase2 = C0X2A.LIZJ.toUpperCase(locale);
        return !upperCase2.isEmpty() ? upperCase2 : LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void tryInit() {
        if (((Boolean) C0B7K.LIZ.getValue()).booleanValue()) {
            LJIIZILJ();
            return;
        }
        if (this.LJIIIIZZ.get()) {
            return;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                if (!this.LJIIIIZZ.get()) {
                    LJIILLIIL();
                    this.LJIIIIZZ.set(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final ILoginService LIZJ() {
        ILoginService iLoginService;
        tryInit();
        if (this.LJIIJ.get() == null) {
            synchronized (this.LJIIJ) {
                try {
                    if (this.LJIIJ.get() == null && (iLoginService = (ILoginService) PluggableExtentionKt.pluggableSpi(ILoginService.class)) != null) {
                        this.LJIIJ.set(iLoginService);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIJ.get();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final ProAccountService LIZLLL() {
        tryInit();
        if (this.LJ == null) {
            this.LJ = new ProAccountService();
        }
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final InterfaceC848770XRj LJFF() {
        tryInit();
        if (this.LJII == null) {
            this.LJII = new TwoStepVerificationService();
        }
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final IBindService LJII() {
        tryInit();
        if (this.LIZJ == null) {
            this.LIZJ = (IBindService) ServiceManager.get().getService(IBindService.class);
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String LJIIIIZZ() {
        return C2222691Bz1.LIZ().toUpperCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final InterceptorService LJIIIZ() {
        tryInit();
        if (this.LJFF == null) {
            this.LJFF = new InterceptorService();
        }
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final AccountUserService LJIIJ() {
        tryInit();
        if (this.LIZ == null) {
            this.LIZ = new AccountUserService();
            AccountUserService accountUserService = this.LIZ;
            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
            accountUserService.getClass();
            C848040XOo.LIZ.getClass();
            C848040XOo.LIZJ = networkProxyAccount;
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final PasswordService LJIIJJI() {
        tryInit();
        if (this.LIZLLL == null) {
            this.LIZLLL = new PasswordService();
        }
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final LoginMethodService LJIIL() {
        tryInit();
        if (this.LJI == null) {
            this.LJI = new LoginMethodService();
        }
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final RnAndH5Service LJIILIIL() {
        tryInit();
        if (this.LIZIZ == null) {
            this.LIZIZ = new RnAndH5Service();
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void LIZIZ(C0XQT c0xqt) {
        tryInit();
        LIZJ().showLoginAndRegisterView(c0xqt);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void LJI(InterfaceC586170Myt interfaceC586170Myt) {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        synchronized (C0XQ5.class) {
            try {
                ((CopyOnWriteArrayList) C0XQ5.LIZ).remove(interfaceC586170Myt);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void LJIILL(InterfaceC586170Myt interfaceC586170Myt) {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        synchronized (C0XQ5.class) {
            try {
                List<InterfaceC586170Myt> list2 = C0XQ5.LIZ;
                if (!((CopyOnWriteArrayList) list2).contains(interfaceC586170Myt)) {
                    ((CopyOnWriteArrayList) list2).add(interfaceC586170Myt);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
