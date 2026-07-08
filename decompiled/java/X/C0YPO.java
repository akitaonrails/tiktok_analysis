package X;

/* JADX INFO: renamed from: X.0YPO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.EnsureConversationForMediaStep", f = "EnsureConversationForMediaStep.kt", l = {117}, m = "pullGroupConvo")
public final class C0YPO extends AbstractC23140094w {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873600YOw this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YPO(C873600YOw c873600YOw, InterfaceC1364105Vn<? super C0YPO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873600YOw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnsureConversationForMediaStep@2f94.pullGroupConvo$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZLLL = this.this$0.LIZLLL(null, this);
        C1C7U.LIZIZ("EnsureConversationForMediaStep@2f94.pullGroupConvo$1");
        return objLIZLLL;
    }
}
