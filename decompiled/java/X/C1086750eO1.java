package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS22S1100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageAudienceV3Setting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0eO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086750eO1 extends C16F5 {
    public EnumC1086740eO0 LLJJ;
    public ValueAnimator LLJJI;
    public String LLJJIII;
    public final long LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;
    public ARunnableS22S1100000_17 LLJJIJIL;
    public final ARunnableS117S0100000_17 LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final String LLJJL;

    public final void LJJJJI() {
        setPadding(this.LLJJJIL, getPaddingTop(), this.LLJJJJ, getPaddingBottom());
    }

    public final void LJJJJJ() {
        C20441214yg.LJIIIZ("TakeStageMarquee", "[TakeStageMarqueeDiag] resetMarqueeStatus");
        this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
        ARunnableS22S1100000_17 aRunnableS22S1100000_17 = this.LLJJIJIL;
        if (aRunnableS22S1100000_17 != null) {
            this.LLJJIJIIJIL.removeCallbacks(aRunnableS22S1100000_17);
        }
        this.LLJJIJIL = null;
        this.LLJJ = EnumC1086740eO0.LL;
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJI = null;
        setScrollX(LJJJJIZL());
        setEllipsize(null);
        String str = this.LLJJIII;
        if (str != null) {
            setText(str);
        }
        this.LLJJIII = null;
        LJJJJI();
    }

    public final int LJJJJIZL() {
        if (C497740JfY.LJJ()) {
            return 1048576 - getWidth();
        }
        return 0;
    }

    public final void LJJJJL() {
        if (getVisibility() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scheduleTryStartMarquee");
            sbLIZ.append(", visibility=");
            sbLIZ.append(getVisibility());
            sbLIZ.append(", skip");
            C20441214yg.LIZIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!isShown()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scheduleTryStartMarquee");
            sbLIZ2.append(", isShown is false, skip");
            C20441214yg.LIZIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (getWidth() <= 0) {
            C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 2));
        } else {
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
            C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, this.LLJJJ);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LiveCoHostTakeTheStageAudienceV3Setting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("TakeStageMarquee", "onAttachedToWindow. scheduleTryStartMarquee");
            LJJJJL();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJJJJJ();
    }

    public C1086750eO1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJ = EnumC1086740eO0.LL;
        this.LLJJIJI = 2000L;
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJ = new ARunnableS117S0100000_17(this, 26);
        this.LLJJJIL = (int) C497740JfY.LIZIZ(8.0f);
        this.LLJJJJ = (int) C497740JfY.LIZIZ(8.0f);
        this.LLJJJJJIL = (int) C497740JfY.LIZIZ(8.0f);
        this.LLJJJJLIIL = (int) C497740JfY.LIZIZ(20.0f);
        this.LLJJL = "    ";
        setEllipsize(null);
        setMaxLines(1);
        setSingleLine(true);
        setHorizontallyScrolling(true);
        LJJJJI();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && LiveCoHostTakeTheStageAudienceV3Setting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("TakeStageMarquee", "onVisibilityChanged. scheduleTryStartMarquee");
            LJJJJL();
        } else {
            LJJJJJ();
        }
    }
}
