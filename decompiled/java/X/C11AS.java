package X;

import Y.ARunnableS40S0101000_29;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.11AS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AS {
    public final MediaPlayer LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler();
    public C19456511Ad LIZJ;
    public ARunnableS40S0101000_29 LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        ARunnableS40S0101000_29 aRunnableS40S0101000_29 = this.LIZLLL;
        if (aRunnableS40S0101000_29 != null) {
            this.LIZIZ.removeCallbacks(aRunnableS40S0101000_29);
        }
    }

    public C11AS(Context context, Uri uri) {
        this.LIZ = MediaPlayer.create(context, uri);
    }
}
