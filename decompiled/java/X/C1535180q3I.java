package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0q3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535180q3I<T> {
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

    public final T LIZIZ() {
        T t = this.LIZ;
        if (t != null) {
            this.LIZIZ = new WeakReference<>(t);
            this.LIZ = null;
            return t;
        }
        WeakReference<T> weakReference = this.LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1535180q3I(C1535110q3B c1535110q3B) {
        this.LIZ = c1535110q3B;
    }
}
