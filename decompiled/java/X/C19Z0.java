package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Z0 extends C21414118rD implements InterfaceC21559919Zd, C19S4, C16G4 {
    public ColorStateList LLILLJJLI;
    public PorterDuff.Mode LLILLL;
    public ColorStateList LLILZ;
    public PorterDuff.Mode LLILZIL;
    public ColorStateList LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public C19Z2 LLJI;

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19Z2] */
    private C19Z1 getImpl() {
        if (this.LLJI == null) {
            final C19ZH c19zh = new C19ZH(this);
            this.LLJI = new C19Z1(this, c19zh) { // from class: X.19Z2
                @Override // X.C19Z1
                public final void LJ() {
                }

                @Override // X.C19Z1
                public final void LJI(int[] iArr) {
                }

                @Override // X.C19Z1
                public final void LJIIIZ() {
                }

                @Override // X.C19Z1
                public final void LJIIJ() {
                }

                @Override // X.C19Z1
                public final float LIZJ() {
                    return this.LJIIZILJ.getElevation();
                }

                public final boolean LJIILIIL() {
                    if (((C19ZH) this.LJIJ).LIZ.LLJ) {
                        return true;
                    }
                    return this.LIZIZ && this.LJIIZILJ.getSizeDimension() < 0;
                }

                @Override // X.C19Z1
                public final void LJFF() {
                    LJIIJJI();
                    throw null;
                }

                @Override // X.C19Z1
                public final void LIZLLL(Rect rect) {
                    if (((C19ZH) this.LJIJ).LIZ.LLJ) {
                        super.LIZLLL(rect);
                    } else if (this.LIZIZ && this.LJIIZILJ.getSizeDimension() < 0) {
                        int sizeDimension = (0 - this.LJIIZILJ.getSizeDimension()) / 2;
                        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
                    } else {
                        rect.set(0, 0, 0, 0);
                    }
                }

                public final Animator LJIIL(float f, float f2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(this.LJIIZILJ, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C19Z0, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
                    animatorSet.setInterpolator(C19Z1.LJIL);
                    return animatorSet;
                }

                @Override // X.C19Z1
                public final void LJII(float f, float f2, float f3) {
                    int i = Build.VERSION.SDK_INT;
                    StateListAnimator stateListAnimator = new StateListAnimator();
                    stateListAnimator.addState(C19Z1.LJJ, LJIIL(f, f3));
                    stateListAnimator.addState(C19Z1.LJJI, LJIIL(f, f2));
                    stateListAnimator.addState(C19Z1.LJJIFFI, LJIIL(f, f2));
                    stateListAnimator.addState(C19Z1.LJJII, LJIIL(f, f2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this.LJIIZILJ, "elevation", f).setDuration(0L));
                    if (i <= 24) {
                        C19Z0 c19z0 = this.LJIIZILJ;
                        arrayList.add(ObjectAnimator.ofFloat(c19z0, (Property<C19Z0, Float>) View.TRANSLATION_Z, c19z0.getTranslationZ()).setDuration(100L));
                    }
                    arrayList.add(ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C19Z0, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
                    animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
                    animatorSet.setInterpolator(C19Z1.LJIL);
                    stateListAnimator.addState(C19Z1.LJJIII, animatorSet);
                    stateListAnimator.addState(C19Z1.LJJIIJ, LJIIL(0.0f, 0.0f));
                    this.LJIIZILJ.setStateListAnimator(stateListAnimator);
                    if (!LJIILIIL()) {
                        return;
                    }
                    LJIIJJI();
                    throw null;
                }
            };
        }
        return this.LLJI;
    }

    @Override // X.C16G4
    public C16BC<C19Z0> getBehavior() {
        return new FloatingActionButton$Behavior();
    }

    public int getRippleColor() {
        ColorStateList colorStateList = this.LLILZLL;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public int getSizeDimension() {
        return LJ(this.LLIZ);
    }

    public final void LIZIZ() {
        C19Z1 impl = getImpl();
        if (impl.LJIILL == null) {
            impl.LJIILL = new ArrayList<>();
        }
        impl.LJIILL.add(null);
    }

    public final void LIZLLL() {
        C19Z1 impl = getImpl();
        C19ZI c19zi = new C19ZI(this) { // from class: X.19Z7
            @Override // X.C19ZI
            public final void LIZ() {
                throw null;
            }

            @Override // X.C19ZI
            public final void LIZIZ() {
                throw null;
            }

            public final int hashCode() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19Z7)) {
                    return false;
                }
                obj.getClass();
                throw null;
            }
        };
        if (impl.LJIILLIIL == null) {
            impl.LJIILLIIL = new ArrayList<>();
        }
        impl.LJIILLIIL.add(c19zi);
    }

    public final boolean LJI() {
        C19Z1 impl = getImpl();
        if (impl.LJIIZILJ.getVisibility() == 0) {
            if (impl.LJIILIIL != 1) {
                return false;
            }
        } else if (impl.LJIILIIL == 2) {
            return false;
        }
        return true;
    }

    public final boolean LJII() {
        C19Z1 impl = getImpl();
        if (impl.LJIIZILJ.getVisibility() != 0) {
            if (impl.LJIILIIL != 2) {
                return false;
            }
        } else if (impl.LJIILIIL == 1) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.LLILZ;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.LLILZIL;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C14MG.LIZJ(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().LJI(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().LIZJ();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().LJ;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().LJFF;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public C194T getHideMotionSpec() {
        return getImpl().LJIIJ;
    }

    public C19RX getShapeAppearanceModel() {
        C19RX c19rx = getImpl().LIZ;
        c19rx.getClass();
        return c19rx;
    }

    public C194T getShowMotionSpec() {
        return getImpl().LJIIIZ;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().LJ();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.19Z6] */
    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final C19Z1 impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C19Z2)) {
            ViewTreeObserver viewTreeObserver = impl.LJIIZILJ.getViewTreeObserver();
            if (impl.LJIJJLI == null) {
                impl.LJIJJLI = new ViewTreeObserver.OnPreDrawListener() { // from class: X.19Z6
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C19Z1 c19z1 = impl;
                        float rotation = c19z1.LJIIZILJ.getRotation();
                        if (c19z1.LJIIJJI == rotation) {
                            return true;
                        }
                        c19z1.LJIIJJI = rotation;
                        c19z1.LJIIJ();
                        return true;
                    }
                };
            }
            C786410Ut5.y3(viewTreeObserver, impl.LJIJJLI);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C19Z1 impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.LJIIZILJ.getViewTreeObserver();
        C19Z6 c19z6 = impl.LJIJJLI;
        if (c19z6 != null) {
            C786410Ut5.D3(viewTreeObserver, c19z6);
            impl.LJIJJLI = null;
        }
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // X.InterfaceC21559919Zd
    public final boolean LLIIIL() {
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.LLILLL;
    }

    public int getCustomSize() {
        return this.LLIZLLLIL;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public ColorStateList getRippleColorStateList() {
        return this.LLILZLL;
    }

    public int getSize() {
        return this.LLIZ;
    }

    public ColorStateList getSupportImageTintList() {
        return this.LLILZ;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.LLILZIL;
    }

    public boolean getUseCompatPadding() {
        return this.LLJ;
    }

    public final void LIZJ(C19XN c19xn) {
        C19Z1 impl = getImpl();
        if (impl.LJIILJJIL == null) {
            impl.LJIILJJIL = new ArrayList<>();
        }
        impl.LJIILJJIL.add(c19xn);
    }

    public final int LJ(int i) {
        int i2 = this.LLIZLLLIL;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.qp);
            }
            return resources.getDimensionPixelSize(R.dimen.qo);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return LJ(1);
        }
        return LJ(0);
    }

    @Override // X.C21414118rD, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mSuperState);
        extendableSavedState.extendableStates.get("expandableWidgetHelper").getClass();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && isLaidOut()) {
            getWidth();
            getHeight();
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.LLILLJJLI != colorStateList) {
            this.LLILLJJLI = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.LLILLL != mode) {
            this.LLILLL = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        C19Z1 impl = getImpl();
        if (impl.LIZLLL != f) {
            impl.LIZLLL = f;
            impl.LJII(f, impl.LJ, impl.LJFF);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C19Z1 impl = getImpl();
        if (impl.LJ != f) {
            impl.LJ = f;
            impl.LJII(impl.LIZLLL, f, impl.LJFF);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C19Z1 impl = getImpl();
        if (impl.LJFF != f) {
            impl.LJFF = f;
            impl.LJII(impl.LIZLLL, impl.LJ, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.LLIZLLLIL) {
                this.LLIZLLLIL = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().LIZIZ) {
            getImpl().LIZIZ = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C194T c194t) {
        getImpl().LJIIJ = c194t;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C194T.LIZ(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C19Z1 impl = getImpl();
            impl.LJIIL = impl.LJIIL;
            Matrix matrix = impl.LJIJJ;
            matrix.reset();
            impl.LJIIZILJ.getDrawable();
            impl.LJIIZILJ.setImageMatrix(matrix);
            if (this.LLILZ != null) {
                LJIIIIZZ();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.LLILZLL != colorStateList) {
            this.LLILZLL = colorStateList;
            getImpl().LJIIIZ();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<C19ZI> arrayList = getImpl().LJIILLIIL;
        if (arrayList != null) {
            Iterator<C19ZI> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<C19ZI> arrayList = getImpl().LJIILLIIL;
        if (arrayList != null) {
            Iterator<C19ZI> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        C19Z1 impl = getImpl();
        impl.LIZJ = z;
        impl.LJIIJJI();
        throw null;
    }

    @Override // X.C19S4
    public void setShapeAppearanceModel(C19RX c19rx) {
        getImpl().LIZ = c19rx;
    }

    public void setShowMotionSpec(C194T c194t) {
        getImpl().LJIIIZ = c194t;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C194T.LIZ(i, getContext()));
    }

    public void setSize(int i) {
        this.LLIZLLLIL = 0;
        if (i != this.LLIZ) {
            this.LLIZ = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.LLILZ != colorStateList) {
            this.LLILZ = colorStateList;
            LJIIIIZZ();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.LLILZIL != mode) {
            this.LLILZIL = mode;
            LJIIIIZZ();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().LJIIIIZZ();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().LJIIIIZZ();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().LJIIIIZZ();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.LLJ != z) {
            this.LLJ = z;
            getImpl().LJFF();
        }
    }

    @Override // X.C21414118rD, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public final void LJFF(C19Z5 c19z5, final boolean z) {
        final C19ZF c19zf;
        int i;
        final C19Z1 impl = getImpl();
        if (c19z5 == null) {
            c19zf = null;
        } else {
            c19zf = new C19ZF(this, c19z5);
        }
        if (impl.LJIIZILJ.getVisibility() == 0) {
            if (impl.LJIILIIL == 1) {
                return;
            }
        } else if (impl.LJIILIIL != 2) {
            return;
        }
        Animator animator = impl.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.LJIIZILJ.isLaidOut() && !impl.LJIIZILJ.isInEditMode()) {
            C194T c194t = impl.LJIIJ;
            if (c194t == null) {
                if (impl.LJII == null) {
                    impl.LJII = C194T.LIZ(R.animator.b, impl.LJIIZILJ.getContext());
                }
                c194t = impl.LJII;
                c194t.getClass();
            }
            AnimatorSet animatorSetLIZ = impl.LIZ(c194t, 0.0f, 0.0f, 0.0f);
            animatorSetLIZ.addListener(new AnimatorListenerAdapter() { // from class: X.19Z3
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator2) {
                    this.LL = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    int i2;
                    C19Z1 c19z1 = impl;
                    c19z1.LJIILIIL = 0;
                    c19z1.LJIIIIZZ = null;
                    if (!this.LL) {
                        C19Z0 c19z0 = c19z1.LJIIZILJ;
                        boolean z2 = z;
                        if (z2) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        c19z0.LIZ(i2, z2);
                        C19ZJ c19zj = c19zf;
                        if (c19zj != null) {
                            C19ZF c19zf2 = (C19ZF) c19zj;
                            c19zf2.LIZ.LIZ(c19zf2.LIZIZ);
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    impl.LJIIZILJ.LIZ(0, z);
                    C19Z1 c19z1 = impl;
                    c19z1.LJIILIIL = 1;
                    c19z1.LJIIIIZZ = animator2;
                    this.LL = false;
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = impl.LJIILL;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    animatorSetLIZ.addListener(it2.next());
                }
            }
            animatorSetLIZ.start();
            return;
        }
        C19Z0 c19z0 = impl.LJIIZILJ;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        c19z0.LIZ(i, z);
        if (c19zf == null) {
            return;
        }
        c19zf.LIZ.LIZ(c19zf.LIZIZ);
    }

    public final void LJIIIZ(C19Z8 c19z8, final boolean z) {
        final C19ZF c19zf;
        final C19Z1 impl = getImpl();
        if (c19z8 == null) {
            c19zf = null;
        } else {
            c19zf = new C19ZF(this, c19z8);
        }
        boolean z2 = true;
        if (impl.LJIIZILJ.getVisibility() != 0) {
            if (impl.LJIILIIL == 2) {
                return;
            }
        } else if (impl.LJIILIIL != 1) {
            return;
        }
        Animator animator = impl.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.LJIIZILJ.isLaidOut() || impl.LJIIZILJ.isInEditMode()) {
            z2 = false;
        }
        if (z2) {
            if (impl.LJIIZILJ.getVisibility() != 0) {
                C19Z0 c19z0 = impl.LJIIZILJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z0);
                c19z0.setAlpha(0.0f);
                C19Z0 c19z02 = impl.LJIIZILJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z02);
                c19z02.setScaleY(0.0f);
                C19Z0 c19z03 = impl.LJIIZILJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z03);
                c19z03.setScaleX(0.0f);
                impl.LJIIL = 0.0f;
                Matrix matrix = impl.LJIJJ;
                matrix.reset();
                impl.LJIIZILJ.getDrawable();
                impl.LJIIZILJ.setImageMatrix(matrix);
            }
            C194T c194t = impl.LJIIIZ;
            if (c194t == null) {
                if (impl.LJI == null) {
                    impl.LJI = C194T.LIZ(R.animator.c, impl.LJIIZILJ.getContext());
                }
                c194t = impl.LJI;
                c194t.getClass();
            }
            AnimatorSet animatorSetLIZ = impl.LIZ(c194t, 1.0f, 1.0f, 1.0f);
            animatorSetLIZ.addListener(new AnimatorListenerAdapter() { // from class: X.19Z4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    C19Z1 c19z1 = impl;
                    c19z1.LJIILIIL = 0;
                    c19z1.LJIIIIZZ = null;
                    C19ZJ c19zj = c19zf;
                    if (c19zj != null) {
                        ((C19ZF) c19zj).LIZ.LIZIZ();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    impl.LJIIZILJ.LIZ(0, z);
                    C19Z1 c19z1 = impl;
                    c19z1.LJIILIIL = 2;
                    c19z1.LJIIIIZZ = animator2;
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = impl.LJIILJJIL;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    animatorSetLIZ.addListener(it2.next());
                }
            }
            animatorSetLIZ.start();
            return;
        }
        impl.LJIIZILJ.LIZ(0, z);
        C19Z0 c19z04 = impl.LJIIZILJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z04);
        c19z04.setAlpha(1.0f);
        C19Z0 c19z05 = impl.LJIIZILJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z05);
        c19z05.setScaleY(1.0f);
        C19Z0 c19z06 = impl.LJIIZILJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19z06);
        c19z06.setScaleX(1.0f);
        impl.LJIIL = 1.0f;
        Matrix matrix2 = impl.LJIJJ;
        matrix2.reset();
        impl.LJIIZILJ.getDrawable();
        impl.LJIIZILJ.setImageMatrix(matrix2);
        if (c19zf == null) {
            return;
        }
        c19zf.LIZ.LIZIZ();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        getSizeDimension();
        getImpl().LJIIJJI();
        throw null;
    }
}
