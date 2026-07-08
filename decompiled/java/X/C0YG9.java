package X;

/* JADX INFO: renamed from: X.0YG9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.ConversationCompletenessCheckAndRepairUseCaseImpl", f = "ConversationCompletenessCheckAndRepairUseCase.kt", l = {190}, m = "downloadMissingConvsInDb")
public final class C0YG9 extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YG4 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YG9(C0YG4 c0yg4, InterfaceC1364105Vn<? super C0YG9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0yg4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.downloadMissingConvsInDb$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(0, null, this);
        C1C7U.LIZIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.downloadMissingConvsInDb$1");
        return objLIZIZ;
    }
}
