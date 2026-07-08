package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ui.layout.AsyncInflaterCacheCheckRunnable;

/* JADX INFO: renamed from: X.0T62, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T62 implements ViewTreeObserver.OnDrawListener {
    public boolean LL;
    public final /* synthetic */ DetailFragmentPanel LLILLJJLI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        DetailFragmentPanel detailFragmentPanel;
        VerticalViewPager verticalViewPager;
        if (this.LL) {
            return;
        }
        this.LL = true;
        Context context = this.LLILLJJLI.getContext();
        if (context != null) {
            if (C278390Avd.LIZ(this.LLILLJJLI.getEventType())) {
                C786410Ut5.LJLIIL(((long) (((Number) C278390Avd.LIZ.getValue()).intValue() >> 1)) * 500, C2113808Pw.LIZIZ.LL, new ARunnableS81S0200000_12(context, this, 49));
            } else {
                C20673215v0.LJII(context, "common_feed_item_feed");
                C20673215v0.LJII(context, "common_feed_item_feed");
            }
            if (((Boolean) C1222904qR.LIZLLL.getValue()).booleanValue() && (verticalViewPager = (detailFragmentPanel = this.LLILLJJLI).LLJJIJI) != null) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 168);
                detailFragmentPanel.b0 = aRunnableS112S0100000_12;
                HandlerHook.viewPostDelay(verticalViewPager, aRunnableS112S0100000_12, 1200L);
            }
        }
        AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable = this.LLILLJJLI.f339X;
        if (asyncInflaterCacheCheckRunnable != null) {
            asyncInflaterCacheCheckRunnable.LIZIZ();
        }
        AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable2 = this.LLILLJJLI.f340Y;
        if (asyncInflaterCacheCheckRunnable2 != null) {
            asyncInflaterCacheCheckRunnable2.LIZIZ();
        }
        AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable3 = this.LLILLJJLI.Z;
        if (asyncInflaterCacheCheckRunnable3 != null) {
            asyncInflaterCacheCheckRunnable3.LIZIZ();
        }
        HandlerHook.viewPost(this.LLILLJJLI.LLJJIJI, new ARunnableS112S0100000_12(this, 169));
    }

    public C0T62(DetailFragmentPanel detailFragmentPanel) {
        this.LLILLJJLI = detailFragmentPanel;
    }
}
