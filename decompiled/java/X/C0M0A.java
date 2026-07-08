package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

/* JADX INFO: renamed from: X.0M0A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {726, 765, 782}, m = "updateSticker")
public final class C0M0A extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C259800zU LLILZIL;
    public C259800zU LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ DraftViewModel LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0A(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M0A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = draftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftViewModel@38a5.updateSticker$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLJI.JQ2(null, null, null, null, false, this);
        C1C7U.LIZIZ("DraftViewModel@38a5.updateSticker$1");
        return objJQ2;
    }
}
