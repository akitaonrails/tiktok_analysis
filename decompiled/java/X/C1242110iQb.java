package X;

import com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchCommentsTabProtocol;

/* JADX INFO: renamed from: X.0iQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchCommentsTabProtocol", f = "InboxSearchCommentsTabProtocol.kt", l = {54}, m = "getResultList")
public final class C1242110iQb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InboxSearchCommentsTabProtocol LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242110iQb(InboxSearchCommentsTabProtocol inboxSearchCommentsTabProtocol, InterfaceC1364105Vn<? super C1242110iQb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchCommentsTabProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchCommentsTabProtocol@aaa7.getResultList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("InboxSearchCommentsTabProtocol@aaa7.getResultList$1");
        return objLJI;
    }
}
