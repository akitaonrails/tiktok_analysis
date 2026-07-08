package X;

import com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsChunkProtocol;

/* JADX INFO: renamed from: X.0iQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsChunkProtocol", f = "InboxSearchMentionsChunkProtocol.kt", l = {52}, m = "getResult")
public final class C1242100iQa extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InboxSearchMentionsChunkProtocol LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242100iQa(InboxSearchMentionsChunkProtocol inboxSearchMentionsChunkProtocol, InterfaceC1364105Vn<? super C1242100iQa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = inboxSearchMentionsChunkProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchMentionsChunkProtocol@131d.getResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("InboxSearchMentionsChunkProtocol@131d.getResult$1");
        return objLJI;
    }
}
