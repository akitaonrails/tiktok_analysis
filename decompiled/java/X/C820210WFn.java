package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzdl;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820210WFn {
    public static volatile C820210WFn LJII;
    public final String LIZ = "FA";
    public final C833180WmK LIZIZ = C833180WmK.LIZ;
    public final ExecutorService LIZJ;
    public final C820220WFo LIZLLL;
    public int LJ;
    public boolean LJFF;
    public volatile InterfaceC820490WGp LJI;

    public final void LIZIZ(final AbstractRunnableC820240WFq abstractRunnableC820240WFq) {
        if ((C2516709td.LIZ & 1) == 1 && C2456309jt.LIZ() && !C820260WFs.LIZ) {
            try {
                final ExecutorService executorService = this.LIZJ;
                if (executorService instanceof ExecutorService) {
                    C786410Ut5.LJLIIL(C820260WFs.LIZ(), C799570VYd.LIZIZ(), new Runnable(abstractRunnableC820240WFq, executorService) { // from class: X.015i
                        public final ExecutorService LL;
                        public final Runnable LLILLJJLI;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GmsMeasurementWorkRunnable@b8a8.run");
                            try {
                                this.LL.execute(this.LLILLJJLI);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GmsMeasurementWorkRunnable@b8a8.run");
                        }

                        {
                            this.LL = executorService;
                            this.LLILLJJLI = abstractRunnableC820240WFq;
                        }
                    });
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZJ.execute(abstractRunnableC820240WFq);
    }

    public C820210WFn(final Context context, final Bundle bundle) {
        C822650WOx c822650WOx = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.0VJA
            public final ThreadFactory LL = Executors.defaultThreadFactory();

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.LL.newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
            }
        });
        c822650WOx.allowCoreThreadTimeOut(true);
        this.LIZJ = Executors.unconfigurableExecutorService(c822650WOx);
        this.LIZLLL = new C820220WFo(this);
        new ArrayList();
        try {
            if (new C0WA3(context, C0WA3.LIZ(context)).LIZIZ("google_app_id") != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C820210WFn.class.getClassLoader());
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJFF = true;
                    return;
                }
            }
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGr
            public final /* synthetic */ String LLILZIL = null;
            public final /* synthetic */ String LLILZLL = null;
            public final /* synthetic */ C820210WFn LLJ;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                boolean z;
                String str;
                String str2;
                String str3;
                try {
                    C820210WFn c820210WFn = this.LLJ;
                    String str4 = this.LLILZIL;
                    String str5 = this.LLILZLL;
                    c820210WFn.getClass();
                    if (str5 == null || str4 == null) {
                        z = false;
                    } else {
                        try {
                            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C820210WFn.class.getClassLoader());
                            z = false;
                        } catch (ClassNotFoundException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            z = true;
                        }
                    }
                    InterfaceC820490WGp interfaceC820490WGpAsInterface = null;
                    if (z) {
                        str3 = this.LLILZLL;
                        str2 = this.LLILZIL;
                        str = this.LLJ.LIZ;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    C0W3J.LJIIIIZZ(context);
                    C820210WFn c820210WFn2 = this.LLJ;
                    Context context2 = context;
                    c820210WFn2.getClass();
                    try {
                        interfaceC820490WGpAsInterface = AbstractBinderC820500WGq.asInterface(DynamiteModule.LIZJ(context2, DynamiteModule.LIZJ, "com.google.android.gms.measurement.dynamite").LIZIZ("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C0WH8 e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        c820210WFn2.LIZJ(e4, true, false);
                    }
                    c820210WFn2.LJI = interfaceC820490WGpAsInterface;
                    if (this.LLJ.LJI == null) {
                        return;
                    }
                    int iLIZ = DynamiteModule.LIZ(context, "com.google.android.gms.measurement.dynamite");
                    zzdl zzdlVar = new zzdl(95001L, Math.max(iLIZ, r1), DynamiteModule.LIZLLL(context, "com.google.android.gms.measurement.dynamite", false) < iLIZ, str, str2, str3, bundle, C0WA3.LIZ(context));
                    InterfaceC820490WGp interfaceC820490WGp = this.LLJ.LJI;
                    C0W3J.LJIIIIZZ(interfaceC820490WGp);
                    interfaceC820490WGp.initialize(new C0WH6(context), zzdlVar, this.LL);
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    this.LLJ.LIZJ(e5, true, false);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, true);
                this.LLJ = this;
            }
        });
        Application application = (Application) C786410Ut5.N3(context);
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C820430WGj(this));
    }

    public static C820210WFn LIZ(Context context, Bundle bundle) {
        C0W3J.LJIIIIZZ(context);
        if (LJII == null) {
            synchronized (C820210WFn.class) {
                try {
                    if (LJII == null) {
                        LJII = new C820210WFn(context, bundle);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public final void LIZJ(Exception exc, boolean z, boolean z2) {
        this.LJFF |= z;
        if (!z && z2) {
            LIZIZ(new C820410WGh(this, "Error with data collection. Data lost.", exc));
        }
    }
}
