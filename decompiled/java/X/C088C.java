package X;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.088C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088C implements C088E {
    public static final void LIZ() {
        if ("main".equals(C786410Ut5.u3().getName())) {
            C088A c088aLIZJ = C088A.LIZJ();
            if (c088aLIZJ.LL == null) {
                throw new RuntimeException("Must call start(Application context) first!!!");
            }
            synchronized (C088A.LLJIJIL) {
                try {
                    MessageQueue messageQueue = c088aLIZJ.LLIZLLLIL;
                    if (messageQueue == null) {
                        return;
                    }
                    synchronized (messageQueue) {
                        try {
                            for (Message message : (ArrayList) c088aLIZJ.LLILLL) {
                                if (HandlerHook.getMessageObj(message.obj) != null && message.arg2 == 9527) {
                                    Message messageObtain = Message.obtain(message);
                                    messageObtain.arg2 = 9528;
                                    message.what = -message.what;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Handle pending message ");
                                    sbLIZ.append(messageObtain.what);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    AnonymousClass0888.LIZ();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Success handle delay message ");
                                    sbLIZ2.append(messageObtain.what);
                                    sbLIZ2.append("!");
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    AnonymousClass0888.LIZ();
                                    ((Handler) C1966607n6.LIZJ()).dispatchMessage(messageObtain);
                                }
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    ((ArrayList) c088aLIZJ.LLILLL).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
