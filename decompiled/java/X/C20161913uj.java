package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.dependency.aweme.main.AwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.launcher.LauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;

/* JADX INFO: renamed from: X.13uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20161913uj {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;

    static {
        LIZ = C1835607Gw.LIZ() == C1835607Gw.LIZIZ || C1835607Gw.LIZ() == C1835607Gw.LJFF;
        LIZIZ = C1835607Gw.LIZ() == C1835607Gw.LJ || C1835607Gw.LIZ() == C1835607Gw.LJFF;
        LIZJ = C1835607Gw.LIZIZ();
    }

    public static LifecycleOwner LIZ(View view) {
        AnonymousClass0317 anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin = AwemeMainDependencyService.createIAwemeMainDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAwemeMainDependencyService.class.getName();
            if (anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAwemeMainDependencyService.class);
        }
        return ((IAwemeMainDependencyService) anonymousClass0317CreateIAwemeMainDependencyServicebyMonsterPlugin).findSAFExpLifecycleOwner(view, null);
    }

    public static final Lifecycle LIZIZ(C19EG c19eg) {
        AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILauncherDependencyService.class.getName();
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
        }
        return ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).requireTopSAFExpLifecycle(c19eg, true);
    }

    public static final LifecycleOwner LIZJ(Fragment fragment) {
        AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILauncherDependencyService.class.getName();
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
        }
        return ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).requireTopSAFExpLifecycleOwner(fragment, true);
    }

    public static final LifecycleOwner LIZLLL(C19EG c19eg) {
        AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILauncherDependencyService.class.getName();
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
        }
        return ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).requireTopSAFExpLifecycleOwner(c19eg, true);
    }
}
