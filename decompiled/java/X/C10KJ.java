package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KJ {
    public final EnumC1264040izy LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final EnumC992920bwg LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C2177251AIx LJIIIIZZ;
    public final boolean LJIIIZ;

    public C10KJ() {
        this(null, false, false, false, false, false, null, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10KJ)) {
            return false;
        }
        C10KJ c10kj = (C10KJ) obj;
        return this.LIZ == c10kj.LIZ && this.LIZIZ == c10kj.LIZIZ && this.LIZJ == c10kj.LIZJ && this.LIZLLL == c10kj.LIZLLL && this.LJ == c10kj.LJ && this.LJFF == c10kj.LJFF && this.LJI == c10kj.LJI && this.LJII == c10kj.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c10kj.LJIIIIZZ) && this.LJIIIZ == c10kj.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        C2177251AIx c2177251AIx = this.LJIIIIZZ;
        return ((iHashCode + (c2177251AIx == null ? 0 : c2177251AIx.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public static C10KJ LIZ(C10KJ c10kj, C2177251AIx c2177251AIx) {
        return new C10KJ(c10kj.LIZ, c10kj.LIZIZ, c10kj.LIZJ, c10kj.LIZLLL, c10kj.LJ, c10kj.LJFF, c10kj.LJI, c10kj.LJII, c2177251AIx, c10kj.LJIIIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10KJ(EnumC1264040izy enumC1264040izy, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2177251AIx c2177251AIx, boolean z6, int i) {
        EnumC992920bwg enumC992920bwg;
        boolean z7 = z6;
        C2177251AIx c2177251AIx2 = c2177251AIx;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        EnumC1264040izy enumC1264040izy2 = (i & 1) != 0 ? EnumC1264040izy.DETAIL : enumC1264040izy;
        z12 = (i & 2) != 0 ? true : z12;
        z11 = (i & 8) != 0 ? true : z11;
        z10 = (i & 16) != 0 ? false : z10;
        if ((i & 32) != 0) {
            enumC992920bwg = EnumC992920bwg.LONGEST_FIRST;
        } else {
            enumC992920bwg = null;
        }
        this(enumC1264040izy2, z12, false, z11, z10, enumC992920bwg, (i & 64) != 0 ? false : z9, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? C2177241AIw.LIZJ : c2177251AIx2, (i & 512) != 0 ? false : z7);
    }

    public C10KJ(EnumC1264040izy enumC1264040izy, boolean z, boolean z2, boolean z3, boolean z4, EnumC992920bwg enumC992920bwg, boolean z5, boolean z6, C2177251AIx c2177251AIx, boolean z7) {
        this.LIZ = enumC1264040izy;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = enumC992920bwg;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = c2177251AIx;
        this.LJIIIZ = z7;
    }
}
