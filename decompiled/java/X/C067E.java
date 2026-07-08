package X;

/* JADX INFO: renamed from: X.067E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.core.risk.ProbeRiskNetworkService", f = "ProbeRiskNetworkService.kt", l = {77}, m = "sendSignalAttempt")
public final class C067E extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C067C LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067E(C067C c067c, InterfaceC1364105Vn<? super C067E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c067c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProbeRiskNetworkService@96a9.sendSignalAttempt$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, null, this);
        C1C7U.LIZIZ("ProbeRiskNetworkService@96a9.sendSignalAttempt$1");
        return objLIZJ;
    }
}
