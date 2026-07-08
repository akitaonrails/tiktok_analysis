package X;

/* JADX INFO: renamed from: X.0YPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.SendMediaMessageUseCaseV2", f = "SendMediaMessageUseCaseV2.kt", l = {222}, m = "sendMediaToRemoteSuspend")
public final class C0YPJ extends AbstractC23140094w {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873570YOt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPJ(C873570YOt c873570YOt, InterfaceC1364105Vn<? super C0YPJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873570YOt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMediaMessageUseCaseV2@e361.sendMediaToRemoteSuspend$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZIZ = this.this$0.LIZIZ(null, false, this);
        C1C7U.LIZIZ("SendMediaMessageUseCaseV2@e361.sendMediaToRemoteSuspend$1");
        return objLIZIZ;
    }
}
