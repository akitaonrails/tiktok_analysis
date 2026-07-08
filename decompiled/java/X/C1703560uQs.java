package X;

/* JADX INFO: renamed from: X.0uQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.trace.heartbeat.HeartbeatSession", f = "MinisHeartbeatController.kt", l = {271}, m = "v1TickLoop")
public final class C1703560uQs extends AbstractC23140094w {
    public C1703590uQv LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1703580uQu LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703560uQs(C1703580uQu c1703580uQu, InterfaceC1364105Vn<? super C1703560uQs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1703580uQu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeartbeatSession@a8fa.v1TickLoop$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, this);
        C1C7U.LIZIZ("HeartbeatSession@a8fa.v1TickLoop$1");
        return objLJII;
    }
}
