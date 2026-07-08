package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;

/* JADX INFO: renamed from: X.0M0S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment", f = "DraftFragment.kt", l = {1193}, m = "getNewDraftId")
public final class C0M0S extends AbstractC23140094w {
    public AwemeDraft LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DraftFragment LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0S(DraftFragment draftFragment, InterfaceC1364105Vn<? super C0M0S> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = draftFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftFragment@975a.getNewDraftId$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objNR = this.LLILLL.NR(null, this);
        C1C7U.LIZIZ("DraftFragment@975a.getNewDraftId$1");
        return objNR;
    }
}
