package X;

/* JADX INFO: renamed from: X.0vLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.core.infocollect.deviceinfo.ProbeLocationFieldCollector", f = "ProbeLocationFieldCollector.kt", l = {48}, m = "collect")
public final class C1738690vLX extends AbstractC23140094w {
    public C604530NnP LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1738680vLW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738690vLX(C1738680vLW c1738680vLW, InterfaceC1364105Vn<? super C1738690vLX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1738680vLW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProbeLocationFieldCollector@cc74.collect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ProbeLocationFieldCollector@cc74.collect$1");
        return objLIZ;
    }
}
