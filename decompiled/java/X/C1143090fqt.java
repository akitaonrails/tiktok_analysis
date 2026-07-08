package X;

import Y.ARunnableS6S0102000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0fqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143090fqt extends C16F5 {
    public Scroller LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final void LJJJJI() {
        this.LLJJIII = getScrollX();
        this.LLJJIJI = true;
        setHorizontallyScrolling(true);
        Scroller scroller = new Scroller(getContext(), new LinearInterpolator());
        this.LLJJ = scroller;
        setScroller(scroller);
        float fMeasureText = getPaint().measureText(getText().toString()) * 1.05f;
        float width = fMeasureText - (getWidth() + this.LLJJIII);
        if (0.0f >= width) {
            width = 0.0f;
        }
        int i = (int) width;
        int i2 = (int) ((((double) (((getLayoutDirection() == 1 ? -1.0f : 1.0f) * this.LLJJI) * i)) * 1.0d) / ((double) fMeasureText));
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        HandlerHook.viewPostDelay(this, new ARunnableS6S0102000_17(this, i, i2, 0), 1000L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.LLJJ;
        if (scroller == null || !scroller.isFinished() || this.LLJJIJI || this.LLJJIJIIJIL) {
            return;
        }
        LJJJJI();
    }

    public final boolean getOneRound() {
        return this.LLJJIJIIJIL;
    }

    public final int getRndDuration() {
        return this.LLJJI;
    }

    public final void setOneRound(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setRndDuration(int i) {
        this.LLJJI = i;
    }

    public C1143090fqt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = 10000;
        this.LLJJIJI = true;
        setSingleLine();
        setEllipsize(null);
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
    }
}
