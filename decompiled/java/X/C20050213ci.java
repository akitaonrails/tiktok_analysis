package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20050213ci {
    public static void LIZ(Activity activity, ComponentCallbacks2 componentCallbacks2) {
        Object c098200Yq;
        ComponentCallbacks2C20050113ch.LL = true;
        if (componentCallbacks2 != null) {
            try {
                C786410Ut5.s4(activity, componentCallbacks2);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static void LIZIZ(Activity activity, ComponentCallbacks2 componentCallbacks2) {
        Object c098200Yq;
        ComponentCallbacks2C20050113ch.LL = true;
        if (componentCallbacks2 != null) {
            try {
                C786410Ut5.t4(activity, componentCallbacks2);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
