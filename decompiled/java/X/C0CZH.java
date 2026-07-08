package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CZH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0CZH extends C2217421BqW implements Function0<Unit> {
    public C0CZH(Object obj) {
        super(0, obj, FailedReviewViewModel.class, "editClick", "editClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FailedReviewViewModel failedReviewViewModel = (FailedReviewViewModel) this.receiver;
        failedReviewViewModel.getClass();
        C318790Ceb.LIZ("FailedReviewViewModel", "editClick");
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModel), null, null, new C316130CaJ(failedReviewViewModel, null), 3);
        C318790Ceb.LIZIZ(failedReviewViewModel.LL, "edit");
        return Unit.LIZ;
    }
}
