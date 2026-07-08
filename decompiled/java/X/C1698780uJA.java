package X;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698780uJA {
    public final Context LIZ;
    public InterfaceC1470080oMI LIZIZ = null;
    public float LIZJ;

    public final float LIZ() {
        int iZ3;
        Context context = this.LIZ;
        if (context == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        int i = 0;
        if (audioManager != null) {
            try {
                iZ3 = C786410Ut5.Z3(audioManager, 3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iZ3 = 0;
            }
            if (iZ3 >= 0) {
                i = iZ3;
            }
        } else {
            iZ3 = 0;
            i = iZ3;
        }
        return i;
    }

    public final float LIZIZ() {
        int streamVolume;
        AudioManager audioManager;
        Context context = this.LIZ;
        if (context == null) {
            return 0.0f;
        }
        int i = 0;
        try {
            audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (audioManager != null) {
            streamVolume = audioManager.getStreamVolume(3);
            if (streamVolume < 0) {
            }
            return i;
        }
        streamVolume = 0;
        i = streamVolume;
        return i;
    }

    public C1698780uJA(Context context) {
        this.LIZ = context;
    }
}
