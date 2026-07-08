package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import java.util.List;

/* JADX INFO: renamed from: X.0R3W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3W implements C0R3Y, InterfaceC1587906Jp {
    public final /* synthetic */ TakoCardAbility LL;

    @Override // X.C0R3Y
    public final List<TakoSourceItem> LLILZIL() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoCardAbility takoCardAbility = this.LL;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null) {
            return null;
        }
        return takoMixFeedLJIIIZ.sources;
    }

    public C0R3W(TakoCardAbility takoCardAbility) {
        this.LL = takoCardAbility;
    }
}
