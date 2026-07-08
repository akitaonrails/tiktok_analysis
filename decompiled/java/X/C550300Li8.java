package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;

/* JADX INFO: renamed from: X.0Li8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitDraftRestoreHandler", f = "AIPortraitDraftRestoreHandler.kt", l = {82, 87}, m = "updateWorkflowId")
public final class C550300Li8 extends AbstractC23140094w {
    public AIPortraitGeneratingModel LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C550280Li6 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550300Li8(C550280Li6 c550280Li6, InterfaceC1364105Vn<? super C550300Li8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c550280Li6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDraftRestoreHandler@541f.updateWorkflowId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, null, this);
        C1C7U.LIZIZ("AIPortraitDraftRestoreHandler@541f.updateWorkflowId$1");
        return objLJFF;
    }
}
