package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858860yTM implements InterfaceC21266318Kf, C14SX, InterfaceC1587906Jp {
    public final /* synthetic */ TakoAnyCard LL;
    public final /* synthetic */ TakoCardAbility LLILLJJLI;
    public final /* synthetic */ TakoPlaceholderSource LLILLL;

    @Override // X.InterfaceC21266318Kf
    public final boolean LJJZZIII() {
        return false;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final Map<String, Object> LJI() {
        C689590R3d c689590R3d;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoPassExt takoPassExt;
        TakoMixFeed takoMixFeedLJIIIZ2;
        Map<String, String> map;
        TakoCardAbility takoCardAbility = this.LLILLJJLI;
        Integer num = null;
        Message messageYy1 = takoCardAbility != null ? takoCardAbility.Yy1() : null;
        TakoPlaceholderSource takoPlaceholderSource = this.LLILLL;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("messageId", messageYy1 != null ? messageYy1.uuid : null);
        pairArr[1] = new Pair("serverMessageId", messageYy1 != null ? messageYy1.msgId : null);
        pairArr[2] = new Pair("logId", (messageYy1 == null || (takoMixFeedLJIIIZ2 = messageYy1.LJIIIZ()) == null || (map = takoMixFeedLJIIIZ2.msgExt) == null) ? null : map.get("log_id"));
        pairArr[3] = new Pair("actionItemId", messageYy1 != null ? Long.valueOf(messageYy1.actionId) : null);
        pairArr[4] = new Pair("subProcessId", messageYy1 != null ? messageYy1.subSessionId : null);
        pairArr[5] = new Pair("pluginType", (messageYy1 == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (takoPassExt = takoMixFeedLJIIIZ.ext) == null) ? null : takoPassExt.pluginType);
        pairArr[6] = new Pair("takoCellBubble", 1);
        pairArr[7] = new Pair("queryMessageId", messageYy1 != null ? messageYy1.replyUuid : null);
        if (takoPlaceholderSource != null && (c689590R3d = takoPlaceholderSource.LIZ) != null) {
            num = c689590R3d.LIZIZ;
        }
        pairArr[8] = new Pair("mixPosition", num);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getRawData() {
        String str;
        TakoAnyCard takoAnyCard = this.LL;
        return (takoAnyCard == null || (str = takoAnyCard.rawData) == null) ? "" : str;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getSchema() {
        String str;
        TakoAnyCard takoAnyCard = this.LL;
        return (takoAnyCard == null || (str = takoAnyCard.schema) == null) ? "" : str;
    }

    public C1858860yTM(TakoAnyCard takoAnyCard, TakoCardAbility takoCardAbility, TakoPlaceholderSource takoPlaceholderSource) {
        this.LL = takoAnyCard;
        this.LLILLJJLI = takoCardAbility;
        this.LLILLL = takoPlaceholderSource;
    }
}
