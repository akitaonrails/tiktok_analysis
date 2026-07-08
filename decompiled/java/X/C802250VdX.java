package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802250VdX implements Thread.UncaughtExceptionHandler {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final ArrayList<AbstractC802360Vdi> LJFF = new ArrayList<>();
    public static boolean LJI;
    public final C801700Vce LIZJ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Thread.UncaughtExceptionHandler LIZ = Thread.getDefaultUncaughtExceptionHandler();

    public C802250VdX(C801700Vce c801700Vce) {
        this.LIZJ = c801700Vce;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static int LIZIZ(Thread thread, Throwable th) {
        int i = 0;
        int iLIZIZ = 0;
        while (true) {
            ArrayList<AbstractC802360Vdi> arrayList = LJFF;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    iLIZIZ |= arrayList.get(i).LIZIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                i++;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        return iLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0170 -> B:59:0x0171). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.Thread r22, java.lang.Throwable r23) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802250VdX.LIZ(java.lang.Thread, java.lang.Throwable):boolean");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            int i = 0;
            try {
                try {
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                if (this.LIZIZ.compareAndSet(false, true)) {
                    if (LIZ(thread, th)) {
                        while (true) {
                            ArrayList<AbstractC802360Vdi> arrayList = LJFF;
                            if (i >= arrayList.size()) {
                                break;
                            }
                            try {
                                try {
                                    arrayList.get(i).LIZ();
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                }
                                i++;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                            }
                        }
                    } else {
                        this.LIZ.uncaughtException(thread, th);
                    }
                } else {
                    this.LIZ.uncaughtException(thread, th);
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
    }
}
