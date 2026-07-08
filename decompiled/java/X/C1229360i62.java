package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0i62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229360i62 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context, EnumC1228830i5B enumC1228830i5B, int i) {
        int iIntValue;
        if (enumC1228830i5B == EnumC1228830i5B.STICKER_CHOOSE_GROUP) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, new ContextThemeWrapper(context, R.style.z4));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -13816531;
            }
            return (iIntValue & 16777215) | (((int) (((double) 255) * 0.95d)) << 24);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(i, context);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ3 != null) {
            return numLIZJ3.intValue();
        }
        return 0;
    }
}
