package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20133813qC {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;

    public final int hashCode() {
        int i = (((((this.LIZ ? 1 : 0) * 31) + (this.LIZIZ ? 1 : 0)) * 31) + this.LIZJ) * 31;
        String str = this.LJIIIZ;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C20133813qC.class, obj.getClass())) {
            return false;
        }
        C20133813qC c20133813qC = (C20133813qC) obj;
        if (this.LIZ == c20133813qC.LIZ && this.LIZIZ == c20133813qC.LIZIZ && this.LIZJ == c20133813qC.LIZJ && Intrinsics.LJFF(this.LJIIIZ, c20133813qC.LJIIIZ) && this.LIZLLL == c20133813qC.LIZLLL && this.LJ == c20133813qC.LJ && this.LJFF == c20133813qC.LJFF && this.LJI == c20133813qC.LJI && this.LJII == c20133813qC.LJII && this.LJIIIIZZ == c20133813qC.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public C20133813qC(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, C1308920kAM.LIZ(str).hashCode(), i, i2, i3, i4, z2, z3, z4);
        this.LJIIIZ = str;
    }

    public C20133813qC(boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
    }
}
