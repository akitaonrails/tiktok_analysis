package X;

import android.os.MessageQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01zC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C512801zC implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C512801zC c512801zC) {
        C23250099c.LIZLLL(C01Q9.LIZ, null, null, new C01Q8((Function0) c512801zC.l0, null), 3);
        return false;
    }

    public static final boolean queueIdle$1(C512801zC c512801zC) {
        C23250099c.LIZLLL(C01Y7.LIZ, null, null, new C01Y6((Function0) c512801zC.l0, null), 3);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C512801zC(Function0 function0, Function0<Unit> function02) {
        this.$t = function02;
        this.l0 = function0;
    }
}
