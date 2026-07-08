package X;

import com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchCommentsChunkProtocol;

/* JADX INFO: renamed from: X.0iQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchCommentsChunkProtocol", f = "InboxSearchCommentsChunkProtocol.kt", l = {51}, m = "getResult")
public final class C1242090iQZ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InboxSearchCommentsChunkProtocol LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242090iQZ(InboxSearchCommentsChunkProtocol inboxSearchCommentsChunkProtocol, InterfaceC1364105Vn<? super C1242090iQZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = inboxSearchCommentsChunkProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchCommentsChunkProtocol@ca6e.getResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("InboxSearchCommentsChunkProtocol@ca6e.getResult$1");
        return objLJI;
    }
}
