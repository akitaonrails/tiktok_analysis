package X;

/* JADX INFO: renamed from: X.0Ipn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataManagerV2", f = "MultiTopLiveDataManagerV2.kt", l = {516, 247, 526, 526, 526, 262}, m = "fetchHangoutTabTopLive")
public final class C478610Ipn extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C478590Ipl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478610Ipn(C478590Ipl c478590Ipl, InterfaceC1364105Vn<? super C478610Ipn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c478590Ipl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManagerV2@5859.fetchHangoutTabTopLive$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.fetchHangoutTabTopLive$1");
        return objLIZ;
    }
}
