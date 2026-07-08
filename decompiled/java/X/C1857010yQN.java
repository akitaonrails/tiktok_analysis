package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;

/* JADX INFO: renamed from: X.0yQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857010yQN implements InterfaceC1857870yRl, InterfaceC1587906Jp {
    public final /* synthetic */ TakoCardAbility LL;

    @Override // X.InterfaceC1857870yRl
    public final C326960Crm LJIL() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoSug takoSug;
        TakoCardAbility takoCardAbility = this.LL;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (takoSug = takoMixFeedLJIIIZ.sug) == null) ? new C326960Crm(null, new TakoSug(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null), null, 5) : new C326960Crm(null, takoSug, this.LL.Yy1(), 1);
    }

    public C1857010yQN(TakoCardAbility takoCardAbility) {
        this.LL = takoCardAbility;
    }
}
