package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.12EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EJ extends FrameLayout {
    public final ConstraintLayout LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TextView LLILZ;
    public final LinearLayout LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final FrameLayout LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public AnimatorSet LLJJIJIL;
    public ARunnableS75S0200000_6 LLJJJ;
    public C12EL LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    private final int getMaxAnchorWidth() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    public final void LIZIZ() {
        Integer numLIZJ;
        FrameLayout frameLayout = this.LLJ;
        Float fValueOf = Float.valueOf(6.0f);
        frameLayout.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        this.LLJ.setBackgroundResource(R.drawable.ajs);
        this.LLIZLLLIL.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), 0);
        if (C0A1E.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext())) != null) {
            this.LLIZ.setTextColor(numLIZJ.intValue());
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LL);
        c19mb.LJI(this.LLIZLLLIL.getId(), 3);
        c19mb.LJI(this.LLIZLLLIL.getId(), 4);
        c19mb.LJIIIIZZ(this.LLIZLLLIL.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(this.LLIZLLLIL.getId(), 4, 0, 4);
        c19mb.LJI(this.LLILZLL.getId(), 7);
        c19mb.LJIIIIZZ(this.LLILZLL.getId(), 7, this.LLIZLLLIL.getId(), 6);
        c19mb.LIZIZ(this.LL);
    }

    public final void LIZJ() {
        C12EL c12el = this.LLJJJIL;
        if (this.LLJJJJ) {
            C786410Ut5.LLIL(this.LLILZLL, 0);
            C786410Ut5.S4(1.0f, this.LLILZLL);
            ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
            int i = this.LLJILJILJ;
            if (i <= 0) {
                i = -2;
            }
            layoutParams.height = i;
            C786410Ut5.g6(this.LLILZLL, layoutParams);
        } else {
            C786410Ut5.LLIL(this.LLILZLL, 8);
            C786410Ut5.S4(0.0f, this.LLILZLL);
        }
        if (this.LLJJJJJIL) {
            C786410Ut5.U4(this.LLIZLLLIL, 1.0f);
            C786410Ut5.LJZ(0, this.LLIZLLLIL);
            ViewGroup.LayoutParams layoutParams2 = this.LLIZLLLIL.getLayoutParams();
            layoutParams2.width = -2;
            C786410Ut5.a6(this.LLIZLLLIL, layoutParams2);
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
            if ((c12el != null ? c12el.LJI : null) == EnumC19367410ps.BUTTON) {
                LIZ(this.LLJI, this.LLJIJIL);
            } else {
                LJIIL(this.LLJI, this.LLJIJIL);
            }
        } else {
            C786410Ut5.LJZ(8, this.LLIZLLLIL);
            C786410Ut5.U4(this.LLIZLLLIL, 0.0f);
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
            LJIIL(this.LLJI, this.LLJIJIL);
        }
        ViewGroup.LayoutParams layoutParams3 = this.LLIZ.getLayoutParams();
        layoutParams3.width = -2;
        C786410Ut5.g6(this.LLIZ, layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.LL.getLayoutParams();
        int i2 = this.LLJJI;
        if (i2 <= 0) {
            i2 = layoutParams4.width;
        }
        layoutParams4.width = i2;
        int i3 = this.LLJJIII;
        if (i3 <= 0) {
            i3 = layoutParams4.height;
        }
        layoutParams4.height = i3;
        C786410Ut5.m6(this.LL, layoutParams4);
        this.LLJILJIL = this.LLILZ.getLayoutParams().width;
    }

    public final void LJIIIZ() {
        this.LLIZLLLIL.getPaddingStart();
        this.LLIZLLLIL.getPaddingEnd();
        int measuredWidth = this.LLIZLLLIL.getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C786410Ut5.LJZ(8, this.LLIZLLLIL);
        C786410Ut5.LJZ(8, this.LLJ);
        C786410Ut5.LLIL(this.LLIZ, 8);
        this.LL.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        C786410Ut5.LJZ(0, this.LLIZLLLIL);
        C786410Ut5.LJZ(0, this.LLJ);
        C786410Ut5.LLIL(this.LLIZ, 0);
        this.LLIZLLLIL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.LL.getMeasuredWidth() + this.LLIZLLLIL.getMeasuredWidth() + (this.LLJJJJJIL ? 0 : this.LLIZLLLIL.getPaddingStart());
        this.LLJJI = Math.min(measuredWidth2, getMaxAnchorWidth());
        this.LLJJIJI = Math.max(0, measuredWidth2 - getMaxAnchorWidth());
        ViewGroup.LayoutParams layoutParams = this.LLIZLLLIL.getLayoutParams();
        layoutParams.width = measuredWidth;
        C786410Ut5.a6(this.LLIZLLLIL, layoutParams);
        this.LLJJIII = this.LL.getMeasuredHeight();
        this.LLJILJILJ = this.LLJJJJ ? this.LLILZLL.getMeasuredHeight() : 0;
    }

    public final void LJIIJJI() {
        if (this.LLJJJJ) {
            C786410Ut5.LLIL(this.LLILZLL, 0);
            ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.g6(this.LLILZLL, layoutParams);
            C786410Ut5.S4(1.0f, this.LLILZLL);
        } else {
            C786410Ut5.LLIL(this.LLILZLL, 8);
        }
        if (this.LLJJJJJIL) {
            C786410Ut5.LJZ(0, this.LLIZLLLIL);
            C786410Ut5.LJZ(0, this.LLJ);
            C786410Ut5.LLIL(this.LLIZ, 0);
            C786410Ut5.U4(this.LLIZLLLIL, 1.0f);
            return;
        }
        C786410Ut5.LJZ(8, this.LLIZLLLIL);
        C786410Ut5.LJZ(8, this.LLJ);
        C786410Ut5.LLIL(this.LLIZ, 8);
        C786410Ut5.U4(this.LLIZLLLIL, 0.0f);
    }

    public final void LJIILJJIL() {
        C12EP c12ep;
        C12EL c12el = this.LLJJJIL;
        if (c12el != null && (c12ep = c12el.LJIIJ) != null) {
            c12ep.LIZ(this.LLJI, this.LLJIJIL);
        }
        this.LLJJJIL = null;
        ARunnableS75S0200000_6 aRunnableS75S0200000_6 = this.LLJJJ;
        if (aRunnableS75S0200000_6 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS75S0200000_6);
        }
        this.LLJJJ = null;
        AnimatorSet animatorSet = this.LLJJIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJIJIL = null;
        this.LLILZ.setText("");
        this.LLILZLL.setText("");
        this.LLIZ.setText("");
        this.LLIZ.setMaxWidth(getMaxAnchorWidth() / 2);
        this.LLIZ.setTextSize(12.0f);
        this.LLIZ.setEllipsize(null);
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJILLL = 0;
        this.LLJJ = 0;
        this.LLJJI = 0;
        this.LLJJIII = 0;
        this.LLJJIJI = 0;
        requestLayout();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final View getBaseArea() {
        return this.LLJI;
    }

    public final View getDynamicArea() {
        return this.LLJIJIL;
    }

    public final C12EL getRenderData() {
        return this.LLJJJIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private final void setCtaText(CharSequence charSequence) {
        int width;
        int paddingEnd;
        this.LLIZ.setText(charSequence);
        TextView textView = this.LLIZ;
        String string = charSequence.toString();
        TextPaint paint = textView.getPaint();
        if (textView.getMaxWidth() > 0) {
            width = textView.getMaxWidth() - textView.getPaddingStart();
            paddingEnd = textView.getPaddingEnd();
        } else {
            width = textView.getWidth() - textView.getPaddingStart();
            paddingEnd = textView.getPaddingEnd();
        }
        if (StaticLayout.Builder.obtain(string, 0, string.length(), paint, width - paddingEnd).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setMaxLines(Integer.MAX_VALUE).build().getLineCount() > 1) {
            this.LLIZ.setTextSize(10.0f);
            this.LLIZ.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.LLIZ.setEllipsize(null);
        }
    }

    private final void setIcon(UrlModel urlModel) {
        if (urlModel == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.LLILZLL.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.LLILZ.setText(charSequence);
    }

    public final void LIZLLL(C12EL c12el) {
        int measuredWidth;
        int paddingStart;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C786410Ut5.LJZ(8, this.LLIZLLLIL);
        this.LL.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        C786410Ut5.LJZ(0, this.LLIZLLLIL);
        this.LLJILJIL = this.LLILZ.getMeasuredWidth();
        this.LLIZLLLIL.getPaddingStart();
        this.LLIZLLLIL.getPaddingEnd();
        CharSequence text = this.LLIZ.getText();
        if (text != null && text.length() != 0) {
            measuredWidth = this.LLIZLLLIL.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        int measuredWidth2 = this.LL.getMeasuredWidth() + measuredWidth;
        if (this.LLJJJJJIL) {
            paddingStart = 0;
        } else {
            paddingStart = this.LLIZLLLIL.getPaddingStart();
        }
        int i = measuredWidth2 + paddingStart;
        this.LLJJI = Math.min(i, getMaxAnchorWidth());
        this.LLJJIJI = Math.max(0, i - getMaxAnchorWidth());
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        layoutParams.width = this.LLJILJIL - this.LLJJIJI;
        C786410Ut5.g6(this.LLILZ, layoutParams);
        this.LLJILJIL = layoutParams.width;
        ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
        layoutParams2.width = this.LLJJI;
        C786410Ut5.m6(this.LL, layoutParams2);
        LJIIIIZZ(new AwS430S0200000_29(this, c12el, 16));
    }

    public final void LJ(C12EL c12el) {
        boolean z;
        boolean z2;
        String str = c12el.LIZLLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.LLJJJJ = !z;
        String str2 = c12el.LJFF;
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLJJJJJIL = !z2;
        if (this.LLJJJJ) {
            ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.g6(this.LLILZLL, layoutParams);
            C786410Ut5.LLIL(this.LLILZLL, 0);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.LLILZLL.getLayoutParams();
            layoutParams2.height = 0;
            C786410Ut5.g6(this.LLILZLL, layoutParams2);
            C786410Ut5.LLIL(this.LLILZLL, 8);
        }
        if (this.LLJJJJJIL) {
            ViewGroup.LayoutParams layoutParams3 = this.LLIZLLLIL.getLayoutParams();
            layoutParams3.width = -2;
            C786410Ut5.a6(this.LLIZLLLIL, layoutParams3);
            C786410Ut5.LJZ(0, this.LLIZLLLIL);
            C786410Ut5.LJZ(0, this.LLJ);
            C786410Ut5.LLIL(this.LLIZ, 0);
        } else {
            ViewGroup.LayoutParams layoutParams4 = this.LLIZLLLIL.getLayoutParams();
            layoutParams4.width = 0;
            C786410Ut5.a6(this.LLIZLLLIL, layoutParams4);
            C786410Ut5.LJZ(8, this.LLIZLLLIL);
            C786410Ut5.LJZ(8, this.LLJ);
            C786410Ut5.LLIL(this.LLIZ, 8);
        }
        ViewGroup.LayoutParams layoutParams5 = this.LL.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        C786410Ut5.m6(this.LL, layoutParams5);
        ViewGroup.LayoutParams layoutParams6 = this.LLILZ.getLayoutParams();
        layoutParams6.width = -2;
        C786410Ut5.g6(this.LLILZ, layoutParams6);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C12EL r11) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12EJ.LJFF(X.12EL):void");
    }

    public final Animator LJII(TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLJILLL, this.LLJJI);
        valueAnimatorOfInt.setDuration(320L);
        valueAnimatorOfInt.setInterpolator(timeInterpolator);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 21));
        return valueAnimatorOfInt;
    }

    public final void LJIIIIZZ(Function0<Unit> function0) {
        ARunnableS75S0200000_6 aRunnableS75S0200000_6 = this.LLJJJ;
        if (aRunnableS75S0200000_6 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS75S0200000_6);
        }
        this.LLJJJ = null;
        AnimatorSet animatorSet = this.LLJJIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJIJIL = null;
        ARunnableS75S0200000_6 aRunnableS75S0200000_62 = new ARunnableS75S0200000_6((Object) this, (Object) function0, 38);
        this.LLJJJ = aRunnableS75S0200000_62;
        HandlerHook.viewPost(this, aRunnableS75S0200000_62);
    }

    public final void LJIIJ(List list) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setStartDelay(0L);
        this.LLJJIJIL = animatorSet;
        animatorSet.addListener(new ALAdapterS23S0200000_29(this, new C013C(), 0));
        animatorSet.start();
    }

    public final void LJIILIIL(C12EL c12el) {
        String str;
        String str2;
        if (this.LLJJJJ && (c12el == null || (str2 = c12el.LIZLLL) == null || str2.length() == 0)) {
            ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
            layoutParams.height = 0;
            C786410Ut5.g6(this.LLILZLL, layoutParams);
            C786410Ut5.LLIL(this.LLILZLL, 0);
            C786410Ut5.S4(0.0f, this.LLILZLL);
        }
        if (this.LLJJJJJIL && (c12el == null || (str = c12el.LJFF) == null || str.length() == 0)) {
            ViewGroup.LayoutParams layoutParams2 = this.LLIZLLLIL.getLayoutParams();
            layoutParams2.width = 0;
            C786410Ut5.a6(this.LLIZLLLIL, layoutParams2);
            C786410Ut5.U4(this.LLIZLLLIL, 0.0f);
            C786410Ut5.LJZ(0, this.LLIZLLLIL);
            C786410Ut5.LJZ(0, this.LLJ);
            C786410Ut5.LLIL(this.LLIZ, 0);
        }
        ViewGroup.LayoutParams layoutParams3 = this.LL.getLayoutParams();
        layoutParams3.width = this.LLJILLL;
        layoutParams3.height = this.LLJJ;
        C786410Ut5.m6(this.LL, layoutParams3);
    }

    public C12EJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(context, 4));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b53, this, true);
        this.LL = (ConstraintLayout) findViewById(R.id.az_);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.jy8);
        this.LLILLL = (FrameLayout) findViewById(R.id.jxs);
        this.LLILZ = (TextView) findViewById(R.id.xzv);
        this.LLILZIL = (LinearLayout) findViewById(R.id.xk8);
        this.LLILZLL = (TextView) findViewById(R.id.wlv);
        this.LLIZ = (TextView) findViewById(R.id.f_w);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.f_x);
        this.LLJ = (FrameLayout) findViewById(R.id.f_v);
        this.LLJI = findViewById(R.id.eu5);
        this.LLJIJIL = findViewById(R.id.f_u);
    }

    public final void LIZ(View view, View view2) {
        C12EP c12ep;
        int measuredWidth = (this.LLILLL.getMeasuredWidth() + this.LLILZIL.getMeasuredWidth()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = measuredWidth;
        C786410Ut5.W5(view, layoutParams);
        C12EL c12el = this.LLJJJIL;
        if (c12el != null && (c12ep = c12el.LJIIJ) != null) {
            c12ep.LIZIZ(view, view2);
        }
    }

    public final void LJIIL(View view, View view2) {
        C12EP c12ep;
        int measuredWidth = this.LLILLL.getMeasuredWidth() + this.LLILZIL.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = measuredWidth;
        C786410Ut5.W5(view, layoutParams);
        C12EL c12el = this.LLJJJIL;
        if (c12el != null && (c12ep = c12el.LJIIJ) != null) {
            c12ep.LIZIZ(view, view2);
        }
    }

    public final Animator LJI(final int i, final int i2, final int i3, TimeInterpolator timeInterpolator) {
        final int paddingStart = this.LLIZLLLIL.getPaddingStart() + this.LLIZLLLIL.getPaddingEnd();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(320L);
        valueAnimatorOfInt.setInterpolator(timeInterpolator);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.10tB
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = this.LL.LLIZLLLIL.getLayoutParams();
                layoutParams.width = iIntValue;
                C786410Ut5.a6(this.LL.LLIZLLLIL, layoutParams);
                int i4 = i;
                float f = (iIntValue - i4) / (i2 - i4);
                int i5 = iIntValue - paddingStart;
                ViewGroup.LayoutParams layoutParams2 = this.LL.LLILZ.getLayoutParams();
                C12EJ c12ej = this.LL;
                layoutParams2.width = (c12ej.LLJILJIL - Math.min(i5, c12ej.LLJJIJI)) - ((int) (f * i3));
                C786410Ut5.g6(this.LL.LLILZ, layoutParams2);
            }
        });
        return valueAnimatorOfInt;
    }
}
