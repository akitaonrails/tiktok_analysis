package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.s;
import java.io.IOException;

/* JADX INFO: renamed from: X.15ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20547315ah extends AbstractC1470440oMs {
    public MediaPlayer LL;
    public InterfaceC1470080oMI LLILLJJLI;

    @Override // X.AbstractC1470440oMs
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC1470440oMs
    public final int LIZ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getCurrentPosition();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AbstractC1470440oMs
    public final int LIZIZ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getDuration();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AbstractC1470440oMs
    public final int LJI() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoHeight();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AbstractC1470440oMs
    public final int LJII() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoWidth();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AbstractC1470440oMs
    public final boolean LJIIIIZZ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIIZ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIJ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIJJI() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LL = null;
                throw th;
            }
            this.LL = null;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIL() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJI() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setScreenOnWhilePlaying(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIIJ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIIJZLJL() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final synchronized C20547315ah LJJIIZ(C1470420oMq c1470420oMq) {
        C20547315ah c20547315ah;
        c20547315ah = new C20547315ah();
        c20547315ah.LL = new MediaPlayer();
        c20547315ah.LLILLJJLI = c1470420oMq;
        return c20547315ah;
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIILIIL(int i) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJ(boolean z) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJI(final InterfaceC1470900oNc interfaceC1470900oNc) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            final InterfaceC1470080oMI interfaceC1470080oMI = this.LLILLJJLI;
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(interfaceC1470900oNc, interfaceC1470080oMI) { // from class: X.15ai
                public final InterfaceC1470900oNc LL;
                public final InterfaceC1470080oMI LLILLJJLI;

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    this.LL.LIZ(this.LLILLJJLI);
                }

                {
                    this.LLILLJJLI = interfaceC1470080oMI;
                    this.LL = interfaceC1470900oNc;
                }
            });
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJJ(final InterfaceC1470910oNd interfaceC1470910oNd) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            final InterfaceC1470080oMI interfaceC1470080oMI = this.LLILLJJLI;
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener(interfaceC1470910oNd, interfaceC1470080oMI) { // from class: X.15aj
                public final InterfaceC1470910oNd LL;
                public final InterfaceC1470080oMI LLILLJJLI;

                {
                    this.LLILLJJLI = interfaceC1470080oMI;
                    this.LL = interfaceC1470910oNd;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return this.LL.LIZLLL(this.LLILLJJLI, i, i2);
                }
            });
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJJLI(final InterfaceC1470920oNe interfaceC1470920oNe) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            final InterfaceC1470080oMI interfaceC1470080oMI = this.LLILLJJLI;
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener(interfaceC1470920oNe, interfaceC1470080oMI) { // from class: X.15ak
                public final InterfaceC1470920oNe LL;
                public final InterfaceC1470080oMI LLILLJJLI;

                {
                    this.LLILLJJLI = interfaceC1470080oMI;
                    this.LL = interfaceC1470920oNe;
                }

                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return this.LL.LIZIZ(this.LLILLJJLI, i, i2);
                }
            });
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIL(final InterfaceC1470930oNf interfaceC1470930oNf) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            final InterfaceC1470080oMI interfaceC1470080oMI = this.LLILLJJLI;
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(interfaceC1470930oNf, interfaceC1470080oMI) { // from class: X.15al
                public final InterfaceC1470930oNf LL;
                public final InterfaceC1470080oMI LLILLJJLI;

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.LL.LIZJ(this.LLILLJJLI);
                }

                {
                    this.LL = interfaceC1470930oNf;
                    this.LLILLJJLI = interfaceC1470080oMI;
                }
            });
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJ(s sVar) {
        PlaybackParams playbackParams = new PlaybackParams();
        float f = sVar.LIZLLL;
        if (f > 0.0f) {
            playbackParams.setSpeed(f);
        }
        int i = sVar.LIZIZ;
        if (i >= 0) {
            playbackParams.setAudioFallbackMode(i);
        }
        float f2 = sVar.LIZJ;
        if (f2 > 0.0f) {
            playbackParams.setPitch(f2);
        }
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setPlaybackParams(playbackParams);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJII(Surface surface) {
        this.LL.setSurface(surface);
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIILJJIL(Context context, Uri uri) throws IOException {
        this.LL.setDataSource(context, uri);
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIII(float f, float f2) {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
