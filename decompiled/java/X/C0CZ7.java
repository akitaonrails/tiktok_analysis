package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0CZ7 extends C2217421BqW implements Function1<String, Unit> {
    public C0CZ7(Object obj) {
        super(1, obj, FailedReviewViewModel.class, "followUpLinkClick", "followUpLinkClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        FailedReviewViewModel failedReviewViewModel = (FailedReviewViewModel) this.receiver;
        failedReviewViewModel.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("followUpLinkClick, ");
        sbLIZ.append(str2);
        C318790Ceb.LIZ("FailedReviewViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModel), null, null, new C0CYS(failedReviewViewModel, str2, null), 3);
        return Unit.LIZ;
    }
}
