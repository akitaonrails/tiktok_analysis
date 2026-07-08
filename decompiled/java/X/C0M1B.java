package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;

/* JADX INFO: renamed from: X.0M1B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment", f = "DraftBoxFragment.kt", l = {1462}, m = "ensureAllDraftsLoaded")
public final class C0M1B extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DraftBoxFragment LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M1B(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C0M1B> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = draftBoxFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.ensureAllDraftsLoaded$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objPR = this.LLILLL.PR(false, this);
        C1C7U.LIZIZ("DraftBoxFragment@80e.ensureAllDraftsLoaded$1");
        return objPR;
    }
}
