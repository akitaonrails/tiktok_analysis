package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12e4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC19803812e4 implements Runnable {
    public final /* synthetic */ C19811512fJ LL;
    public final /* synthetic */ C19804512eB LLILLJJLI;

    public final void LIZ() {
        C19804512eB c19804512eB = this.LLILLJJLI;
        InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
        if (interfaceC19802012dm == null) {
            c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send current screen to service");
            return;
        }
        try {
            C19811512fJ c19811512fJ = this.LL;
            if (c19811512fJ == null) {
                interfaceC19802012dm.LLLZLZ(0L, null, null, c19804512eB.LIZ.LIZ.getPackageName());
            } else {
                interfaceC19802012dm.LLLZLZ(c19811512fJ.LIZJ, c19811512fJ.LIZ, c19811512fJ.LIZIZ, c19804512eB.LIZ.LIZ.getPackageName());
            }
            this.LLILLJJLI.LJJIIJZLJL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LJIILJJIL().LJFF.LIZ(e, "Failed to send current screen to the service");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzln@3983.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzln@3983.run");
    }

    public RunnableC19803812e4(C19804512eB c19804512eB, C19811512fJ c19811512fJ) {
        this.LL = c19811512fJ;
        this.LLILLJJLI = c19804512eB;
    }
}
