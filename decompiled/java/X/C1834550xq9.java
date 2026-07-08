package X;

/* JADX INFO: renamed from: X.0xq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834550xq9 {
    public static final EnumC1834800xqY LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return EnumC1834800xqY.SPINNER_LOADING;
            }
            if (num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 0 || num.intValue() == 4) {
                return EnumC1834800xqY.NORMAL;
            }
            return null;
        }
        return null;
    }
}
