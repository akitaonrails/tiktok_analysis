package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Q9 {
    public final ColorStateList LIZ;
    public final ColorStateList LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final boolean LJIIIIZZ;
    public final float LJIIIZ;
    public float LJIIJ;
    public final int LJIIJJI;
    public boolean LJIIL;
    public Typeface LJIILIIL;

    public final void LIZ() {
        String str;
        if (this.LJIILIIL == null && (str = this.LIZJ) != null) {
            this.LJIILIIL = Typeface.create(str, this.LIZLLL);
        }
        if (this.LJIILIIL == null) {
            int i = this.LJ;
            if (i == 1) {
                this.LJIILIIL = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.LJIILIIL = Typeface.SERIF;
            } else if (i != 3) {
                this.LJIILIIL = Typeface.DEFAULT;
            } else {
                this.LJIILIIL = Typeface.MONOSPACE;
            }
            this.LJIILIIL = Typeface.create(this.LJIILIIL, this.LIZLLL);
        }
    }

    public C19Q9(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        this.LJIIJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
        this.LIZ = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.LIZLLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.LJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int i2 = R$styleable.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : R$styleable.TextAppearance_android_fontFamily;
        this.LJIIJJI = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.LIZJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, i2);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.LIZIZ = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.LJFF = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.LJI = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.LJII = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
        this.LJIIIIZZ = typedArrayObtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
        this.LJIIIZ = typedArrayObtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void LIZIZ(Context context, final C19QC c19qc) {
        LIZ();
        int i = this.LJIIJJI;
        if (i == 0) {
            this.LJIIL = true;
        }
        if (this.LJIIL) {
            c19qc.LIZIZ(this.LJIILIIL, true);
            return;
        }
        try {
            C20143013rg.LIZLLL(context, i, new AbstractC20142713rd() { // from class: X.19QA
                @Override // X.AbstractC20142713rd
                public final void LIZJ(int i2) {
                    this.LIZIZ.LJIIL = true;
                    c19qc.LIZ(i2);
                }

                @Override // X.AbstractC20142713rd
                public final void LIZLLL(Typeface typeface) {
                    C19Q9 c19q9 = this.LIZIZ;
                    c19q9.LJIILIIL = Typeface.create(typeface, c19q9.LIZLLL);
                    C19Q9 c19q92 = this.LIZIZ;
                    c19q92.LJIIL = true;
                    c19qc.LIZIZ(c19q92.LJIILIIL, false);
                }
            });
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJIIL = true;
            c19qc.LIZ(1);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LJIIL = true;
            c19qc.LIZ(-3);
        }
    }

    public final void LIZLLL(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.LIZLLL;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.LJIIJ);
        if (this.LJIIIIZZ) {
            textPaint.setLetterSpacing(this.LJIIIZ);
        }
    }

    public final void LIZJ(Context context, TextPaint textPaint, C19QC c19qc) {
        int colorForState;
        int colorForState2;
        LIZ();
        LIZLLL(textPaint, this.LJIILIIL);
        LIZIZ(context, new C19QB(this, textPaint, c19qc));
        ColorStateList colorStateList = this.LIZ;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        float f = this.LJII;
        float f2 = this.LJFF;
        float f3 = this.LJI;
        ColorStateList colorStateList2 = this.LIZIZ;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, colorForState2);
    }
}
