package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.EnumMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS257S0300000_13;

/* JADX INFO: renamed from: X.0WG0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WG0 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0WFt] */
    public final void LIZIZ() {
        C835510Wq5 c835510Wq5LIZLLL;
        C820270WFt c820270WFt;
        if (this.LIZLLL) {
            return;
        }
        if (this.LIZ) {
            C1913870zu5.LIZ.getClass();
            if (!C1913870zu5.LIZ()) {
                return;
            }
        }
        EnumMap enumMap = new EnumMap(EnumC820330WFz.class);
        EnumC820330WFz enumC820330WFz = EnumC820330WFz.ANALYTICS_STORAGE;
        C0WG4 c0wg4 = C0WG4.GRANTED;
        enumMap.put(enumC820330WFz, c0wg4);
        enumMap.put(EnumC820330WFz.AD_STORAGE, c0wg4);
        enumMap.put(EnumC820330WFz.AD_USER_DATA, c0wg4);
        enumMap.put(EnumC820330WFz.AD_PERSONALIZATION, c0wg4);
        C0WG6 c0wg6 = C0WG5.LIZIZ;
        C844470XAv.LIZ.getClass();
        C0WG5 c0wg5LIZ = c0wg6.LIZ(C844470XAv.LIZ());
        C20144713rx c20144713rx = new C20144713rx(939524366);
        C837720Wte.LIZ("Firebase", "setConsent", c20144713rx, new AwS257S0300000_13(enumMap, c20144713rx, c0wg5LIZ, 3));
        final FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(C844470XAv.LIZ());
        firebaseAnalytics.getClass();
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (firebaseAnalytics.LIZIZ == null) {
                        final TimeUnit timeUnit = TimeUnit.SECONDS;
                        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
                        firebaseAnalytics.LIZIZ = new C822650WOx(timeUnit, arrayBlockingQueue) { // from class: X.0WFt
                            @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                super.execute(runnable);
                            }
                        };
                    }
                    c820270WFt = firebaseAnalytics.LIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c835510Wq5LIZLLL = C835460Wq0.LIZJ(c820270WFt, new Callable<String>() { // from class: X.0WG3
                @Override // java.util.concurrent.Callable
                public final String call() {
                    C1C7U.LIZ("zzc@3a8.call");
                    final C820210WFn c820210WFn = firebaseAnalytics.LIZ;
                    c820210WFn.getClass();
                    final C0WGB c0wgb = new C0WGB();
                    c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, c0wgb) { // from class: X.0WGA
                        public final /* synthetic */ C0WGB LLILZIL;
                        public final /* synthetic */ C820210WFn LLILZLL;

                        @Override // X.AbstractRunnableC820240WFq
                        public final void LIZ() {
                            InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                            C0W3J.LJIIIIZZ(interfaceC820490WGp);
                            interfaceC820490WGp.getAppInstanceId(this.LLILZIL);
                        }

                        @Override // X.AbstractRunnableC820240WFq
                        public final void LIZIZ() {
                            this.LLILZIL.LJJ(null);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(c820210WFn, true);
                            this.LLILZIL = c0wgb;
                            this.LLILZLL = c820210WFn;
                        }
                    });
                    String strLLLLII = c0wgb.LLLLII(120000L);
                    C1C7U.LIZIZ("zzc@3a8.call");
                    return strLLLLII;
                }
            });
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new C820410WGh(c820210WFn, "Failed to schedule task for getAppInstanceId", null));
            c835510Wq5LIZLLL = C835460Wq0.LIZLLL(e);
        }
        c835510Wq5LIZLLL.LJI(C835490Wq3.LIZ, new InterfaceC835710WqP() { // from class: X.0TUp
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("app_instance_id", (String) obj);
                c2344009Gk.LIZJ(3, "growth_deepevent");
                C20684815ws.LJIILLIIL("firebase_to_server", c2344009Gk.LIZ);
            }
        });
        c835510Wq5LIZLLL.LIZLLL(new InterfaceC835730WqR() { // from class: X.0TUo
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("fail_reason", exc.toString());
                c2344009Gk.LIZJ(3, "growth_deepevent");
                C20684815ws.LJIILLIIL("firebase_to_server", c2344009Gk.LIZ);
            }
        });
        LIZ(this.LIZIZ, true);
        this.LIZLLL = true;
    }

    public final void LIZ(boolean z, boolean z2) {
        C1913870zu5.LIZ.getClass();
        Keva repo = Keva.getRepo("firebase_repo");
        boolean z3 = false;
        boolean z4 = repo.getBoolean("has_report_consent_status", false);
        if (repo.getBoolean("IS_CONSENT_GRANTED", false) != z2) {
            z3 = true;
        }
        if (!z4 || z3) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("region", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
            c2344009Gk.LIZJ(C1913870zu5.LIZ() ? 1 : 0, "has_consent");
            c2344009Gk.LIZJ(C10EU.LJIILIIL() ? 1 : 0, "is_child_mode");
            c2344009Gk.LIZJ(this.LIZJ ? 1 : 0, "is_delay_mode");
            c2344009Gk.LIZJ(!this.LIZIZ ? 1 : 0, "is_preinstall");
            c2344009Gk.LIZJ(z ? 1 : 0, "is_collection_enable");
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_consent_granted");
            c2344009Gk.LIZJ(!z4 ? 1 : 0, "is_first_time");
            C20684815ws.LJIILLIIL("google_consent_update", c2344009Gk.LIZ);
            if (!z4) {
                repo.storeBoolean("has_report_consent_status", true);
            }
            if (z3) {
                repo.storeBoolean("IS_CONSENT_GRANTED", z2);
            }
        }
    }

    public C0WG0(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
