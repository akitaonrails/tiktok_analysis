package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0hEK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196060hEK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2) {
        boolean z;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (str == null) {
                return null;
            }
            return u.LJJIFFI(str, "%1$s", "", false);
        }
        if (str == null) {
            return null;
        }
        return u.LJJIFFI(str, "%1$s", str2, false);
    }
}
