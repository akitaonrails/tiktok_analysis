package X;

/* JADX INFO: renamed from: X.0YP7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.SendMediaMessageUseCase", f = "SendMediaMessageUseCase.kt", l = {104}, m = "runPipeline")
public final class C0YP7 extends AbstractC23140094w {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873580YOu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YP7(C873580YOu c873580YOu, InterfaceC1364105Vn<? super C0YP7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873580YOu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMediaMessageUseCase@cd4.runPipeline$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = this.this$0.LIZ(null, null, null, false, this);
        C1C7U.LIZIZ("SendMediaMessageUseCase@cd4.runPipeline$1");
        return objLIZ;
    }
}
