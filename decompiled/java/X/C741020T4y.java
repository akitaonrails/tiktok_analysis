package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741020T4y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GameLiveCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C741020T4y(GameLiveCard gameLiveCard) {
        super(0);
        this.LL = gameLiveCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GameLiveCard gameLiveCard = this.LL;
        int i = GameLiveCard.LLLF;
        gameLiveCard.LJJJLIIL(false);
        final GameLiveCard gameLiveCard2 = this.LL;
        ViewGroup viewGroup = gameLiveCard2.LLJL;
        if (viewGroup != null) {
            C476770Imp.LIZJ(viewGroup, new Runnable() { // from class: X.0T4l
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameLiveCard@6636.showPageRetryStatusView$1$1");
                    try {
                        ViewGroup viewGroup2 = gameLiveCard2.LLJL;
                        if (viewGroup2 != null) {
                            C500260Jjc.LJIILIIL(viewGroup2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameLiveCard@6636.showPageRetryStatusView$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
