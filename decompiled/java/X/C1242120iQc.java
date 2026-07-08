package X;

import com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsTabProtocol;

/* JADX INFO: renamed from: X.0iQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsTabProtocol", f = "InboxSearchMentionsTabProtocol.kt", l = {56}, m = "getResultList")
public final class C1242120iQc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InboxSearchMentionsTabProtocol LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242120iQc(InboxSearchMentionsTabProtocol inboxSearchMentionsTabProtocol, InterfaceC1364105Vn<? super C1242120iQc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchMentionsTabProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchMentionsTabProtocol@9578.getResultList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("InboxSearchMentionsTabProtocol@9578.getResultList$1");
        return objLJI;
    }
}
