package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: renamed from: X.0yTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858850yTL implements C0H5X, InterfaceC1587906Jp {
    public final /* synthetic */ TakoCardAbility LL;

    @Override // X.C0H5X
    public final String LJLIIIL() {
        Message messageYy1;
        String str;
        TakoCardAbility takoCardAbility = this.LL;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.uuid) == null) ? "" : str;
    }

    @Override // X.C0H5X
    public final BotMarketInfo LJLLLL() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoCardAbility takoCardAbility = this.LL;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null) {
            return null;
        }
        return takoMixFeedLJIIIZ.botMarketInfo;
    }

    public C1858850yTL(TakoCardAbility takoCardAbility) {
        this.LL = takoCardAbility;
    }
}
