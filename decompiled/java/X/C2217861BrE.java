package X;

import android.media.AudioTrack;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.1BrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217861BrE {
    public final C2217871BrF LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final void LIZ() {
        if (this.LIZ != null) {
            LIZIZ(0);
        }
    }

    public C2217861BrE(AudioTrack audioTrack) {
        if (C1285020jXo.LIZ >= 19) {
            this.LIZ = new C2217871BrF(audioTrack);
            LIZ();
        } else {
            this.LIZ = null;
            LIZIZ(3);
        }
    }

    public final void LIZIZ(int i) {
        this.LIZIZ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.LIZLLL = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.LIZLLL = 10000000L;
                return;
            }
            this.LIZLLL = Mp4ScreenVideoLoadTimeout.CONTROL;
            return;
        }
        this.LJ = 0L;
        this.LJFF = -1L;
        this.LIZJ = System.nanoTime() / 1000;
        this.LIZLLL = Mp4ScreenVideoLoadTimeout.CONTROL;
    }
}
