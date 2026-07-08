package X;

import Y.ARunnableS90S0200000_21;
import android.graphics.Typeface;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384500m8G {
    public static final /* synthetic */ int LJII = 0;
    public InterfaceC1384330m7z LIZ;
    public long LIZIZ = 6000;
    public final C1384520m8I LIZJ = new C1384520m8I(this);
    public final C1384420m88 LIZLLL = new C1384420m88(this);
    public final C1384410m87 LJ = new C1384410m87(this);
    public final AFwS259S0000000_21 LJFF = AFwS259S0000000_21.get$arr$(195);
    public final AFwS259S0000000_21 LJI = AFwS259S0000000_21.get$arr$(194);

    public final void LIZLLL() {
        InterfaceC1384330m7z interfaceC1384330m7z;
        C1384750m8f config;
        C1384510m8H c1384510m8H;
        long j = (long) (this.LIZJ.LIZIZ / this.LJ.LIZJ);
        if (this.LIZIZ != j || (interfaceC1384330m7z = this.LIZ) == null || (config = interfaceC1384330m7z.getConfig()) == null || (c1384510m8H = config.LJFF) == null || c1384510m8H.LIZ != j) {
            this.LIZIZ = j;
            LIZIZ(new AwS600S0100000_21(this, 379));
        }
    }

    public static void LIZJ(C1384500m8G c1384500m8G) {
        c1384500m8G.getClass();
        C2487409ou.LIZJ(new ARunnableS90S0200000_21(new AwS34S0010000_21(false, 16), c1384500m8G, 63));
    }

    public final void LIZIZ(Function1<? super C1384750m8f, Unit> function1) {
        C2487409ou.LIZJ(new ARunnableS90S0200000_21(function1, this, 19));
    }

    public final boolean LIZ(InterfaceC1384330m7z interfaceC1384330m7z, boolean z) {
        AFwS259S0000000_21 aFwS259S0000000_21;
        if (Intrinsics.LJFF(this.LIZ, interfaceC1384330m7z)) {
            return false;
        }
        C1384750m8f config = interfaceC1384330m7z.getConfig();
        C1384510m8H c1384510m8H = config.LJFF;
        c1384510m8H.LIZ(this.LIZJ.LIZ);
        float f = this.LIZJ.LIZJ;
        int i = (c1384510m8H.LJ > f ? 1 : (c1384510m8H.LJ == f ? 0 : -1));
        float f2 = 0;
        if (f < f2) {
            f = 0.0f;
        }
        c1384510m8H.LJ = f;
        c1384510m8H.LJIIJJI.LIZ(1404);
        c1384510m8H.LIZJ(this.LIZJ.LIZLLL);
        c1384510m8H.LIZIZ(this.LIZJ.LJ);
        this.LIZJ.getClass();
        int i2 = (c1384510m8H.LJFF > 24.0f ? 1 : (c1384510m8H.LJFF == 24.0f ? 0 : -1));
        c1384510m8H.LJFF = 24.0f;
        c1384510m8H.LJIIJJI.LIZ(1405);
        c1384510m8H.LIZLLL(this.LIZJ.LIZIZ);
        boolean z2 = this.LIZJ.LJFF;
        if (c1384510m8H.LJIIJ != z2) {
            c1384510m8H.LJIIJ = z2;
            c1384510m8H.LJIIJJI.LIZ(1410);
        }
        int iIntValue = ((Number) C256900A4y.LIZ.getValue()).intValue();
        int i3 = c1384510m8H.LJI;
        if (iIntValue < 0) {
            iIntValue = 8;
        }
        c1384510m8H.LJI = iIntValue;
        c1384510m8H.LJIIJJI.LIZ(1406);
        C1384530m8J c1384530m8J = config.LJ;
        float f3 = this.LIZLLL.LIZ;
        int i4 = (c1384530m8J.LIZ > f3 ? 1 : (c1384530m8J.LIZ == f3 ? 0 : -1));
        if (f3 <= f2) {
            f3 = 48.0f;
        }
        c1384530m8J.LIZ = f3;
        c1384530m8J.LJI.LIZ(1200);
        int i5 = this.LIZLLL.LIZIZ;
        int i6 = c1384530m8J.LIZIZ;
        c1384530m8J.LIZIZ = i5;
        c1384530m8J.LJI.LIZ(1201);
        Typeface typeface = this.LIZLLL.LIZJ;
        Intrinsics.LJFF(c1384530m8J.LIZJ, typeface);
        c1384530m8J.LIZJ = typeface;
        c1384530m8J.LJI.LIZ(1202);
        C1385090m9D c1385090m9D = config.LIZLLL;
        int i7 = 255;
        int i8 = (int) (this.LJ.LIZLLL * 255);
        int i9 = c1385090m9D.LIZJ;
        if (i8 < 0) {
            i7 = 0;
        } else if (i8 <= 255) {
            i7 = i8;
        }
        c1385090m9D.LIZJ = i7;
        c1385090m9D.LJIILJJIL.LIZ(1100);
        c1385090m9D.LIZ((int) (this.LJ.LIZJ * 100));
        c1385090m9D.LJIILIIL = true;
        if (z) {
            aFwS259S0000000_21 = this.LJFF;
        } else {
            aFwS259S0000000_21 = this.LJI;
        }
        c1385090m9D.LIZLLL = new AwS600S0100000_21(aFwS259S0000000_21, (Function1<? super IDanmakuData, Integer>) 149);
        boolean z3 = c1385090m9D.LJIIJJI;
        c1385090m9D.LJIIJJI = true;
        c1385090m9D.LJIILJJIL.LIZ(1108);
        boolean z4 = C2510909sh.LIZ;
        boolean z5 = c1385090m9D.LJIIJ;
        c1385090m9D.LJIIJ = z4;
        c1385090m9D.LJIILJJIL.LIZ(1106);
        if (((Boolean) C275050AqF.LIZ.getValue()).booleanValue()) {
            c1385090m9D.LJIIL = true;
            c1385090m9D.LJIILJJIL.LIZ(1108);
        }
        C1384720m8c c1384720m8c = config.LJI;
        int i10 = c1384720m8c.LIZIZ;
        c1384720m8c.LIZIZ = 0;
        c1384720m8c.LIZJ.LIZ(1503);
        C1384710m8b c1384710m8b = config.LJII;
        int i11 = c1384710m8b.LIZIZ;
        c1384710m8b.LIZIZ = 0;
        c1384710m8b.LIZJ.LIZ(1603);
        this.LIZ = interfaceC1384330m7z;
        return true;
    }
}
