package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rVL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591010rVL {
    public final C19EG LIZ;
    public final float LIZIZ = ((Number) C0AD2.LIZ.getValue()).floatValue();
    public final C01GW LIZJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1883));
    public final C01GW LIZLLL = C1509305vX.LIZ(AFwS213S0000000_24.get$arr$(673));
    public final C01GW LJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1882));

    public final boolean LIZIZ() {
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) this.LIZLLL.getValue();
        return iHomeSidebarService != null && iHomeSidebarService.LIZJ();
    }

    public C1591010rVL(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    public final boolean LIZ(float f, float f2) {
        boolean z;
        boolean z2;
        boolean zLIZLLL = C426750GoL.LIZLLL(this.LIZ);
        Rect rect = (Rect) this.LJ.getValue();
        if ((f < ((Number) this.LIZJ.getValue()).intValue() * this.LIZIZ && !zLIZLLL) || (f > ((Number) this.LIZJ.getValue()).intValue() * (1 - this.LIZIZ) && zLIZLLL)) {
            z = true;
        } else {
            z = false;
        }
        if (rect != null && f2 >= rect.top) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
