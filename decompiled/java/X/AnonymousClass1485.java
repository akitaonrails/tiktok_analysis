package X;

import com.ss.android.ugc.aweme.pipo.probe.ProbeService;

/* JADX INFO: renamed from: X.1485, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.ProbeService", f = "ProbeService.kt", l = {252}, m = "collectLocation")
public final class AnonymousClass1485 extends AbstractC23140094w {
    public C604530NnP LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ProbeService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1485(ProbeService probeService, InterfaceC1364105Vn<? super AnonymousClass1485> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = probeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProbeService@86fa.collectLocation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("ProbeService@86fa.collectLocation$1");
        return objLIZLLL;
    }
}
