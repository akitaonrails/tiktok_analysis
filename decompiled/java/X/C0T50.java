package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T50, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T50 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T50(VideoFeedCard videoFeedCard) {
        super(0);
        this.LL = videoFeedCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VideoFeedCard videoFeedCard = this.LL;
        int i = VideoFeedCard.LLLIIIIL;
        videoFeedCard.LJJJZ(null);
        final VideoFeedCard videoFeedCard2 = this.LL;
        ViewGroup viewGroup = videoFeedCard2.LLJLILLLLZIIL;
        if (viewGroup != null) {
            C476770Imp.LIZJ(viewGroup, new Runnable() { // from class: X.0T4q
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoFeedCard@7810.showPageRetryStatusView$1$1");
                    try {
                        ViewGroup viewGroup2 = videoFeedCard2.LLJLILLLLZIIL;
                        if (viewGroup2 != null) {
                            C500260Jjc.LJIILIIL(viewGroup2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoFeedCard@7810.showPageRetryStatusView$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
