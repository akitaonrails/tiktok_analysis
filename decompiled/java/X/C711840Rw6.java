package X;

import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711840Rw6 extends C09AY implements Function1<C711590Rvh, View> {
    public C711840Rw6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        View viewLIZLLL = ((IAmberAlertService) ComplianceServiceProvider.LJJII.getValue()).LIZLLL(c711590Rvh.LIZIZ);
        if (viewLIZLLL != null) {
            return viewLIZLLL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
