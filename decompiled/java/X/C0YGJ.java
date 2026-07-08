package X;

/* JADX INFO: renamed from: X.0YGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.MessageCompletenessCheckAndRepairUseCaseImpl", f = "MessageCompletenessCheckAndRepairUseCase.kt", l = {312}, m = "fetchMessageCompletenessInfo")
public final class C0YGJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YGE LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGJ(C0YGE c0yge, InterfaceC1364105Vn<? super C0YGJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.fetchMessageCompletenessInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(0, 0L, null, this);
        C1C7U.LIZIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.fetchMessageCompletenessInfo$1");
        return objLIZIZ;
    }
}
