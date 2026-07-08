package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0qIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544620qIW<T> implements InterfaceC1544640qIY<T> {
    public final WeakReference<T> LIZ;

    @Override // X.InterfaceC1544640qIY
    public final T LIZ() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C1544620qIW(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.LIZ = weakReference;
    }
}
