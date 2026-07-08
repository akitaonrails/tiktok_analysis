package X;

import android.os.Looper;
import android.os.MessageQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.189C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189C {
    public static MessageQueue LIZ;

    public static void LIZ(final Function0 function0) {
        if (C18CS.LIZ.LIZLLL().LJIIZILJ() == 1) {
            MessageQueue queue = null;
            if (LIZ == null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    queue = mainLooper.getQueue();
                }
                LIZ = queue;
            }
            MessageQueue messageQueue = LIZ;
            if (messageQueue != null) {
                C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.189D
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        function0.invoke();
                        return false;
                    }
                }, messageQueue);
                if (Unit.LIZ != null) {
                    return;
                }
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }
}
