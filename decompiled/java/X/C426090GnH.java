package X;

import Y.ARunnableS17S0101000_6;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0GnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426090GnH extends FrameLayout {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final LinearLayout LLILLL;
    public AnimatorSet LLILZ;
    public AnimatorSet LLILZIL;
    public ARunnableS17S0101000_6 LLILZLL;
    public ViewTreeObserverOnPreDrawListenerC426100GnI LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public int LLJIJIL;

    public final void LIZ() {
        LinearLayout linearLayout;
        ViewTreeObserver viewTreeObserver;
        this.LLJ = false;
        this.LLJI = 0L;
        this.LLJIJIL++;
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLILZ = null;
        AnimatorSet animatorSet2 = this.LLILZIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLILZIL = null;
        ARunnableS17S0101000_6 aRunnableS17S0101000_6 = this.LLILZLL;
        if (aRunnableS17S0101000_6 != null) {
            getMainHandler().removeCallbacks(aRunnableS17S0101000_6);
        }
        this.LLILZLL = null;
        ViewTreeObserverOnPreDrawListenerC426100GnI viewTreeObserverOnPreDrawListenerC426100GnI = this.LLIZ;
        if (viewTreeObserverOnPreDrawListenerC426100GnI != null && (linearLayout = this.LLILLL) != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC426100GnI);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC426100GnI, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLIZ = null;
    }

    private final Handler getMainHandler() {
        return (Handler) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0GnI, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void LIZJ() {
        if (this.LLJ) {
            return;
        }
        LIZ();
        this.LLJ = true;
        this.LLJI = SystemClock.uptimeMillis() + 2300;
        LIZIZ(2300L);
        final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this, 48);
        final LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams.width != -2) {
                layoutParams.width = -2;
                C786410Ut5.d6(linearLayout, layoutParams);
            }
            C786410Ut5.LJZL(0, linearLayout);
            C786410Ut5.W4(linearLayout, 0.0f);
            linearLayout.requestLayout();
            int measuredWidth = linearLayout.getMeasuredWidth();
            if (measuredWidth > 0) {
                awS585S0100000_6.invoke(Integer.valueOf(measuredWidth));
                return;
            }
            ViewTreeObserverOnPreDrawListenerC426100GnI viewTreeObserverOnPreDrawListenerC426100GnI = this.LLIZ;
            if (viewTreeObserverOnPreDrawListenerC426100GnI != null) {
                ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC426100GnI);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC426100GnI, ViewTreeObserver.OnPreDrawListener.class);
                }
            }
            ?? r2 = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0GnI
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int measuredWidth2 = linearLayout.getMeasuredWidth();
                    if (measuredWidth2 <= 0) {
                        return true;
                    }
                    ViewTreeObserver viewTreeObserver2 = linearLayout.getViewTreeObserver();
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                        C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                    }
                    this.LLIZ = null;
                    awS585S0100000_6.invoke(Integer.valueOf(measuredWidth2));
                    return true;
                }
            };
            this.LLIZ = r2;
            ViewTreeObserver viewTreeObserver2 = linearLayout.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnPreDrawListener(r2);
                C2187701Ajg.LIZ(viewTreeObserver2, r2, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LinearLayout linearLayout;
        ViewTreeObserver viewTreeObserver;
        if (!this.LLJ || this.LLJI <= 0) {
            LIZ();
        } else {
            AnimatorSet animatorSet = this.LLILZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLILZ = null;
            AnimatorSet animatorSet2 = this.LLILZIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLILZIL = null;
            ARunnableS17S0101000_6 aRunnableS17S0101000_6 = this.LLILZLL;
            if (aRunnableS17S0101000_6 != null) {
                getMainHandler().removeCallbacks(aRunnableS17S0101000_6);
            }
            this.LLILZLL = null;
            ViewTreeObserverOnPreDrawListenerC426100GnI viewTreeObserverOnPreDrawListenerC426100GnI = this.LLIZ;
            if (viewTreeObserverOnPreDrawListenerC426100GnI != null && (linearLayout = this.LLILLL) != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC426100GnI);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC426100GnI, ViewTreeObserver.OnPreDrawListener.class);
            }
            this.LLIZ = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJ) {
            long j = this.LLJI;
            if (j > 0) {
                long jUptimeMillis = j - SystemClock.uptimeMillis();
                LIZIZ(jUptimeMillis >= 0 ? jUptimeMillis : 0L);
            }
        }
    }

    public final void LIZIZ(long j) {
        ARunnableS17S0101000_6 aRunnableS17S0101000_6 = this.LLILZLL;
        if (aRunnableS17S0101000_6 != null) {
            getMainHandler().removeCallbacks(aRunnableS17S0101000_6);
        }
        ARunnableS17S0101000_6 aRunnableS17S0101000_62 = new ARunnableS17S0101000_6(this.LLJIJIL, this, 1);
        this.LLILZLL = aRunnableS17S0101000_62;
        C786410Ut5.LJLIIL(j, getMainHandler(), aRunnableS17S0101000_62);
    }

    public C426090GnH(Context context, AttributeSet attributeSet) {
        TuxIconView tuxIconView;
        TextView textView;
        super(context, attributeSet, 0);
        this.LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS192S0000000_6.get$arr$(425));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i_a, this, true);
        this.LL = viewTd;
        LinearLayout linearLayout = null;
        if (viewTd != null) {
            tuxIconView = (TuxIconView) viewTd.findViewById(R.id.lo2);
        } else {
            tuxIconView = null;
        }
        this.LLILLJJLI = tuxIconView;
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.zwu);
            linearLayout = (LinearLayout) viewTd.findViewById(R.id.nar);
        } else {
            textView = null;
        }
        this.LLILLL = linearLayout;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            linearLayout.setBackground(c384050F3z.LIZ(context));
        }
        if (textView != null) {
            textView.setText(C555520LqY.LIZIZ(2131836942));
        }
    }
}
