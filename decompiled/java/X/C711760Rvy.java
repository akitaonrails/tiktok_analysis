package X;

import android.view.View;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711760Rvy extends C09AY implements Function1<C711590Rvh, View> {
    public C711760Rvy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        View viewLIZJ;
        C711590Rvh c711590Rvh2 = c711590Rvh;
        IVibeFeedService iVibeFeedServiceLIZIZ = C1557990qe5.LIZIZ();
        if (iVibeFeedServiceLIZIZ == null || (viewLIZJ = iVibeFeedServiceLIZIZ.LIZJ(c711590Rvh2.LIZIZ, 70, c711590Rvh2.LIZ)) == null) {
            return new View(c711590Rvh2.LIZIZ);
        }
        return viewLIZJ;
    }
}
