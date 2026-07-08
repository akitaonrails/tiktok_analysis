package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0R3D, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3D implements InterfaceC689400R2k, InterfaceC1587906Jp {
    public final /* synthetic */ TakoCardAbility LL;

    @Override // X.InterfaceC689400R2k
    public final List<TakoLinkItem> LLFFF() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoCardAbility takoCardAbility = this.LL;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null) {
            return null;
        }
        return takoMixFeedLJIIIZ.linkList;
    }

    @Override // X.InterfaceC689400R2k
    public final String LLFII() {
        Message messageYy1;
        String str;
        TakoCardAbility takoCardAbility = this.LL;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.subSessionId) == null) ? "" : str;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJ() {
        Message messageYy1;
        TakoCardAbility takoCardAbility = this.LL;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return 0L;
        }
        return messageYy1.botId;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJJJJIL() {
        Message messageYy1;
        TakoCardAbility takoCardAbility = this.LL;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return 0L;
        }
        return messageYy1.actionId;
    }

    @Override // X.InterfaceC689400R2k
    public final String getMessageId() {
        Message messageYy1;
        String str;
        TakoCardAbility takoCardAbility = this.LL;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.uuid) == null) ? "" : str;
    }

    public C0R3D(TakoCardAbility takoCardAbility) {
        this.LL = takoCardAbility;
    }
}
