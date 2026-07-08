package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290450jgZ<V> {
    public final V LIZ;
    public final Throwable LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public C1290450jgZ(V v) {
        this.LIZ = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1290450jgZ)) {
            return false;
        }
        C1290450jgZ c1290450jgZ = (C1290450jgZ) obj;
        V v = this.LIZ;
        if (v != null && v.equals(c1290450jgZ.LIZ)) {
            return true;
        }
        Throwable th = this.LIZIZ;
        if (th == null || c1290450jgZ.LIZIZ == null) {
            return false;
        }
        return th.toString().equals(this.LIZIZ.toString());
    }

    public C1290450jgZ(Throwable th) {
        this.LIZIZ = th;
    }
}
