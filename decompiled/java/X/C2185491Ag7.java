package X;

import java.util.List;

/* JADX INFO: renamed from: X.1Ag7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185491Ag7 {
    public final int LIZ;
    public final List<C2185521AgA> LIZIZ;
    public final List<C2185471Ag5> LIZJ;
    public final List<C2185421Ag0> LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;

    public C2185491Ag7() {
        this(0, null, null, null, 0L, 0L, false, false, false, 2047);
    }

    public C2185491Ag7(int i, List list, List list2, List list3, long j, long j2, boolean z, boolean z2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? C13BV.INSTANCE : list3, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? 0L : j2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0, 0L);
    }

    public C2185491Ag7(int i, List<C2185521AgA> list, List<C2185471Ag5> list2, List<C2185421Ag0> list3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = j3;
    }
}
