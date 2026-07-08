package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.13tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20153113tJ {
    public static boolean LIZ() {
        return C20152913tH.LIZIZ != null;
    }

    public static C20152113t9 LIZIZ() {
        if (LIZ()) {
            return C1524605y0.LIZ();
        }
        return null;
    }

    public static void LIZJ(InterfaceC20153213tK interfaceC20153213tK) {
        if (LIZ()) {
            interfaceC20153213tK.LIZ(C1524605y0.LIZ());
            return;
        }
        ConcurrentLinkedQueue<InterfaceC20153213tK> concurrentLinkedQueue = C20152913tH.LIZJ;
        if (concurrentLinkedQueue.size() >= 5) {
            concurrentLinkedQueue.poll();
            concurrentLinkedQueue.offer(interfaceC20153213tK);
        } else {
            concurrentLinkedQueue.offer(interfaceC20153213tK);
        }
    }
}
