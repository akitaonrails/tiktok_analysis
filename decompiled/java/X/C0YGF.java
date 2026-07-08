package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0YGF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.MessageCompletenessCheckAndRepairUseCaseImpl", f = "MessageCompletenessCheckAndRepairUseCase.kt", l = {101, 154, 187, 217}, m = "checkAndRepair")
public final class C0YGF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Pair LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ C0YGE LLJILLL;
    public int LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGF(C0YGE c0yge, InterfaceC1364105Vn<? super C0YGF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILLL = c0yge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.checkAndRepair$1");
        this.LLJILJILJ = obj;
        this.LLJJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJILLL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("MessageCompletenessCheckAndRepairUseCaseImpl@85da.checkAndRepair$1");
        return objLIZ;
    }
}
