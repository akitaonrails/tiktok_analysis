package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IO4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO4 {
    public static final Rect LIZ(Context context) {
        Object c098200Yq;
        try {
            C0IKF.LIZ.getClass();
            c098200Yq = C465320IMo.LIZ().LIZIZ(context).LIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Rect rect = new Rect();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = rect;
        }
        return (Rect) c098200Yq;
    }
}
