package X;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import com.bytedance.android.livesdk.broadcast.notification.BroadcastKeepAliveService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19397410ui {
    public final SoundPool LIZ;
    public final int LIZIZ;
    public AudioManager LIZJ;
    public boolean LIZLLL;
    public final C19397510uj LJ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.10uj
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            try {
                if (i != -3) {
                    if (i != -2) {
                        if (i != -1) {
                            if (i == 1) {
                                C19397410ui c19397410ui = this.LL;
                                c19397410ui.LIZ.resume(c19397410ui.LIZIZ);
                                return;
                            }
                            return;
                        }
                        C19397410ui c19397410ui2 = this.LL;
                        c19397410ui2.LIZ.stop(c19397410ui2.LIZIZ);
                        this.LL.LIZ();
                        return;
                    }
                    C19397410ui c19397410ui3 = this.LL;
                    c19397410ui3.LIZ.pause(c19397410ui3.LIZIZ);
                    return;
                }
                C19397410ui c19397410ui4 = this.LL;
                c19397410ui4.LIZ.setVolume(c19397410ui4.LIZIZ, 0.5f, 0.5f);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    };

    public final void LIZ() {
        AudioManager audioManager;
        if (this.LIZLLL) {
            try {
                if (Build.VERSION.SDK_INT < 26 && (audioManager = this.LIZJ) != null) {
                    audioManager.abandonAudioFocus(this.LJ);
                }
                this.LIZLLL = false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10uj] */
    public C19397410ui(BroadcastKeepAliveService broadcastKeepAliveService, SoundPool soundPool, int i) {
        this.LIZ = soundPool;
        this.LIZIZ = i;
    }
}
