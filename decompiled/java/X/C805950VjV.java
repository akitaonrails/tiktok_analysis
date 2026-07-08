package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805950VjV {
    public static Field LIZ;
    public static Field LIZIZ;
    public static MessageQueue LIZJ;
    public static Handler LIZLLL;
    public static Object LJ;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3115));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(402));

    public static boolean LIZ() {
        if (!((Boolean) LJI.getValue()).booleanValue()) {
            return false;
        }
        LIZIZ();
        if (LIZLLL == null || LJ == null) {
            Object objLIZJ = C1961107mD.LIZJ(C786410Ut5.v2(), "mHandler");
            LIZLLL = objLIZJ instanceof Handler ? (Handler) objLIZJ : null;
            Object objLIZJ2 = C1961107mD.LIZJ(C786410Ut5.v2(), "mDisplayEventReceiver");
            if (!(objLIZJ2 instanceof Object)) {
                objLIZJ2 = null;
            }
            LJ = objLIZJ2;
        }
        Field field = LIZ;
        Object obj = field != null ? field.get(LIZJ) : null;
        C1218504pj.LIZ();
        for (Message messageLIZJ = obj instanceof Message ? (Message) obj : null; messageLIZJ != null; messageLIZJ = LIZJ(messageLIZJ)) {
            if (messageLIZJ.what == 0 && Intrinsics.LJFF(messageLIZJ.getTarget(), LIZLLL) && Intrinsics.LJFF(messageLIZJ.getCallback(), LJ)) {
                Handler target = messageLIZJ.getTarget();
                Message messageObtain = Message.obtain(messageLIZJ);
                if (target != null) {
                    target.removeMessages(messageLIZJ.what, HandlerHook.getMessageObj(messageLIZJ.obj));
                    C786410Ut5.LJLJJLL(target, messageObtain);
                }
                C1218504pj.LIZ();
                return true;
            }
        }
        C1218504pj.LIZ();
        return false;
    }

    public static void LIZIZ() {
        if (LIZ == null || LIZIZ == null || LIZJ == null) {
            LIZ = C1961107mD.LIZ(MessageQueue.class, "mMessages");
            LIZIZ = C1961107mD.LIZ(Message.class, "next");
            LIZJ = Looper.getMainLooper().getQueue();
        }
    }

    public static Message LIZJ(Message message) {
        Object obj;
        try {
            Field field = LIZIZ;
            if (field != null) {
                obj = field.get(message);
            } else {
                obj = null;
            }
            if (obj != null) {
                return (Message) obj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getNextMessage error, exception : ");
            sbLIZ.append(Log.getStackTraceString(e));
            C2188811AlT.LIZIZ(sbLIZ);
            C1218504pj.LIZ();
        }
        return null;
    }

    public static void LIZLLL(String str, List list) {
        ((ConcurrentHashMap) LJFF.getValue()).put(str, list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerRule, scene : ");
        sbLIZ.append(str);
        sbLIZ.append(", rule : ");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C1218504pj.LIZ();
    }
}
