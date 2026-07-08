package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.0dyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071220dyy {
    public final C1071620dzc LIZ;
    public final C1071240dz0 LIZIZ;

    public C1071220dyy(C1071620dzc c1071620dzc, int i) {
        C1071240dz0 c1071240dz0;
        C1071620dzc c1071620dzc2 = c1071620dzc;
        int i2 = 0;
        if ((i & 1) != 0) {
            Activity topActivity = ActivityStack.getTopActivity();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(topActivity);
            C1DFH c1dfh = C0PEM.LIZ;
            c1071620dzc2 = new C1071620dzc(topActivity, c19egLIZIZ, C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ())), new C1071130dyp(0), new C1071160dys(0), EnumC1073320e2M.UNKNOWN, null);
        }
        if ((i & 2) != 0) {
            c1071240dz0 = new C1071240dz0(i2);
        } else {
            c1071240dz0 = null;
        }
        this(c1071620dzc2, c1071240dz0);
    }

    public C1071220dyy(C1071620dzc c1071620dzc, C1071240dz0 c1071240dz0) {
        this.LIZ = c1071620dzc;
        this.LIZIZ = c1071240dz0;
    }
}
