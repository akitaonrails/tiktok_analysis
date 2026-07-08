package Y;

import X.AnonymousClass0810;
import X.C1C7U;
import X.C2095108Ir;
import X.C2103208Lu;
import X.C786410Ut5;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS10S0000100_3 implements Runnable {
    public final int $t;
    public long j0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (!C2103208Lu.LJ.isEmpty()) {
                C2095108Ir.LIZLLL();
                if (C2103208Lu.LJIIJ) {
                    System.out.println((Object) "LocalLeakWatcher force executeGc");
                }
            } else if (C2103208Lu.LJIIJ) {
                System.out.println((Object) "LocalLeakWatcher no need executeGc");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
        C786410Ut5.LJLIIL(this.j0, (Handler) C2103208Lu.LJII.getValue(), this);
    }

    public static final void run$0(ARunnableS10S0000100_3 aRunnableS10S0000100_3) {
        boolean zLIZ;
        C1C7U.LIZ("LeakWatcher@97d2.start$gcTask$1");
        try {
            aRunnableS10S0000100_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LeakWatcher@97d2.start$gcTask$1");
    }

    public static final void run$1(ARunnableS10S0000100_3 aRunnableS10S0000100_3) {
        boolean zLIZ;
        C1C7U.LIZ("PostModePerfUtil@d6c5.requestCpuBoost$1");
        try {
            AnonymousClass0810.LIZ.LIZ((int) aRunnableS10S0000100_3.j0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModePerfUtil@d6c5.requestCpuBoost$1");
    }

    public ARunnableS10S0000100_3(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
