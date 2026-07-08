package X;

import android.graphics.DashPathEffect;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0kv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337870kv3 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJI;
    public boolean LJII;
    public float LJIIIZ;
    public int LJIIJ;
    public DashPathEffect LJIIJJI;
    public RectF LJIIL;
    public float[] LJIILIIL;
    public Path LJIILJJIL;
    public boolean LJIILL;
    public RectF LJIILLIIL;
    public float[] LJIIZILJ;
    public Path LJIJ;
    public boolean LJIJI;
    public RectF LJIJJ;
    public float[] LJIJJLI;
    public Path LJIL;
    public boolean LJJ;
    public C1337890kv5 LJJI;
    public Path LJJIFFI;
    public boolean LJJII;
    public RectF LJJIII;
    public float[] LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJFF = -1;
    public boolean LJIIIIZZ = true;

    public final C1337890kv5 LIZ() {
        C1337890kv5 c1337890kv5 = this.LJJI;
        if (c1337890kv5 != null) {
            return c1337890kv5;
        }
        C1337890kv5 c1337890kv52 = new C1337890kv5();
        this.LJJI = c1337890kv52;
        return c1337890kv52;
    }

    public final Path LIZIZ() {
        Path path = this.LJIL;
        if (path != null) {
            return path;
        }
        Path path2 = new Path();
        this.LJIL = path2;
        return path2;
    }

    public final void LIZLLL(View view) {
        LIZJ(view.getScrollX(), view.getScrollY(), view.getWidth(), view.getHeight());
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.LJJ && this.LJJIIJZLJL == i && this.LJJIIZ == i2) {
            return;
        }
        this.LJJIIJZLJL = i;
        this.LJJIIZ = i2;
        this.LJJ = false;
        float f5 = this.LJIIIZ;
        Path pathLIZIZ = LIZIZ();
        pathLIZIZ.reset();
        RectF rectF = this.LJIJJ;
        if (rectF == null) {
            rectF = new RectF();
            this.LJIJJ = rectF;
        }
        rectF.set(i + f5, i2 + f5, (i + i3) - f5, (i2 + i4) - f5);
        float f6 = 0.0f;
        if (this.LJFF == 0) {
            float f7 = this.LJI - f5;
            if (f7 >= 0.0f) {
                f6 = f7;
            }
            pathLIZIZ.addRoundRect(rectF, f6, f6, Path.Direction.CCW);
            return;
        }
        float f8 = this.LIZ;
        float f9 = this.LIZJ;
        float f10 = this.LIZLLL;
        float f11 = this.LIZIZ;
        float[] fArr = this.LJIJJLI;
        if (fArr == null) {
            fArr = new float[8];
            this.LJIJJLI = fArr;
        }
        float f12 = f8 - f5;
        if (f12 < 0.0f) {
            f = 0.0f;
        } else {
            f = f12;
        }
        fArr[0] = f;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        fArr[1] = f12;
        float f13 = f9 - f5;
        if (f13 < 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = f13;
        }
        fArr[2] = f2;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        fArr[3] = f13;
        float f14 = f10 - f5;
        if (f14 < 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = f14;
        }
        fArr[4] = f3;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        fArr[5] = f14;
        float f15 = f11 - f5;
        if (f15 < 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = f15;
        }
        fArr[6] = f4;
        if (f15 >= 0.0f) {
            f6 = f15;
        }
        fArr[7] = f6;
        pathLIZIZ.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    public final void LJ(int i, int i2, int i3, int i4) {
        if (this.LJIILL) {
            if ((this.LJ && !this.LJII) || this.LJJI != null) {
                this.LJIILL = false;
                RectF rectF = this.LJIIL;
                if (rectF == null) {
                    rectF = new RectF();
                    this.LJIIL = rectF;
                }
                rectF.set(i, i2, i3, i4);
                Path path = this.LJIILJJIL;
                if (path == null) {
                    path = new Path();
                    this.LJIILJJIL = path;
                }
                path.reset();
                if (this.LJFF == 0) {
                    float f = this.LJI;
                    path.addRoundRect(rectF, f, f, Path.Direction.CCW);
                    return;
                }
                float f2 = this.LIZ;
                float f3 = this.LIZJ;
                float f4 = this.LIZLLL;
                float f5 = this.LIZIZ;
                float[] fArr = this.LJIILIIL;
                if (fArr == null) {
                    fArr = new float[8];
                    this.LJIILIIL = fArr;
                }
                fArr[0] = f2;
                fArr[1] = f2;
                fArr[2] = f3;
                fArr[3] = f3;
                fArr[4] = f4;
                fArr[5] = f4;
                fArr[6] = f5;
                fArr[7] = f5;
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
        }
    }
}
