package X;

/* JADX INFO: renamed from: X.0YPK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.GetRetryMediaMsgStep", f = "GetRetryMediaMsgStep.kt", l = {51}, m = "execute")
public final class C0YPK extends AbstractC23140094w {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873620YOy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPK(C873620YOy c873620YOy, InterfaceC1364105Vn<? super C0YPK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873620YOy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetRetryMediaMsgStep@f87c.execute$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, this);
        C1C7U.LIZIZ("GetRetryMediaMsgStep@f87c.execute$1");
        return objLIZ;
    }
}
