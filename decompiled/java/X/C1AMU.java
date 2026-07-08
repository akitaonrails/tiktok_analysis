package X;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AMU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMU {
    public AudioManager LIZ;
    public final C1AMV LIZIZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.1AMV
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1AMV] */
    public C1AMU(Context context) {
        this.LIZ = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(context), "audio");
    }

    public final void LIZ(Context context) {
        C1AMV c1amv;
        try {
            if (this.LIZ == null) {
                this.LIZ = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(context), "audio");
            }
            AudioManager audioManager = this.LIZ;
            if (audioManager != null && (c1amv = this.LIZIZ) != null) {
                audioManager.abandonAudioFocus(c1amv);
            }
            this.LIZ = null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(Context context) {
        C1AMV c1amv;
        try {
            if (this.LIZ == null) {
                this.LIZ = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(context), "audio");
            }
            AudioManager audioManager = this.LIZ;
            if (audioManager != null && (c1amv = this.LIZIZ) != null) {
                C786410Ut5.q4(audioManager, c1amv, 3, 2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
