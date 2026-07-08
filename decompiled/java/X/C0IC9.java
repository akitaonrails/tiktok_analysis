package X;

import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0IC9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IC9 implements Serializable {
    public static final int $stable = 8;
    public String conversationId;
    public final Effect effect;
    public final String enterFrom;
    public final boolean isGroupChat;
    public final GameMainFlowEventParameters mainFlowParams;
    public final int order;
    public final int rankingType;
    public final double score;
    public final List<String> thumbnail;
    public final String toUserId;

    public final boolean isGroupChat() {
        return this.isGroupChat;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public C0IC9(String str, String str2, boolean z, String str3, List<String> list, Effect effect, double d, int i, int i2, GameMainFlowEventParameters gameMainFlowEventParameters) {
        this.conversationId = str;
        this.enterFrom = str2;
        this.isGroupChat = z;
        this.toUserId = str3;
        this.thumbnail = list;
        this.effect = effect;
        this.score = d;
        this.rankingType = i;
        this.order = i2;
        this.mainFlowParams = gameMainFlowEventParameters;
    }
}
