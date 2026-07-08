package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420690GeZ extends FrameLayout {
    public final View LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final LinearLayout LLILZIL;
    public EnumC429130GsB LLILZLL;
    public boolean LLIZ;
    public Animator LLIZLLLIL;
    public Animator LLJ;
    public Animator LLJI;

    public final void LIZIZ() {
        if (this.LLIZ || getWidth() <= 0 || getHeight() <= 0) {
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.LLIZ = false;
        }
    }

    public final void LIZJ() {
        Animator animator = this.LLIZLLLIL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLIZLLLIL = null;
        Animator animator2 = this.LLJ;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLJ = null;
        LJ();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        C786410Ut5.Ob(this.LL, 1.0f);
        C786410Ut5.pc(this.LL, 1.0f);
        C786410Ut5.Rb(this.LLILLJJLI, 1.0f);
        C786410Ut5.sc(this.LLILLJJLI, 1.0f);
        C786410Ut5.O1(this, 8);
    }

    public final void LJ() {
        Animator animator = this.LLJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJI = null;
        C786410Ut5.Ob(this.LL, 1.0f);
        C786410Ut5.pc(this.LL, 1.0f);
    }

    public final void LIZLLL() {
        LJ();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<View, Float>) View.SCALE_X, 0.8f, 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, (Property<View, Float>) View.SCALE_Y, 0.8f, 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat2.setRepeatMode(1);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.LLJI = animatorSet;
        animatorSet.start();
    }

    public final PointF getDotCenterOffset() {
        LIZIZ();
        return new PointF(this.LL.getLeft() + (this.LL.getWidth() / 2.0f), this.LL.getTop() + (this.LL.getHeight() / 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LIZJ();
        super.onDetachedFromWindow();
    }

    public C420690GeZ(Context context) {
        super(context, null, 0);
        this.LLILZLL = EnumC429130GsB.RIGHT;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ij, frameLayout.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        frameLayout.setBackground(gradientDrawable);
        View view = new View(frameLayout.getContext());
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 17));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, view.getContext());
        if (numLIZJ2 != null) {
            gradientDrawable2.setColor(numLIZJ2.intValue());
        }
        view.setBackground(gradientDrawable2);
        frameLayout.addView(view);
        this.LL = frameLayout;
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(C426750GoL.LIZLLL(linearLayout.getContext()) ? 1 : 0);
        linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        gradientDrawable3.setColor(1711276032);
        linearLayout.setBackground(gradientDrawable3);
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setIconRes(R.raw.icon_qr_code);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        tuxIconView.setTintColorRes(R.attr.ee);
        linearLayout.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, tuxTextView.getContext());
        if (numLIZJ3 != null) {
            tuxTextView.setTextColor(numLIZJ3.intValue());
        }
        tuxTextView.setTuxFont(72);
        linearLayout.addView(tuxTextView);
        this.LLILLL = tuxTextView;
        TuxIconView tuxIconView2 = new TuxIconView(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        C786410Ut5.M6(tuxIconView2, layoutParams3);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView2.setTintColorRes(R.attr.ee);
        linearLayout.addView(tuxIconView2);
        this.LLILZ = tuxIconView2;
        this.LLILLJJLI = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutDirection(0);
        this.LLILZIL = linearLayout2;
        addView(linearLayout2);
        LIZ(EnumC429130GsB.RIGHT);
        C786410Ut5.O1(this, 8);
    }

    public final void LIZ(EnumC429130GsB enumC429130GsB) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        boolean z;
        int iLIZIZ;
        int i;
        this.LLILZLL = enumC429130GsB;
        ViewGroup.LayoutParams layoutParams3 = this.LL.getLayoutParams();
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams3) == null) {
            layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        ViewGroup.LayoutParams layoutParams4 = this.LLILLJJLI.getLayoutParams();
        if (!(layoutParams4 instanceof LinearLayout.LayoutParams) || (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        if (enumC429130GsB == EnumC429130GsB.RIGHT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        } else {
            iLIZIZ = 0;
        }
        layoutParams.leftMargin = iLIZIZ;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        C786410Ut5.LJJJJJL(this.LLILZIL);
        if (z) {
            this.LLILZIL.addView(this.LL);
            this.LLILZIL.addView(this.LLILLJJLI);
            this.LLILLJJLI.setPivotX(0.0f);
        } else {
            layoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            this.LLILZIL.addView(this.LLILLJJLI);
            this.LLILZIL.addView(this.LL);
            this.LLILLJJLI.setPivotX(r1.getWidth());
        }
        C786410Ut5.Fb(this.LLILZ, 0.0f);
        C786410Ut5.W5(this.LL, layoutParams);
        C786410Ut5.d6(this.LLILLJJLI, layoutParams2);
        this.LLIZ = true;
        requestLayout();
    }
}
