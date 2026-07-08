package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0pyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532120pyM<T> {
    public volatile T LIZ;
    public volatile WeakReference<T> LIZIZ;

    public final T LIZ() {
        T t = this.LIZ;
        if (t != null) {
            return t;
        }
        WeakReference<T> weakReference = this.LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C1532120pyM(T t, boolean z) {
        if (z) {
            this.LIZIZ = new WeakReference<>(t);
        } else {
            this.LIZ = t;
        }
    }
}
