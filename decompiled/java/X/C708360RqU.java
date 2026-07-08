package X;

/* JADX INFO: renamed from: X.0RqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708360RqU {
    public static final int LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1271119582) {
            if (iHashCode != -667094460) {
                if (iHashCode == 1691937916 && str.equals("homepage_hot")) {
                    return 1;
                }
                return -1;
            }
            if (str.equals("homepage_friends")) {
                return 0;
            }
            return -1;
        }
        if (str.equals("homepage_follow")) {
            return 2;
        }
        return -1;
    }
}
