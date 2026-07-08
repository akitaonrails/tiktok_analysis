package X;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19RW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RW {
    public static final int[] LJIJ = {R.attr.state_checked};
    public static final double LJIJI = Math.cos(Math.toRadians(45.0d));
    public final C19RV LIZ;
    public final C21538919Rb LIZJ;
    public final C21538919Rb LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public ColorStateList LJIIJ;
    public C19RX LJIIJJI;
    public ColorStateList LJIIL;
    public Drawable LJIILIIL;
    public LayerDrawable LJIILJJIL;
    public C21538919Rb LJIILL;
    public boolean LJIIZILJ;
    public final Rect LIZIZ = new Rect();
    public boolean LJIILLIIL = false;

    public final float LIZ() {
        float fLIZIZ = LIZIZ(this.LJIIJJI.LIZ, this.LIZJ.LJII());
        C21540919Rv c21540919Rv = this.LJIIJJI.LIZIZ;
        C21538919Rb c21538919Rb = this.LIZJ;
        float fMax = Math.max(fLIZIZ, LIZIZ(c21540919Rv, c21538919Rb.LL.LIZ.LJFF.LIZ(c21538919Rb.LJI())));
        C21540919Rv c21540919Rv2 = this.LJIIJJI.LIZJ;
        C21538919Rb c21538919Rb2 = this.LIZJ;
        float fLIZIZ2 = LIZIZ(c21540919Rv2, c21538919Rb2.LL.LIZ.LJI.LIZ(c21538919Rb2.LJI()));
        C21540919Rv c21540919Rv3 = this.LJIIJJI.LIZLLL;
        C21538919Rb c21538919Rb3 = this.LIZJ;
        return Math.max(fMax, Math.max(fLIZIZ2, LIZIZ(c21540919Rv3, c21538919Rb3.LL.LIZ.LJII.LIZ(c21538919Rb3.LJI()))));
    }

    public final Drawable LIZJ() {
        if (this.LJIILIIL == null) {
            this.LJIILL = new C21538919Rb(this.LJIIJJI);
            this.LJIILIIL = new RippleDrawable(this.LJIIIZ, null, this.LJIILL);
        }
        if (this.LJIILJJIL == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.LJIIIIZZ;
            if (drawable != null) {
                stateListDrawable.addState(LJIJ, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.LJIILIIL, this.LIZLLL, stateListDrawable});
            this.LJIILJJIL = layerDrawable;
            layerDrawable.setId(2, com.zhiliaoapp.musically.R.id.oms);
        }
        return this.LJIILJJIL;
    }

    public final boolean LJI() {
        return this.LIZ.getPreventCornerOverlap() && this.LIZJ.LJIIIZ() && this.LIZ.getUseCompatPadding();
    }

    public final void LJII() {
        boolean z = true;
        if ((!this.LIZ.getPreventCornerOverlap() || this.LIZJ.LJIIIZ()) && !LJI()) {
            z = false;
        }
        float cardViewRadius = 0.0f;
        float fLIZ = z ? LIZ() : 0.0f;
        if (this.LIZ.getPreventCornerOverlap() && this.LIZ.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - LJIJI) * ((double) this.LIZ.getCardViewRadius()));
        }
        int i = (int) (fLIZ - cardViewRadius);
        C19RV c19rv = this.LIZ;
        Rect rect = this.LIZIZ;
        c19rv.LJIIIZ(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void LJIIIIZZ() {
        if (!this.LJIILLIIL) {
            this.LIZ.setBackgroundInternal(LIZLLL(this.LIZJ));
        }
        this.LIZ.setForeground(LIZLLL(this.LJII));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19RZ] */
    public final C19RZ LIZLLL(final Drawable drawable) {
        final int iCeil;
        final int iCeil2;
        float fLIZ;
        if (this.LIZ.getUseCompatPadding()) {
            float maxCardElevation = this.LIZ.getMaxCardElevation() * 1.5f;
            float fLIZ2 = 0.0f;
            if (LJI()) {
                fLIZ = LIZ();
            } else {
                fLIZ = 0.0f;
            }
            iCeil2 = (int) Math.ceil(maxCardElevation + fLIZ);
            float maxCardElevation2 = this.LIZ.getMaxCardElevation();
            if (LJI()) {
                fLIZ2 = LIZ();
            }
            iCeil = (int) Math.ceil(maxCardElevation2 + fLIZ2);
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        final int i = iCeil;
        final int i2 = iCeil2;
        return new InsetDrawable(drawable, iCeil, iCeil2, i, i2) { // from class: X.19RZ
            @Override // android.graphics.drawable.Drawable
            public final int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public final boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    public final void LJ(Drawable drawable) {
        this.LJIIIIZZ = drawable;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.LJIIIIZZ = drawableMutate;
            C16GF.LJII(drawableMutate, this.LJIIJ);
        }
        if (this.LJIILJJIL != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.LJIIIIZZ;
            if (drawable2 != null) {
                stateListDrawable.addState(LJIJ, drawable2);
            }
            this.LJIILJJIL.setDrawableByLayerId(com.zhiliaoapp.musically.R.id.oms, stateListDrawable);
        }
    }

    public final void LJFF(C19RX c19rx) {
        this.LJIIJJI = c19rx;
        this.LIZJ.setShapeAppearanceModel(c19rx);
        this.LIZJ.LLJJJIL = !r1.LJIIIZ();
        C21538919Rb c21538919Rb = this.LIZLLL;
        if (c21538919Rb != null) {
            c21538919Rb.setShapeAppearanceModel(c19rx);
        }
        C21538919Rb c21538919Rb2 = this.LJIILL;
        if (c21538919Rb2 != null) {
            c21538919Rb2.setShapeAppearanceModel(c19rx);
        }
    }

    public static float LIZIZ(C21540919Rv c21540919Rv, float f) {
        if (c21540919Rv instanceof C21539519Rh) {
            return (float) ((1.0d - LJIJI) * ((double) f));
        }
        if (c21540919Rv instanceof C21539219Re) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public C19RW(C19RV c19rv, AttributeSet attributeSet, int i) {
        this.LIZ = c19rv;
        C21538919Rb c21538919Rb = new C21538919Rb(c19rv.getContext(), attributeSet, i, com.zhiliaoapp.musically.R.style.a4i);
        this.LIZJ = c21538919Rb;
        c21538919Rb.LJIIIIZZ(c19rv.getContext());
        c21538919Rb.LJIILJJIL(-12303292);
        C19RX c19rx = c21538919Rb.LL.LIZ;
        c19rx.getClass();
        C19RY c19ry = new C19RY(c19rx);
        TypedArray typedArrayObtainStyledAttributes = c19rv.getContext().obtainStyledAttributes(attributeSet, R$styleable.CardView, i, com.zhiliaoapp.musically.R.style.hp);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardCornerRadius)) {
            c19ry.LIZJ(typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.LIZLLL = new C21538919Rb();
        LJFF(new C19RX(c19ry));
        typedArrayObtainStyledAttributes.recycle();
    }
}
