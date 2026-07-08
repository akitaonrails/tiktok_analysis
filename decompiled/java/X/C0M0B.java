package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

/* JADX INFO: renamed from: X.0M0B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {265, 277, 280, 283, 287, 292}, m = "updateDraftViewInfo")
public final class C0M0B extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ DraftViewModel LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0B(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M0B> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = draftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.updateDraftViewInfo$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLJ.HQ2(null, null, null, this);
        C1C7U.LIZIZ("DraftViewModel@38a5.updateDraftViewInfo$1");
        return objHQ2;
    }
}
