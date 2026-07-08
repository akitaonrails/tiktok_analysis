package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

/* JADX INFO: renamed from: X.0M0E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {792, 799}, m = "queryPostedDraftEntrance")
public final class C0M0E extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DraftViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0E(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M0E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = draftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftViewModel@38a5.queryPostedDraftEntrance$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFQ2 = this.LLILLJJLI.FQ2(this);
        C1C7U.LIZIZ("DraftViewModel@38a5.queryPostedDraftEntrance$1");
        return objFQ2;
    }
}
