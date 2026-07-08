package X;

/* JADX INFO: renamed from: X.107K, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107K {
    public static final C107K LIZ = new C107K();

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "everyone";
            }
            if (num.intValue() == 3) {
                return "following";
            }
            if (num.intValue() == 4) {
                return "friends";
            }
            if (num.intValue() == 5) {
                return "no_one";
            }
            return "";
        }
        return "";
    }
}
