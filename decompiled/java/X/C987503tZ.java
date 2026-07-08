package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C987503tZ {
    public static final int LIZ(Context context, boolean z) {
        int i;
        if (z) {
            i = R.attr.g0b;
        } else {
            i = R.attr.g0e;
        }
        Integer numLIZ = C1308910kAL.LIZ(i, context);
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return 0;
    }
}
