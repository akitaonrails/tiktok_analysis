package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0od2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480460od2 {
    public static void LIZIZ(HandlerThread handlerThread, int i, int i2) {
        int threadId;
        if (1 == C1474810oTv.LLILLJJLI() && handlerThread != null && C786410Ut5.W2(handlerThread) != null && C786410Ut5.W2(handlerThread) != Looper.getMainLooper() && (threadId = handlerThread.getThreadId()) > 0) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adjustPlayerThreadPriority play thread, scene : ");
                sbLIZ.append(i);
                sbLIZ.append(", priority : ");
                sbLIZ.append(i2);
                C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                Process.setThreadPriority(threadId, i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySession", "Process.setThreadPriority exception");
                }
            }
        }
    }

    public static void LIZ(HandlerThread handlerThread, int i, Message message, boolean z) {
        if (handlerThread != null && C786410Ut5.W2(handlerThread) != null && C786410Ut5.W2(handlerThread) != Looper.getMainLooper()) {
            int threadId = handlerThread.getThreadId();
            if (z && threadId > 0) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("adjustPlayThreadPriority play thread, scene : ");
                    sbLIZ.append(i);
                    sbLIZ.append(", priority : ");
                    sbLIZ.append(10);
                    C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (((Boolean) C1474810oTv.LLJZIJLIL.getValue()).booleanValue()) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("set play session thread priority: ");
                        sbLIZ2.append(threadId);
                        sbLIZ2.append(" -> ");
                        sbLIZ2.append(10);
                        C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    Process.setThreadPriority(threadId, 10);
                }
                if ((i == 4 || i == 3) && message != null) {
                    message.obj = Boolean.TRUE;
                }
            }
        }
    }
}
