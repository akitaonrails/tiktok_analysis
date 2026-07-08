package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

/* JADX INFO: renamed from: X.0M0C, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {910, 917}, m = "deleteDraft")
public final class C0M0C extends AbstractC23140094w {
    public AwemeDraft LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DraftViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0C(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M0C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = draftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.deleteDraft$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("DraftViewModel@38a5.deleteDraft$1");
        return objYQ2;
    }
}
