package X;

/* JADX INFO: renamed from: X.0uw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPiListUseCase", f = "GetPiListUseCase.kt", l = {40, 47, 52, 55}, m = "invoke")
public final class C1722910uw5 extends AbstractC23140094w {
    public C1722790uvt LL;
    public C1005610cH9 LLILLJJLI;
    public AbstractC1623806Xk LLILLL;
    public AbstractC1623806Xk LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1722900uw4 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722910uw5(C1722900uw4 c1722900uw4, InterfaceC1364105Vn<? super C1722910uw5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1722900uw4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPiListUseCase@6b87.invoke$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("GetPiListUseCase@6b87.invoke$1");
        return objLIZ;
    }
}
