package X;

/* JADX INFO: renamed from: X.0YGH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.MessageCompletenessCheckAndRepairUseCaseImpl", f = "MessageCompletenessCheckAndRepairUseCase.kt", l = {475}, m = "repairMissingMessages")
public final class C0YGH extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YGE LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGH(C0YGE c0yge, InterfaceC1364105Vn<? super C0YGH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.repairMissingMessages$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, null, null, 0L, 0, this);
        C1C7U.LIZIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.repairMissingMessages$1");
        return objLIZLLL;
    }
}
