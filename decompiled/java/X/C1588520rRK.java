package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* JADX INFO: renamed from: X.0rRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588520rRK {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "landing_page_optimization_experiment", false) == 3;
    }

    public static final boolean LIZ(Aweme aweme) {
        AwemeStatus statusSafety;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "landing_page_optimization_experiment", false);
        if (iLJIJ != 3 && ((iLJIJ != 1 && iLJIJ != 2) || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || statusSafety.getPrivateStatus() != 0)) {
            return false;
        }
        return true;
    }
}
