package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21540119Rn {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public final List<AbstractC21540819Ru> LJI = new ArrayList();
    public final List<AbstractC21539319Rf> LJII = new ArrayList();

    public C21540119Rn() {
        LJ(0.0f, 270.0f, 0.0f);
    }

    public final void LIZIZ(float f) {
        float f2 = this.LJ;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.LIZJ;
        float f5 = this.LIZLLL;
        C21540519Rr c21540519Rr = new C21540519Rr(f4, f5, f4, f5);
        c21540519Rr.LJFF = this.LJ;
        c21540519Rr.LJI = f3;
        ((ArrayList) this.LJII).add(new C21540219Ro(c21540519Rr));
        this.LJ = f;
    }

    public final void LIZJ(Matrix matrix, Path path) {
        int size = ((ArrayList) this.LJI).size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21540819Ru) ListProtector.get(this.LJI, i)).LIZ(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.19Rp, java.lang.Object] */
    public final void LIZLLL(float f, float f2) {
        final C21540619Rs c21540619Rs = new C21540619Rs();
        c21540619Rs.LIZIZ = f;
        c21540619Rs.LIZJ = f2;
        ((ArrayList) this.LJI).add(c21540619Rs);
        final float f3 = this.LIZJ;
        final float f4 = this.LIZLLL;
        ?? r3 = new AbstractC21539319Rf(c21540619Rs, f3, f4) { // from class: X.19Rp
            public final C21540619Rs LIZIZ;
            public final float LIZJ;
            public final float LIZLLL;

            public final float LIZIZ() {
                C21540619Rs c21540619Rs2 = this.LIZIZ;
                return (float) Math.toDegrees(Math.atan((c21540619Rs2.LIZJ - this.LIZLLL) / (c21540619Rs2.LIZIZ - this.LIZJ)));
            }

            {
                this.LIZIZ = c21540619Rs;
                this.LIZJ = f3;
                this.LIZLLL = f4;
            }

            @Override // X.AbstractC21539319Rf
            public final void LIZ(Matrix matrix, C21540419Rq c21540419Rq, int i, Canvas canvas) {
                C21540619Rs c21540619Rs2 = this.LIZIZ;
                RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(c21540619Rs2.LIZJ - this.LIZLLL, c21540619Rs2.LIZIZ - this.LIZJ), 0.0f);
                Matrix matrix2 = new Matrix(matrix);
                matrix2.preTranslate(this.LIZJ, this.LIZLLL);
                matrix2.preRotate(LIZIZ());
                c21540419Rq.getClass();
                rectF.bottom += i;
                rectF.offset(0.0f, -i);
                int[] iArr = C21540419Rq.LJIIIIZZ;
                iArr[0] = c21540419Rq.LJFF;
                iArr[1] = c21540419Rq.LJ;
                iArr[2] = c21540419Rq.LIZLLL;
                Paint paint = c21540419Rq.LIZJ;
                float f5 = rectF.left;
                paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C21540419Rq.LJIIIZ, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix2);
                canvas.drawRect(rectF, c21540419Rq.LIZJ);
                canvas.restore();
            }
        };
        float fLIZIZ = r3.LIZIZ() + 270.0f;
        float fLIZIZ2 = r3.LIZIZ() + 270.0f;
        LIZIZ(fLIZIZ);
        ((ArrayList) this.LJII).add(r3);
        this.LJ = fLIZIZ2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }

    public final void LJ(float f, float f2, float f3) {
        this.LIZ = 0.0f;
        this.LIZIZ = f;
        this.LIZJ = 0.0f;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = (f2 + f3) % 360.0f;
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJII).clear();
    }

    public final void LIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        C21540519Rr c21540519Rr = new C21540519Rr(f, f2, f3, f4);
        c21540519Rr.LJFF = f5;
        c21540519Rr.LJI = f6;
        ((ArrayList) this.LJI).add(c21540519Rr);
        C21540219Ro c21540219Ro = new C21540219Ro(c21540519Rr);
        float f8 = f5 + f6;
        if (f6 < 0.0f && 1 != 0) {
            f5 = (f5 + 180.0f) % 360.0f;
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        LIZIZ(f5);
        ((ArrayList) this.LJII).add(c21540219Ro);
        this.LJ = f7;
        double d = f8;
        this.LIZJ = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.LIZLLL = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }
}
