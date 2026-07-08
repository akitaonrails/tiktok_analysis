package X;

import Y.AAListenerS328S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import mf.a;

/* JADX INFO: renamed from: X.0fDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118590fDN extends FrameLayout {
    public C1099610eil LL;
    public TuxIconView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public View.OnClickListener LLIZLLLIL;
    public View.OnClickListener LLJ;
    public AnimatorSet LLJI;

    private final FrameLayout.LayoutParams getAvatarViewParams() {
        MultiGuestFollowBackGuideSetting multiGuestFollowBackGuideSetting = MultiGuestFollowBackGuideSetting.INSTANCE;
        if (multiGuestFollowBackGuideSetting.whiteFollowButtonStyle()) {
            int i = this.LLILLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            return layoutParams;
        }
        if (!multiGuestFollowBackGuideSetting.redfollowButtonStyle()) {
            int i2 = this.LLILLL;
            return new FrameLayout.LayoutParams(i2, i2);
        }
        int i3 = this.LLILLL;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        return layoutParams2;
    }

    public final void LIZIZ() {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView == null || !C500260Jjc.LJJJJIZL(tuxIconView)) {
            return;
        }
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_X, 1.0f, 0.5f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZJ());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_Y, 1.0f, 0.5f);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZJ());
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet2.addListener(new AAListenerS328S0100000_17(this, 2));
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_X, 0.5f, 1.0f);
            objectAnimatorOfFloat3.setDuration(150L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIIIIZZ());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_Y, 0.5f, 1.0f);
            objectAnimatorOfFloat4.setDuration(150L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIIIIZZ());
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setStartDelay(600L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_X, 1.0f, 0.0f);
            objectAnimatorOfFloat5.setDuration(200L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.SCALE_Y, 1.0f, 0.0f);
            objectAnimatorOfFloat6.setDuration(200L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxIconView, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat7.setDuration(200L);
            objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LIZLLL());
            animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playSequentially(animatorSet2, animatorSet3, animatorSet4);
            this.LLJI = animatorSet5;
            animatorSet5.addListener(new AAListenerS328S0100000_17(this, 1));
            AnimatorSet animatorSet6 = this.LLJI;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
        }
    }

    public final void LJ() {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        this.LLIZ = false;
    }

    public final void LJFF() {
        AnimatorSet animatorSet = this.LLJI;
        if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null)) {
            AnimatorSet animatorSet2 = this.LLJI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLJI = null;
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C12ES.LJIILL(0, tuxIconView);
        }
        LIZ(false);
        LJI();
    }

    public final void LJI() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        if (!this.LLIZ || this.LLILLJJLI == null) {
            return;
        }
        MultiGuestFollowBackGuideSetting multiGuestFollowBackGuideSetting = MultiGuestFollowBackGuideSetting.INSTANCE;
        if (multiGuestFollowBackGuideSetting.whiteFollowButtonStyle()) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            layoutParams = tuxIconView != null ? tuxIconView.getLayoutParams() : null;
            if (!(layoutParams instanceof FrameLayout.LayoutParams) || (layoutParams3 = (FrameLayout.LayoutParams) layoutParams) == null) {
                return;
            }
            layoutParams3.gravity = 81;
            TuxIconView tuxIconView2 = this.LLILLJJLI;
            if (tuxIconView2 != null) {
                C786410Ut5.M6(tuxIconView2, layoutParams3);
                return;
            }
            return;
        }
        if (multiGuestFollowBackGuideSetting.redfollowButtonStyle()) {
            TuxIconView tuxIconView3 = this.LLILLJJLI;
            layoutParams = tuxIconView3 != null ? tuxIconView3.getLayoutParams() : null;
            if (!(layoutParams instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) == null) {
                return;
            }
            layoutParams2.gravity = 8388693;
            TuxIconView tuxIconView4 = this.LLILLJJLI;
            if (tuxIconView4 != null) {
                C786410Ut5.M6(tuxIconView4, layoutParams2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJI = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    public final void LIZ(boolean z) {
        MultiGuestFollowBackGuideSetting multiGuestFollowBackGuideSetting = MultiGuestFollowBackGuideSetting.INSTANCE;
        if (multiGuestFollowBackGuideSetting.whiteFollowButtonStyle()) {
            if (z) {
                LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), R.attr.ezr, R.raw.icon_tick_fill, this.LLILZIL, this.LLILZLL, R.attr.ezm, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), R.attr.ev1);
                return;
            } else {
                LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), R.attr.ezr, R.raw.icon_plus_person_fill, this.LLILZIL, this.LLILZLL, R.attr.ezm, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), R.attr.ev1);
                return;
            }
        }
        if (!multiGuestFollowBackGuideSetting.redfollowButtonStyle()) {
            return;
        }
        if (z) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            int i = this.LLILZ;
            LIZLLL(iLIZIZ, iLIZIZ2, R.attr.eya, R.raw.icon_tick_fill, i, i, R.attr.ezn, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(264)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), R.attr.ezn);
            return;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        int i2 = this.LLILZ;
        LIZLLL(iLIZIZ3, iLIZIZ4, R.attr.c9i, R.raw.icon_plus_small, i2, i2, R.attr.eya, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(264)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), R.attr.ext);
    }

    public final void LIZJ(ImageModel imageModel) {
        C1099610eil c1099610eil = this.LL;
        if (c1099610eil != null) {
            C1121670fIL.LJIILIIL(c1099610eil, imageModel, c1099610eil.getWidth(), c1099610eil.getHeight(), R.drawable.el_);
            View.OnClickListener aVar = this.LLIZLLLIL;
            if (C1848410yCV.LIZ) {
                if (aVar != null) {
                    aVar = new f(aVar);
                    aVar = new a(aVar);
                }
            } else if (aVar != null) {
                aVar = new a(aVar);
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
    }

    public final void setAvatarOnClickListener(View.OnClickListener onClickListener) {
        this.LLIZLLLIL = onClickListener;
        C1099610eil c1099610eil = this.LL;
        if (c1099610eil != null) {
            C500260Jjc.LJLIIIL(500L, c1099610eil, new AwS594S0100000_15(onClickListener, 447));
        }
    }

    public final void setFollowOnClickListener(View.OnClickListener onClickListener) {
        this.LLJ = onClickListener;
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C500260Jjc.LJLIIIL(500L, tuxIconView, new AwS594S0100000_15(onClickListener, 448));
        }
    }

    public C1118590fDN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.FollowBadgetAvatarView);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FollowBadgetAvatarView_headSize, this.LLILLL);
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.FollowBadgetAvatarView_headBackground);
        this.LLIZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FollowBadgetAvatarView_isHasFollowButton, false);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FollowBadgetAvatarView_badgeSize, this.LLILZ);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FollowBadgetAvatarView_bottomFollowWidth, this.LLILZIL);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FollowBadgetAvatarView_bottomFollowHeight, this.LLILZLL);
        typedArrayObtainStyledAttributes.recycle();
        C1099610eil c1099610eil = new C1099610eil(getContext());
        C786410Ut5.B6(c1099610eil, getAvatarViewParams());
        C500260Jjc.LJLIIIL(500L, c1099610eil, new AwS596S0100000_17(this, 18));
        this.LL = c1099610eil;
        addView(c1099610eil);
        if (this.LLIZ) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                C12ES.LJIILL(0, tuxIconView);
            }
            LIZ(false);
        }
        LJI();
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9) {
        if (this.LLILLJJLI == null) {
            this.LLIZ = true;
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            View.OnClickListener onClickListener = this.LLJ;
            if (onClickListener != null) {
                C500260Jjc.LJLIIL(onClickListener, tuxIconView);
            }
            this.LLILLJJLI = tuxIconView;
            addView(tuxIconView);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i4;
        c419910GdJ.LJ = Integer.valueOf(i3);
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = i5;
        c384050F3z.LJI = i6;
        c384050F3z.LIZIZ = Integer.valueOf(i7);
        c384050F3z.LIZJ = Float.valueOf(f);
        c384050F3z.LIZLLL = Integer.valueOf(i8);
        c384050F3z.LJFF = Integer.valueOf(i9);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext()));
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setImageDrawable(layerDrawableLJIILIIL);
        }
    }
}
