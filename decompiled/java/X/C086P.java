package X;

import android.content.Intent;
import android.os.Build;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.086P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086P {
    public static Intent LIZ(Message message) {
        Intent intent;
        int i = message.what;
        String str = "intent";
        if (i != 100) {
            if (i != 121) {
                if (i != 159) {
                    switch (i) {
                        case 113:
                            if (!"intent".isEmpty() && HandlerHook.getMessageObj(message.obj) != null) {
                                try {
                                    return (Intent) C1958707lp.LIZIZ(HandlerHook.getMessageObj(message.obj), "intent");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            return null;
                        case 114:
                        case 115:
                            break;
                        default:
                            return null;
                    }
                }
            }
            if (i != 114 && i != 121) {
                str = i == 115 ? "args" : "";
            }
            if (!str.isEmpty() && HandlerHook.getMessageObj(message.obj) != null) {
                try {
                    return (Intent) C1958707lp.LIZIZ(HandlerHook.getMessageObj(message.obj), str);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            return null;
        }
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 && message.what == 100) {
            try {
                return (Intent) C1958707lp.LIZIZ(messageObj, "intent");
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (i2 >= 28 && message.what == 159) {
            try {
                List list = (List) C1958707lp.LIZIZ(messageObj, "mActivityCallbacks");
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Object obj = ListProtector.get(list, i3);
                        if (obj != null && (intent = (Intent) C1958707lp.LIZIZ(obj, "mIntent")) != null) {
                            return intent;
                        }
                    }
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return null;
    }
}
