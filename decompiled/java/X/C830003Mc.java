package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C830003Mc {
    public final int LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Float LJFF;
    public final Integer LJI;

    public C830003Mc() {
        this(0, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C830003Mc)) {
            return false;
        }
        C830003Mc c830003Mc = (C830003Mc) obj;
        return this.LIZ == c830003Mc.LIZ && Intrinsics.LJFF(this.LIZIZ, c830003Mc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c830003Mc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c830003Mc.LIZLLL) && Intrinsics.LJFF(this.LJ, c830003Mc.LJ) && Intrinsics.LJFF(this.LJFF, c830003Mc.LJFF) && Intrinsics.LJFF(this.LJI, c830003Mc.LJI);
    }

    public C830003Mc(int i, Integer num, Integer num2, Integer num3, Float f, Integer num4, int i2) {
        i = (i2 & 1) != 0 ? 3 : i;
        num = (i2 & 4) != 0 ? null : num;
        num2 = (i2 & 8) != 0 ? null : num2;
        num3 = (i2 & 16) != 0 ? null : num3;
        f = (i2 & 32) != 0 ? null : f;
        num4 = (i2 & 64) != 0 ? null : num4;
        this.LIZ = i;
        this.LIZIZ = null;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = num3;
        this.LJFF = f;
        this.LJI = num4;
    }
}
