package X;

/* JADX INFO: renamed from: X.0YMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetMessageCheckInfoUseCase", f = "GetMessageCheckInfoUseCase.kt", l = {97}, m = "fetchMessageCompletenessInfo")
public final class C872950YMj extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C872940YMi LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872950YMj(C872940YMi c872940YMi, InterfaceC1364105Vn<? super C872950YMj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c872940YMi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMessageCheckInfoUseCase@ae5.fetchMessageCompletenessInfo$2");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(0, 0, null, 0L, 0L, 0, this);
        C1C7U.LIZIZ("GetMessageCheckInfoUseCase@ae5.fetchMessageCompletenessInfo$2");
        return objLIZIZ;
    }
}
