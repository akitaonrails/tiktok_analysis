package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1ARZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARZ implements InterfaceC2179221AQm {
    public static final String LJIILJJIL = C1ARZ.class.getSimpleName();
    public final Context LIZ;
    public final InterfaceC2178301AMy LIZIZ;
    public MediaPlayer LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ = true;
    public C1ANF LJIIJ = C1ANF.PLAYBACK_STATE_STOPPED;
    public long LJIIJJI = Long.MIN_VALUE;
    public long LJIIL = Long.MIN_VALUE;
    public final BPEAHandler LJIILIIL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC2179221AQm
    public final int LIZ() {
        return 0;
    }

    @Override // X.InterfaceC2179221AQm
    public final long LJFF() {
        return 0L;
    }

    @Override // X.InterfaceC2179221AQm
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC2179221AQm
    public final long LIZIZ() {
        MediaPlayer mediaPlayer;
        long currentPosition = 0;
        try {
            if (this.LIZLLL && (mediaPlayer = this.LIZJ) != null) {
                currentPosition = mediaPlayer.getCurrentPosition();
                return currentPosition;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIJ();
        }
        return currentPosition;
    }

    public final void LJIIIIZZ() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.1ARa
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                C1ARZ c1arz = this.LL;
                C2178901APg.LIZIZ(C1ARZ.LJIILJJIL, "---> onPrepared()");
                c1arz.LIZLLL = true;
                c1arz.LIZIZ.LJI();
                if (c1arz.LJ) {
                    c1arz.LJIIJJI();
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.1ARb
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C1ARZ c1arz = this.LL;
                c1arz.LJIIIZ();
                C1ANF c1anf = C1ANF.PLAYBACK_STATE_STOPPED;
                c1arz.LJIIJ = c1anf;
                c1arz.LIZIZ.LJIIIIZZ(c1anf);
                c1arz.LIZIZ.LJIILL();
            }
        });
        mediaPlayer.setLooping(false);
        this.LIZJ = mediaPlayer;
    }

    public final void LJIIIZ() {
        C2178901APg.LIZIZ(LJIILJJIL, " ---> resetFlags()");
        this.LJIIIZ = true;
        this.LJ = false;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
        LJIIL(false);
    }

    public final void LJIIJ() {
        MediaPlayer mediaPlayer = this.LIZJ;
        if (mediaPlayer != null) {
            LJIIIZ();
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnSeekCompleteListener(null);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.LIZJ = null;
    }

    public final void LJIIJJI() {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> start(), startPlayTime: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",   mIsStart: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(",   mIsPendingStart: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",   mIsPrepared: ");
        sbLIZ.append(this.LIZLLL);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        long j = this.LJFF;
        if (j > 0) {
            LJI(j, null);
            this.LJFF = 0L;
        }
        try {
            MediaPlayer mediaPlayer = this.LIZJ;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.LJI = true;
            this.LJ = false;
            this.LJII = false;
            this.LJIIIZ = false;
            C1ANF c1anf = C1ANF.PLAYBACK_STATE_PLAYING;
            this.LJIIJ = c1anf;
            this.LIZIZ.LJIIIIZZ(c1anf);
            LJIIL(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(str, th.getMessage());
            this.LIZIZ.LJFF(C1AN0.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final long getDuration() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.LIZLLL || (mediaPlayer = this.LIZJ) == null) {
                return 0L;
            }
            return mediaPlayer.getDuration();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(LJIILJJIL, th.getMessage());
            LJIIJ();
            return 0L;
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void pause() {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> pause(), mIsStarted: ");
        sbLIZ.append(this.LJI);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJI) {
            try {
                MediaPlayer mediaPlayer = this.LIZJ;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2178901APg.LIZ(str, th.getMessage());
                LJIIJ();
            }
            this.LJII = true;
            this.LJI = false;
            this.LJ = false;
            this.LJIIIZ = false;
            C1ANF c1anf = C1ANF.PLAYBACK_STATE_PAUSED;
            this.LJIIJ = c1anf;
            this.LIZIZ.LJIIIIZZ(c1anf);
            LJIIL(false);
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void release() {
        C2178901APg.LIZIZ(LJIILJJIL, " ---> release()");
        LJIIJ();
    }

    @Override // X.InterfaceC2179221AQm
    public final void resume() {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> resume(), mIsPaused: ");
        sbLIZ.append(this.LJII);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJII) {
            LJIIJJI();
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void stop() {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> stop(), mIsStopped: ");
        sbLIZ.append(this.LJIIIZ);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIIZ) {
            return;
        }
        try {
            MediaPlayer mediaPlayer = this.LIZJ;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            C1ANF c1anf = C1ANF.PLAYBACK_STATE_STOPPED;
            this.LJIIJ = c1anf;
            this.LIZIZ.LJIIIIZZ(c1anf);
            LJIIIZ();
            MediaPlayer mediaPlayer2 = this.LIZJ;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnSeekCompleteListener(null);
            }
            MediaPlayer mediaPlayer3 = this.LIZJ;
            if (mediaPlayer3 != null) {
                mediaPlayer3.seekTo(0);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(str, th.getMessage());
            LJIIJ();
        }
    }

    public final void LJIILIIL() {
        long jLIZIZ = LIZIZ();
        if (jLIZIZ != this.LJIIJJI) {
            this.LIZIZ.LJIIJJI(jLIZIZ);
            if (Math.abs(jLIZIZ - this.LJIIL) >= 500) {
                this.LIZIZ.LJIIJ(jLIZIZ);
                this.LJIIL = jLIZIZ;
            }
            this.LJIIJJI = jLIZIZ;
        }
        C786410Ut5.LJLIIIL(this.LJIILIIL, new ARunnableS133S0100000_33(this, 109), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // X.InterfaceC2179221AQm
    public final C1ANF LJIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC2179221AQm
    public final void LIZLLL(long j) {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> play(), startPlayTime: ");
        sbLIZ.append(j);
        sbLIZ.append(",   mIsStart: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(",   mIsPendingStart: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",   mIsPrepared: ");
        sbLIZ.append(this.LIZLLL);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJI && !this.LJ) {
            this.LJFF = j;
            if (this.LIZLLL) {
                LJIIJJI();
            } else {
                this.LJ = true;
            }
        }
    }

    public final void LJIIL(boolean z) {
        if (z) {
            C786410Ut5.LJLIIIL(this.LJIILIIL, new ARunnableS133S0100000_33(this, 108), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LJIILIIL.removeCallbacksAndMessages(this);
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIJ(String str) {
        LJIJI(str);
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIJI(String str) {
        String str2 = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> setDirectURL(), url is ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (this.LIZJ == null) {
                C2178901APg.LIZIZ(str2, "mediaplayer is null ---> createMediaPlayer");
                LJIIIIZZ();
            }
            MediaPlayer mediaPlayer = this.LIZJ;
            if (mediaPlayer != null) {
                this.LIZLLL = false;
                mediaPlayer.reset();
                if (str == null || !u.LJJIIJZLJL(str, "http", false)) {
                    mediaPlayer.setDataSource(this.LIZ, UriProtector.parse(str));
                } else {
                    mediaPlayer.setDataSource(str);
                }
                this.LIZIZ.LJIIIZ();
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(str2, th.getMessage());
            this.LIZIZ.LJFF(C1AN0.INVALIDATE_PLAYER_MODEL);
        }
    }

    public C1ARZ(Context context, C2179181AQi c2179181AQi) {
        this.LIZ = context;
        this.LIZIZ = c2179181AQi;
    }

    @Override // X.InterfaceC2179221AQm
    public final void LIZJ(EnumC2281151EQn enumC2281151EQn, C1470240oMY c1470240oMY) {
        C2178901APg.LIZ(LJIILJJIL, "light player not support VideoModel src Type");
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJ(String str, String str2) {
        LJIJI(str);
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJI(final long j, final C2179171AQh c2179171AQh) {
        String str = LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> seekToTime(), time: ");
        sbLIZ.append(j);
        sbLIZ.append(",   mIsSeeking: ");
        sbLIZ.append(this.LJIIIIZZ);
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJIIIIZZ && j >= 0) {
            this.LJIIIIZZ = true;
            LJIIL(false);
            try {
                MediaPlayer mediaPlayer = this.LIZJ;
                if (mediaPlayer != null) {
                    mediaPlayer.seekTo((int) j);
                }
                MediaPlayer mediaPlayer2 = this.LIZJ;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: X.1ARc
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer3) {
                            InterfaceC2178281AMw interfaceC2178281AMw = c2179171AQh;
                            long j2 = j;
                            C1ARZ c1arz = this;
                            if (interfaceC2178281AMw != null) {
                                interfaceC2178281AMw.LIZ(j2, true);
                            }
                            c1arz.LJIIL(true);
                            c1arz.LJIIIIZZ = false;
                        }
                    });
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2178901APg.LIZ(str, th.getMessage());
                LJIIJ();
                return;
            }
        }
        if (c2179171AQh != null) {
            c2179171AQh.LIZ(j, false);
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIIZILJ(FileDescriptor fileDescriptor, long j, long j2) {
        String str = LJIILJJIL;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" ---> setDataSource(), file descriptor is ");
            sbLIZ.append(fileDescriptor);
            C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZJ == null) {
                C2178901APg.LIZIZ(str, "mediaplayer is null ---> createMediaPlayer");
                LJIIIIZZ();
            }
            MediaPlayer mediaPlayer = this.LIZJ;
            if (mediaPlayer != null) {
                this.LIZLLL = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(fileDescriptor, j, j2);
                this.LIZIZ.LJIIIZ();
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(str, th.getMessage());
            this.LIZIZ.LJFF(C1AN0.INVALIDATE_PLAYER_MODEL);
        }
    }
}
