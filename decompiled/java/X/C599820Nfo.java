package X;

import android.os.Looper;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599820Nfo {
    public static final C599820Nfo LIZ = new C599820Nfo();
    public static volatile long LIZIZ;

    public static void LIZIZ() {
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
        ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
    }

    public static void LIZLLL() {
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
        ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
    }

    public static void LJ(C599820Nfo c599820Nfo) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        c599820Nfo.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
    }

    public static void LIZ(String str, String str2) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            return;
        }
        if (LIZIZ == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mmk-");
            sbLIZ.append(str);
            sbLIZ.append(", msg: ");
            sbLIZ.append(str2);
            sbLIZ.append(", time: ");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(", start record duration, UI thread: ");
            sbLIZ.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mmk-");
            sbLIZ2.append(str);
            sbLIZ2.append(", msg: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", time: ");
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append(", duration: ");
            sbLIZ2.append(System.currentTimeMillis() - LIZIZ);
            sbLIZ2.append(", UI thread: ");
            sbLIZ2.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        LIZIZ = System.currentTimeMillis();
    }
}
