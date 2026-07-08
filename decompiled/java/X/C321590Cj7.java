package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;

/* JADX INFO: renamed from: X.0Cj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C321590Cj7 implements InterfaceC321360Cik {
    public final C321490Cix LL;
    public final String LLILLJJLI;
    public final CommerceAgentMixFeed LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public String getText() {
        return this.LLILZ;
    }

    public C321590Cj7(C321490Cix c321490Cix) {
        String str;
        this.LL = c321490Cix;
        Message message = c321490Cix.LIZJ;
        this.LLILLJJLI = message.uuid;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = message.LIZIZ();
        this.LLILLL = commerceAgentMixFeedLIZIZ;
        if (commerceAgentMixFeedLIZIZ != null) {
            str = commerceAgentMixFeedLIZIZ.text;
        } else {
            str = null;
        }
        this.LLILZ = str;
        this.LLILZIL = c321490Cix.LIZJ.LIZJ;
    }
}
