package X;

import Y.ARunnableS10S0102000_23;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493010oxH implements InterfaceC1492980oxE {
    public volatile int LIZ = -1;
    public final Map<InterfaceC1493130oxT, Handler> LIZIZ = new HashMap();

    public C1493010oxH() {
        TTWiFiCellSwitcher.inst().registerObserver(this, null);
    }

    @Override // X.InterfaceC1492980oxE
    public final void LIZ(EnumC1493060oxM enumC1493060oxM) {
        int i;
        switch (C1493050oxL.LIZ[enumC1493060oxM.ordinal()]) {
            case 1:
            case 2:
                i = 2;
                break;
            case 3:
            case 4:
            case 5:
                i = 0;
                break;
            case 6:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            default:
                i = -1;
                break;
        }
        if (this.LIZ != i) {
            synchronized (this) {
                try {
                    for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                        InterfaceC1493130oxT interfaceC1493130oxT = (InterfaceC1493130oxT) entry.getKey();
                        Handler handler = (Handler) entry.getValue();
                        ARunnableS10S0102000_23 aRunnableS10S0102000_23 = new ARunnableS10S0102000_23(this, i, interfaceC1493130oxT, 1);
                        if (handler != null) {
                            C786410Ut5.LJJZZIII(handler, aRunnableS10S0102000_23);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZ = i;
        }
    }
}
