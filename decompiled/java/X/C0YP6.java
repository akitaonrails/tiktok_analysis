package X;

/* JADX INFO: renamed from: X.0YP6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.SendMediaMessageUseCaseV2", f = "SendMediaMessageUseCaseV2.kt", l = {90, 115, 142}, m = "sendInternal")
public final class C0YP6 extends AbstractC23140094w {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873570YOt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YP6(C873570YOt c873570YOt, InterfaceC1364105Vn<? super C0YP6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873570YOt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMediaMessageUseCaseV2@e361.sendInternal$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = this.this$0.LIZ(null, null, this);
        C1C7U.LIZIZ("SendMediaMessageUseCaseV2@e361.sendInternal$1");
        return objLIZ;
    }
}
