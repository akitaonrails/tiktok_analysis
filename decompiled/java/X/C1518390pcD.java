package X;

/* JADX INFO: renamed from: X.0pcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine", f = "PNSNetworkEngine.kt", l = {137}, m = "executeInternal")
public final class C1518390pcD<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1518410pcF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518390pcD(C1518410pcF c1518410pcF, InterfaceC1364105Vn<? super C1518390pcD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1518410pcF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSNetworkEngine@3e07.executeInternal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.executeInternal$1");
        return objLIZLLL;
    }
}
