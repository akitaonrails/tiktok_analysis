package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19S6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19S6 extends FrameLayout {
    public static final C11U1 LLILZLL = new View.OnTouchListener() { // from class: X.11U1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    public int LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public ColorStateList LLILZ;
    public PorterDuff.Mode LLILZIL;

    public void setOnAttachStateChangeListener(C19S7 c19s7) {
    }

    public void setOnLayoutChangeListener(C19S8 c19s8) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20097313kJ.LIZJ(this);
    }

    public float getActionTextColorAlpha() {
        return this.LLILLL;
    }

    public int getAnimationMode() {
        return this.LL;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setAnimationMode(int i) {
        this.LL = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.LLILZ != null) {
            drawable = drawable.mutate();
            C16GF.LJII(drawable, this.LLILZ);
            C16GF.LJIIIIZZ(drawable, this.LLILZIL);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.LLILZ = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            C16GF.LJII(drawableMutate, colorStateList);
            C16GF.LJIIIIZZ(drawableMutate, this.LLILZIL);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.LLILZIL = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            C16GF.LJIIIIZZ(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C11U1 c11u1;
        if (onClickListener != null) {
            c11u1 = null;
        } else {
            c11u1 = LLILZLL;
        }
        setOnTouchListener(c11u1);
        super.setOnClickListener(onClickListener);
    }

    public C19S6(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
            C14K9.LJIJ(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0));
        }
        this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(C19RN.LIZ(context2, typedArrayObtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(C21551419Vw.LIZLLL(typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.LLILLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(LLILZLL);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.aar);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C19PM.LIZJ(getBackgroundOverlayColorAlpha(), C19PM.LIZIZ(R.attr.bix, this), C19PM.LIZIZ(R.attr.bio, this)));
            ColorStateList colorStateList = this.LLILZ;
            if (colorStateList != null) {
                C16GF.LJII(gradientDrawable, colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
