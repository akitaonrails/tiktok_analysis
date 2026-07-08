package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674790tgT {
    public final C1523605xq LIZ;
    public final C1674540tg4 LIZIZ;
    public final C1674800tgU LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final boolean LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;

    public C1674790tgT() {
        this(null, null, null, 0, 0, 0.0f, false, 0, 0.0f, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674790tgT)) {
            return false;
        }
        C1674790tgT c1674790tgT = (C1674790tgT) obj;
        return Intrinsics.LJFF(this.LIZ, c1674790tgT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674790tgT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674790tgT.LIZJ) && this.LIZLLL == c1674790tgT.LIZLLL && this.LJ == c1674790tgT.LJ && Float.compare(this.LJFF, c1674790tgT.LJFF) == 0 && this.LJI == c1674790tgT.LJI && this.LJII == c1674790tgT.LJII && Float.compare(this.LJIIIIZZ, c1674790tgT.LJIIIIZZ) == 0 && Intrinsics.LJFF(this.LJIIIZ, c1674790tgT.LJIIIZ);
    }

    public C1674790tgT(C1523605xq c1523605xq, C1674540tg4 c1674540tg4, C1674800tgU c1674800tgU, int i, int i2, float f, boolean z, int i3, float f2, int i4) {
        c1523605xq = (i4 & 1) != 0 ? null : c1523605xq;
        c1674540tg4 = (i4 & 2) != 0 ? null : c1674540tg4;
        c1674800tgU = (i4 & 4) != 0 ? null : c1674800tgU;
        i = (i4 & 8) != 0 ? 0 : i;
        i2 = (i4 & 16) != 0 ? 0 : i2;
        f = (i4 & 32) != 0 ? 0.0f : f;
        z = (i4 & 64) != 0 ? false : z;
        i3 = (i4 & 128) != 0 ? 0 : i3;
        f2 = (i4 & 256) != 0 ? 0.0f : f2;
        this.LIZ = c1523605xq;
        this.LIZIZ = c1674540tg4;
        this.LIZJ = c1674800tgU;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = f;
        this.LJI = z;
        this.LJII = i3;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = null;
    }
}
