package X;

import Y.AgS40S1300000_8;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;

/* JADX INFO: renamed from: X.0LcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.draft.DraftAIGCRestoreHandler$observeWorkflowState$3", f = "DraftAIGCRestoreHandler.kt", l = {103}, m = "emit")
public final class C546720LcM extends AbstractC23140094w {
    public CreateState LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS40S1300000_8<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C546720LcM(AgS40S1300000_8<? super T> agS40S1300000_8, InterfaceC1364105Vn<? super C546720LcM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS40S1300000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAIGCRestoreHandler@cf1d.observeWorkflowState$3$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLL.LIZ$0(null, this);
        C1C7U.LIZIZ("DraftAIGCRestoreHandler@cf1d.observeWorkflowState$3$emit$1");
        return objLIZ$0;
    }
}
