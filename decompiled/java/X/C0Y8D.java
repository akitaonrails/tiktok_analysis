package X;

/* JADX INFO: renamed from: X.0Y8D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmessagepreview.GetMessagePreviewUseCase", f = "GetMessagePreviewUseCase.kt", l = {41, 42}, m = "pullAndSave$core_release")
public final class C0Y8D extends AbstractC23140094w {
    public C0Y8F LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y8C LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y8D(C0Y8C c0y8c, InterfaceC1364105Vn<? super C0Y8D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y8c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GetMessagePreviewUseCase@412d.pullAndSave$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("GetMessagePreviewUseCase@412d.pullAndSave$1");
        return objLIZIZ;
    }
}
