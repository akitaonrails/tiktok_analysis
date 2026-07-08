package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SNY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SNY {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(Context context, String str, boolean z) {
        ContextThemeWrapper contextThemeWrapper;
        if (context != null) {
            contextThemeWrapper = new ContextThemeWrapper(context, C1385040m98.LIZLLL(context));
        } else {
            contextThemeWrapper = null;
        }
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_7);
        C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_k);
        if (C277310Att.LIZ()) {
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_l);
        }
        if (C0SO2.LIZJ(str)) {
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_u);
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.ea0);
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.ea3);
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_5);
            if (z) {
                C21146717pB.LIZJ(contextThemeWrapper, R.layout.e9z);
            }
        } else {
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.ea2);
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_z);
            C21146717pB.LIZJ(contextThemeWrapper, R.layout.e_4);
            if (z) {
                C21146717pB.LIZJ(contextThemeWrapper, R.layout.e9y);
            }
        }
        LIZ = SystemClock.elapsedRealtime();
    }
}
