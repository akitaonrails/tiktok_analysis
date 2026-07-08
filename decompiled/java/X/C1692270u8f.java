package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692270u8f<T> {
    public final T LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692270u8f)) {
            return false;
        }
        C1692270u8f c1692270u8f = (C1692270u8f) obj;
        return Intrinsics.LJFF(this.LIZ, c1692270u8f.LIZ) && this.LIZIZ == c1692270u8f.LIZIZ && this.LIZJ == c1692270u8f.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1692270u8f.LIZLLL);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((((((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public C1692270u8f(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }

    public C1692270u8f(T t, int i, int i2, String str) {
        this.LIZ = t;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        if (i > i2) {
            C1681000tqU.LIZ("Reversed range is not supported");
        }
    }

    public static C1692270u8f LIZ(C1692270u8f c1692270u8f, C1693480uAc c1693480uAc, int i, int i2) {
        int i3;
        String str;
        if ((i2 & 1) != 0) {
            c1693480uAc = c1692270u8f.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1692270u8f.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i = c1692270u8f.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str = c1692270u8f.LIZLLL;
        } else {
            str = null;
        }
        c1692270u8f.getClass();
        return new C1692270u8f(c1693480uAc, i3, i, str);
    }
}
