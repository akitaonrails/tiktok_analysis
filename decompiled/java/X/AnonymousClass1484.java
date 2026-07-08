package X;

import com.ss.android.ugc.aweme.pipo.probe.ProbeService;

/* JADX INFO: renamed from: X.1484, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.ProbeService", f = "ProbeService.kt", l = {287}, m = "collectApplist")
public final class AnonymousClass1484 extends AbstractC23140094w {
    public C00EM LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ProbeService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1484(ProbeService probeService, InterfaceC1364105Vn<? super AnonymousClass1484> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = probeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProbeService@86fa.collectApplist$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, this);
        C1C7U.LIZIZ("ProbeService@86fa.collectApplist$1");
        return objLJIIIZ;
    }
}
