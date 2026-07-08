package X;

/* JADX INFO: renamed from: X.0LrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub", f = "AIGCWorkflowEventHub.kt", l = {387}, m = "applyPreEmitHook")
public final class C556110LrV extends AbstractC23140094w {
    public InterfaceC1902607cm LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C556080LrS LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556110LrV(C556080LrS c556080LrS, InterfaceC1364105Vn<? super C556110LrV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c556080LrS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.applyPreEmitHook$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.applyPreEmitHook$1");
        return objLIZ;
    }
}
