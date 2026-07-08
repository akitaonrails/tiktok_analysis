package X;

/* JADX INFO: renamed from: X.0ICa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462580ICa {
    public static final int LIZ(int i, Integer num, Integer num2) {
        int iIntValue;
        int iIntValue2;
        int i2 = 1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 1;
        }
        if (iIntValue == 0) {
            iIntValue = 1;
        }
        if (iIntValue2 != 0) {
            i2 = iIntValue2;
        }
        return (i * i2) / iIntValue;
    }
}
