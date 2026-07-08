package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126208Uq {
    public static final C2125908Un LIZ = C2126108Up.LIZJ;
    public static final C2125908Un LIZIZ = C2126108Up.LJFF;
    public static final ExecutorService LIZJ = C2126108Up.LIZLLL;
    public static final C2125908Un LIZLLL;
    public static final C2125908Un LJ;

    static {
        int i = C2126108Up.LJI;
        int i2 = C2126108Up.LJII;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LIZLLL = new C2125908Un(i, i2, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC20653087f());
        LJ = new C2125908Un(2, 2, timeUnit, new LinkedBlockingQueue(), new C086H(C00GJ.ABOVE_NORMAL));
    }
}
