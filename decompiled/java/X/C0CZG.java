package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CZG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0CZG extends C2217421BqW implements Function0<Unit> {
    public C0CZG(Object obj) {
        super(0, obj, FailedReviewViewModel.class, "confirmDeleteClick", "confirmDeleteClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FailedReviewViewModel failedReviewViewModel = (FailedReviewViewModel) this.receiver;
        failedReviewViewModel.getClass();
        C318790Ceb.LIZ("FailedReviewViewModel", "confirmDeleteClick");
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModel), null, null, new C315750CZh(failedReviewViewModel, null), 3);
        C318790Ceb.LIZJ(failedReviewViewModel.LL, "delete");
        return Unit.LIZ;
    }
}
