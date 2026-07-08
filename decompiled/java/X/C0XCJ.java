package X;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCJ {
    public static final C0XCO LIZ = new C0XCO();
    public static final C0XCI LIZIZ = new C0XCI();

    public static C844630XBl LIZ() {
        C0XCI c0xci = LIZIZ;
        Context contextLJ = c0xci.LJ();
        if (contextLJ == null) {
            return null;
        }
        return c0xci.LJFF.LIZIZ(contextLJ).LJIIIIZZ();
    }

    public static void LIZIZ() {
        C0XCI c0xci = LIZIZ;
        Integer numLIZLLL = c0xci.LIZLLL();
        C0XBN c0xbnLJI = c0xci.LJI();
        if (numLIZLLL != null) {
            if (c0xbnLJI == null || TextUtils.isEmpty(c0xbnLJI.LL) || TextUtils.isEmpty(c0xbnLJI.LLILLJJLI)) {
                C0XCL c0xcl = c0xci.LIZJ;
                if (c0xcl.LIZLLL.get() == null) {
                    C844830XCf.LIZ("tryWaitingForInstallFinishWithOldWay");
                    synchronized (c0xcl.LIZ) {
                        try {
                            c0xcl.LIZJ(numLIZLLL);
                            if (!c0xcl.LJ) {
                                if (Looper.myLooper() == C824170WUt.LIZLLL(String.valueOf(numLIZLLL))) {
                                    C844830XCf.LIZLLL(new RuntimeException("did generate at this thread,you shouldn't block this thread"));
                                }
                                long j = c0xcl.LJFF ? 4000L : 1500L;
                                if (!c0xcl.LIZIZ) {
                                    try {
                                        c0xcl.LIZ.wait(j);
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                c0xcl.LJ = true;
                                C844830XCf.LIZ("tryWaitingForInstallFinishWithOldWay finish");
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                c0xci.LJI();
            }
        }
    }
}
