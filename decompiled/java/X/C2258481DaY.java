package X;

/* JADX INFO: renamed from: X.1DaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.network.GroupChatNetworkRequestApi", f = "GroupChatNetworkRequestApi.kt", l = {44}, m = "getUnreadAuditCount")
public final class C2258481DaY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2258521Dac LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258481DaY(C2258521Dac c2258521Dac, InterfaceC1364105Vn<? super C2258481DaY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2258521Dac;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNetworkRequestApi@53d2.getUnreadAuditCount$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object unreadAuditCount = this.LLILLJJLI.getUnreadAuditCount(null, this);
        C1C7U.LIZIZ("GroupChatNetworkRequestApi@53d2.getUnreadAuditCount$1");
        return unreadAuditCount;
    }
}
