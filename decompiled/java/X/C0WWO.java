package X;

import android.app.Application;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WWO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWO {
    public static final String LIZLLL(RouteIntent routeIntent, String str) {
        Intent extra = routeIntent.getExtra();
        String stringExtra = null;
        if (extra != null) {
            try {
                stringExtra = extra.getStringExtra(str);
                return stringExtra;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return stringExtra;
    }

    public static final void LIZIZ(C013C c013c, C259800zU<AbstractC813200VvC> c259800zU, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU2, Application application, C259800zU<Object> c259800zU3, FragmentManager fragmentManager) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        AbstractC813200VvC abstractC813200VvC = c259800zU.element;
        if (abstractC813200VvC != null && fragmentManager != null) {
            fragmentManager.LLIILZL(abstractC813200VvC);
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = c259800zU2.element;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        c259800zU3.element = null;
    }

    public static final void LIZJ(C013C c013c, C259800zU<AbstractC813200VvC> c259800zU, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU2, Application application, C259800zU<Object> c259800zU3, FragmentManager fragmentManager) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        AbstractC813200VvC abstractC813200VvC = c259800zU.element;
        if (abstractC813200VvC != null && fragmentManager != null) {
            fragmentManager.LLIILZL(abstractC813200VvC);
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = c259800zU2.element;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        c259800zU3.element = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r0
      0x002f: PHI (r0v8 androidx.fragment.app.FragmentManager) = (r0v4 androidx.fragment.app.FragmentManager), (r0v14 androidx.fragment.app.FragmentManager) binds: [B:38:0x012f, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0VvC] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(com.bytedance.router.SmartRoute r34, android.content.Context r35, int r36, int r37, kotlin.jvm.functions.Function2 r38, final X.C0WWR r39, boolean r40, boolean r41, X.AbstractC23140094w r42) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WWO.LIZ(com.bytedance.router.SmartRoute, android.content.Context, int, int, kotlin.jvm.functions.Function2, X.0WWR, boolean, boolean, X.094w):java.lang.Object");
    }
}
