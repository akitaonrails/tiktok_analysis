package X;

import android.os.Build;

/* JADX INFO: renamed from: X.08lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2211708lX {
    public static final String LIZ;

    static {
        boolean z;
        StringBuilder sb = new StringBuilder("(Linux; Android ");
        sb.append(Build.VERSION.RELEASE);
        String str = Build.MODEL;
        if (str.isEmpty() || !"REL".equals(Build.VERSION.CODENAME)) {
            z = false;
        } else {
            sb.append("; ");
            sb.append(str);
            z = true;
        }
        if (!Build.ID.isEmpty()) {
            if (!z) {
                sb.append("; ");
            }
            sb.append(" Build/");
            sb.append(Build.ID);
        }
        sb.append(") Mobile PIA/2.5.3");
        LIZ = sb.toString();
    }
}
