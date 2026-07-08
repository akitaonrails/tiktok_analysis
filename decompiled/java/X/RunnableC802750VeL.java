package X;

import Y.ARunnableS92S0000000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: X.0VeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC802750VeL implements Runnable {
    public final /* synthetic */ FileOutputStream LL;
    public final /* synthetic */ int LLILLJJLI;

    public final void LIZ() {
        String strLIZIZ;
        if (C802640VeA.LJJJJJL == -1) {
            C802640VeA.LJJJJI = true;
        }
        if (C802640VeA.LJJJJJL != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("time=");
            sbLIZ.append(C802640VeA.LJJJJJ - C802640VeA.LJJJJIZL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            if (C802640VeA.LJJJJI) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(", main_timeout\n");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append(", main_alive=");
                sbLIZ3.append(C802640VeA.LJJJJJL - C802640VeA.LJJJJIZL);
                sbLIZ3.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            try {
                this.LL.write(strLIZIZ.getBytes());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (this.LLILLJJLI == 100) {
            return;
        }
        C802640VeA.LJJJJJL = -1L;
        C802640VeA.LJJJJJ = System.currentTimeMillis();
        if (!C802640VeA.LJJJJI) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS92S0000000_13(5));
        }
        C0VXF.postDelayed(new RunnableC802750VeL(this.LL, this.LLILLJJLI + 1), 3000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnrDumper@9bf0.testMainThread$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnrDumper@9bf0.testMainThread$1");
    }

    public RunnableC802750VeL(FileOutputStream fileOutputStream, int i) {
        this.LL = fileOutputStream;
        this.LLILLJJLI = i;
    }
}
