package X;

/* JADX INFO: renamed from: X.01AW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AW {
    public static boolean LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 15 || num.intValue() == 16 || num.intValue() == 18 || num.intValue() == 20 || num.intValue() == 223 || num.intValue() == 224) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(Integer num) {
        if (!LIZ(num)) {
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
