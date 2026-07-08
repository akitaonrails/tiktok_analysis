package X;

/* JADX INFO: renamed from: X.0hzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.newconversation.FriendSearchDataSourceProtocol", f = "FriendSearchDataSourceProtocol.kt", l = {161}, m = "onSearch")
public final class C1225540hzs extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1227330i2l LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225540hzs(C1227330i2l c1227330i2l, InterfaceC1364105Vn<? super C1225540hzs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1227330i2l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendSearchDataSourceProtocol@6629.onSearch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILLL.LJJIIZ(null, this);
        C1C7U.LIZIZ("FriendSearchDataSourceProtocol@6629.onSearch$1");
        return objLJJIIZ;
    }
}
