package X;

import android.os.Message;

/* JADX INFO: renamed from: X.0VD4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VD4 {
    public static final boolean LIZ(Object obj, RunnableC794000VCs runnableC794000VCs) {
        Message message = (Message) obj;
        if (runnableC794000VCs == null) {
            if (message == null || message.getCallback() == null) {
                return true;
            }
            return false;
        }
        if (message != null && runnableC794000VCs.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
