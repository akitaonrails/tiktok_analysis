package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21380418lm {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final Float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21380418lm)) {
            return false;
        }
        C21380418lm c21380418lm = (C21380418lm) obj;
        return this.LIZ == c21380418lm.LIZ && this.LIZIZ == c21380418lm.LIZIZ && this.LIZJ == c21380418lm.LIZJ && this.LIZLLL == c21380418lm.LIZLLL && Intrinsics.LJFF(this.LJ, c21380418lm.LJ) && Intrinsics.LJFF(this.LJFF, c21380418lm.LJFF);
    }

    public final int hashCode() {
        int i = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Integer num = this.LJ;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.LJFF;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public /* synthetic */ C21380418lm(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null, null);
    }

    public C21380418lm(int i, int i2, int i3, int i4, Integer num, Float f) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = num;
        this.LJFF = f;
    }
}
