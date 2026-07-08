package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0twC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684540twC {
    public EnumC1684560twE LIZ;
    public boolean LIZIZ;
    public final C1684440tw2 LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public C1684590twH LJIIIIZZ;
    public Rect LJIIIZ;
    public final Rect LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;

    public C1684540twC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684540twC)) {
            return false;
        }
        C1684540twC c1684540twC = (C1684540twC) obj;
        return this.LIZ == c1684540twC.LIZ && this.LIZIZ == c1684540twC.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1684540twC.LIZJ) && this.LIZLLL == c1684540twC.LIZLLL && this.LJ == c1684540twC.LJ && this.LJFF == c1684540twC.LJFF && this.LJI == c1684540twC.LJI && this.LJII == c1684540twC.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1684540twC.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1684540twC.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1684540twC.LJIIJ) && Float.compare(this.LJIIJJI, c1684540twC.LJIIJJI) == 0 && Float.compare(this.LJIIL, c1684540twC.LJIIL) == 0 && Float.compare(this.LJIILIIL, c1684540twC.LJIILIIL) == 0;
    }

    public C1684540twC(int i) {
        EnumC1684560twE enumC1684560twE = EnumC1684560twE.FRONT_DETECTION;
        C1684440tw2 c1684440tw2 = new C1684440tw2(0);
        C1684590twH c1684590twH = new C1684590twH(0, new float[7]);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.LIZ = enumC1684560twE;
        this.LIZIZ = false;
        this.LIZJ = c1684440tw2;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = 0;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = c1684590twH;
        this.LJIIIZ = rect;
        this.LJIIJ = rect2;
        this.LJIIJJI = 0.0f;
        this.LJIIL = 0.0f;
        this.LJIILIIL = 0.0f;
    }
}
