package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292000jj4<V> {
    public final V LIZ;
    public final Throwable LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1292000jj4(C1294720jnS c1294720jnS) {
        this.LIZ = c1294720jnS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1292000jj4)) {
            return false;
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) obj;
        V v = this.LIZ;
        if (v != null && v.equals(c1292000jj4.LIZ)) {
            return true;
        }
        Throwable th = this.LIZIZ;
        if (th == null || c1292000jj4.LIZIZ == null) {
            return false;
        }
        return th.toString().equals(this.LIZIZ.toString());
    }

    public C1292000jj4(Throwable th) {
        this.LIZIZ = th;
    }
}
