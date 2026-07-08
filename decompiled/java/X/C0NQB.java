package X;

import Y.AgS167S0300000_9;

/* JADX INFO: renamed from: X.0NQB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$startAvgReporter$1$invokeSuspend$$inlined$map$1$2", f = "MinisFpsMonitorAssem.kt", l = {224, 223}, m = "emit")
public final class C0NQB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS167S0300000_9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQB(AgS167S0300000_9 agS167S0300000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS167S0300000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
