package X;

/* JADX INFO: renamed from: X.0VI8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VI8 {
    public static C0VI8 LIZ;

    public static synchronized C0VI8 LIZ() {
        if (LIZ == null) {
            LIZ = new C0VIC(3);
        }
        return LIZ;
    }

    public static String LIZIZ(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
