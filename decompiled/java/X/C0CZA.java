package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CZA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0CZA extends C2217421BqW implements Function0<Unit> {
    public C0CZA(Object obj) {
        super(0, obj, FailedReviewViewModel.class, "onDismissRequest", "onDismissRequest()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FailedReviewViewModel failedReviewViewModel = (FailedReviewViewModel) this.receiver;
        failedReviewViewModel.getClass();
        C318790Ceb.LIZ("FailedReviewViewModel", "onDismissRequest");
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModel), null, null, new C0CZB(failedReviewViewModel, null), 3);
        return Unit.LIZ;
    }
}
