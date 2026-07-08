package X;

import java.lang.Comparable;
import java.util.Objects;

/* JADX INFO: renamed from: X.136N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C136N<T extends Comparable<? super T>> {
    public final T LIZ;
    public final T LIZIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ);
    }

    public final String toString() {
        return C786410Ut5.j4("[%s, %s]", new Object[]{this.LIZ, this.LIZIZ});
    }

    public final boolean LIZ(T t) {
        boolean z;
        boolean z2;
        if (t.compareTo(this.LIZ) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t.compareTo(this.LIZIZ) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136N)) {
            return false;
        }
        C136N c136n = (C136N) obj;
        if (!this.LIZ.equals(c136n.LIZ) || !this.LIZIZ.equals(c136n.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C136N(T t, T t2) {
        this.LIZ = t;
        this.LIZIZ = t2;
        if (t.compareTo(t2) <= 0) {
        } else {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }
}
