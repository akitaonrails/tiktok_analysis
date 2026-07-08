package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0kto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337100kto extends ImageView implements InterfaceC1337130ktr, C19J1 {
    public static final Shader.TileMode LLJJIII = Shader.TileMode.CLAMP;
    public float LL;
    public final float[] LLILLJJLI;
    public ColorStateList LLILLL;
    public float LLILZ;
    public ColorFilter LLILZIL;
    public boolean LLILZLL;
    public Drawable LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public ImageView.ScaleType LLJILJIL;
    public Shader.TileMode LLJILJILJ;
    public Shader.TileMode LLJILLL;
    public C1337210ktz LLJJ;
    public final C1337110ktp LLJJI;

    public final void LIZJ() {
        LIZIZ(this.LLIZ, this.LLJILJIL);
    }

    public int getBorderColor() {
        return this.LLILLL.getDefaultColor();
    }

    public float getBorderRadius() {
        return this.LLJJI.LLILLJJLI;
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.LLILLJJLI) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // X.C19J1
    public float getRubIn() {
        return this.LLJJI.LLILZLL;
    }

    @Override // X.C19J1
    public float getShine() {
        return this.LLJJI.LLILZ;
    }

    @Override // X.C19J1
    public float getStretch() {
        return this.LLJJI.LLILZIL;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null) {
            c1337210ktz.LJIIJJI();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null) {
            c1337210ktz.LJIIL();
        }
        C20597815iq.LIZ(this);
    }

    public ColorStateList getBorderColors() {
        return this.LLILLL;
    }

    public float getBorderWidth() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1337130ktr, X.C19J1
    public float getRipple() {
        return this.LL;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.LLJILJIL;
    }

    public Shader.TileMode getTileModeX() {
        return this.LLJILJILJ;
    }

    public Shader.TileMode getTileModeY() {
        return this.LLJILLL;
    }

    public C1337100kto(Context context) {
        super(context);
        this.LLILLJJLI = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.LLILLL = ColorStateList.valueOf(-16777216);
        this.LLILZ = 0.0f;
        this.LLILZIL = null;
        this.LLILZLL = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        Shader.TileMode tileMode = LLJJIII;
        this.LLJILJILJ = tileMode;
        this.LLJILLL = tileMode;
        this.LLJJI = new C1337110ktp(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C19JY c19jy;
        try {
            C1337210ktz c1337210ktz = this.LLJJ;
            if (c1337210ktz != null && (c19jy = c1337210ktz.LLLLLLZZ) != null) {
                c19jy.LJI();
            }
            super.onDraw(canvas);
            C1337210ktz c1337210ktz2 = this.LLJJ;
            if (c1337210ktz2 != null) {
                c1337210ktz2.LIZJ(canvas, this);
                C19JY c19jy2 = this.LLJJ.LLLLLLZZ;
                if (c19jy2 != null) {
                    c19jy2.LJI();
                }
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        C19JY c19jy;
        super.onWindowFocusChanged(z);
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null && (c19jy = c1337210ktz.LLLLLLZZ) != null) {
            c19jy.LIZLLL();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackgroundDrawable(new ColorDrawable(i));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.LLJIJIL != i) {
            this.LLJIJIL = i;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i2 = this.LLJIJIL;
                if (i2 != 0) {
                    try {
                        drawable = resources.getDrawable(i2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLJIJIL = 0;
                    }
                }
                drawable = C1337090ktn.LIZ(drawable);
            }
            setBackgroundDrawable(drawable);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.LLILLL.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.LLILLL = colorStateList;
        LIZJ();
        if (this.LLILZ > 0.0f) {
            invalidate();
        }
    }

    public void setBorderRadius(float f) {
        C1337110ktp c1337110ktp = this.LLJJI;
        if (c1337110ktp != null) {
            c1337110ktp.LIZIZ(f);
        }
    }

    public void setBorderWidth(float f) {
        if (this.LLILZ == f) {
            return;
        }
        this.LLILZ = f;
        LIZJ();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.LLILZIL != colorFilter) {
            this.LLILZIL = colorFilter;
            this.LLIZLLLIL = true;
            this.LLILZLL = true;
            Drawable drawable = this.LLIZ;
            if (drawable != null) {
                Drawable drawableMutate = drawable.mutate();
                this.LLIZ = drawableMutate;
                if (this.LLIZLLLIL) {
                    drawableMutate.setColorFilter(this.LLILZIL);
                }
            }
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        LIZ(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        LIZ(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        C1337090ktn c1337090ktn;
        this.LLJI = 0;
        if (bitmap != null) {
            c1337090ktn = new C1337090ktn(bitmap);
        } else {
            c1337090ktn = null;
        }
        this.LLIZ = c1337090ktn;
        LIZJ();
        super.setImageDrawable(this.LLIZ);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.LLJI = 0;
        this.LLIZ = C1337090ktn.LIZ(drawable);
        LIZJ();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.LLJI != i) {
            this.LLJI = i;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i2 = this.LLJI;
                if (i2 != 0) {
                    try {
                        drawable = resources.getDrawable(i2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLJI = 0;
                    }
                }
                drawable = C1337090ktn.LIZ(drawable);
            }
            this.LLIZ = drawable;
            LIZJ();
            super.setImageDrawable(this.LLIZ);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.LLJ = z;
        LIZJ();
        invalidate();
    }

    public void setRipple(float f) {
        View view;
        this.LL = f;
        C1337110ktp c1337110ktp = this.LLJJI;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILLL = f;
            view.postInvalidate();
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C1337110ktp c1337110ktp = this.LLJJI;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZLL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.LLJILJIL != scaleType) {
            this.LLJILJIL = scaleType;
            int i = C340230DVl.LIZ[scaleType.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                super.setScaleType(scaleType);
            }
            LIZJ();
            invalidate();
        }
    }

    public void setShine(float f) {
        View view;
        C1337110ktp c1337110ktp = this.LLJJI;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILZ = f;
            view.postInvalidate();
        }
    }

    public void setStretch(float f) {
        C1337110ktp c1337110ktp = this.LLJJI;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZIL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.LLJILJILJ == tileMode) {
            return;
        }
        this.LLJILJILJ = tileMode;
        LIZJ();
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.LLJILLL == tileMode) {
            return;
        }
        this.LLJILLL = tileMode;
        LIZJ();
        invalidate();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public final void LIZIZ(Drawable drawable, ImageView.ScaleType scaleType) {
        boolean z;
        boolean z2;
        boolean z3;
        if (drawable == null) {
            return;
        }
        boolean z4 = false;
        if (drawable instanceof C1337090ktn) {
            C1337090ktn c1337090ktn = (C1337090ktn) drawable;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            if (c1337090ktn.LJIJI != scaleType) {
                c1337090ktn.LJIJI = scaleType;
                c1337090ktn.LIZJ();
            }
            float f = this.LLILZ;
            c1337090ktn.LJIIZILJ = f;
            c1337090ktn.LJIIIIZZ.setStrokeWidth(f);
            ColorStateList colorStateListValueOf = this.LLILLL;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            c1337090ktn.LJIJ = colorStateListValueOf;
            c1337090ktn.LJIIIIZZ.setColor(colorStateListValueOf.getColorForState(c1337090ktn.getState(), -16777216));
            c1337090ktn.LJIILLIIL = this.LLJ;
            Shader.TileMode tileMode = this.LLJILJILJ;
            if (c1337090ktn.LJIIJJI != tileMode) {
                c1337090ktn.LJIIJJI = tileMode;
                c1337090ktn.LJIILIIL = true;
                c1337090ktn.invalidateSelf();
            }
            Shader.TileMode tileMode2 = this.LLJILLL;
            if (c1337090ktn.LJIIL != tileMode2) {
                c1337090ktn.LJIIL = tileMode2;
                c1337090ktn.LJIILIIL = true;
                c1337090ktn.invalidateSelf();
            }
            float[] fArr = this.LLILLJJLI;
            if (fArr != null) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                HashSet hashSet = new HashSet(4);
                hashSet.add(Float.valueOf(f2));
                hashSet.add(Float.valueOf(f3));
                hashSet.add(Float.valueOf(f4));
                hashSet.add(Float.valueOf(f5));
                hashSet.remove(Float.valueOf(0.0f));
                if (hashSet.size() <= 1) {
                    if (!hashSet.isEmpty()) {
                        float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                        if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                            c1337090ktn.LJIILJJIL = fFloatValue;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Invalid radius value: ");
                            sbLIZ.append(fFloatValue);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        c1337090ktn.LJIILJJIL = 0.0f;
                    }
                    boolean[] zArr = c1337090ktn.LJIILL;
                    if (f2 > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[0] = z;
                    if (f3 > 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zArr[1] = z2;
                    if (f4 > 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zArr[2] = z3;
                    if (f5 > 0.0f) {
                        z4 = true;
                    }
                    zArr[3] = z4;
                } else {
                    throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
                }
            }
            Drawable drawable2 = this.LLIZ;
            if (drawable2 != null && this.LLILZLL) {
                Drawable drawableMutate = drawable2.mutate();
                this.LLIZ = drawableMutate;
                if (this.LLIZLLLIL) {
                    drawableMutate.setColorFilter(this.LLILZIL);
                    return;
                }
                return;
            }
            return;
        }
        if (!(drawable instanceof LayerDrawable)) {
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            LIZIZ(layerDrawable.getDrawable(i), scaleType);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null) {
            int[] iArrLJIIIZ = c1337210ktz.LJIIIZ(i, i2);
            super.onMeasure(iArrLJIIIZ[0], iArrLJIIIZ[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        float[] fArr = this.LLILLJJLI;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        LIZJ();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null) {
            c1337210ktz.LJIILLIIL(i, i2);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C19JY c19jy;
        C1337210ktz c1337210ktz = this.LLJJ;
        if (c1337210ktz != null && (c19jy = c1337210ktz.LLLLLLZZ) != null && !c1337210ktz.LLLLZ) {
            c1337210ktz.LLLLZ = true;
            c19jy.LJIIIZ();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
