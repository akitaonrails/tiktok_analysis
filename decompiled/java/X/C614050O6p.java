package X;

/* JADX INFO: renamed from: X.0O6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.runner.network.NetworkRunner", f = "NetworkRunner.kt", l = {138}, m = "waitForNetworkAvailable")
public final class C614050O6p extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C614000O6k LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614050O6p(C614000O6k c614000O6k, InterfaceC1364105Vn<? super C614050O6p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c614000O6k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkRunner@7f7b.waitForNetworkAvailable$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("NetworkRunner@7f7b.waitForNetworkAvailable$1");
        return objLIZLLL;
    }
}
