package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885210z9r extends C09AY implements Function1<C1885270z9x, Unit> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885210z9r(VideoFeedCard videoFeedCard) {
        super(1);
        this.LL = videoFeedCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1885270z9x c1885270z9x) {
        RunnableC781530UlD runnableC781530UlD;
        final C1885270z9x c1885270z9x2 = c1885270z9x;
        final VideoFeedCard videoFeedCard = this.LL;
        if (!videoFeedCard.LLJJIJI && (runnableC781530UlD = videoFeedCard.LLJJJ) != null) {
            C476770Imp.LIZJ(runnableC781530UlD, new Runnable() { // from class: X.0z9X
                /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 557
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1885010z9X.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoFeedCard@7810.onMixPageVideosChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoFeedCard@7810.onMixPageVideosChanged$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
