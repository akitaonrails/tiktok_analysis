package X;

import java.util.List;

/* JADX INFO: renamed from: X.0aDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926620aDk {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final List<Integer> LJFF;
    public final boolean LJI;
    public boolean LJII;
    public final int LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C926620aDk() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public C926620aDk(int i, boolean z, boolean z2, boolean z3, boolean z4, List<Integer> list, boolean z5, boolean z6, int i2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = list;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = i2;
    }

    public /* synthetic */ C926620aDk(int i, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, int i2, int i3) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : list, (i2 & 64) == 0 ? z5 : false, (i2 & 128) == 0 ? z6 : true, 0);
    }
}
