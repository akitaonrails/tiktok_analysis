package X;

/* JADX INFO: renamed from: X.0HqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453540HqS {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:src");
        if (str == null) {
            return true;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 98361695) {
                if (iHashCode == 110246592 && str.equals("tenor")) {
                    return true;
                }
            } else if (str.equals("giphy")) {
                return true;
            }
        } else if (str.equals("")) {
            return true;
        }
        return false;
    }
}
