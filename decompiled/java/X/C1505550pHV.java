package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0pHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505550pHV {
    public static final int LIZ;
    public static final C1505540pHU LIZIZ;

    static {
        if (C296490Bjj.LIZ(4)) {
            LIZ = 13;
        }
        LIZIZ = new C1505540pHU(0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1505570pHX("gecko-check-update-thread", LIZ));
    }
}
