package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;

/* JADX INFO: renamed from: X.0YG8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.ConversationCompletenessCheckAndRepairUseCaseImpl", f = "ConversationCompletenessCheckAndRepairUseCase.kt", l = {241}, m = "updateResultWithMsgCheckInfo")
public final class C0YG8 extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public ConversationCheckInfoV2 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0YG4 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YG8(C0YG4 c0yg4, InterfaceC1364105Vn<? super C0YG8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0yg4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.updateResultWithMsgCheckInfo$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(0, null, this);
        C1C7U.LIZIZ("ConversationCompletenessCheckAndRepairUseCaseImpl@a294.updateResultWithMsgCheckInfo$1");
        return objLJ;
    }
}
