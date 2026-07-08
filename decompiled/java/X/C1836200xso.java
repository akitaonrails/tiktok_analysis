package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836200xso {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;
    public final int LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1836200xso)) {
            return false;
        }
        C1836200xso c1836200xso = (C1836200xso) obj;
        return this.LIZ == c1836200xso.LIZ && this.LIZIZ == c1836200xso.LIZIZ && this.LIZJ == c1836200xso.LIZJ && this.LIZLLL == c1836200xso.LIZLLL && Intrinsics.LJFF(this.LJ, c1836200xso.LJ) && this.LJFF == c1836200xso.LJFF && this.LJI == c1836200xso.LJI && this.LJII == c1836200xso.LJII && this.LJIIIIZZ == c1836200xso.LJIIIIZZ && this.LJIIIZ == c1836200xso.LJIIIZ;
    }

    public C1836200xso(int i, int i2, int i3, int i4, Pair<Integer, Integer> pair, int i5, int i6, int i7, int i8, long j) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = pair;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = j;
        float f = i5;
        float fLIZIZ = C814420VxA.LIZIZ(((i - f) - i6) / i3);
        this.LJIIJ = fLIZIZ;
        float f2 = i4 * fLIZIZ;
        this.LJIIJJI = f2;
        this.LJIIL = (f2 / pair.getFirst().floatValue()) * pair.getSecond().floatValue();
        int i9 = (((int) fLIZIZ) * i3) + i5;
        int i10 = (int) ((j * fLIZIZ) + f);
        this.LJIILIIL = i10 <= i9 ? i10 : i9;
    }
}
