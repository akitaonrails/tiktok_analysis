package X;

/* JADX INFO: renamed from: X.0Y8E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmessagepreview.GetMessagePreviewUseCase", f = "GetMessagePreviewUseCase.kt", l = {53, 86}, m = "pullAndSaveMessages")
public final class C0Y8E extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0Y8C LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y8E(C0Y8C c0y8c, InterfaceC1364105Vn<? super C0Y8E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0y8c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GetMessagePreviewUseCase@412d.pullAndSaveMessages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("GetMessagePreviewUseCase@412d.pullAndSaveMessages$1");
        return objLIZJ;
    }
}
