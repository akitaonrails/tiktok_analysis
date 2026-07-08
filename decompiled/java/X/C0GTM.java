package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GTM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTM {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, Context context) {
        Integer numLIZJ;
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, R.style.y0))) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    public static int LIZIZ(int i, Integer num) {
        int iIntValue;
        int iMax;
        if (num == null || (iIntValue = num.intValue()) <= 0) {
            return -1;
        }
        if (i < 0) {
            iMax = Math.max(i + iIntValue, 0);
        } else {
            iMax = i % iIntValue;
        }
        return Math.max(iMax, Math.min(500, iIntValue));
    }
}
