package X;

import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;

/* JADX INFO: renamed from: X.0CYX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel", f = "FailedReviewViewModel.kt", l = {307, 309}, m = "prepareCorrespondingDraft")
public final class C0CYX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FailedReviewViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CYX(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C0CYX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = failedReviewViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FailedReviewViewModel@9b63.prepareCorrespondingDraft$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.prepareCorrespondingDraft$1");
        return objWQ2;
    }
}
