package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;

/* JADX INFO: renamed from: X.0YG5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.ConversationCompletenessCheckAndRepairUseCaseImpl", f = "ConversationCompletenessCheckAndRepairUseCase.kt", l = {289}, m = "repairMissingConvs")
public final class C0YG5 extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C013C LLILZLL;
    public Object LLIZ;
    public ConversationCheckInfoV2 LLIZLLLIL;
    public long LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C0YG4 LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YG5(C0YG4 c0yg4, InterfaceC1364105Vn<? super C0YG5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c0yg4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.repairMissingConvs$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJIJIL.LIZLLL(0, null, 0L, this);
        C1C7U.LIZIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.repairMissingConvs$1");
        return objLIZLLL;
    }
}
