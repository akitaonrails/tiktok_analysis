package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01BY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(295));

    public static int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static int LIZIZ() {
        int iLIZJ = LIZJ();
        Double dValueOf = Double.valueOf(0.5d);
        if (iLIZJ != 0) {
            if (iLIZJ == 1) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
            }
            if (iLIZJ == 2) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.7d)));
            }
            if (iLIZJ != 3) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
            }
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
    }

    public static int LIZ(Context context) {
        if (LIZJ() == 1) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
