package com.bytedance.android.live.design.view.icon;

import X.AbstractC20736416Ck;
import X.C14MI;
import X.C16FX;
import X.C16FY;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C20743616Fe;
import X.C20744616Fo;
import X.C783370UoB;
import X.C783380UoC;
import X.InterfaceC1080960eEg;
import X.InterfaceC1834170xpX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes32.dex */
public class LiveIconView extends C16FY implements InterfaceC1834170xpX {
    public int LLILLL;
    public C20743516Fd LLILZ;
    public boolean LLILZIL;
    public ColorStateList LLILZLL;
    public Drawable LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    public LiveIconView() {
        throw null;
    }

    public final void LJ() {
        this.LLILZLL = null;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.setTintList(null);
            if (this.LLILZ.isStateful()) {
                this.LLILZ.setState(getDrawableState());
            }
        }
    }

    public final void LIZ() {
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd == null || this.LLJJI == -1) {
            return;
        }
        Context context = getContext();
        int i = this.LLJJI;
        C20743616Fe c20743616Fe = c20743516Fd.LLJJ;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, c20743616Fe.LIZLLL());
        c20743616Fe.LJ(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (this.LLILZ.isStateful()) {
            this.LLILZ.setState(getDrawableState());
        }
    }

    public final void LIZJ() {
        ColorStateList colorStateList;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd == null || (colorStateList = this.LLILZLL) == null) {
            return;
        }
        c20743516Fd.setTintList(colorStateList);
        if (this.LLILZ.isStateful()) {
            this.LLILZ.setState(getDrawableState());
        }
    }

    public final void LIZLLL() {
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            float f = this.LLIZLLLIL;
            float f2 = this.LLJI;
            float f3 = this.LLJIJIL;
            int i = this.LLJ;
            c20743516Fd.LLJIJIL = f;
            c20743516Fd.LLJ = f2;
            c20743516Fd.LLJI = f3;
            c20743516Fd.LLIZLLLIL = i;
            if (i == 0 || f <= 0.0f) {
                c20743516Fd.LLJILJILJ = null;
            } else {
                if (c20743516Fd.LLJILJILJ == null) {
                    c20743516Fd.LLJILJILJ = new Paint(1);
                }
                c20743516Fd.LLJILJILJ.setColor(c20743516Fd.LLIZLLLIL);
            }
            c20743516Fd.LLJILLL = null;
            c20743516Fd.LLJJJJLIIL = 0;
            c20743516Fd.invalidateSelf();
            c20743516Fd.LJFF();
            c20743516Fd.invalidateSelf();
        }
    }

    public InterfaceC1080960eEg getIconBackgroundShapeController() {
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            return c20743516Fd.LLJJI;
        }
        return null;
    }

    public C16FX getIconStateAlphaController() {
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            return c20743516Fd.LLJJ;
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd == null || !c20743516Fd.setState(getDrawableState())) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.LLJJJJJIL = true;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.LLJJJJJIL = false;
            c20743516Fd.LLJJJJ.removeCallbacks(c20743516Fd.LLJL);
        }
    }

    public C20743516Fd getIcon() {
        return this.LLILZ;
    }

    public float getIconHeightRatio() {
        return this.LLJILJILJ;
    }

    public ColorStateList getIconTintList() {
        return this.LLILZLL;
    }

    public float getIconWidthRatio() {
        return this.LLJILJIL;
    }

    public int getShadowColor() {
        return this.LLJ;
    }

    public float getShadowDx() {
        return this.LLJI;
    }

    public float getShadowDy() {
        return this.LLJIJIL;
    }

    public float getShadowRadius() {
        return this.LLIZLLLIL;
    }

    public final void LJFF(Drawable drawable) {
        boolean z;
        if (drawable instanceof C20743516Fd) {
            C20743516Fd c20743516Fd = (C20743516Fd) drawable;
            this.LLILZ = c20743516Fd;
            super.setImageDrawable(c20743516Fd);
        } else if (drawable == null) {
            this.LLILZ = null;
            super.setImageDrawable(null);
        } else {
            C20743516Fd c20743516Fd2 = new C20743516Fd(drawable);
            this.LLILZ = c20743516Fd2;
            super.setImageDrawable(c20743516Fd2);
        }
        LIZJ();
        C20743516Fd c20743516Fd3 = this.LLILZ;
        if (c20743516Fd3 != null) {
            c20743516Fd3.setAutoMirrored(this.LLILZIL);
        }
        C20743516Fd c20743516Fd4 = this.LLILZ;
        if (c20743516Fd4 != null) {
            c20743516Fd4.LIZLLL(this.LLIZ);
        }
        C20743516Fd c20743516Fd5 = this.LLILZ;
        if (c20743516Fd5 != null && c20743516Fd5.LLJJIJIIJIL != (z = this.LLJILLL)) {
            c20743516Fd5.LLJJIJIIJIL = z;
            c20743516Fd5.invalidateSelf();
        }
        LIZLLL();
        C20743516Fd c20743516Fd6 = this.LLILZ;
        if (c20743516Fd6 != null) {
            c20743516Fd6.LJ(this.LLJILJIL);
        }
        C20743516Fd c20743516Fd7 = this.LLILZ;
        if (c20743516Fd7 != null) {
            float f = this.LLJILJILJ;
            if (c20743516Fd7.LLJJIJI != f) {
                c20743516Fd7.LLJJIJI = f;
                c20743516Fd7.LJII();
                c20743516Fd7.invalidateSelf();
            }
        }
        C20743516Fd c20743516Fd8 = this.LLILZ;
        if (c20743516Fd8 != null && this.LLJJ != -1) {
            Context context = getContext();
            int i = this.LLJJ;
            C20744616Fo<C20743516Fd> c20744616Fo = c20743516Fd8.LLJJI;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, c20744616Fo.LIZLLL());
            c20744616Fo.LJ(context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
        LIZ();
        C20743516Fd c20743516Fd9 = this.LLILZ;
        if (c20743516Fd9 != null) {
            c20743516Fd9.LLJJJ = this.LLJJIII;
        }
    }

    @Override // X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJI && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1834160xpW
    public void setAllowClickWhenDisabledCompat(boolean z) {
        this.LLJJIJI = z;
    }

    public void setCheckColorFilter(boolean z) {
        this.LLJJIII = z;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.LLJJJ = z;
        }
    }

    public void setCutout(boolean z) {
        this.LLJILLL = z;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null && c20743516Fd.LLJJIJIIJIL != z) {
            c20743516Fd.LLJJIJIIJIL = z;
            c20743516Fd.invalidateSelf();
        }
    }

    public void setIcon(int i) {
        if (this.LLILLL == i) {
            return;
        }
        this.LLILLL = i;
        C783370UoB c783370UoB = C783380UoC.LIZ;
        Context context = getContext();
        c783370UoB.getClass();
        LJFF(C783370UoB.LIZ(i, context));
        setIconAutoMirrored(c783370UoB.LIZIZ(i, false));
    }

    public void setIconAttr(int i) {
        setIcon(C20736316Cj.LJ(i, getContext()));
    }

    public void setIconAutoMirrored(boolean z) {
        this.LLILZIL = z;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.setAutoMirrored(z);
        }
    }

    public void setIconBackground(int i) {
        setIconBackground(C14MI.LIZ(getContext(), i));
    }

    public void setIconBackgroundAppearance(int i) {
        this.LLJJ = i;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null && i != -1) {
            Context context = getContext();
            int i2 = this.LLJJ;
            C20744616Fo<C20743516Fd> c20744616Fo = c20743516Fd.LLJJI;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, c20744616Fo.LIZLLL());
            c20744616Fo.LJ(context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setIconBackgroundColor(int i) {
        setIconBackground(new ColorDrawable(i));
    }

    public void setIconHeightRatio(float f) {
        this.LLJILJILJ = f;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null && c20743516Fd.LLJJIJI != f) {
            c20743516Fd.LLJJIJI = f;
            c20743516Fd.LJII();
            c20743516Fd.invalidateSelf();
        }
    }

    public void setIconStateAlphaAppearance(int i) {
        this.LLJJI = i;
        LIZ();
    }

    public void setIconTint(int i) {
        setIconTintList(ColorStateList.valueOf(i));
    }

    public void setIconTintAttr(int i) {
        setIconTintList(ColorStateList.valueOf(C20736316Cj.LIZIZ(i, getContext())));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.LLILZLL = colorStateList;
        LIZJ();
    }

    public void setIconWidthRatio(float f) {
        this.LLJILJIL = f;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.LJ(f);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setIcon(drawable);
    }

    public void setIcon(Drawable drawable) {
        this.LLILLL = -1;
        LJFF(drawable);
    }

    public void setIconBackground(Drawable drawable) {
        this.LLIZ = drawable;
        C20743516Fd c20743516Fd = this.LLILZ;
        if (c20743516Fd != null) {
            c20743516Fd.LIZLLL(drawable);
        }
    }

    public LiveIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = -1;
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = 1.0f;
        this.LLJJ = -1;
        this.LLJJI = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LiveIconView, i, 0);
        int iLJFF = C20736316Cj.LJFF(getContext(), typedArrayObtainStyledAttributes, R$styleable.LiveIconView_icon);
        if (iLJFF != -1) {
            setIcon(iLJFF);
        }
        new AbstractC20736416Ck<LiveIconView>(this) { // from class: X.16FW
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.IconAppearance;
            }

            {
                super(this);
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                int color;
                if (typedArray.hasValue(R$styleable.IconAppearance_iconShadowColor) && (color = typedArray.getColor(R$styleable.IconAppearance_iconShadowColor, 0)) != 0) {
                    ((LiveIconView) this.LL).LJI(typedArray.getDimension(R$styleable.IconAppearance_iconShadowRadius, 0.0f), typedArray.getDimension(R$styleable.IconAppearance_iconShadowDx, 0.0f), typedArray.getDimension(R$styleable.IconAppearance_iconShadowDy, 0.0f), color);
                }
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R$styleable.IconAppearance_liveIconBackground) {
                        ((LiveIconView) this.LL).setIconBackground(typedArray.getDrawable(index));
                    } else if (index == R$styleable.IconAppearance_iconWidthRatio) {
                        TypedValue typedValue = new TypedValue();
                        typedArray.getValue(index, typedValue);
                        ((LiveIconView) this.LL).setIconWidthRatio(typedValue.getFloat());
                    } else if (index == R$styleable.IconAppearance_iconHeightRatio) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(index, typedValue2);
                        ((LiveIconView) this.LL).setIconHeightRatio(typedValue2.getFloat());
                    } else if (index == R$styleable.IconAppearance_cutout) {
                        ((LiveIconView) this.LL).setCutout(typedArray.getBoolean(index, false));
                    } else if (index == R$styleable.IconAppearance_iconTint) {
                        ColorStateList colorStateListLIZ = C16F8.LIZ(this.LL.getContext(), typedArray, index);
                        if (colorStateListLIZ != null) {
                            ((LiveIconView) this.LL).setIconTintList(colorStateListLIZ);
                        }
                    } else if (index == R$styleable.IconAppearance_iconBackgroundAppearance) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        if (resourceId != -1) {
                            ((LiveIconView) this.LL).setIconBackgroundAppearance(resourceId);
                        }
                    } else if (index == R$styleable.IconAppearance_iconStateAlphaAppearance) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        if (resourceId2 != -1) {
                            ((LiveIconView) this.LL).setIconStateAlphaAppearance(resourceId2);
                        }
                    } else if (index == R$styleable.IconAppearance_checkColorFilter) {
                        ((LiveIconView) this.LL).setCheckColorFilter(typedArray.getBoolean(index, false));
                    }
                }
            }
        }.LJII(attributeSet, i, 0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveIconView_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LJI(float f, float f2, float f3, int i) {
        this.LLIZLLLIL = f;
        this.LLJI = f2;
        this.LLJIJIL = f3;
        this.LLJ = i;
        LIZLLL();
    }
}
