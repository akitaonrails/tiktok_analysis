package X;

/* JADX INFO: renamed from: X.0YO1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.uploader.usecase.GetMediaUploadConfigUseCase", f = "GetMediaUploadConfigUseCase.kt", l = {53}, m = "fetchFromRemote-IoAF18A")
public final class C0YO1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YO0 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YO1(C0YO0 c0yo0, InterfaceC1364105Vn<? super C0YO1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yo0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMediaUploadConfigUseCase@f52a.fetchFromRemote$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("GetMediaUploadConfigUseCase@f52a.fetchFromRemote$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("GetMediaUploadConfigUseCase@f52a.fetchFromRemote$1");
        return c189200o6M1boximpl;
    }
}
