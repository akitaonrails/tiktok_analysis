package X;

import android.os.Message;

/* JADX INFO: renamed from: X.0V3I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V3I {
    public static final boolean LIZ(Object obj, Object obj2) {
        Message message = (Message) obj;
        if (obj2 == null) {
            if (message == null || message.getCallback() == null) {
                return true;
            }
            return false;
        }
        if (message != null && obj2.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
