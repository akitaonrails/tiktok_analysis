package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0SEO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SEO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ BubbleListAssem LL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        BubbleListAssem bubbleListAssem;
        Integer numHp;
        View viewML;
        BubbleListAssem bubbleListAssem2 = this.LL;
        View view = bubbleListAssem2.LLJLL;
        if (view == null) {
            return;
        }
        if (!bubbleListAssem2.kp()) {
            BubbleListAssem bubbleListAssem3 = this.LL;
            if (bubbleListAssem3.LLL == bubbleListAssem3.ip(view)) {
                BubbleListAssem bubbleListAssem4 = this.LL;
                int i = bubbleListAssem4.LLLF;
                View view2 = bubbleListAssem4.LLJLLIL;
                if (i == (view2 != null ? view2.getMeasuredHeight() : 0)) {
                    return;
                }
            }
            this.LL.lp(view);
            BubbleListAssem bubbleListAssem5 = this.LL;
            bubbleListAssem5.LLL = bubbleListAssem5.ip(view);
            BubbleListAssem bubbleListAssem6 = this.LL;
            View view3 = bubbleListAssem6.LLJLLIL;
            bubbleListAssem6.LLLF = view3 != null ? view3.getMeasuredHeight() : 0;
            return;
        }
        if (AwemeExtKt.isPhotoMode(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()) || !C726220SeC.LIZIZ.LJIIJJI(this.LL.jm().LIZ, ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme())) {
            BubbleListAssem bubbleListAssem7 = this.LL;
            if (bubbleListAssem7.LLJZIJLIL == bubbleListAssem7.LJJIJL().getBottom() || (numHp = (bubbleListAssem = this.LL).hp()) == null) {
                return;
            }
            int iIntValue = numHp.intValue();
            C0SEP c0sep = bubbleListAssem.LLJLILLLLZIIL;
            if (c0sep != null) {
                c0sep.LJII(iIntValue);
                return;
            }
            return;
        }
        BubbleListAssem bubbleListAssem8 = this.LL;
        if (bubbleListAssem8.LLL == bubbleListAssem8.ip(view)) {
            BubbleListAssem bubbleListAssem9 = this.LL;
            if (bubbleListAssem9.LLJZIJLIL == bubbleListAssem9.LJJIJL().getBottom()) {
                BubbleListAssem bubbleListAssem10 = this.LL;
                int i2 = bubbleListAssem10.LLJZ;
                Rect rect = new Rect();
                LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) bubbleListAssem10.LLJJLIIIJLLLLLLLZ.getValue();
                if (landscapeEntrancesControlAbility != null && (viewML = landscapeEntrancesControlAbility.ML()) != null) {
                    viewML.getGlobalVisibleRect(rect);
                }
                if (i2 == rect.bottom) {
                    return;
                }
            }
        }
        this.LL.op(view);
        BubbleListAssem bubbleListAssem11 = this.LL;
        bubbleListAssem11.LLL = bubbleListAssem11.ip(view);
    }

    public C0SEO(BubbleListAssem bubbleListAssem) {
        this.LL = bubbleListAssem;
    }
}
