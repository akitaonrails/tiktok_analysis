package X;

/* JADX INFO: renamed from: X.0YPF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.CreateNewMediaMsgStep", f = "CreateNewMediaMsgStep.kt", l = {88}, m = "execute")
public final class C0YPF extends AbstractC23140094w {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873560YOs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPF(C873560YOs c873560YOs, InterfaceC1364105Vn<? super C0YPF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873560YOs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateNewMediaMsgStep@b191.execute$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, this);
        C1C7U.LIZIZ("CreateNewMediaMsgStep@b191.execute$1");
        return objLIZ;
    }
}
