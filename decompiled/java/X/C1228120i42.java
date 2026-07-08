package X;

/* JADX INFO: renamed from: X.0i42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.newconversation.FriendContentTabDataSourceProtocol", f = "FriendContentTabDataSourceProtocol.kt", l = {119, 127}, m = "refreshStickyTopUser")
public final class C1228120i42 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1228060i3w LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228120i42(C1228060i3w c1228060i3w, InterfaceC1364105Vn<? super C1228120i42> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1228060i3w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendContentTabDataSourceProtocol@b484.refreshStickyTopUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLJJLI.LJJJJLL(this);
        C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.refreshStickyTopUser$1");
        return objLJJJJLL;
    }
}
