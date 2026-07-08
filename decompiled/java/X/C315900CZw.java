package X;

/* JADX INFO: renamed from: X.0CZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModelRepo", f = "FailedReviewViewModelRepo.kt", l = {40}, m = "findCorrespondingDraft-IoAF18A")
public final class C315900CZw extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C315860CZs LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315900CZw(C315860CZs c315860CZs, InterfaceC1364105Vn<? super C315900CZw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c315860CZs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FailedReviewViewModelRepo@7b24.findCorrespondingDraft$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("FailedReviewViewModelRepo@7b24.findCorrespondingDraft$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("FailedReviewViewModelRepo@7b24.findCorrespondingDraft$1");
        return c189200o6M1boximpl;
    }
}
