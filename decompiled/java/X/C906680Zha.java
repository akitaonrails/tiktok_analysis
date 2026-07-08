package X;

/* JADX INFO: renamed from: X.0Zha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamingAPIRepositoryImpl", f = "StreamingAPIRepositoryImpl.kt", l = {74}, m = "interruptStream-gIAlu-s")
public final class C906680Zha extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C906660ZhY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906680Zha(C906660ZhY c906660ZhY, InterfaceC1364105Vn<? super C906680Zha> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c906660ZhY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StreamingAPIRepositoryImpl@e04e.interruptStream$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.interruptStream$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.interruptStream$1");
        return c189200o6M1boximpl;
    }
}
