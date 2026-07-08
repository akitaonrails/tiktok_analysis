package X;

import android.os.MessageQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Umu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782580Umu implements MessageQueue.IdleHandler {
    public static final C782580Umu LL = new C782580Umu();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = C782550Umr.LIZLLL;
        C782540Umq.LIZ();
        C782550Umr.LJ = null;
        return false;
    }
}
