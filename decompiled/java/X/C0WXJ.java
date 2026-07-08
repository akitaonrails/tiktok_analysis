package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0WXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXJ {
    public static int LIZIZ;
    public static final ConcurrentHashMap<Integer, C0WXO> LIZ = new ConcurrentHashMap<>();
    public static final ReentrantLock LIZJ = new ReentrantLock();

    public static void LIZIZ(C0WXN c0wxn) {
        while (true) {
            ConcurrentHashMap<Integer, C0WXO> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(Integer.valueOf(LIZIZ))) {
                C0WXO c0wxoRemove = concurrentHashMap.remove(Integer.valueOf(LIZIZ));
                if (c0wxoRemove != null) {
                    if (c0wxn != null) {
                        c0wxn.LJFF(c0wxoRemove.LIZ, new AwS592S0100000_13(c0wxoRemove, 55));
                    }
                    LIZIZ++;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r3 == r6) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C830090WhL LIZ(X.InterfaceC824480WVy r10, X.C0WXN r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WXJ.LIZ(X.0WVy, X.0WXN, boolean):X.0WhL");
    }
}
