package X;

import android.os.Message;

/* JADX INFO: renamed from: X.0V3H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V3H {
    public static final boolean LIZ(Object obj, Object obj2) {
        Message message;
        Message message2;
        C0V3J c0v3j = (C0V3J) obj;
        if (obj2 == null) {
            if (c0v3j == null || (message2 = c0v3j.LIZ) == null || message2.getCallback() == null) {
                return true;
            }
            return false;
        }
        if (c0v3j != null && (message = c0v3j.LIZ) != null && obj2.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
