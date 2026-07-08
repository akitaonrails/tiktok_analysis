package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;

/* JADX INFO: renamed from: X.0Uuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787360Uuc {
    public final LiveLoggerService LIZ;
    public final Context LIZIZ;
    public final AudioManager LIZJ;
    public final C787350Uub LIZLLL;
    public int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;

    public final int LIZ() {
        int streamVolume;
        AudioManager audioManager = this.LIZJ;
        if (audioManager == null || (streamVolume = audioManager.getStreamVolume(3)) < 0) {
            return 0;
        }
        return streamVolume;
    }

    public final void LIZIZ() {
        if (this.LIZLLL == null || this.LIZIZ == null) {
            return;
        }
        this.LJ = LIZ();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        C786410Ut5.LJIJJ(this.LIZIZ, this.LIZLLL, intentFilter);
        this.LJFF = true;
        C1698940uJQ.LIZJ();
    }

    public final void LIZJ() {
        Context context;
        C787350Uub c787350Uub = this.LIZLLL;
        if (c787350Uub == null || (context = this.LIZIZ) == null || !this.LJFF) {
            return;
        }
        C786410Ut5.LJJIFFI(context, c787350Uub);
        this.LJFF = false;
        C1698940uJQ.LIZJ();
    }

    public C787360Uuc(Context context, LiveLoggerService liveLoggerService) {
        this.LJI = Integer.MAX_VALUE;
        this.LIZ = liveLoggerService;
        this.LIZIZ = context;
        if (context != null) {
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
            this.LIZJ = audioManager;
            if (audioManager != null) {
                this.LJI = C786410Ut5.Z3(audioManager, 3);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.LJII = audioManager.getStreamMinVolume(3);
                }
            }
            C787350Uub c787350Uub = new C787350Uub();
            this.LIZLLL = c787350Uub;
            c787350Uub.LIZ = this;
        }
    }
}
