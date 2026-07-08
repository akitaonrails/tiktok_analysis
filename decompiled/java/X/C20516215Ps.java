package X;

import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516215Ps extends LinearLayout {
    public final AttributeSet LL;
    public final int LLILLJJLI;
    public final RelativeLayout LLILLL;
    public final C1CRB LLILZ;
    public final RelativeLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final C197039127h LLJ;
    public final TuxIconView LLJI;
    public final LinearLayout LLJIJIL;
    public final RelativeLayout LLJILJIL;
    public C1057450dcl LLJILJILJ;
    public final float LLJILLL;
    public Function0<Unit> LLJJ;

    public final Function0<Unit> getDismiss() {
        return this.LLJJ;
    }

    public final void LIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = this.LLJILLL;
            f = 0.0f;
        } else {
            f = this.LLJILLL;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", f2, f).setDuration(348L);
        duration.setInterpolator(new InterpolatorC448120Hhi(1.71f));
        float[] fArr = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr[1] = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.start();
    }

    public final void LIZIZ(C1057450dcl c1057450dcl) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        this.LLJILJILJ = c1057450dcl;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.LL, R$styleable.TuxFloatingNotice, R.attr.xy, this.LLILLJJLI);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.TuxFloatingNotice__tux_noticeBgDrawable);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFloatingNotice__tux_titleFontColor, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFloatingNotice__tux_titleFont, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFloatingNotice__tux_noticeMsgFontColor, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFloatingNotice__tux_noticeMsgFont, 0);
        int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFloatingNotice__tux_noticeMsgFontWithoutTitle, 0);
        int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFloatingNotice__tux_noticeBtnSize, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFloatingNotice__tux_noticeVariantNormal, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFloatingNotice__tux_noticeVariantNormalEndIconColor, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFloatingNotice__tux_noticeVariantDisclosure, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFloatingNotice__tux_noticeVariantDisclosureEndIconColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout relativeLayout = this.LLILLL;
        relativeLayout.setBackground(drawable);
        relativeLayout.setLayoutMode(1);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = Math.min(C497820Jfg.LIZIZ(relativeLayout.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(430))) + relativeLayout.getPaddingLeft() + relativeLayout.getPaddingRight();
        C786410Ut5.e6(relativeLayout, layoutParams);
        C426750GoL.LJIIL(this.LLILZ, null, null, null, Integer.valueOf(c1057450dcl.LJIIIZ), 23);
        C427690Gpr.LJ(this.LLILZIL, C418440Gaw.LIZIZ(16));
        C786410Ut5.S7(this.LLILZIL, new ACListenerS133S0200000_31(c1057450dcl, this, 9));
        FrameLayout frameLayout = this.LLILZLL;
        Function1<? super FrameLayout, Unit> function1 = c1057450dcl.LIZ;
        if (function1 == null) {
            i = 8;
        } else {
            function1.invoke(frameLayout);
            i = 0;
        }
        C786410Ut5.LJZ(i, frameLayout);
        C426750GoL.LJIIIZ(frameLayout, null, null, Integer.valueOf(c1057450dcl.LIZLLL), null, false, 27);
        CharSequence charSequence = c1057450dcl.LJ;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = !z;
        CharSequence charSequence2 = c1057450dcl.LJFF;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        TuxTextView tuxTextView = this.LLIZ;
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i2);
        if (z4) {
            tuxTextView.setTextDirection(5);
            tuxTextView.setTuxFont(i5);
            tuxTextView.setTextColor(color);
            tuxTextView.setText(c1057450dcl.LJ);
        }
        if (!z5) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) tuxTextView.getLayoutParams();
            layoutParams2.addRule(15);
            C786410Ut5.R6(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        CharSequence charSequence3 = c1057450dcl.LJFF;
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i3);
        if (z5) {
            tuxTextView2.setTextDirection(5);
            CharSequence charSequence4 = c1057450dcl.LJ;
            if (charSequence4 == null || charSequence4.length() <= 0) {
                i6 = i7;
            }
            tuxTextView2.setTuxFont(i6);
            CharSequence charSequence5 = c1057450dcl.LJ;
            if (charSequence5 == null || charSequence5.length() <= 0) {
                color2 = color;
            }
            tuxTextView2.setTextColor(color2);
            tuxTextView2.setText(charSequence3);
            tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
            tuxTextView2.setClickable(false);
            tuxTextView2.setLongClickable(false);
        }
        if (!z4) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tuxTextView2.getLayoutParams();
            layoutParams3.addRule(15);
            C786410Ut5.R6(tuxTextView2, layoutParams3);
        } else if (z5) {
            C426750GoL.LJIIIZ(this.LLIZ, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 23);
        }
        CharSequence charSequence6 = c1057450dcl.LJI;
        if (charSequence6 != null && charSequence6.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = !z3;
        C197039127h c197039127h = this.LLJ;
        if (z6) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i4);
        if (z6) {
            c197039127h.setButtonSize(i8);
            c197039127h.setMinTextSize(10.0f);
            Integer num = c1057450dcl.LJIIIIZZ;
            if (num != null) {
                c197039127h.setButtonVariant(num.intValue());
            }
            c197039127h.setText(c1057450dcl.LJI);
            C786410Ut5.U8(c197039127h, new ACListenerS165S0100000_31(c1057450dcl, 60));
            if (c1057450dcl.LJII > 0) {
                ViewGroup.LayoutParams layoutParams4 = c197039127h.getLayoutParams();
                layoutParams4.width = c1057450dcl.LJII;
                C786410Ut5.J6(c197039127h, layoutParams4);
            }
        }
        TuxIconView tuxIconView = this.LLJI;
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (c1057450dcl.LJIIJ == 1) {
            tuxIconView.setIconRes(resourceId2);
            tuxIconView.setTintColor(color4);
        } else {
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color3);
            C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 61));
        }
        C427690Gpr.LJI(tuxIconView, null);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.LLJIJIL.getLayoutParams();
        layoutParams5.addRule(15);
        C786410Ut5.d6(this.LLJIJIL, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.LLJILJIL.getLayoutParams();
        layoutParams6.addRule(15);
        C786410Ut5.e6(this.LLJILJIL, layoutParams6);
        C786410Ut5.x3(this.LLILZ.getViewTreeObserver(), new C16HN(this, 8));
    }

    public final void setDismiss(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public C20516215Ps(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = attributeSet;
        this.LLILLJJLI = 0;
        this.LLJILLL = C418440Gaw.LIZIZ(20);
        C786410Ut5.Sd(R.layout.g6, C786410Ut5.ne(context), this);
        this.LLILLL = (RelativeLayout) findViewById(R.id.bxd);
        this.LLILZ = (C1CRB) findViewById(R.id.id5);
        this.LLILZIL = (RelativeLayout) findViewById(R.id.evm);
        this.LLILZLL = (FrameLayout) findViewById(R.id.vzg);
        this.LLIZ = (TuxTextView) findViewById(R.id.title);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.o8v);
        this.LLJ = (C197039127h) findViewById(R.id.pcs);
        this.LLJI = (TuxIconView) findViewById(R.id.h4q);
        this.LLJIJIL = (LinearLayout) findViewById(R.id.tks);
        this.LLJILJIL = (RelativeLayout) findViewById(R.id.mjp);
    }

    public final boolean LIZJ(int i, int i2) {
        int[] iArr = new int[2];
        this.LLILZIL.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = this.LLILZIL.getMeasuredWidth() + i3;
        int measuredHeight = this.LLILZIL.getMeasuredHeight() + i4;
        if (i4 > i2 || i2 > measuredHeight || i3 > i || i > measuredWidth) {
            return false;
        }
        return true;
    }
}
