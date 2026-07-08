package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.088h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20681088h {
    public static MessageQueue LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;

    public static MessageQueue LIZ() {
        if (LIZ == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                LIZ = Looper.myQueue();
            } else {
                LIZ = mainLooper.getQueue();
            }
        }
        return LIZ;
    }

    public static Message LIZIZ(MessageQueue messageQueue) {
        if (Build.VERSION.SDK_INT >= 37) {
            return null;
        }
        Field field = LIZIZ;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                LIZIZ = declaredField;
                declaredField.setAccessible(true);
                return (Message) LIZIZ.get(messageQueue);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Message LIZJ(Message message) {
        if (Build.VERSION.SDK_INT >= 37) {
            return null;
        }
        Field field = LIZJ;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                LIZJ = declaredField;
                declaredField.setAccessible(true);
                return (Message) LIZJ.get(message);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
