package X;

import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680860QnE {
    public final int LIZ;

    public C680860QnE(C19EG c19eg) {
        int dimensionPixelSize;
        int iN3;
        try {
            iN3 = C786410Ut5.n3(Resources.getSystem(), "status_bar_height", "dimen", "android");
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (iN3 > 0) {
            int dimensionPixelSize2 = c19eg.getResources().getDimensionPixelSize(iN3);
            dimensionPixelSize = Resources.getSystem().getDimensionPixelSize(iN3);
            if (dimensionPixelSize < dimensionPixelSize2) {
                dimensionPixelSize = Math.round((dimensionPixelSize2 * Resources.getSystem().getDisplayMetrics().density) / c19eg.getResources().getDisplayMetrics().density);
            }
        } else {
            dimensionPixelSize = 0;
        }
        this.LIZ = dimensionPixelSize;
    }
}
