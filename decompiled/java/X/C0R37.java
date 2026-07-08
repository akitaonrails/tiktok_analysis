package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;

/* JADX INFO: renamed from: X.0R37, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R37 implements InterfaceC1859540yUS, InterfaceC1587906Jp {
    public final /* synthetic */ String LL;
    public final /* synthetic */ TakoCardAbility LLILLJJLI;

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        TakoCardAbility takoCardAbility = this.LLILLJJLI;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (str = takoMixFeedLJIIIZ.hint) == null) ? "" : str;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        TakoCardAbility takoCardAbility = this.LLILLJJLI;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (str = takoMixFeedLJIIIZ.hintInText) == null) ? "" : str;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        String str2 = this.LL;
        if (str2 != null) {
            return str2;
        }
        TakoCardAbility takoCardAbility = this.LLILLJJLI;
        return (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (str = takoMixFeedLJIIIZ.text) == null) ? "" : str;
    }

    public C0R37(TakoCardAbility takoCardAbility, String str) {
        this.LL = str;
        this.LLILLJJLI = takoCardAbility;
    }
}
