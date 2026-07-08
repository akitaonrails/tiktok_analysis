package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0kse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336380kse {
    public final ConcurrentLinkedQueue<Function1<Function0<Unit>, Unit>> LIZ = new ConcurrentLinkedQueue<>();
    public final Semaphore LIZIZ;

    public final void LIZ() {
        while (this.LIZIZ.tryAcquire()) {
            Function1<Function0<Unit>, Unit> function1Poll = this.LIZ.poll();
            if (function1Poll == null) {
                this.LIZIZ.release();
                return;
            }
            function1Poll.invoke(new AwS564S0100000_20(this, 26));
        }
    }

    public C1336380kse(int i) {
        if (1 < i) {
            if (4 <= i) {
                i = 4;
            }
        } else {
            i = 1;
        }
        this.LIZIZ = new Semaphore(i);
    }
}
