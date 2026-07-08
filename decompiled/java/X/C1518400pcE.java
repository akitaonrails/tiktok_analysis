package X;

/* JADX INFO: renamed from: X.0pcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine", f = "PNSNetworkEngine.kt", l = {155}, m = "doRequest")
public final class C1518400pcE<T> extends AbstractC23140094w {
    public C1518420pcG LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1518410pcF LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518400pcE(C1518410pcF c1518410pcF, InterfaceC1364105Vn<? super C1518400pcE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1518410pcF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSNetworkEngine@3e07.doRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.doRequest$1");
        return objLIZJ;
    }
}
