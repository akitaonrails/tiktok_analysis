package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXH(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FeedBottomButtonContainer feedBottomButtonContainer = this.LL;
        InteractAreaFunnelAbility interactAreaFunnelAbility = feedBottomButtonContainer.LLLJIL;
        if (interactAreaFunnelAbility == null) {
            synchronized (feedBottomButtonContainer) {
                interactAreaFunnelAbility = feedBottomButtonContainer.LLLJIL;
                if (interactAreaFunnelAbility == null) {
                    C0QSJ c0qsjOp = feedBottomButtonContainer.op();
                    interactAreaFunnelAbility = c0qsjOp != null ? (InteractAreaFunnelAbility) c0qsjOp.getAbility(InteractAreaFunnelAbility.class) : null;
                    feedBottomButtonContainer.LLLJIL = interactAreaFunnelAbility;
                    if (interactAreaFunnelAbility != null) {
                    }
                }
            }
            interactAreaFunnelAbility.nf2();
        } else {
            interactAreaFunnelAbility.nf2();
        }
        return Unit.LIZ;
    }
}
