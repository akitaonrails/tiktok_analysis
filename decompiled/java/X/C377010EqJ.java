package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0EqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377010EqJ<T> implements C01GW<T>, Serializable {
    public final T LL;

    @Override // X.C01GW
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }

    @Override // X.C01GW
    public T getValue() {
        return this.LL;
    }

    public C377010EqJ(T t) {
        this.LL = t;
    }
}
