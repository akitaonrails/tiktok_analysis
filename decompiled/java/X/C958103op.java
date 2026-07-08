package X;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.03op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C958103op {
    public static final C958103op LIZ = new C958103op();
    public static final float LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final float LJII;
    public static final int LJIIIIZZ;
    public static final int LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final int LJIILL;
    public static final int LJIILLIIL;
    public static final int LJIIZILJ;

    static {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        IECommerceHostService iECommerceHostService4;
        IECommerceHostService iECommerceHostService5;
        IECommerceHostService iECommerceHostService6;
        IECommerceHostService iECommerceHostService7;
        IECommerceHostService iECommerceHostService8;
        IECommerceHostService iECommerceHostService9;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LIZIZ = C12ES.LIZJ(12.0f, ((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C12ES.LIZJ(32.0f, ((IApplicationDependencyService) iECommerceHostService2).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LIZJ = (int) C12ES.LIZJ(16.0f, ((IApplicationDependencyService) iECommerceHostService3).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            iECommerceHostService4 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime4, 1, IApplicationDependencyService.class.getName(), iECommerceHostService4 != null ? iECommerceHostService4.getClass().getName() : null, iECommerceHostService4 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LIZLLL = (int) C12ES.LIZJ(8.0f, ((IApplicationDependencyService) iECommerceHostService4).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            iECommerceHostService5 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime5, 1, IApplicationDependencyService.class.getName(), iECommerceHostService5 != null ? iECommerceHostService5.getClass().getName() : null, iECommerceHostService5 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService5 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LJ = ViewConfiguration.get(((IApplicationDependencyService) iECommerceHostService5).getApplicationContext()).getScaledTouchSlop();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime6 = SystemClock.elapsedRealtime();
            iECommerceHostService6 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime6, 1, IApplicationDependencyService.class.getName(), iECommerceHostService6 != null ? iECommerceHostService6.getClass().getName() : null, iECommerceHostService6 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService6 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LJFF = (int) C12ES.LIZJ(44.0f, ((IApplicationDependencyService) iECommerceHostService6).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime7 = SystemClock.elapsedRealtime();
            iECommerceHostService7 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime7, 1, IApplicationDependencyService.class.getName(), iECommerceHostService7 != null ? iECommerceHostService7.getClass().getName() : null, iECommerceHostService7 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService7 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        LJI = (int) C12ES.LIZJ(6.5f, ((IApplicationDependencyService) iECommerceHostService7).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime8 = SystemClock.elapsedRealtime();
            iECommerceHostService8 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime8, 1, IApplicationDependencyService.class.getName(), iECommerceHostService8 != null ? iECommerceHostService8.getClass().getName() : null, iECommerceHostService8 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService8 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C12ES.LIZJ(4.0f, ((IApplicationDependencyService) iECommerceHostService8).getApplicationContext());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime9 = SystemClock.elapsedRealtime();
            iECommerceHostService9 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime9, 1, IApplicationDependencyService.class.getName(), iECommerceHostService9 != null ? iECommerceHostService9.getClass().getName() : null, iECommerceHostService9 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService9 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C12ES.LIZJ(12.0f, ((IApplicationDependencyService) iECommerceHostService9).getApplicationContext());
        C418440Gaw.LIZIZ(2);
        LJII = C418440Gaw.LIZIZ(4);
        LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        LJIIIZ = (int) C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LJIIJJI = (int) C418440Gaw.LIZIZ(Double.valueOf(4.17d));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LJIILJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        LJIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
        LJIILLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        LJIIZILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
    }

    public static final float LJ() {
        IECommerceHostService iECommerceHostService;
        LIZ.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return (C2132808Xe.LIZLLL(((IApplicationDependencyService) iECommerceHostService).getApplicationContext())[1] >= 0 ? r0 : 0) * 0.73f;
    }

    public static final float LIZ() {
        return LIZJ() * 0.73f;
    }

    public static final float LIZIZ() {
        return LIZJ() * 0.73f;
    }

    public static final int LIZJ() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return C12ES.LJIIIIZZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
    }

    public static final int LIZLLL() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return C12ES.LJIIJ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
    }
}
