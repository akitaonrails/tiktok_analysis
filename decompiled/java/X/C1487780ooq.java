package X;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0ooq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487780ooq {
    public static Field LIZ;
    public static Field LIZIZ;

    public static void LIZ(Looper looper) {
        MessageQueue queue = null;
        try {
            queue = looper.getQueue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            if (LIZ == null) {
                Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
                LIZ = declaredField;
                declaredField.setAccessible(true);
            }
            Message message = (Message) LIZ.get(queue);
            int i = 0;
            while (message != null) {
                i++;
                try {
                    if (LIZIZ == null) {
                        Field declaredField2 = Message.class.getDeclaredField("next");
                        LIZIZ = declaredField2;
                        declaredField2.setAccessible(true);
                    }
                    Object obj = LIZIZ.get(message);
                    if (obj == null) {
                        break;
                    } else {
                        message = (Message) obj;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("messageQueue count = ");
            sbLIZ.append(i);
            C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }
}
