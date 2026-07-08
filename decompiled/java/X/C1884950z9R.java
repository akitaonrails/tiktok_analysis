package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884950z9R extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GameLiveCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884950z9R(GameLiveCard gameLiveCard) {
        super(0);
        this.LL = gameLiveCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GameLiveCard gameLiveCard = this.LL;
        if (gameLiveCard.LLJJJJJIL) {
            gameLiveCard.LJJJLIIL(true);
        }
        return Unit.LIZ;
    }
}
