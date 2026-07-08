package X;

import android.os.Message;

/* JADX INFO: renamed from: X.0VD3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VD3 {
    public static final boolean LIZ(Object obj, RunnableC794000VCs runnableC794000VCs) {
        Message message;
        Message message2;
        C0VD5 c0vd5 = (C0VD5) obj;
        if (runnableC794000VCs == null) {
            if (c0vd5 == null || (message2 = c0vd5.LIZ) == null || message2.getCallback() == null) {
                return true;
            }
            return false;
        }
        if (c0vd5 != null && (message = c0vd5.LIZ) != null && runnableC794000VCs.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
