package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.player.PlayerContext;

/* JADX INFO: renamed from: X.15ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20547215ag implements InterfaceC1304250k2p, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnSeekCompleteListener {
    public final MediaPlayer LL;
    public InterfaceC1304230k2n LLILLJJLI;
    public final Context LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public double LLIZ;

    @Override // X.InterfaceC1304250k2p
    public final void getRotation() {
    }

    @Override // X.InterfaceC1304250k2p
    public final double LIZLLL() {
        return !this.LL.isPlaying() ? this.LLIZ : ((double) this.LL.getCurrentPosition()) / 1000.0d;
    }

    @Override // X.InterfaceC1304250k2p
    public final double LJIIJ() {
        try {
            return this.LL.getPlaybackParams().getSpeed();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPlaybackRate exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
            return 1.0d;
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean LJIILJJIL() {
        return this.LL.isLooping();
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean isPlaying() {
        return this.LL.isPlaying();
    }

    @Override // X.InterfaceC1304250k2p
    public final void pause() {
        try {
            this.LLIZ = ((double) this.LL.getCurrentPosition()) / 1000.0d;
            this.LL.pause();
            InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
            if (interfaceC1304230k2n != null) {
                ((PlayerContext) interfaceC1304230k2n).LIZ(6, null);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void play() {
        try {
            this.LL.start();
            InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
            if (interfaceC1304230k2n != null) {
                ((PlayerContext) interfaceC1304230k2n).LIZ(5, null);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void prepare() {
        try {
            this.LL.prepareAsync();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareAsync exception: ");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("prepareAsync exception:");
            sbLIZ2.append(e.getMessage());
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void release() {
        try {
            this.LL.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final int getDuration() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoWidth() {
        return this.LLILZ;
    }

    public C20547215ag(Context context) {
        this.LLILLL = context;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.LL = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnInfoListener(this);
    }

    @Override // X.InterfaceC1304250k2p
    public final void LIZ(double d) {
        float f = (float) d;
        this.LL.setVolume(f, f);
    }

    public final void LIZIZ(String str) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZIZ(new Error(str));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJFF(double d) {
        try {
            PlaybackParams playbackParams = this.LL.getPlaybackParams();
            playbackParams.setSpeed((float) d);
            this.LL.setPlaybackParams(playbackParams);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPlaybackRate exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIILLIIL(InterfaceC1304230k2n interfaceC1304230k2n) {
        this.LLILLJJLI = interfaceC1304230k2n;
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIIZILJ(double d) {
        int i = (int) (d * 1000.0d);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.LL.seekTo(i, 3);
            } else {
                this.LL.seekTo(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("seekTo exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(1, null);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C1288370jdD.LIZJ("Player default", "onPrepared");
        if (this.LLILLJJLI != null) {
            this.LLILZ = this.LL.getVideoWidth();
            this.LLILZIL = this.LL.getVideoHeight();
            this.LLILZLL = this.LL.getDuration();
            PlayerContext playerContext = (PlayerContext) this.LLILLJJLI;
            playerContext.LJ = true;
            playerContext.LIZ(0, null);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(4, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void setDataSource(String str) {
        try {
            this.LL.reset();
            this.LLIZ = 0.0d;
            try {
                this.LL.setDataSource(this.LLILLL, UriProtector.parse(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setDataSource exception: ");
                sbLIZ.append(e.getMessage());
                C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setDataSource exception:");
                sbLIZ2.append(e.getMessage());
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reset exception: ");
            sbLIZ3.append(e2.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("reset exception:");
            sbLIZ4.append(e2.getMessage());
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void setLooping(boolean z) {
        this.LL.setLooping(z);
    }

    @Override // X.InterfaceC1304250k2p
    public final void setSurface(Surface surface) {
        try {
            this.LL.setSurface(surface);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurface exception:");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError what ");
        sbLIZ.append(i);
        sbLIZ.append(" extra ");
        sbLIZ.append(i2);
        C1288370jdD.LIZJ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("what: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", extra: ");
        sbLIZ2.append(i2);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInfo what ");
        sbLIZ.append(i);
        sbLIZ.append(" extra ");
        sbLIZ.append(i2);
        C1288370jdD.LIZJ("Player default", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 3) {
            InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
            if (interfaceC1304230k2n != null) {
                ((PlayerContext) interfaceC1304230k2n).LIZ(3, null);
                return true;
            }
            return true;
        }
        return false;
    }
}
