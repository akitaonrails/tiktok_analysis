package X;

/* JADX INFO: renamed from: X.0uQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.trace.heartbeat.HeartbeatSession", f = "MinisHeartbeatController.kt", l = {290}, m = "v2TickLoop")
public final class C1703570uQt extends AbstractC23140094w {
    public C1703590uQv LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1703580uQu LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703570uQt(C1703580uQu c1703580uQu, InterfaceC1364105Vn<? super C1703570uQt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1703580uQu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeartbeatSession@a8fa.v2TickLoop$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZIL.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("HeartbeatSession@a8fa.v2TickLoop$1");
        return objLJIIIIZZ;
    }
}
