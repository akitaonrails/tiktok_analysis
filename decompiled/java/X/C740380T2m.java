package X;

import Y.ACallableS416S0100000_9;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740380T2m {
    public static final C740380T2m LIZ = new C740380T2m();

    public static void LIZ(String str, C589850NBn c589850NBn) {
        C740410T2p.LIZ.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C740410T2p.LIZIZ;
        C11NJ c11nj = (C11NJ) concurrentHashMap.get(str);
        if (c11nj == null) {
            c11nj = new C11NJ();
            concurrentHashMap.put(str, c11nj);
        }
        c11nj.LIZ(c589850NBn);
    }

    public static void LIZIZ(String str, C0T0O c0t0o, Runnable runnable) {
        C098D c098dLJIILIIL = C11NZ.LJJJJI(new ACallableS416S0100000_9(runnable, 7)).LJIILIIL(C740750T3x.LIZ(c0t0o));
        C589850NBn c589850NBn = new C589850NBn(c0t0o);
        c098dLJIILIIL.LIZIZ(c589850NBn);
        LIZ(str, c589850NBn);
    }
}
