package X;

/* JADX INFO: renamed from: X.0LuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetworkV2", f = "AIGCTaskNetworkV2.kt", l = {382}, m = "notifyQuotaRefresh")
public final class C557920LuQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C557860LuK LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557920LuQ(C557860LuK c557860LuK, InterfaceC1364105Vn<? super C557920LuQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c557860LuK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCTaskNetworkV2@705b.notifyQuotaRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("AIGCTaskNetworkV2@705b.notifyQuotaRefresh$1");
        return objLJIIIIZZ;
    }
}
