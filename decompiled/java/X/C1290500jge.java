package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290500jge<V> {
    public final V LIZ;
    public final Throwable LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public C1290500jge(V v) {
        this.LIZ = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1290500jge)) {
            return false;
        }
        C1290500jge c1290500jge = (C1290500jge) obj;
        V v = this.LIZ;
        if (v != null && v.equals(c1290500jge.LIZ)) {
            return true;
        }
        Throwable th = this.LIZIZ;
        if (th == null || c1290500jge.LIZIZ == null) {
            return false;
        }
        return th.toString().equals(this.LIZIZ.toString());
    }

    public C1290500jge(Throwable th) {
        this.LIZIZ = th;
    }
}
