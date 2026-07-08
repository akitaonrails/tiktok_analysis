package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.19Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21521219Kg {
    public static String LIZ(C1B3S c1b3s) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1b3s.LJII);
        if (!TextUtils.isEmpty(c1b3s.LJIIIIZZ)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(c1b3s.LJIIIIZZ);
        }
        if (!TextUtils.isEmpty(c1b3s.LJIIIZ)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(c1b3s.LJIIIZ);
        }
        return sb.toString();
    }
}
