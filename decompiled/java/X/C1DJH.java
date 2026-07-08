package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1DJH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DJH {
    public static WeakReference<C1DJJ> LIZ;

    public static void LIZ(Throwable th) {
        C1DJJ c1djj;
        WeakReference<C1DJJ> weakReference = LIZ;
        if (weakReference != null && (c1djj = weakReference.get()) != null) {
            c1djj.onException(th);
        }
    }
}
