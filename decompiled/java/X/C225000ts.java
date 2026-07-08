package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.00ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C225000ts {
    public static final String LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -16777216;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RGB(");
        double d = 255;
        sbLIZ.append(((double) Color.red(iIntValue)) / d);
        sbLIZ.append(", ");
        sbLIZ.append(((double) Color.green(iIntValue)) / d);
        sbLIZ.append(", ");
        sbLIZ.append(((double) Color.blue(iIntValue)) / d);
        sbLIZ.append(") alpha(");
        sbLIZ.append(((double) Color.alpha(iIntValue)) / d);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
