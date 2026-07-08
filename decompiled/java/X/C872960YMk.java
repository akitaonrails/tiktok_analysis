package X;

/* JADX INFO: renamed from: X.0YMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetMessageCheckInfoUseCase", f = "GetMessageCheckInfoUseCase.kt", l = {139}, m = "fetchCheckInfo")
public final class C872960YMk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C872940YMi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872960YMk(C872940YMi c872940YMi, InterfaceC1364105Vn<? super C872960YMk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c872940YMi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMessageCheckInfoUseCase@ae5.fetchCheckInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, 0, null, 0L, 0L, 0, this);
        C1C7U.LIZIZ("GetMessageCheckInfoUseCase@ae5.fetchCheckInfo$1");
        return objLIZ;
    }
}
