package X;

import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351800lHW {
    public static boolean LIZIZ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(446));
    public static final C1351780lHU LIZJ = C1351780lHU.LL;
    public static final C1351810lHX LIZLLL = new C1351810lHX(new InterfaceC1351830lHZ() { // from class: X.0lHV
        @Override // X.InterfaceC1351830lHZ
        public final void LIZ() {
            C1348320lBu.LIZ.LIZIZ("headset_disconnected");
        }
    });

    public static C583750Muz LIZ() {
        return (C583750Muz) LIZ.getValue();
    }

    public static void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioStopped: reason=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C19393310u3.LIZ.remove(LIZJ);
        LIZLLL.LIZ();
        if (Intrinsics.LJFF(str, "play_another_audio")) {
            LIZ().LIZ();
        } else {
            LIZ().LIZJ();
        }
    }

    public static void LIZJ(Context context, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartAudio: isContinue=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ().LIZIZ(null, z);
        C19393310u3.LIZ(context, LIZJ);
        C1351810lHX c1351810lHX = LIZLLL;
        if (!c1351810lHX.LIZIZ) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            try {
                C786410Ut5.LJIJJ(C1383370m6R.LIZ, c1351810lHX.LIZJ, intentFilter);
                c1351810lHX.LIZIZ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error registering headset receiver: ");
                sbLIZ2.append(e.getMessage());
                C1344030l4z.LIZ("HeadsetReceiverHelper", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
