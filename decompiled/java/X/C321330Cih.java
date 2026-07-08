package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentProcessInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Cih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C321330Cih implements InterfaceC321350Cij, InterfaceC321360Cik {
    public final C321490Cix LL;
    public final String LLILLJJLI;
    public final CommerceAgentMixFeed LLILLL;
    public final int LLILZ;
    public final List<CommerceAgentProcessInfo> LLILZIL;

    @Override // X.InterfaceC321350Cij
    public final int LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC321350Cij
    public final List<CommerceAgentProcessInfo> LJJIFFI() {
        return this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentProcessInfo>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public C321330Cih(C321490Cix c321490Cix) {
        int i;
        ?? arrayList;
        List<CommerceAgentProcessInfo> list;
        this.LL = c321490Cix;
        Message message = c321490Cix.LIZJ;
        this.LLILLJJLI = message.uuid;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = message.LIZIZ();
        this.LLILLL = commerceAgentMixFeedLIZIZ;
        if (commerceAgentMixFeedLIZIZ != null) {
            i = commerceAgentMixFeedLIZIZ.status;
        } else {
            i = -1;
        }
        this.LLILZ = i;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ2 = c321490Cix.LIZJ.LIZIZ();
        if (commerceAgentMixFeedLIZIZ2 != null && (list = commerceAgentMixFeedLIZIZ2.processInfo) != null) {
            arrayList = new ArrayList();
            for (CommerceAgentProcessInfo commerceAgentProcessInfo : list) {
                if (commerceAgentProcessInfo.stage != 0) {
                    arrayList.add(commerceAgentProcessInfo);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLILZIL = arrayList;
    }
}
