package X;

import android.os.Looper;
import android.os.MessageQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21394318o1 {
    public static MessageQueue LIZ;

    public static void LIZ(final Function0 function0) {
        MessageQueue messageQueue = LIZ;
        if (messageQueue != null) {
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.18o2
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    function0.invoke();
                    return false;
                }
            }, messageQueue);
            return;
        }
        LIZ = Looper.getMainLooper().getQueue();
        C1490740otc.LIZIZ(C1490740otc.LIZ, "mMainMessageQueue Looper.getMainLooper().queue", null, null, 6);
        LIZ(function0);
    }
}
