package X;

/* JADX INFO: renamed from: X.0YGG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.MessageCompletenessCheckAndRepairUseCaseImpl", f = "MessageCompletenessCheckAndRepairUseCase.kt", l = {362}, m = "fetchMessagesFromServer-0E7RQCE")
public final class C0YGG extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YGE LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGG(C0YGE c0yge, InterfaceC1364105Vn<? super C0YGG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.fetchMessagesFromServer$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.fetchMessagesFromServer$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.fetchMessagesFromServer$1");
        return c189200o6M1boximpl;
    }
}
