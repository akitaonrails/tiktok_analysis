package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468040oJ0 {
    public static C1468040oJ0 LJI;
    public final Context LIZ;
    public C1469100oKi LIZLLL;
    public volatile boolean LJFF;
    public final List<InterfaceC1468050oJ1> LIZJ = new ArrayList();
    public volatile int LJ = 65280;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public final boolean LIZIZ() {
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        return (this.LJ & 1) != 0;
    }

    public final boolean LIZJ() {
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        return (this.LJ & 2) != 0;
    }

    public C1468040oJ0(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    public final int LIZ(Context context) {
        if (C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 4L) && !this.LJFF) {
            return 1;
        }
        try {
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
            if (audioManager == null) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("HeadsetStateMonitor", "AudioManager is null");
                return 65280;
            }
            if (Build.VERSION.SDK_INT == 25) {
                boolean zIsWiredHeadsetOn = audioManager.isWiredHeadsetOn();
                if (!audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn()) {
                    return zIsWiredHeadsetOn ? 1 : 0;
                }
                return (zIsWiredHeadsetOn ? 1 : 0) | 2;
            }
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            int i2 = 0;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                    i2 |= 1;
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wired device: ");
                    sbLIZ.append((Object) audioDeviceInfo.getProductName());
                    TTVideoEngineLog.d("HeadsetStateMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                    i2 |= 2;
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("bluetooth device: ");
                    sbLIZ2.append((Object) audioDeviceInfo.getProductName());
                    TTVideoEngineLog.d("HeadsetStateMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            return i2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 65280;
        }
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (((ArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        for (int i = 0; i < ((ArrayList) this.LIZJ).size(); i++) {
            try {
                InterfaceC1468050oJ1 interfaceC1468050oJ1 = (InterfaceC1468050oJ1) ((ArrayList) this.LIZJ).get(i);
                if (interfaceC1468050oJ1 != null) {
                    if (!LIZIZ() && !LIZJ()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    interfaceC1468050oJ1.LIZ(z2, z);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public final void LJ(int i) {
        boolean z;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConnected, ");
        sbLIZ.append(i);
        TTVideoEngineLog.d("HeadsetStateMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        int i3 = this.LJ | i;
        if (i3 == this.LJ) {
            return;
        }
        this.LJ = i3;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL(z);
    }

    public final void LJFF(int i) {
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("HeadsetStateMonitor", "onDisconnected");
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        int i3 = (~i) & this.LJ;
        if (i3 == this.LJ) {
            return;
        }
        this.LJ = i3;
        LIZLLL(LIZJ());
    }

    public static void LJI(BPEAHandler bPEAHandler, Runnable runnable) {
        if (Looper.myLooper() == bPEAHandler.getLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }
}
