package X;

/* JADX INFO: renamed from: X.0LZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZQ {
    public static final String LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1184392185) {
            if (iHashCode != 3452698) {
                if (iHashCode == 100344454 && str.equals("inbox")) {
                    return "ai_inbox";
                }
                return str;
            }
            if (!str.equals("push")) {
                return str;
            }
            return "ai_push";
        }
        if (!str.equals("in_app")) {
            return str;
        }
        return "ai_inapp";
    }
}
