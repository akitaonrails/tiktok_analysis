package X;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.0czk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033260czk {
    public static final float LIZ(Number number) {
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final String LIZIZ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(th.getClass().getName());
        sbLIZ.append(':');
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(Object obj, String str) {
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('-');
            sbLIZ.append(thM5exceptionOrNullimpl.getClass().getName());
            sbLIZ.append(':');
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("-miss exception");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
