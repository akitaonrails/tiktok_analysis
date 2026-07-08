package X;

/* JADX INFO: renamed from: X.0uwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPageDataUseCase", f = "GetPageDataUseCase.kt", l = {39}, m = "invoke$suspendImpl")
public final class C1722990uwD extends AbstractC23140094w {
    public C1005610cH9 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1722980uwC LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722990uwD(C1722980uwC c1722980uwC, InterfaceC1364105Vn<? super C1722990uwD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1722980uwC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPageDataUseCase@d833.invoke$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = C1722980uwC.LIZ(null, this.LLILLL, null, this);
        C1C7U.LIZIZ("GetPageDataUseCase@d833.invoke$1");
        return objLIZ;
    }
}
