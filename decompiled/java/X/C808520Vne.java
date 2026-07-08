package X;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808520Vne implements WeakHandler.IHandler {
    public static volatile C808520Vne LL;
    public static WeakHandler LLILLJJLI;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static C808520Vne LIZ() {
        if (LL == null) {
            synchronized (C808520Vne.class) {
                try {
                    if (LL == null) {
                        LL = new C808520Vne();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LL;
    }

    public C808520Vne() {
        if (LLILLJJLI == null) {
            try {
                LLILLJJLI = C808510Vnd.LIZ().LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                HandlerThread handlerThread = new HandlerThread("WsHT");
                handlerThread.start();
                LLILLJJLI = new WeakHandler(C786410Ut5.W2(handlerThread), this);
            }
        }
    }
}
