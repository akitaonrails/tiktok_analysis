package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07AZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(469));

    public static final float LIZ() {
        int iIntValue = ((Number) LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            return 0.1f;
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? 1.0f : 0.01f;
        }
        return 0.05f;
    }
}
