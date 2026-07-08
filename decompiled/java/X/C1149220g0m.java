package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0g0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149220g0m extends FrameLayout {
    public boolean LL;
    public C20743416Fc LLILLJJLI;
    public HorizontalScrollView LLILLL;
    public LinearLayout LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ARunnableS28S0101000_17 LLIZ;
    public ValueAnimator LLIZLLLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LL = false;
        super.onDetachedFromWindow();
        HandlerHook.viewRemoveCallbacks(this, this.LLIZ);
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    public final String getText() {
        CharSequence text;
        String string;
        C20743416Fc c20743416Fc = this.LLILLJJLI;
        return (c20743416Fc == null || (text = c20743416Fc.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL = true;
        findViewById(R.id.dyj);
        this.LLILLL = (HorizontalScrollView) findViewById(R.id.u34);
        this.LLILLJJLI = (C20743416Fc) findViewById(R.id.tv_task_tip_title);
        this.LLILZ = (LinearLayout) findViewById(R.id.nio);
        this.LLILZIL = findViewById(R.id.view_alpha_left);
        this.LLILZLL = findViewById(R.id.view_alpha_right);
    }

    public final void LIZ(int i) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll width is ");
        sbLIZ.append(i);
        sbLIZ.append(", scroll X is ");
        HorizontalScrollView horizontalScrollView = this.LLILLL;
        if (horizontalScrollView != null) {
            numValueOf = Integer.valueOf(horizontalScrollView.getScrollX());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("MarqueeView", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= ((int) C497740JfY.LIZIZ(10.0f))) {
            HandlerHook.viewRemoveCallbacks(this, this.LLIZ);
            this.LLIZ = new ARunnableS28S0101000_17(i, this, 1);
            HandlerHook.viewPostDelay(this, this.LLIZ, 1000L);
        }
    }

    public final void setTextSize(float f) throws Throwable {
        C20743416Fc c20743416Fc = this.LLILLJJLI;
        if (c20743416Fc != null) {
            c20743416Fc.setTextSize(1, f);
        }
    }

    public C1149220g0m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h2o, this, true);
    }

    public static void LIZIZ(C1149220g0m c1149220g0m, SpannableStringBuilder spannableStringBuilder) {
        if (a0.LJJJIL(spannableStringBuilder)) {
            int visibility = c1149220g0m.getVisibility();
            c1149220g0m.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1149220g0m);
        } else {
            C20743416Fc c20743416Fc = c1149220g0m.LLILLJJLI;
            if (c20743416Fc != null) {
                c20743416Fc.setText(spannableStringBuilder);
            }
            HandlerHook.viewPost(c1149220g0m, new ARunnableS117S0100000_17(c1149220g0m, 175));
        }
    }
}
