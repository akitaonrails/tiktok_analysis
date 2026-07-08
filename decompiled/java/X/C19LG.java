package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.19LG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LG {
    public static final Matrix LJIILL = new Matrix();
    public final Path LIZ;
    public final Path LIZIZ;
    public final Matrix LIZJ;
    public Paint LIZLLL;
    public Paint LJ;
    public PathMeasure LJFF;
    public final C19LF LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public Boolean LJIILIIL;
    public final C830490Whz<String, Object> LJIILJJIL;

    public C19LG() {
        this.LIZJ = new Matrix();
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 255;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = new C830490Whz<>();
        this.LJI = new C19LF();
        this.LIZ = new Path();
        this.LIZIZ = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.LJIIJJI;
    }

    public C19LG(C19LG c19lg) {
        this.LIZJ = new Matrix();
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 255;
        this.LJIIL = null;
        this.LJIILIIL = null;
        C830490Whz<String, Object> c830490Whz = new C830490Whz<>();
        this.LJIILJJIL = c830490Whz;
        this.LJI = new C19LF(c19lg.LJI, c830490Whz);
        this.LIZ = new Path(c19lg.LIZ);
        this.LIZIZ = new Path(c19lg.LIZIZ);
        this.LJII = c19lg.LJII;
        this.LJIIIIZZ = c19lg.LJIIIIZZ;
        this.LJIIIZ = c19lg.LJIIIZ;
        this.LJIIJ = c19lg.LJIIJ;
        this.LJIIJJI = c19lg.LJIIJJI;
        this.LJIIL = c19lg.LJIIL;
        String str = c19lg.LJIIL;
        if (str != null) {
            c830490Whz.put(str, this);
        }
        this.LJIILIIL = c19lg.LJIILIIL;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.LJIIJJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final void LIZ(C19LF c19lf, Matrix matrix, Canvas canvas, int i, int i2) {
        boolean z;
        Path.FillType fillType;
        Path.FillType fillType2;
        c19lf.LIZ.set(matrix);
        c19lf.LIZ.preConcat(c19lf.LJIIIZ);
        canvas.save();
        ?? r4 = 0;
        int i3 = 0;
        while (i3 < c19lf.LIZIZ.size()) {
            AbstractC21519319Jn abstractC21519319Jn = (AbstractC21519319Jn) ListProtector.get(c19lf.LIZIZ, i3);
            if (abstractC21519319Jn instanceof C19LF) {
                LIZ((C19LF) abstractC21519319Jn, c19lf.LIZ, canvas, i, i2);
            } else if (abstractC21519319Jn instanceof AbstractC21519119Jl) {
                AbstractC21519119Jl abstractC21519119Jl = (AbstractC21519119Jl) abstractC21519319Jn;
                float f = i / this.LJIIIZ;
                float f2 = i2 / this.LJIIJ;
                float fMin = Math.min(f, f2);
                Matrix matrix2 = c19lf.LIZ;
                this.LIZJ.set(matrix2);
                this.LIZJ.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[r4], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[r4] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                if (fMax > 0.0f) {
                    float fAbs = Math.abs(f3) / fMax;
                    if (fAbs != 0.0f) {
                        Path path = this.LIZ;
                        abstractC21519119Jl.getClass();
                        path.reset();
                        C21518919Jj[] c21518919JjArr = abstractC21519119Jl.LIZ;
                        if (c21518919JjArr != null) {
                            C21518819Ji.LJFF(c21518919JjArr, path);
                        }
                        Path path2 = this.LIZ;
                        this.LIZIZ.reset();
                        if (abstractC21519119Jl instanceof C21519219Jm) {
                            Path path3 = this.LIZIZ;
                            if (abstractC21519119Jl.LIZJ == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.LIZIZ.addPath(path2, this.LIZJ);
                            canvas.clipPath(this.LIZIZ);
                        } else {
                            C21530219Ns c21530219Ns = (C21530219Ns) abstractC21519119Jl;
                            float f4 = c21530219Ns.LJIIIZ;
                            if (f4 != 0.0f || c21530219Ns.LJIIJ != 1.0f) {
                                float f5 = c21530219Ns.LJIIJJI;
                                float f6 = (f4 + f5) % 1.0f;
                                float f7 = (c21530219Ns.LJIIJ + f5) % 1.0f;
                                if (this.LJFF == null) {
                                    this.LJFF = new PathMeasure();
                                }
                                this.LJFF.setPath(this.LIZ, r4);
                                float length = this.LJFF.getLength();
                                float f8 = f6 * length;
                                float f9 = f7 * length;
                                path2.reset();
                                if (f8 > f9) {
                                    this.LJFF.getSegment(f8, length, path2, true);
                                    this.LJFF.getSegment(0.0f, f9, path2, true);
                                } else {
                                    this.LJFF.getSegment(f8, f9, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.LIZIZ.addPath(path2, this.LIZJ);
                            C21530119Nr c21530119Nr = c21530219Ns.LJI;
                            if (c21530119Nr.LIZ == null && c21530119Nr.LIZJ == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (this.LJ == null) {
                                    Paint paint = new Paint(1);
                                    this.LJ = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.LJ;
                                Shader shader = c21530119Nr.LIZ;
                                if (shader != null) {
                                    shader.setLocalMatrix(this.LIZJ);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c21530219Ns.LJIIIIZZ * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    paint2.setColor((c21530119Nr.LIZJ & 16777215) | (((int) (Color.alpha(r2) * c21530219Ns.LJIIIIZZ)) << 24));
                                }
                                paint2.setColorFilter(null);
                                Path path4 = this.LIZIZ;
                                if (c21530219Ns.LIZJ == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas.drawPath(this.LIZIZ, paint2);
                            }
                            C21530119Nr c21530119Nr2 = c21530219Ns.LJ;
                            if (c21530119Nr2.LIZ != null || c21530119Nr2.LIZJ != 0) {
                                if (this.LIZLLL == null) {
                                    Paint paint3 = new Paint(1);
                                    this.LIZLLL = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.LIZLLL;
                                Paint.Join join = c21530219Ns.LJIILIIL;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c21530219Ns.LJIIL;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c21530219Ns.LJIILJJIL);
                                Shader shader2 = c21530119Nr2.LIZ;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(this.LIZJ);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c21530219Ns.LJII * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    paint4.setColor((c21530119Nr2.LIZJ & 16777215) | (((int) (Color.alpha(r2) * c21530219Ns.LJII)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c21530219Ns.LJFF * fAbs * fMin);
                                canvas.drawPath(this.LIZIZ, paint4);
                            }
                        }
                    }
                }
            }
            i3++;
            r4 = 0;
        }
        canvas.restore();
    }
}
