package X;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Mug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583560Mug {
    public final AudioManager LIZ;
    public int LIZIZ = -1;
    public C1046310dKn LIZJ;
    public InterfaceC1046330dKp LIZLLL;

    public final int LIZ() {
        AudioManager audioManager = this.LIZ;
        int streamVolume = -1;
        if (audioManager != null) {
            try {
                streamVolume = audioManager.getStreamVolume(3);
                return streamVolume;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        return streamVolume;
    }

    public C583560Mug(Context context) {
        this.LIZ = (AudioManager) C786410Ut5.H2(context, "audio");
    }
}
