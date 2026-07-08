package X;

/* JADX INFO: renamed from: X.107I, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107I {
    public static final C107I LIZ = new C107I();

    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                if (C104L.LIZJ()) {
                    return "Followers";
                }
                return "Everyone";
            }
            if (num.intValue() == 1) {
                return "Friends";
            }
            if (num.intValue() == 3) {
                return "No_one";
            }
            return null;
        }
        return null;
    }
}
