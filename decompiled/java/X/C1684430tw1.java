package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684430tw1 {
    public final EnumC1684560twE LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Rect LJFF;
    public final Rect LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final C1684440tw2 LJIIIZ;
    public final int LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;

    public C1684430tw1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684430tw1)) {
            return false;
        }
        C1684430tw1 c1684430tw1 = (C1684430tw1) obj;
        return this.LIZ == c1684430tw1.LIZ && this.LIZIZ == c1684430tw1.LIZIZ && this.LIZJ == c1684430tw1.LIZJ && this.LIZLLL == c1684430tw1.LIZLLL && this.LJ == c1684430tw1.LJ && Intrinsics.LJFF(this.LJFF, c1684430tw1.LJFF) && Intrinsics.LJFF(this.LJI, c1684430tw1.LJI) && this.LJII == c1684430tw1.LJII && this.LJIIIIZZ == c1684430tw1.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1684430tw1.LJIIIZ) && this.LJIIJ == c1684430tw1.LJIIJ && Float.compare(this.LJIIJJI, c1684430tw1.LJIIJJI) == 0 && Float.compare(this.LJIIL, c1684430tw1.LJIIL) == 0 && Float.compare(this.LJIILIIL, c1684430tw1.LJIILIIL) == 0;
    }

    public /* synthetic */ C1684430tw1(int i) {
        this(null, false, 0, false, false, new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), false, false, null, -1, 0.0f, 0.0f, 0.0f);
    }

    public C1684430tw1(EnumC1684560twE enumC1684560twE, boolean z, int i, boolean z2, boolean z3, Rect rect, Rect rect2, boolean z4, boolean z5, C1684440tw2 c1684440tw2, int i2, float f, float f2, float f3) {
        this.LIZ = enumC1684560twE;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = rect;
        this.LJI = rect2;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = c1684440tw2;
        this.LJIIJ = i2;
        this.LJIIJJI = f;
        this.LJIIL = f2;
        this.LJIILIIL = f3;
    }
}
