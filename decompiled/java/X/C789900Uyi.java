package X;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.AndroidCellularSignalStrength;

/* JADX INFO: renamed from: X.0Uyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C789900Uyi extends PhoneStateListener implements InterfaceC789910Uyj {
    public final /* synthetic */ AndroidCellularSignalStrength LIZ;

    public C789900Uyi(AndroidCellularSignalStrength androidCellularSignalStrength) throws Throwable {
        this.LIZ = androidCellularSignalStrength;
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C787230UuP.LIZ, "phone");
        if (telephonyManager.getSimState() != 5) {
            return;
        }
        ApplicationStatus.LIZIZ(this);
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1) {
            C2204961BRm.LLILIL(telephonyManager, this, 256, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLarP8L/ol9hn01R6AvlrU9NuBzN17cgE=", null));
        } else {
            if (stateForApplication != 2) {
                return;
            }
            androidCellularSignalStrength.LIZ = Integer.MIN_VALUE;
            C2204961BRm.LLILIL(telephonyManager, this, 0, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLarP8L/ol9hn01R6AvlrU9NuBzN17cgE=", null));
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (ApplicationStatus.getStateForApplication() != 1) {
            return;
        }
        try {
            this.LIZ.LIZ = signalStrength.getLevel();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZ = Integer.MIN_VALUE;
        }
    }
}
