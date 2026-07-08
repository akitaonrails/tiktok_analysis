package X;

/* JADX INFO: renamed from: X.0YPG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.SendToRemoteStep", f = "SendToRemoteStep.kt", l = {67}, m = "execute")
public final class C0YPG extends AbstractC23140094w {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873630YOz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPG(C873630YOz c873630YOz, InterfaceC1364105Vn<? super C0YPG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873630YOz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendToRemoteStep@b8ee.execute$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, this);
        C1C7U.LIZIZ("SendToRemoteStep@b8ee.execute$1");
        return objLIZ;
    }
}
