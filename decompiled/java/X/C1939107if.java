package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1939107if {
    public static final String LIZ(String str, int i, int i2, String str2, Integer num, String str3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" [unifiedCode=");
        sb.append(i);
        if (i2 != i) {
            sb.append(", legacyCode=");
            sb.append(i2);
        }
        if (!Intrinsics.LJFF(str2, str)) {
            sb.append(", legacyMessage=");
            sb.append(str2);
        }
        if (num != null) {
            sb.append(", serverCode=");
            sb.append(num.intValue());
        }
        if (str3 != null && str3.length() != 0) {
            sb.append(", serverMessage=");
            sb.append(str3);
        }
        if (th != null) {
            sb.append(", cause=");
            sb.append(th.getClass().getSimpleName());
            String message = th.getMessage();
            if (message != null && message.length() > 0) {
                sb.append(": ");
                sb.append(message);
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
