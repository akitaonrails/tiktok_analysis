package X;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Uyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C789990Uyr extends PhoneStateListener {
    public final TelephonyManager LIZ;
    public final WeakReference<C790010Uyt> LIZIZ;

    public final void LIZ() throws Throwable {
        if (this.LIZ != null) {
            try {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTNetWorkListener", "start listen signal strength");
                C2204961BRm.LLILIL(this.LIZ, this, 256, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFgfamkEiHWSoOWe4IxY190E4=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("TTNetWorkListener", "listen signal strength failed");
            }
            C2204961BRm.LLILIL(this.LIZ, this, 64, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFgfamkEiHWSoOWe4IxY190E4=", null));
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C790010Uyt c790010Uyt;
        int level;
        super.onSignalStrengthsChanged(signalStrength);
        if (signalStrength != null) {
            WeakReference<C790010Uyt> weakReference = this.LIZIZ;
            if (weakReference != null) {
                c790010Uyt = weakReference.get();
                if (c790010Uyt != null && c790010Uyt.LIZ == 0) {
                    return;
                }
            } else {
                c790010Uyt = null;
            }
            try {
                level = signalStrength.getLevel();
                if (level == 0) {
                    level = 1;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("TTNetWorkListener", "failed to get signalStrength");
                level = -1;
            }
            if (c790010Uyt != null) {
                c790010Uyt.LIZ(level);
            }
        }
    }

    public C789990Uyr(Context context, C790010Uyt c790010Uyt) {
        this.LIZIZ = new WeakReference<>(c790010Uyt);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
            if (telephonyManager == null) {
                return;
            }
            this.LIZ = telephonyManager;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("TTNetWorkListener", "create telephonyManager failed");
            this.LIZ = null;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        WeakReference<C790010Uyt> weakReference;
        C790010Uyt c790010Uyt;
        super.onDataConnectionStateChanged(i, i2);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data connection state changed, state: ");
        sbLIZ.append(i);
        sbLIZ.append(", networkType: ");
        sbLIZ.append(i2);
        TTVideoEngineLog.d("TTNetWorkListener", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 2 && (weakReference = this.LIZIZ) != null && (c790010Uyt = weakReference.get()) != null && c790010Uyt.LIZ != 0) {
            c790010Uyt.LJIIIZ(C790010Uyt.LIZJ(i2));
        }
    }
}
