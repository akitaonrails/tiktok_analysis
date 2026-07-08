package X;

import android.media.AudioAttributes;
import android.media.MediaPlayer;

/* JADX INFO: renamed from: X.1CxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247241CxW {
    public int LIZ;
    public final MediaPlayer LIZIZ;
    public C2247261CxY LIZJ;

    public C2247241CxW() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.LIZIZ = mediaPlayer;
        C2247251CxX c2247251CxX = new C2247251CxX(this);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build());
        mediaPlayer.setOnPreparedListener(c2247251CxX);
        mediaPlayer.setOnBufferingUpdateListener(c2247251CxX);
        mediaPlayer.setOnInfoListener(c2247251CxX);
        mediaPlayer.setOnSeekCompleteListener(c2247251CxX);
        mediaPlayer.setOnCompletionListener(c2247251CxX);
        mediaPlayer.setOnVideoSizeChangedListener(c2247251CxX);
        mediaPlayer.setOnErrorListener(c2247251CxX);
        this.LIZ = 0;
    }
}
