package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883760z7W extends C09AY implements Function0<Unit> {
    public final /* synthetic */ XTabESportsHighlightCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883760z7W(XTabESportsHighlightCard xTabESportsHighlightCard) {
        super(0);
        this.LL = xTabESportsHighlightCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJJLI();
        this.LL.LJJIJIL();
        final XTabESportsHighlightCard xTabESportsHighlightCard = this.LL;
        C1749280vcc c1749280vcc = xTabESportsHighlightCard.LLJJIJIL;
        if (c1749280vcc != null) {
            HandlerHook.viewPost(c1749280vcc, new Runnable() { // from class: X.0z7V
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("XTabESportsHighlightCard@6cd9.showRetryView$1$1");
                    try {
                        C500260Jjc.LJIILIIL(xTabESportsHighlightCard.LLJJIJIL);
                        xTabESportsHighlightCard.LJJJJIZL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("XTabESportsHighlightCard@6cd9.showRetryView$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
