package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0LcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.draft.DraftAIGCRestoreHandler", f = "DraftAIGCRestoreHandler.kt", l = {101, 102}, m = "observeWorkflowState")
public final class C546640LcE extends AbstractC23140094w {
    public AwemeDraft LL;
    public AIGCCreationModel LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C546620LcC LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546640LcE(C546620LcC c546620LcC, InterfaceC1364105Vn<? super C546640LcE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c546620LcC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAIGCRestoreHandler@cf1d.observeWorkflowState$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("DraftAIGCRestoreHandler@cf1d.observeWorkflowState$1");
        return objLIZIZ;
    }
}
