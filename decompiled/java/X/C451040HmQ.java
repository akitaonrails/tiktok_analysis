package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451040HmQ {
    public static final Integer LIZ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            Integer numLIZJ2 = C1308910kAL.LIZJ(i, context);
            if (numLIZJ2 != null) {
                return Integer.valueOf(C2441009hQ.LJIIJ(numLIZJ2.intValue(), iIntValue));
            }
            return null;
        }
        return null;
    }
}
