package X;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: X.1CxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247251CxX implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener {
    public final /* synthetic */ C2247241CxW LL;

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
    }

    public C2247251CxX(C2247241CxW c2247241CxW) {
        this.LL = c2247241CxW;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C2247241CxW c2247241CxW = this.LL;
        c2247241CxW.LIZ = 7;
        C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
        if (c2247261CxY != null) {
            c2247261CxY.LJ(mediaPlayer.getDuration(), false);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C2247241CxW c2247241CxW = this.LL;
        c2247241CxW.LIZ = 2;
        C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
        if (c2247261CxY != null) {
            c2247261CxY.onPrepared();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C2247241CxW c2247241CxW = this.LL;
        c2247241CxW.LIZ = 9;
        C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
        if (c2247261CxY != null) {
            c2247261CxY.LIZJ(i, String.valueOf(i2), false);
            return true;
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        C2247261CxY c2247261CxY;
        if (i == 3 && (c2247261CxY = this.LL.LIZJ) != null) {
            c2247261CxY.LIZLLL(mediaPlayer.getDuration());
            return true;
        }
        return true;
    }
}
