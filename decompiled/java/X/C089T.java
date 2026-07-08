package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.089T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089T {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static Field LIZLLL;
    public static MessageQueue LJ;
    public static Field LJFF;

    public static boolean LIZ() {
        Field fieldLIZ;
        MessageQueue messageQueue;
        Field fieldLIZ2;
        if (!((Boolean) C285090BFj.LJIILJJIL.getValue()).booleanValue()) {
            return true;
        }
        try {
            if (LIZLLL == null) {
                try {
                    fieldLIZ = C1961107mD.LIZ(MessageQueue.class, "mMessages");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Log.getStackTraceString(th);
                    fieldLIZ = null;
                }
                LIZLLL = fieldLIZ;
                try {
                    messageQueue = (MessageQueue) C1961107mD.LIZJ(Looper.getMainLooper(), "mQueue");
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    Log.getStackTraceString(th2);
                    messageQueue = null;
                }
                LJ = messageQueue;
            }
            Message message = (Message) LIZLLL.get(LJ);
            while (message != null) {
                C01GW c01gw = C285090BFj.LLFF;
                if (!((Boolean) c01gw.getValue()).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("message.getCallback():");
                    sbLIZ.append(message.getCallback());
                    sbLIZ.append(", ,message.what:");
                    sbLIZ.append(message.what);
                    sbLIZ.append(",message.getTarget()  :     ");
                    sbLIZ.append(message.getTarget());
                    sbLIZ.append(",       ");
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (message.getCallback() != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("--message.getCallback().getClass().toString():");
                        sbLIZ2.append(message.getCallback().getClass().toString());
                        sbLIZ2.append(", ,message.sRenderFirstFrameWhat:");
                        sbLIZ2.append(C1479490obT.LJJLIIIJ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                if (message.what == C1479490obT.LJJLIIIJ && message.getCallback() != null && message.getCallback().getClass().toString().contains(C1479490obT.class.getSimpleName())) {
                    ((Boolean) c01gw.getValue()).booleanValue();
                    if (!((Boolean) C285090BFj.LJIILL.getValue()).booleanValue()) {
                        return true;
                    }
                    LIZIZ(message.getTarget(), message);
                    return true;
                }
                try {
                    if (LJFF == null) {
                        try {
                            fieldLIZ2 = C1961107mD.LIZ(Message.class, "next");
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            Log.getStackTraceString(th3);
                            fieldLIZ2 = null;
                        }
                        LJFF = fieldLIZ2;
                    }
                    Object obj = LJFF.get(message);
                    if (obj == null) {
                        return false;
                    }
                    message = (Message) obj;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Log.getStackTraceString(e);
                    return false;
                }
            }
            return false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Log.getStackTraceString(e2);
            return false;
        }
    }

    public static void LIZIZ(Handler handler, Message message) {
        if (!((Boolean) C285090BFj.LLFF.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[3790 add] moveMessageToHead() called with: handler = [");
            sbLIZ.append(handler);
            sbLIZ.append("], message = [");
            sbLIZ.append(message);
            sbLIZ.append(e3.f);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            Message messageObtain = Message.obtain(message);
            handler.removeMessages(message.what, HandlerHook.getMessageObj(message.obj));
            C786410Ut5.LJLJL(handler, messageObtain, -1L);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
        }
    }
}
