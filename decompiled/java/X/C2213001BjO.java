package X;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213001BjO {
    public C2213121Bja LIZ;
    public C2212951BjJ LIZIZ;
    public final Context LIZJ;
    public final AudioManager LIZLLL;
    public boolean LJ;

    public final int LIZ() {
        int streamVolume = -1;
        try {
            AudioManager audioManager = this.LIZLLL;
            if (audioManager == null) {
                return -1;
            }
            streamVolume = audioManager.getStreamVolume(3);
            return streamVolume;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2212291BiF.LIZLLL().LIZ("key_exception_volume_npe", e);
            return streamVolume;
        }
    }

    public C2213001BjO(Context context) {
        this.LIZJ = context;
        this.LIZLLL = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(context), "audio");
    }
}
