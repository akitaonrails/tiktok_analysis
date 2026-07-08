package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.03qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C968903qZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append("_");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return u.LJJIFFI(sb.toString(), "__", "_", false);
    }
}
