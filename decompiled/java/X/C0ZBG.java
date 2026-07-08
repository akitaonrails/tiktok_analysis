package X;

/* JADX INFO: renamed from: X.0ZBG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBG {
    public static final C0ZBF LIZ(Integer num) {
        int iIntValue;
        if (num != null && (iIntValue = num.intValue()) >= 0 && iIntValue < 2) {
            C0ZBF c0zbf = C0ZBF.values()[num.intValue()];
            if (c0zbf != null) {
                return c0zbf;
            }
        }
        return C0ZBF.UN_MUTE;
    }
}
