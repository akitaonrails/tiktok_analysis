package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesInnerFeedDetailPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS262S0300000_18;

/* JADX INFO: renamed from: X.0gpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180820gpk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ SeriesInnerFeedDetailPageFragment LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TuxTextView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1180820gpk(View view, long j, SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment, int i, TuxTextView tuxTextView) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = j;
        this.LLILLL = seriesInnerFeedDetailPageFragment;
        this.LLILZ = i;
        this.LLILZIL = tuxTextView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final View view = this.LL;
        final SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment = this.LLILLL;
        final int i = this.LLILZ;
        final TuxTextView tuxTextView = this.LLILZIL;
        HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.0gpl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SeriesInnerFeedDetailPageFragment@f879.startGuideAnimation$1$1$1");
                try {
                    SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment2 = seriesInnerFeedDetailPageFragment;
                    View view2 = view;
                    int width = view2.getWidth();
                    int i2 = i;
                    AwS262S0300000_18 awS262S0300000_18 = new AwS262S0300000_18(tuxTextView, seriesInnerFeedDetailPageFragment, view, 14);
                    seriesInnerFeedDetailPageFragment2.getClass();
                    SeriesInnerFeedDetailPageFragment.WR(width, i2, view2, awS262S0300000_18);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SeriesInnerFeedDetailPageFragment@f879.startGuideAnimation$1$1$1");
            }
        }, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
