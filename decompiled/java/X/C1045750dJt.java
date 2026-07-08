package X;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045750dJt {
    public final AudioManager LIZ;
    public C1045920dKA LIZIZ;
    public C1046290dKl LIZJ;

    public final int LIZ() {
        int streamVolume = -1;
        try {
            AudioManager audioManager = this.LIZ;
            if (audioManager != null) {
                streamVolume = audioManager.getStreamVolume(3);
                return streamVolume;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return streamVolume;
    }

    public C1045750dJt(Context context) {
        this.LIZ = (AudioManager) C446980Hfs.LIZIZ(context, AudioManager.class);
    }
}
