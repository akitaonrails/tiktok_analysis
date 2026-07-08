package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJ0 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Integer LJI;

    public C0OJ0() {
        this(0, 0, 0, 0, 0, 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OJ0)) {
            return false;
        }
        C0OJ0 c0oj0 = (C0OJ0) obj;
        return this.LIZ == c0oj0.LIZ && this.LIZIZ == c0oj0.LIZIZ && this.LIZJ == c0oj0.LIZJ && this.LIZLLL == c0oj0.LIZLLL && this.LJ == c0oj0.LJ && this.LJFF == c0oj0.LJFF && Intrinsics.LJFF(this.LJI, c0oj0.LJI);
    }

    public final int hashCode() {
        int i = ((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        return i + (num == null ? 0 : num.hashCode());
    }

    public C0OJ0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        i = (i7 & 1) != 0 ? 0 : i;
        i2 = (i7 & 2) != 0 ? 0 : i2;
        i3 = (i7 & 4) != 0 ? 0 : i3;
        i4 = (i7 & 8) != 0 ? 0 : i4;
        i5 = (i7 & 16) != 0 ? 0 : i5;
        i6 = (i7 & 32) != 0 ? 0 : i6;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = null;
    }
}
