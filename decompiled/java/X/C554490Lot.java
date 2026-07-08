package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;

/* JADX INFO: renamed from: X.0Lot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl", f = "AIGCWorkflowCreationServiceImpl.kt", l = {179, 183}, m = "cancelWorkflowByCreationId")
public final class C554490Lot extends AbstractC23140094w {
    public EnumC2398509aZ LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554490Lot(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, InterfaceC1364105Vn<? super C554490Lot> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = aIGCWorkflowCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.cancelWorkflowByCreationId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZ.LJIIJ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.cancelWorkflowByCreationId$1");
        return objLJIIJ;
    }
}
