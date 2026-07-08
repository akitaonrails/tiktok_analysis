package X;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: X.0kTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320840kTa {
    public static final C1320840kTa LIZIZ = new C1320840kTa();
    public static boolean LIZJ = true;
    public final Queue<EnumC1320760kTS> LIZ = new ArrayBlockingQueue(20);

    public final String toString() {
        return this.LIZ.toString();
    }

    public final void LIZ(EnumC1320760kTS enumC1320760kTS) {
        if (!LIZJ) {
            return;
        }
        if (((ArrayBlockingQueue) this.LIZ).size() + 1 > 20) {
            ((ArrayBlockingQueue) this.LIZ).poll();
        }
        ((ArrayBlockingQueue) this.LIZ).add(enumC1320760kTS);
    }
}
