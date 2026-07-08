package X;

/* JADX INFO: renamed from: X.0YG7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.ConversationCompletenessCheckAndRepairUseCaseImpl", f = "ConversationCompletenessCheckAndRepairUseCase.kt", l = {89, 93, 117, 120, 123, 126}, m = "checkAndRepair")
public final class C0YG7 extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0YG4 LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YG7(C0YG4 c0yg4, InterfaceC1364105Vn<? super C0YG7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c0yg4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.checkAndRepair$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJ.LIZ(0, false, this);
        C1C7U.LIZIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.checkAndRepair$1");
        return objLIZ;
    }
}
