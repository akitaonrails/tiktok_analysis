package X;

/* JADX INFO: renamed from: X.037j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7917037j {
    public static String LIZ(C755502xF c755502xF) {
        Integer num;
        Integer num2;
        String str;
        C720002rW c720002rW = c755502xF.LLIZ;
        int iIntValue = 0;
        if (c720002rW != null && (str = c720002rW.LLJILLL) != null && str.length() > 0) {
            return "all_applied";
        }
        C720002rW c720002rW2 = c755502xF.LLIZ;
        if (c720002rW2 != null && (num = c720002rW2.LLJILJILJ) != null && num.intValue() > 0) {
            C720002rW c720002rW3 = c755502xF.LLIZ;
            if (c720002rW3 != null && (num2 = c720002rW3.LLJILJILJ) != null) {
                iIntValue = num2.intValue();
            }
            return String.valueOf(iIntValue);
        }
        return "no_coupon";
    }
}
