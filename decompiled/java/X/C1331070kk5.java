package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1331070kk5 implements InterfaceC1320140kSS {
    public final Drawable LIZ;
    public final Resources LIZIZ;
    public C1331100kk8 LIZJ;
    public final Context LIZLLL;
    public final C1321120kU2 LJ;
    public final C1331110kk9 LJFF;
    public final C1331050kk3 LJI;

    public final void LJIIIIZZ() {
        LJIIIZ(1);
        LJIIIZ(2);
        LJIIIZ(3);
        LJIIIZ(4);
        LJIIIZ(5);
    }

    public final InterfaceC1320380kSq LJIIJJI() {
        if (LJIIL(2) instanceof C1319910kS5) {
            return LJIILIIL(2).LLILZIL;
        }
        return null;
    }

    @Override // X.InterfaceC1320140kSS
    public final void LIZ() {
        this.LJFF.LLJJIII++;
        LJIIIIZZ();
        if (this.LJFF.LIZ(4) != null) {
            LJII(4);
        } else {
            LJII(1);
        }
        r1.LLJJIII--;
        this.LJFF.invalidateSelf();
    }

    @Override // X.InterfaceC1320140kSS
    public final void LIZJ() {
        this.LJFF.LLJJIII++;
        LJIIIIZZ();
        if (this.LJFF.LIZ(5) != null) {
            LJII(5);
        } else {
            LJII(1);
        }
        r1.LLJJIII--;
        this.LJFF.invalidateSelf();
    }

    public final boolean LJIILJJIL() {
        return this.LJFF.LIZ(1) != null;
    }

    public final void LJIILL() {
        C1331110kk9 c1331110kk9 = this.LJFF;
        if (c1331110kk9 != null) {
            c1331110kk9.LLJJIII++;
            c1331110kk9.LLJI = 0;
            Arrays.fill(c1331110kk9.LLJJI, true);
            c1331110kk9.invalidateSelf();
            LJIIIIZZ();
            LJII(1);
            this.LJFF.LIZLLL();
            r1.LLJJIII--;
            this.LJFF.invalidateSelf();
        }
    }

    @Override // X.InterfaceC1320140kSS
    public final void reset() {
        this.LJI.LJIILIIL(this.LIZ);
        LJIILL();
    }

    @Override // X.InterfaceC1316360kMM
    public final C1321120kU2 LIZIZ() {
        return this.LJ;
    }

    public C1331070kk5(C1331090kk7 c1331090kk7) {
        int size;
        int i;
        int i2 = 0;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.LIZ = colorDrawable;
        C1336010ks3.LIZIZ();
        this.LIZIZ = c1331090kk7.LIZ;
        this.LIZLLL = c1331090kk7.LIZIZ;
        this.LIZJ = c1331090kk7.LJIIZILJ;
        C1331050kk3 c1331050kk3 = new C1331050kk3(colorDrawable);
        this.LJI = c1331050kk3;
        List<Drawable> list = c1331090kk7.LJIILL;
        int i3 = 1;
        if (list != null) {
            size = list.size();
        } else {
            size = 1;
        }
        if (c1331090kk7.LJIILLIIL != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i4 = size + i;
        Drawable[] drawableArr = new Drawable[i4 + 6];
        drawableArr[0] = LJI(c1331090kk7.LJIILJJIL, null);
        drawableArr[1] = LJI(c1331090kk7.LJ, c1331090kk7.LJFF);
        InterfaceC1320380kSq interfaceC1320380kSq = c1331090kk7.LJIIL;
        PointF pointF = c1331090kk7.LJIILIIL;
        c1331050kk3.setColorFilter(null);
        drawableArr[2] = C1331080kk6.LJ(c1331050kk3, interfaceC1320380kSq, pointF);
        drawableArr[3] = LJI(c1331090kk7.LJIIJ, c1331090kk7.LJIIJJI);
        drawableArr[4] = LJI(c1331090kk7.LJI, c1331090kk7.LJII);
        drawableArr[5] = LJI(c1331090kk7.LJIIIIZZ, c1331090kk7.LJIIIZ);
        if (i4 > 0) {
            List<Drawable> list2 = c1331090kk7.LJIILL;
            if (list2 != null) {
                Iterator<Drawable> it2 = list2.iterator();
                while (it2.hasNext()) {
                    drawableArr[i2 + 6] = LJI(it2.next(), null);
                    i2++;
                }
                i3 = i2;
            }
            Drawable drawable = c1331090kk7.LJIILLIIL;
            if (drawable != null) {
                drawableArr[i3 + 6] = LJI(drawable, null);
            }
        }
        C1331110kk9 c1331110kk9 = new C1331110kk9(drawableArr);
        this.LJFF = c1331110kk9;
        c1331110kk9.LJ(c1331090kk7.LIZJ);
        C1321120kU2 c1321120kU2 = new C1321120kU2(C1331080kk6.LIZLLL(c1331110kk9, this.LIZJ));
        this.LJ = c1321120kU2;
        c1321120kU2.mutate();
        LJIILL();
        C1336010ks3.LIZIZ();
    }

    @Override // X.InterfaceC1320140kSS
    public final void LIZLLL(Drawable drawable) {
        C1321120kU2 c1321120kU2 = this.LJ;
        c1321120kU2.LLILZIL = drawable;
        c1321120kU2.invalidateSelf();
    }

    public final void LJII(int i) {
        if (i >= 0) {
            C1331110kk9 c1331110kk9 = this.LJFF;
            c1331110kk9.LLJI = 0;
            c1331110kk9.LLJJI[i] = true;
            c1331110kk9.invalidateSelf();
        }
    }

    public final void LJIIIZ(int i) {
        if (i >= 0) {
            C1331110kk9 c1331110kk9 = this.LJFF;
            c1331110kk9.LLJI = 0;
            c1331110kk9.LLJJI[i] = false;
            c1331110kk9.invalidateSelf();
        }
    }

    public final void LJIIJ(RectF rectF) {
        C1331050kk3 c1331050kk3 = this.LJI;
        Matrix matrix = C1331050kk3.LLILZ;
        c1331050kk3.LJIIL(matrix);
        rectF.set(c1331050kk3.getBounds());
        matrix.mapRect(rectF);
    }

    public final InterfaceC722050STz LJIIL(final int i) {
        boolean z;
        final C1331110kk9 c1331110kk9 = this.LJFF;
        c1331110kk9.getClass();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i >= c1331110kk9.LLILZ.length) {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        InterfaceC722050STz[] interfaceC722050STzArr = c1331110kk9.LLILZ;
        if (interfaceC722050STzArr[i] == null) {
            interfaceC722050STzArr[i] = new InterfaceC722050STz() { // from class: X.0kkB
                @Override // X.InterfaceC722050STz
                public final Drawable LIZ() {
                    return c1331110kk9.LIZ(i);
                }

                @Override // X.InterfaceC722050STz
                public final Drawable LIZJ(Drawable drawable) {
                    return c1331110kk9.LIZJ(drawable, i);
                }
            };
        }
        InterfaceC722050STz interfaceC722050STz = interfaceC722050STzArr[i];
        if (interfaceC722050STz.LIZ() instanceof C1319920kS6) {
            interfaceC722050STz = (C1331050kk3) interfaceC722050STz.LIZ();
        }
        if (interfaceC722050STz.LIZ() instanceof C1319910kS5) {
            return (C1331050kk3) interfaceC722050STz.LIZ();
        }
        return interfaceC722050STz;
    }

    public final C1319910kS5 LJIILIIL(int i) {
        InterfaceC722050STz interfaceC722050STzLJIIL = LJIIL(i);
        if (interfaceC722050STzLJIIL instanceof C1319910kS5) {
            return (C1319910kS5) interfaceC722050STzLJIIL;
        }
        Drawable drawableLJ = C1331080kk6.LJ(interfaceC722050STzLJIIL.LIZJ(C1331080kk6.LIZ), InterfaceC1320380kSq.LIZ, null);
        interfaceC722050STzLJIIL.LIZJ(drawableLJ);
        C1322350kW1.LIZLLL(drawableLJ, "Parent has no child drawable!");
        return (C1319910kS5) drawableLJ;
    }

    public final void LJIILLIIL(PointF pointF) {
        LJIILIIL(2).LJIJ(pointF);
    }

    public final void LJIIZILJ(InterfaceC1320380kSq interfaceC1320380kSq) {
        interfaceC1320380kSq.getClass();
        LJIILIIL(2).LJIJI(interfaceC1320380kSq);
    }

    public final void LJIJI(int i) {
        this.LJFF.LJ(i);
    }

    public final void LJIL(Drawable drawable) {
        boolean z;
        if (6 < this.LJFF.LLILLL.length) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("The given index does not correspond to an overlay image.", z);
        LJIJ(drawable, 6);
    }

    public final void LJJ(int i) {
        LJIJ(this.LIZIZ.getDrawable(i), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJII(float f) {
        Drawable drawableLIZ = this.LJFF.LIZ(3);
        if (drawableLIZ == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableLIZ instanceof Animatable) {
                ((Animatable) drawableLIZ).stop();
            }
            LJIIIZ(3);
        } else {
            if (drawableLIZ instanceof Animatable) {
                ((Animatable) drawableLIZ).start();
            }
            LJII(3);
        }
        drawableLIZ.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIII(C1331100kk8 c1331100kk8) {
        this.LIZJ = c1331100kk8;
        C1321120kU2 c1321120kU2 = this.LJ;
        Drawable drawable = C1331080kk6.LIZ;
        Drawable drawable2 = c1321120kU2.LL;
        if (c1331100kk8 != null && c1331100kk8.LIZ == EnumC1321320kUM.OVERLAY_COLOR) {
            if (drawable2 instanceof C1322840kWo) {
                C1322840kWo c1322840kWo = (C1322840kWo) drawable2;
                C1331080kk6.LIZIZ(c1322840kWo, c1331100kk8);
                c1322840kWo.LLJJ = c1331100kk8.LIZLLL;
                c1322840kWo.invalidateSelf();
            } else {
                c1321120kU2.LJIILIIL(C1331080kk6.LIZLLL(c1321120kU2.LJIILIIL(C1331080kk6.LIZ), c1331100kk8));
            }
        } else if (drawable2 instanceof C1322840kWo) {
            c1321120kU2.LJIILIIL(((C1331050kk3) drawable2).LJIILIIL(C1331080kk6.LIZ));
            C1331080kk6.LIZ.setCallback(null);
        }
        for (int i = 0; i < this.LJFF.LLILLL.length; i++) {
            InterfaceC722050STz interfaceC722050STzLJIIL = LJIIL(i);
            C1331100kk8 c1331100kk82 = this.LIZJ;
            Resources resources = this.LIZIZ;
            while (true) {
                Object objLIZ = interfaceC722050STzLJIIL.LIZ();
                if (objLIZ == interfaceC722050STzLJIIL || !(objLIZ instanceof InterfaceC722050STz)) {
                    break;
                } else {
                    interfaceC722050STzLJIIL = (InterfaceC722050STz) objLIZ;
                }
            }
            Drawable drawableLIZ = interfaceC722050STzLJIIL.LIZ();
            if (c1331100kk82 != null && c1331100kk82.LIZ == EnumC1321320kUM.BITMAP_ONLY) {
                if (drawableLIZ instanceof InterfaceC1331120kkA) {
                    C1331080kk6.LIZIZ((InterfaceC1331120kkA) drawableLIZ, c1331100kk82);
                } else if (drawableLIZ != 0) {
                    interfaceC722050STzLJIIL.LIZJ(C1331080kk6.LIZ);
                    interfaceC722050STzLJIIL.LIZJ(C1331080kk6.LIZ(drawableLIZ, c1331100kk82, resources));
                }
            } else if (drawableLIZ instanceof InterfaceC1331120kkA) {
                InterfaceC1331120kkA interfaceC1331120kkA = (InterfaceC1331120kkA) drawableLIZ;
                interfaceC1331120kkA.LJIIIIZZ(false);
                interfaceC1331120kkA.setRadius(0.0f);
                interfaceC1331120kkA.LJIIJ(0.0f, 0);
                interfaceC1331120kkA.LJIIJJI(0.0f);
                interfaceC1331120kkA.LJII(false);
            }
        }
    }

    @Override // X.InterfaceC1320140kSS
    public final void LJ(float f, boolean z) {
        if (this.LJFF.LIZ(3) == null) {
            return;
        }
        this.LJFF.LLJJIII++;
        LJJII(f);
        if (z) {
            this.LJFF.LIZLLL();
        }
        r1.LLJJIII--;
        this.LJFF.invalidateSelf();
    }

    public final Drawable LJI(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq) {
        return C1331080kk6.LJ(C1331080kk6.LIZJ(drawable, this.LIZJ, this.LIZIZ), interfaceC1320380kSq, null);
    }

    public final void LJIJ(Drawable drawable, int i) {
        if (drawable == null) {
            this.LJFF.LIZJ(null, i);
        } else {
            LJIIL(i).LIZJ(C1331080kk6.LIZJ(drawable, this.LIZJ, this.LIZIZ));
        }
    }

    public final void LJIJJ(int i, InterfaceC1320380kSq interfaceC1320380kSq) {
        LJIJJLI(this.LIZIZ.getDrawable(i), interfaceC1320380kSq);
    }

    public final void LJIJJLI(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq) {
        LJIJ(drawable, 5);
        LJIILIIL(5).LJIJI(interfaceC1320380kSq);
    }

    public final void LJJI(int i, InterfaceC1320380kSq interfaceC1320380kSq) {
        LJJIFFI(this.LIZIZ.getDrawable(i), interfaceC1320380kSq);
    }

    public void LJJIFFI(final Drawable drawable, final InterfaceC1320380kSq interfaceC1320380kSq) {
        if (drawable == null) {
            try {
                FrescoDraweeViewNPEChecker.recordDrawableNullPoint();
                if (C1328730kgJ.LJIIZILJ) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Context context = this.LIZLLL;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: X.0JeQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GenericDraweeHierarchy@dd4.setPlaceholderImage$1");
                        try {
                            this.LLILLL.LJIJ(drawable, 1);
                            this.LLILLL.LJIILIIL(1).LJIJI(interfaceC1320380kSq);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GenericDraweeHierarchy@dd4.setPlaceholderImage$1");
                    }
                });
                return;
            }
            return;
        }
        LJIJ(drawable, 1);
        LJIILIIL(1).LJIJI(interfaceC1320380kSq);
    }

    @Override // X.InterfaceC1320140kSS
    public final void LJFF(Drawable drawable, float f, boolean z) {
        Drawable drawableLIZJ = C1331080kk6.LIZJ(drawable, this.LIZJ, this.LIZIZ);
        drawableLIZJ.mutate();
        this.LJI.LJIILIIL(drawableLIZJ);
        this.LJFF.LLJJIII++;
        LJIIIIZZ();
        LJII(2);
        LJJII(f);
        if (z) {
            this.LJFF.LIZLLL();
        }
        r1.LLJJIII--;
        this.LJFF.invalidateSelf();
    }
}
