package X;

import android.media.MediaPlayer;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.15ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20548315ar extends AbsSafelyRenderEngine implements MediaPlayer.OnPreparedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener {
    public MediaPlayer LLJILJILJ;
    public Boolean LLJJ;
    public final AtomicBoolean LLJILLL = new AtomicBoolean(false);
    public final AtomicBoolean LLJJI = new AtomicBoolean(false);
    public final AtomicBoolean LLJJIII = new AtomicBoolean(false);
    public long LLJJIJI = -1;

    @Override // com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine
    public final long LIZLLL() {
        try {
            MediaPlayer mediaPlayer = this.LLJILJILJ;
            if (mediaPlayer == null) {
                return 0L;
            }
            long currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition < 0) {
                return 0L;
            }
            return currentPosition;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    public static void LJIIIZ(String str) {
        C576730Mjf.LJIIIZ("MediaPlayer", str);
    }

    public static void LJIIJJI(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pause: exception: ");
                sbLIZ.append(e);
                C576730Mjf.LJIIJ("MediaPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJIIL(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start: exception: ");
                sbLIZ.append(e);
                C576730Mjf.LJIIJ("MediaPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine
    public final boolean LJFF(long j) {
        MediaPlayer mediaPlayer = this.LLJILJILJ;
        if (mediaPlayer != null && this.LLJJIII.get() && !this.LLJILLL.get()) {
            if (Math.abs(LIZLLL() - j) <= 10.0d) {
                LJ(6);
                return false;
            }
            try {
                mediaPlayer.seekTo((int) j);
                return true;
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSeek exception: ");
                sbLIZ.append(e);
                C576730Mjf.LJIIJ("MediaPlayer", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIJ(String str) {
        boolean z;
        MediaPlayer mediaPlayer = this.LLJILJILJ;
        if (mediaPlayer != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("call releasePlayer() cause by ");
            sbLIZ.append(str);
            LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                mediaPlayer.setOnVideoSizeChangedListener(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                mediaPlayer.setOnPreparedListener(null);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                mediaPlayer.stop();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                mediaPlayer.release();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            z = true;
        } else {
            z = false;
        }
        LJIILIIL(this.LLJILJILJ, null);
        this.LLJILJILJ = null;
        this.LLJJI.set(false);
        this.LLJJIII.set(false);
        return z;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        LJII("onCompletion()");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.LLJILLL.get() && mediaPlayer == this.LLJILJILJ) {
            LJIIIZ("MediaPlayer onPrepared finish");
            this.LLJJIJI = mediaPlayer.getDuration();
            LJ(5);
            LJIIL(mediaPlayer);
            if (!this.LL) {
                LJIIJJI(mediaPlayer);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        LJIIIZ("onSeekComplete(MediaPlayer)");
        LJ(6);
    }

    @Override // com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine
    public final boolean LJI(String str, Surface surface) throws IOException {
        boolean z;
        if (this.LLJILJILJ == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            this.LLJILJILJ = mediaPlayer;
            LJIIIZ("mediaPlayer <init>");
            z = true;
        } else {
            z = false;
        }
        MediaPlayer mediaPlayer2 = this.LLJILJILJ;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setSurface(surface);
        }
        if (!this.LLJJIII.getAndSet(true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mediaPlayer setDataSource path = ");
            sbLIZ.append(str);
            LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            MediaPlayer mediaPlayer3 = this.LLJILJILJ;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDataSource(str);
            }
            MediaPlayer mediaPlayer4 = this.LLJILJILJ;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            return true;
        }
        return z;
    }

    public final void LJIILIIL(MediaPlayer mediaPlayer, Boolean bool) {
        int i;
        if (mediaPlayer == null) {
            LJIIIZ("mediaPlayer updateBuffering ignore mp is null");
            return;
        }
        if (mediaPlayer != this.LLJILJILJ) {
            LJIIIZ("mediaPlayer updateBuffering ignore (mp != mediaPlayer)");
            return;
        }
        if (this.LLJILLL.get()) {
            bool = null;
        }
        if (this.LLJJ != bool) {
            this.LLJJ = bool;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                LJ(i);
                if (this.LLJJI.getAndSet(false)) {
                    LJ(3);
                }
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        boolean z;
        if (i < 100) {
            z = true;
        } else {
            z = false;
        }
        LJIILIIL(mediaPlayer, Boolean.valueOf(z));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.LLJILLL.get()) {
            LJIIIZ("mediaPlayer onInfo ignore (isStop.get())");
            return false;
        }
        if (mediaPlayer != this.LLJILJILJ) {
            LJIIIZ("mediaPlayer onInfo ignore (mp != mediaPlayer)");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mediaPlayer onInfo what = ");
        sbLIZ.append(i);
        sbLIZ.append(",extra = ");
        sbLIZ.append(i2);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i != 3) {
            if (i != 701) {
                if (i != 702) {
                    return false;
                }
            } else {
                LJIILIIL(mediaPlayer, Boolean.TRUE);
                return false;
            }
        }
        LJIILIIL(mediaPlayer, Boolean.FALSE);
        return false;
    }
}
