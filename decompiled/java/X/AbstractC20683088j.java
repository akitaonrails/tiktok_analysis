package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.088j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20683088j implements C0N5U {
    public static final Object LIZJ = new Object();
    public static final Object LIZLLL = new Object();
    public final Handler LIZ;
    public Message LIZIZ;

    @Override // X.C0N5U
    public final void LIZIZ() {
        Message message = this.LIZIZ;
        if (message == null) {
            return;
        }
        this.LIZIZ = null;
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        Object obj = LIZJ;
        if (Intrinsics.LJFF(messageObj, obj) && Intrinsics.LJFF(message.getTarget(), this.LIZ)) {
            Message messageObtain = Message.obtain(message);
            messageObtain.obj = LIZLLL;
            C786410Ut5.LJLJJLL(this.LIZ, messageObtain);
            this.LIZ.removeMessages(message.what, obj);
        }
    }

    public AbstractC20683088j(Handler handler) {
        this.LIZ = handler;
    }

    @Override // X.C0N5U
    public final boolean LIZ(Message message, long j) {
        if (HandlerHook.getMessageObj(message.obj) != null) {
            return false;
        }
        this.LIZIZ = message;
        message.obj = LIZJ;
        return C786410Ut5.LJLJL(this.LIZ, message, j);
    }
}
