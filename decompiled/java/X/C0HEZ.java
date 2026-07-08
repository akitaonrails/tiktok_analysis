package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HEZ {
    public static final int LIZIZ(String str) {
        if (a0.LJJJIL(str)) {
            return -1;
        }
        if (str.charAt(0) == '#') {
            String strSubstring = str.substring(1);
            CharsKt__CharJVMKt.checkRadix(16);
            long j = CastLongProtector.parseLong(strSubstring, 16);
            if (str.length() == 7) {
                j |= -16777216;
            } else if (str.length() != 9) {
                "Unknown color".toString();
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) j;
        }
        throw new IllegalArgumentException("Unknown color");
    }

    public static final int LIZ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return C446980Hfs.LIZ(context, i);
    }
}
