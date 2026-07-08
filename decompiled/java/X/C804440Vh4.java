package X;

import Y.ARunnableS75S0200000_6;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Vh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804440Vh4 implements InterfaceC804430Vh3 {
    public NetworkInfo LIZ;
    public EnumC804620VhM LIZIZ = EnumC804620VhM.NONE;
    public C0O0L LIZJ = C0O0L.UNKNOWN;
    public final ArrayList<C0H62> LIZLLL = new ArrayList<>();

    public final boolean LIZIZ() {
        boolean z;
        synchronized (C804440Vh4.class) {
            try {
                NetworkInfo networkInfo = this.LIZ;
                z = networkInfo != null && networkInfo.isAvailable();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LIZJ() {
        boolean z;
        synchronized (C804440Vh4.class) {
            try {
                NetworkInfo networkInfo = this.LIZ;
                z = false;
                if (networkInfo != null && networkInfo.isAvailable() && 1 == C2204961BRm.LJLLILLLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFVr3I2KuwEau+dnqVaHs0PDFS1g==", null))) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public C804440Vh4() throws Throwable {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(C2213981Bky.LIZIZ.getApplicationContext(), "connectivity"));
            this.LIZ = networkInfoLJIJ;
            LJFF(networkInfoLJIJ);
            C804420Vh2.LIZ = this;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(C0H62 c0h62) {
        this.LIZLLL.add(c0h62);
    }

    public final void LIZLLL(C0H62 c0h62) {
        this.LIZLLL.remove(c0h62);
    }

    public final void LJ(C0O0L c0o0l) {
        C09UZ.LIZJ(new ARunnableS75S0200000_6(this, c0o0l, 98));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void LJFF(NetworkInfo networkInfo) throws Throwable {
        int iLLIILII;
        if (networkInfo != null && networkInfo.isAvailable()) {
            int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFVr3I2KuwEau+dnqVaHs0PDFS1g==", null));
            if (1 == iLJLLILLLL) {
                this.LIZIZ = EnumC804620VhM.WIFI;
                return;
            }
            if (iLJLLILLLL == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C2213981Bky.LIZIZ.getApplicationContext(), "phone");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (!C804370Vgx.LIZ.getAndSet(true)) {
                        C804370Vgx.LIZ().LIZIZ();
                    }
                    iLLIILII = C804370Vgx.LIZ().LIZ();
                    if (C804370Vgx.LIZJ || iLLIILII != -1) {
                    }
                    this.LIZIZ = EnumC804620VhM.MOBILE;
                    return;
                }
                iLLIILII = C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFVr3I2KuwEau+dnqVaHs0PDFS1g==", null));
                switch (iLLIILII) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case 14:
                    case 15:
                        this.LIZIZ = EnumC804620VhM.MOBILE_3G;
                        this.LIZIZ = EnumC804620VhM.MOBILE_4G;
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        this.LIZIZ = EnumC804620VhM.MOBILE_4G;
                        break;
                }
                this.LIZIZ = EnumC804620VhM.MOBILE;
                return;
            }
            this.LIZIZ = EnumC804620VhM.MOBILE;
            return;
        }
        this.LIZIZ = EnumC804620VhM.NONE;
    }
}
