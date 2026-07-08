package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: X.19Rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21538919Rb extends Drawable implements C19S4 {
    public static final Paint LLJJJJ = new Paint(1);
    public C21539019Rc LL;
    public final AbstractC21539319Rf[] LLILLJJLI;
    public final AbstractC21539319Rf[] LLILLL;
    public final BitSet LLILZ;
    public boolean LLILZIL;
    public final Matrix LLILZLL;
    public final Path LLIZ;
    public final Path LLIZLLLIL;
    public final RectF LLJ;
    public final RectF LLJI;
    public final Region LLJIJIL;
    public final Region LLJILJIL;
    public C19RX LLJILJILJ;
    public final Paint LLJILLL;
    public final Paint LLJJ;
    public final C21540419Rq LLJJI;
    public final C21539919Rl LLJJIII;
    public final C21540019Rm LLJJIJI;
    public PorterDuffColorFilter LLJJIJIIJIL;
    public PorterDuffColorFilter LLJJIJIL;
    public final RectF LLJJJ;
    public boolean LLJJJIL;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.LLILZIL = true;
        super.invalidateSelf();
    }

    public C21538919Rb() {
        this(new C19RX());
    }

    public final RectF LJI() {
        this.LLJ.set(getBounds());
        return this.LLJ;
    }

    public final float LJII() {
        return this.LL.LIZ.LJ.LIZ(LJI());
    }

    public final boolean LJIIIZ() {
        return this.LL.LIZ.LIZLLL(LJI());
    }

    public final boolean LJIJ() {
        PorterDuffColorFilter porterDuffColorFilter = this.LLJJIJIIJIL;
        PorterDuffColorFilter porterDuffColorFilter2 = this.LLJJIJIL;
        C21539019Rc c21539019Rc = this.LL;
        this.LLJJIJIIJIL = LIZJ(c21539019Rc.LJFF, c21539019Rc.LJI, this.LLJILLL, true);
        C21539019Rc c21539019Rc2 = this.LL;
        this.LLJJIJIL = LIZJ(c21539019Rc2.LJ, c21539019Rc2.LJI, this.LLJJ, false);
        C21539019Rc c21539019Rc3 = this.LL;
        if (c21539019Rc3.LJIJI) {
            this.LLJJI.LIZ(c21539019Rc3.LJFF.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.LLJJIJIIJIL) && Objects.equals(porterDuffColorFilter2, this.LLJJIJIL)) ? false : true;
    }

    public final void LJIJI() {
        C21539019Rc c21539019Rc = this.LL;
        float f = c21539019Rc.LJIILIIL + c21539019Rc.LJIILJJIL;
        c21539019Rc.LJIILLIIL = (int) Math.ceil(0.75f * f);
        this.LL.LJIIZILJ = (int) Math.ceil(f * 0.25f);
        LJIJ();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.LL = new C21539019Rc(this.LL);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.LLJIJIL.set(getBounds());
        LIZIZ(this.LLIZ, LJI());
        this.LLJILJIL.setPath(this.LLIZ, this.LLJIJIL);
        this.LLJIJIL.op(this.LLJILJIL, Region.Op.DIFFERENCE);
        return this.LLJIJIL;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.LL.LJFF;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.LL.LJ;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.LL.LIZLLL;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.LL.LIZJ;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.LL;
    }

    public C21538919Rb(C21539019Rc c21539019Rc) {
        C21540019Rm c21540019Rm;
        this.LLILLJJLI = new AbstractC21539319Rf[4];
        this.LLILLL = new AbstractC21539319Rf[4];
        this.LLILZ = new BitSet(8);
        this.LLILZLL = new Matrix();
        this.LLIZ = new Path();
        this.LLIZLLLIL = new Path();
        this.LLJ = new RectF();
        this.LLJI = new RectF();
        this.LLJIJIL = new Region();
        this.LLJILJIL = new Region();
        Paint paint = new Paint(1);
        this.LLJILLL = paint;
        Paint paint2 = new Paint(1);
        this.LLJJ = paint2;
        this.LLJJI = new C21540419Rq();
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            c21540019Rm = C19RE.LIZ;
        } else {
            c21540019Rm = new C21540019Rm();
        }
        this.LLJJIJI = c21540019Rm;
        this.LLJJJ = new RectF();
        this.LLJJJIL = true;
        this.LL = c21539019Rc;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = LLJJJJ;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LJIJ();
        LJIIZILJ(getState());
        this.LLJJIII = new C21539919Rl(this);
    }

    public final int LIZLLL(int i) {
        C21539019Rc c21539019Rc = this.LL;
        float f = c21539019Rc.LJIILIIL + c21539019Rc.LJIILJJIL + c21539019Rc.LJIIL;
        C19Q8 c19q8 = c21539019Rc.LIZIZ;
        if (c19q8 != null && c19q8.LIZ && C2441009hQ.LJIIL(i, 255) == c19q8.LIZJ) {
            float fMin = 0.0f;
            if (c19q8.LIZLLL > 0.0f && f > 0.0f) {
                fMin = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            }
            return C2441009hQ.LJIIL(C19PM.LIZJ(fMin, C2441009hQ.LJIIL(i, 255), c19q8.LIZIZ), Color.alpha(i));
        }
        return i;
    }

    public final void LJ(Canvas canvas) {
        this.LLILZ.cardinality();
        if (this.LL.LJIIZILJ != 0) {
            canvas.drawPath(this.LLIZ, this.LLJJI.LIZ);
        }
        int i = 0;
        do {
            AbstractC21539319Rf abstractC21539319Rf = this.LLILLJJLI[i];
            C21540419Rq c21540419Rq = this.LLJJI;
            int i2 = this.LL.LJIILLIIL;
            Matrix matrix = AbstractC21539319Rf.LIZ;
            abstractC21539319Rf.LIZ(matrix, c21540419Rq, i2, canvas);
            this.LLILLL[i].LIZ(matrix, this.LLJJI, this.LL.LJIILLIIL, canvas);
            i++;
        } while (i < 4);
        if (this.LLJJJIL) {
            int iSin = (int) (((double) this.LL.LJIIZILJ) * Math.sin(Math.toRadians(r1.LJIJ)));
            int iCos = (int) (((double) this.LL.LJIIZILJ) * Math.cos(Math.toRadians(r1.LJIJ)));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(this.LLIZ, LLJJJJ);
            canvas.translate(iSin, iCos);
        }
    }

    public final void LJIIIIZZ(Context context) {
        this.LL.LIZIZ = new C19Q8(context);
        LJIJI();
    }

    public final void LJIIJ(float f) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJIILIIL != f) {
            c21539019Rc.LJIILIIL = f;
            LJIJI();
        }
    }

    public final void LJIIJJI(ColorStateList colorStateList) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LIZJ != colorStateList) {
            c21539019Rc.LIZJ = colorStateList;
            onStateChange(getState());
        }
    }

    public final void LJIIL(float f) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJIIIZ != f) {
            c21539019Rc.LJIIIZ = f;
            this.LLILZIL = true;
            invalidateSelf();
        }
    }

    public final void LJIILIIL(Paint.Style style) {
        this.LL.LJIJJ = style;
        super.invalidateSelf();
    }

    public final void LJIILJJIL(int i) {
        this.LLJJI.LIZ(i);
        this.LL.LJIJI = false;
        super.invalidateSelf();
    }

    public final void LJIILL(int i) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJIILL != i) {
            c21539019Rc.LJIILL = i;
            super.invalidateSelf();
        }
    }

    public final void LJIILLIIL(int i) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJIIZILJ != i) {
            c21539019Rc.LJIIZILJ = i;
            super.invalidateSelf();
        }
    }

    public final boolean LJIIZILJ(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.LL.LIZJ != null && color2 != (colorForState2 = this.LL.LIZJ.getColorForState(iArr, (color2 = this.LLJILLL.getColor())))) {
            this.LLJILLL.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.LL.LIZLLL != null && color != (colorForState = this.LL.LIZLLL.getColorForState(iArr, (color = this.LLJJ.getColor())))) {
            this.LLJJ.setColor(colorForState);
            return true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [X.19Ri] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float strokeWidth;
        float strokeWidth2;
        C21538919Rb c21538919Rb = this;
        c21538919Rb.LLJILLL.setColorFilter(c21538919Rb.LLJJIJIIJIL);
        int alpha = c21538919Rb.LLJILLL.getAlpha();
        Paint paint = c21538919Rb.LLJILLL;
        int i = c21538919Rb.LL.LJIIJJI;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        c21538919Rb.LLJJ.setColorFilter(c21538919Rb.LLJJIJIL);
        c21538919Rb.LLJJ.setStrokeWidth(c21538919Rb.LL.LJIIJ);
        int alpha2 = c21538919Rb.LLJJ.getAlpha();
        Paint paint2 = c21538919Rb.LLJJ;
        int i2 = c21538919Rb.LL.LJIIJJI;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        float strokeWidth3 = 0.0f;
        if (c21538919Rb.LLILZIL) {
            Paint.Style style = c21538919Rb.LL.LJIJJ;
            if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && c21538919Rb.LLJJ.getStrokeWidth() > 0.0f) {
                strokeWidth = c21538919Rb.LLJJ.getStrokeWidth() / 2.0f;
            } else {
                strokeWidth = 0.0f;
            }
            final float f = -strokeWidth;
            C19RX c19rx = c21538919Rb.LL.LIZ;
            ?? r5 = new Object() { // from class: X.19Ri
                public final InterfaceC21538819Ra LIZ(final InterfaceC21538819Ra interfaceC21538819Ra) {
                    if (!(interfaceC21538819Ra instanceof C1844480y6A)) {
                        final float f2 = f;
                        return new InterfaceC21538819Ra(f2, interfaceC21538819Ra) { // from class: X.19Rj
                            public final InterfaceC21538819Ra LIZ;
                            public final float LIZIZ;

                            public final int hashCode() {
                                return Arrays.hashCode(new Object[]{this.LIZ, Float.valueOf(this.LIZIZ)});
                            }

                            @Override // X.InterfaceC21538819Ra
                            public final float LIZ(RectF rectF) {
                                return Math.max(0.0f, this.LIZ.LIZ(rectF) + this.LIZIZ);
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C21539719Rj)) {
                                    return false;
                                }
                                C21539719Rj c21539719Rj = (C21539719Rj) obj;
                                if (this.LIZ.equals(c21539719Rj.LIZ) && this.LIZIZ == c21539719Rj.LIZIZ) {
                                    return true;
                                }
                                return false;
                            }

                            {
                                while (interfaceC21538819Ra instanceof C21539719Rj) {
                                    interfaceC21538819Ra = ((C21539719Rj) interfaceC21538819Ra).LIZ;
                                    f += ((C21539719Rj) interfaceC21538819Ra).LIZIZ;
                                }
                                this.LIZ = interfaceC21538819Ra;
                                this.LIZIZ = f;
                            }
                        };
                    }
                    return interfaceC21538819Ra;
                }
            };
            c19rx.getClass();
            C19RY c19ry = new C19RY(c19rx);
            c19ry.LJ = r5.LIZ(c19rx.LJ);
            c19ry.LJFF = r5.LIZ(c19rx.LJFF);
            c19ry.LJII = r5.LIZ(c19rx.LJII);
            c19ry.LJI = r5.LIZ(c19rx.LJI);
            C19RX c19rx2 = new C19RX(c19ry);
            c21538919Rb.LLJILJILJ = c19rx2;
            C21540019Rm c21540019Rm = c21538919Rb.LLJJIJI;
            float f2 = c21538919Rb.LL.LJIIIZ;
            c21538919Rb.LLJI.set(c21538919Rb.LJI());
            Paint.Style style2 = c21538919Rb.LL.LJIJJ;
            if ((style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && c21538919Rb.LLJJ.getStrokeWidth() > 0.0f) {
                strokeWidth2 = c21538919Rb.LLJJ.getStrokeWidth() / 2.0f;
            } else {
                strokeWidth2 = 0.0f;
            }
            c21538919Rb.LLJI.inset(strokeWidth2, strokeWidth2);
            c21540019Rm.LIZ(c19rx2, f2, c21538919Rb.LLJI, null, c21538919Rb.LLIZLLLIL);
            c21538919Rb.LIZIZ(c21538919Rb.LLIZ, c21538919Rb.LJI());
            c21538919Rb.LLILZIL = false;
        }
        C21539019Rc c21539019Rc = c21538919Rb.LL;
        int i3 = c21539019Rc.LJIILL;
        if (i3 != 1 && c21539019Rc.LJIILLIIL > 0 && (i3 == 2 || (!c21538919Rb.LJIIIZ() && !c21538919Rb.LLIZ.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            int iSin = (int) (((double) c21538919Rb.LL.LJIIZILJ) * Math.sin(Math.toRadians(r2.LJIJ)));
            C21539019Rc c21539019Rc2 = c21538919Rb.LL;
            canvas.translate(iSin, (int) (((double) c21539019Rc2.LJIIZILJ) * Math.cos(Math.toRadians(c21539019Rc2.LJIJ))));
            if (!c21538919Rb.LLJJJIL) {
                c21538919Rb.LJ(canvas);
                canvas.restore();
            } else {
                int iWidth = (int) (c21538919Rb.LLJJJ.width() - c21538919Rb.getBounds().width());
                int iHeight = (int) (c21538919Rb.LLJJJ.height() - c21538919Rb.getBounds().height());
                if (iWidth >= 0 && iHeight >= 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) c21538919Rb.LLJJJ.width()) + (c21538919Rb.LL.LJIILLIIL * 2) + iWidth, ((int) c21538919Rb.LLJJJ.height()) + (c21538919Rb.LL.LJIILLIIL * 2) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (c21538919Rb.getBounds().left - c21538919Rb.LL.LJIILLIIL) - iWidth;
                    float f4 = (c21538919Rb.getBounds().top - c21538919Rb.LL.LJIILLIIL) - iHeight;
                    canvas2.translate(-f3, -f4);
                    c21538919Rb.LJ(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    C786410Ut5.LJJJJ(bitmapCreateBitmap);
                    canvas.restore();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
        }
        C21539019Rc c21539019Rc3 = c21538919Rb.LL;
        Paint.Style style3 = c21539019Rc3.LJIJJ;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            c21538919Rb.LJFF(canvas, c21538919Rb.LLJILLL, c21538919Rb.LLIZ, c21539019Rc3.LIZ, c21538919Rb.LJI());
        }
        Paint.Style style4 = c21538919Rb.LL.LJIJJ;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && c21538919Rb.LLJJ.getStrokeWidth() > 0.0f) {
            Paint paint3 = c21538919Rb.LLJJ;
            Path path = c21538919Rb.LLIZLLLIL;
            C19RX c19rx3 = c21538919Rb.LLJILJILJ;
            c21538919Rb.LLJI.set(c21538919Rb.LJI());
            Paint.Style style5 = c21538919Rb.LL.LJIJJ;
            if ((style5 == Paint.Style.FILL_AND_STROKE || style5 == Paint.Style.STROKE) && c21538919Rb.LLJJ.getStrokeWidth() > 0.0f) {
                strokeWidth3 = c21538919Rb.LLJJ.getStrokeWidth() / 2.0f;
            }
            c21538919Rb.LLJI.inset(strokeWidth3, strokeWidth3);
            RectF rectF = c21538919Rb.LLJI;
            c21538919Rb = c21538919Rb;
            c21538919Rb.LJFF(canvas, paint3, path, c19rx3, rectF);
        }
        c21538919Rb.LLJILLL.setAlpha(alpha);
        c21538919Rb.LLJJ.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.LL.LJIILL == 2) {
            return;
        }
        if (LJIIIZ()) {
            outline.setRoundRect(getBounds(), LJII() * this.LL.LJIIIZ);
            return;
        }
        LIZIZ(this.LLIZ, LJI());
        if (this.LLIZ.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.LLIZ);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.LL.LJII;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.LLILZIL = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zLJIIZILJ = LJIIZILJ(iArr);
        boolean zLJIJ = LJIJ();
        if (!zLJIIZILJ && !zLJIJ) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJIIJJI != i) {
            c21539019Rc.LJIIJJI = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.LL.getClass();
        super.invalidateSelf();
    }

    @Override // X.C19S4
    public final void setShapeAppearanceModel(C19RX c19rx) {
        this.LL.LIZ = c19rx;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.LL.LJFF = colorStateList;
        LJIJ();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C21539019Rc c21539019Rc = this.LL;
        if (c21539019Rc.LJI != mode) {
            c21539019Rc.LJI = mode;
            LJIJ();
            super.invalidateSelf();
        }
    }

    public C21538919Rb(C19RX c19rx) {
        this(new C21539019Rc(c19rx));
    }

    public final void LIZIZ(Path path, RectF rectF) {
        C21540019Rm c21540019Rm = this.LLJJIJI;
        C21539019Rc c21539019Rc = this.LL;
        c21540019Rm.LIZ(c21539019Rc.LIZ, c21539019Rc.LJIIIZ, rectF, this.LLJJIII, path);
        if (this.LL.LJIIIIZZ != 1.0f) {
            this.LLILZLL.reset();
            Matrix matrix = this.LLILZLL;
            float f = this.LL.LJIIIIZZ;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.LLILZLL);
        }
        path.computeBounds(this.LLJJJ, true);
    }

    public C21538919Rb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C19RX.LIZIZ(context, attributeSet, i, i2).LIZ());
    }

    public final PorterDuffColorFilter LIZJ(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iLIZLLL;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = LIZLLL(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (iLIZLLL = LIZLLL((color = paint.getColor()))) != color) {
            return new PorterDuffColorFilter(iLIZLLL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final void LJFF(Canvas canvas, Paint paint, Path path, C19RX c19rx, RectF rectF) {
        if (c19rx.LIZLLL(rectF)) {
            float fLIZ = c19rx.LJFF.LIZ(rectF) * this.LL.LJIIIZ;
            canvas.drawRoundRect(rectF, fLIZ, fLIZ, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }
}
