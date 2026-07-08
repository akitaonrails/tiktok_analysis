package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

/* JADX INFO: renamed from: X.0M0D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {314}, m = "computeOverallStatus")
public final class C0M0D extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DraftViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0D(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M0D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = draftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.computeOverallStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, null, this);
        C1C7U.LIZIZ("DraftViewModel@38a5.computeOverallStatus$1");
        return objVQ2;
    }
}
