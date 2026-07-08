package X;

/* JADX INFO: renamed from: X.0ZgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl", f = "StreamRepositoryImpl.kt", l = {486}, m = "cancelWithoutResume")
public final class C906000ZgU extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C905950ZgP LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906000ZgU(C905950ZgP c905950ZgP, InterfaceC1364105Vn<? super C906000ZgU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c905950ZgP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamRepositoryImpl@ffe.cancelWithoutResume$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, null, this);
        C1C7U.LIZIZ("StreamRepositoryImpl@ffe.cancelWithoutResume$1");
        return objLJ;
    }
}
