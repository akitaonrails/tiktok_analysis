package X;

/* JADX INFO: renamed from: X.0LyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560460LyW {
    public static final String LIZ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    return "none";
                }
            } else if (i != 0) {
                if (i > 1) {
                    if (i2 == 0) {
                        return "video";
                    }
                } else if (i < 1) {
                    return "";
                }
            }
            return i2 >= 1 ? "mix" : "";
        }
        if (i2 == 1) {
            return "none";
        }
        return i2 > 1 ? "photo" : "";
    }
}
