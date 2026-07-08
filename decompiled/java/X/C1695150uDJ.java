package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: X.0uDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695150uDJ implements InterfaceC1695240uDS {
    public final Paint LIZ;
    public int LIZIZ = 3;
    public Shader LIZJ;
    public C1685400txa LIZLLL;
    public InterfaceC1669090tXH LJ;

    @Override // X.InterfaceC1695240uDS
    public final float LIZ() {
        return this.LIZ.getAlpha() / 255.0f;
    }

    @Override // X.InterfaceC1695240uDS
    public final long LIZJ() {
        return C1685850tyJ.LIZIZ(this.LIZ.getColor());
    }

    @Override // X.InterfaceC1695240uDS
    public final int LJIILLIIL() {
        return !this.LIZ.isFilterBitmap() ? 0 : 1;
    }

    public final int LJIIZILJ() {
        int i;
        Paint.Cap strokeCap = this.LIZ.getStrokeCap();
        if (strokeCap == null || (i = C1293890jm7.LIZ[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 2 : 0;
        }
        return 1;
    }

    public final int LJIJI() {
        int i;
        Paint.Join strokeJoin = this.LIZ.getStrokeJoin();
        if (strokeJoin != null && (i = C1293890jm7.LIZIZ[strokeJoin.ordinal()]) != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
        }
        return 0;
    }

    public final float LJIJJ() {
        return this.LIZ.getStrokeMiter();
    }

    public final float LJIJJLI() {
        return this.LIZ.getStrokeWidth();
    }

    @Override // X.InterfaceC1695240uDS
    public final C1685400txa LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1695240uDS
    public final Paint LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1695240uDS
    public final Shader LJIILJJIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1695240uDS
    public final int LJIJ() {
        return this.LIZIZ;
    }

    public C1695150uDJ(Paint paint) {
        this.LIZ = paint;
    }

    @Override // X.InterfaceC1695240uDS
    public final void LIZLLL(int i) {
        Paint.Cap cap;
        Paint paint = this.LIZ;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJ(InterfaceC1669090tXH interfaceC1669090tXH) {
        PathEffect pathEffect;
        Paint paint = this.LIZ;
        C1669080tXG c1669080tXG = (C1669080tXG) interfaceC1669090tXH;
        if (c1669080tXG != null) {
            pathEffect = c1669080tXG.LIZIZ;
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
        this.LJ = interfaceC1669090tXH;
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJFF(int i) {
        Paint.Style style;
        Paint paint = this.LIZ;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJI(float f) {
        this.LIZ.setStrokeWidth(f);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJII(int i) {
        Paint.Join join;
        Paint paint = this.LIZ;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIIIIZZ(float f) {
        this.LIZ.setStrokeMiter(f);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIIIZ(long j) {
        this.LIZ.setColor(C1685850tyJ.LJIIIZ(j));
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIIJ(int i) {
        if (this.LIZIZ != i) {
            this.LIZIZ = i;
            Paint paint = this.LIZ;
            if (Build.VERSION.SDK_INT >= 29) {
                paint.setBlendMode(C418890Gbf.LIZ(i));
            } else {
                paint.setXfermode(new PorterDuffXfermode(C418890Gbf.LIZIZ(i)));
            }
        }
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIIJJI(C1685400txa c1685400txa) {
        ColorFilter colorFilter;
        this.LIZLLL = c1685400txa;
        Paint paint = this.LIZ;
        if (c1685400txa != null) {
            colorFilter = c1685400txa.LIZ;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIIL(int i) {
        boolean z;
        Paint paint = this.LIZ;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    @Override // X.InterfaceC1695240uDS
    public final void LJIILL(Shader shader) {
        this.LIZJ = shader;
        this.LIZ.setShader(shader);
    }

    @Override // X.InterfaceC1695240uDS
    public final void setAlpha(float f) {
        this.LIZ.setAlpha((int) Math.rint(f * 255.0f));
    }
}
