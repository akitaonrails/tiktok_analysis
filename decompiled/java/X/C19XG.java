package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar$SavedState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19XG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19XG extends C19V8 implements C16G4 {
    public Animator LLLIL;
    public Animator LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public boolean LLLJIL;
    public BottomAppBar$Behavior LLLJL;

    private C19VD getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C19VD) {
                return (C19VD) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return 0;
    }

    public int getLeftInset() {
        return 0;
    }

    public int getRightInset() {
        return 0;
    }

    @Override // X.C19V8
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // X.C19V8
    public void setTitle(CharSequence charSequence) {
    }

    @Override // X.C16G4
    public BottomAppBar$Behavior getBehavior() {
        if (this.LLLJL == null) {
            this.LLLJL = new BottomAppBar$Behavior();
        }
        return this.LLLJL;
    }

    public float getFabTranslationX() {
        return LJIJJLI(this.LLLILZJ);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().LLILLL;
    }

    public final View LJIJI() {
        if (!(getParent() instanceof C16G0)) {
            return null;
        }
        for (View view : (ArrayList) ((C16G0) getParent()).LJI(this)) {
            if ((view instanceof C19Z0) || (view instanceof C19Q6)) {
                return view;
            }
        }
        return null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().LLILLL;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().LLILLJJLI;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().LL;
    }

    @Override // X.C19V8, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZLLL(this, null);
        throw null;
    }

    @Override // X.C19V8, android.view.View
    public final Parcelable onSaveInstanceState() {
        BottomAppBar$SavedState bottomAppBar$SavedState = new BottomAppBar$SavedState((Toolbar$SavedState) super.onSaveInstanceState());
        bottomAppBar$SavedState.LL = this.LLLILZJ;
        bottomAppBar$SavedState.LLILLJJLI = this.LLLJIL;
        return bottomAppBar$SavedState;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.LLLILZJ;
    }

    public int getFabAnimationMode() {
        return this.LLLILZLLLI;
    }

    public boolean getHideOnScroll() {
        return this.LLLIZZ;
    }

    public C19XL getTopEdgeTreatment() {
        throw null;
    }

    public final float LJIJJLI(int i) {
        boolean zLIZJ = C21551419Vw.LIZJ(this);
        int i2 = 1;
        if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (zLIZJ) {
                i2 = -1;
            }
            return measuredWidth * i2;
        }
        return 0.0f;
    }

    @Override // X.C19V8, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BottomAppBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BottomAppBar$SavedState bottomAppBar$SavedState = (BottomAppBar$SavedState) parcelable;
        super.onRestoreInstanceState(bottomAppBar$SavedState.mSuperState);
        this.LLLILZJ = bottomAppBar$SavedState.LL;
        this.LLLJIL = bottomAppBar$SavedState.LLILLJJLI;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C16GF.LJII(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C19XL topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.LLILLL = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        final int i2;
        C19Z0 c19z0;
        C19Z0 c19z02;
        this.LLLJ = 0;
        final boolean z = this.LLLJIL;
        View view = null;
        if (!isLaidOut()) {
            int i3 = this.LLLJ;
            if (i3 != 0) {
                this.LLLJ = 0;
                getMenu().clear();
                LJIIJ(i3);
            }
        } else {
            Animator animator = this.LLLILZ;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            View viewLJIJI = LJIJI();
            if ((viewLJIJI instanceof C19Z0) && (c19z0 = (C19Z0) viewLJIJI) != null && c19z0.LJII()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            final C19VD actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - LJIJJ(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.19XF
                        public boolean LL;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator2) {
                            this.LL = true;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            boolean z2;
                            if (!this.LL) {
                                C19XG c19xg = this.LLILZIL;
                                int i4 = c19xg.LLLJ;
                                if (i4 != 0) {
                                    z2 = true;
                                    c19xg.LLLJ = 0;
                                    c19xg.getMenu().clear();
                                    c19xg.LJIIJ(i4);
                                } else {
                                    z2 = false;
                                }
                                this.LLILZIL.LJIL(actionMenuView, i2, z, z2);
                            }
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.LLLILZ = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.19XK
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    this.LL.getClass();
                    this.LL.getClass();
                    this.LL.LLLILZ = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    this.LL.getClass();
                }
            });
            this.LLLILZ.start();
        }
        if (this.LLLILZJ != i && isLaidOut()) {
            Animator animator2 = this.LLLIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.LLLILZLLLI == 1) {
                View viewLJIJI2 = LJIJI();
                if (viewLJIJI2 instanceof C19Z0) {
                    view = viewLJIJI2;
                }
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "translationX", LJIJJLI(i));
                objectAnimatorOfFloat3.setDuration(300L);
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewLJIJI3 = LJIJI();
                if ((viewLJIJI3 instanceof C19Z0) && (c19z02 = (C19Z0) viewLJIJI3) != null && !c19z02.LJI()) {
                    c19z02.LJFF(new C19Z5(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.LLLIL = animatorSet3;
            animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: X.19XJ
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator3) {
                    this.LL.getClass();
                    this.LL.LLLIL = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator3) {
                    this.LL.getClass();
                }
            });
            this.LLLIL.start();
        }
        this.LLLILZJ = i;
    }

    public void setFabAnimationMode(int i) {
        this.LLLILZLLLI = i;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().LLILLJJLI = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().LL = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.LLLIZZ = z;
    }

    public final int LJIJJ(C19VD c19vd, int i, boolean z) {
        int iMax;
        int left;
        if (i != 1 || !z) {
            return 0;
        }
        boolean zLIZJ = C21551419Vw.LIZJ(this);
        if (zLIZJ) {
            iMax = getMeasuredWidth();
        } else {
            iMax = 0;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C19MJ) && (((C19MI) childAt.getLayoutParams()).LIZ & 8388615) == 8388611) {
                if (zLIZJ) {
                    iMax = Math.min(iMax, childAt.getLeft());
                } else {
                    iMax = Math.max(iMax, childAt.getRight());
                }
            }
        }
        if (zLIZJ) {
            left = c19vd.getRight();
        } else {
            left = c19vd.getLeft();
        }
        return iMax - left;
    }

    public final void LJIL(final C19VD c19vd, final int i, final boolean z, boolean z2) {
        Runnable runnable = new Runnable() { // from class: X.19XH
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BottomAppBar@531b.translateActionMenuView$1");
                try {
                    C19VD c19vd2 = c19vd;
                    float fLJIJJ = this.LLILZ.LJIJJ(c19vd2, i, z);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19vd2);
                    c19vd2.setTranslationX(fLJIJJ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BottomAppBar@531b.translateActionMenuView$1");
            }
        };
        if (z2) {
            HandlerHook.viewPost(c19vd, runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.C19V8, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C19Z0 c19z0;
        super.onLayout(z, i, i2, i3, i4);
        C19Z0 c19z02 = null;
        if (z) {
            Animator animator = this.LLLILZ;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.LLLIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            C19XL topEdgeTreatment = getTopEdgeTreatment();
            getFabTranslationX();
            topEdgeTreatment.getClass();
            LJIJI();
            if (this.LLLJIL) {
                View viewLJIJI = LJIJI();
                if ((viewLJIJI instanceof C19Z0) && (c19z0 = (C19Z0) viewLJIJI) != null) {
                    c19z0.LJII();
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        C19VD actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.LLLILZ == null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(actionMenuView);
            actionMenuView.setAlpha(1.0f);
            View viewLJIJI2 = LJIJI();
            if (viewLJIJI2 instanceof C19Z0) {
                c19z02 = (C19Z0) viewLJIJI2;
            }
            if (c19z02 != null && c19z02.LJII()) {
                LJIL(actionMenuView, this.LLLILZJ, this.LLLJIL, false);
            } else {
                LJIL(actionMenuView, 0, false, false);
            }
        }
    }
}
