package X;

/* JADX INFO: renamed from: X.0pcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine", f = "PNSNetworkEngine.kt", l = {219}, m = "deliverToCallback")
public final class C1518380pcC<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1518410pcF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518380pcC(C1518410pcF c1518410pcF, InterfaceC1364105Vn<? super C1518380pcC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1518410pcF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSNetworkEngine@3e07.deliverToCallback$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, false, this);
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.deliverToCallback$1");
        return objLIZIZ;
    }
}
