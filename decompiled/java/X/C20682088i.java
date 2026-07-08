package X;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.088i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20682088i {
    public static MessageQueue LIZ;

    public static MessageQueue LIZ() {
        if (LIZ == null) {
            try {
                if (Looper.getMainLooper() != null) {
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper == Looper.myLooper()) {
                        LIZ = Looper.myQueue();
                    } else {
                        LIZ = mainLooper.getQueue();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return LIZ;
    }

    public static ArrayList<Message> LIZIZ(MessageQueue messageQueue, int i) {
        Message message;
        ArrayList<Message> arrayList = new ArrayList<>();
        if (messageQueue == null) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            message = (Message) declaredField.get(messageQueue);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            message = null;
        }
        synchronized (messageQueue) {
            int i2 = 0;
            while (message != null && i2 < i) {
                i2++;
                try {
                    arrayList.add(message);
                    try {
                        Field declaredField2 = Class.forName("android.os.Message").getDeclaredField("next");
                        declaredField2.setAccessible(true);
                        message = (Message) declaredField2.get(message);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        message = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
