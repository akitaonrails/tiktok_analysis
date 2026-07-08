package X;

import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0wtx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798470wtx {
    public final Context LIZ;
    public final WifiManager LIZIZ;
    public final long LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public volatile InterfaceC1798520wu2 LJ;
    public C854540Xfg LJFF;
    public ARunnableS127S0100000_27 LJI;

    public final void LIZ() {
        C1798620wuC.LIZIZ("WifiScanManager", "cleanup: cleaning up resources");
        this.LIZLLL.set(false);
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LJI;
        if (aRunnableS127S0100000_27 != null) {
            new BPEAHandler(Looper.getMainLooper()).removeCallbacks(aRunnableS127S0100000_27);
        }
        this.LJI = null;
        C854540Xfg c854540Xfg = this.LJFF;
        if (c854540Xfg != null) {
            try {
                C786410Ut5.LJJIFFI(this.LIZ, c854540Xfg);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                C1798620wuC.LJ("WifiScanManager", "cleanup: receiver was not registered", null);
            }
        }
        this.LJFF = null;
        this.LJ = null;
    }

    public final void LIZIZ(boolean z, boolean z2) {
        InterfaceC1798520wu2 interfaceC1798520wu2 = this.LJ;
        LIZ();
        if (interfaceC1798520wu2 != null) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyComplete: scanTriggered=");
            sbLIZ.append(true);
            sbLIZ.append(", scanSucceeded=");
            sbLIZ.append(z);
            sbLIZ.append(", isTimeout=");
            sbLIZ.append(z2);
            C1798620wuC.LIZLLL("WifiScanManager", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1798520wu2.LIZ(true, z);
        }
    }

    public C1798470wtx(Context context, WifiManager wifiManager, long j) {
        this.LIZ = context;
        this.LIZIZ = wifiManager;
        this.LIZJ = j;
    }
}
