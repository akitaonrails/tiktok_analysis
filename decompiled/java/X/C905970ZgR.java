package X;

/* JADX INFO: renamed from: X.0ZgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl", f = "StreamRepositoryImpl.kt", l = {505}, m = "interruptStream-hUnOzRk")
public final class C905970ZgR extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C905950ZgP LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905970ZgR(C905950ZgP c905950ZgP, InterfaceC1364105Vn<? super C905970ZgR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c905950ZgP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamRepositoryImpl@ffe.interruptStream$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZLL.LJI(null, 0L, null, null, 0, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("StreamRepositoryImpl@ffe.interruptStream$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("StreamRepositoryImpl@ffe.interruptStream$1");
        return c189200o6M1boximpl;
    }
}
