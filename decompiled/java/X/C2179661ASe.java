package X;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1ASe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2179661ASe implements InterfaceC2179731ASl {
    public final MediaSession LIZ;
    public final MediaSessionCompat.Token LIZIZ;
    public final Bundle LIZLLL;
    public PlaybackStateCompat LJI;
    public MediaMetadataCompat LJII;
    public MediaSessionCompat.Callback LJIIIIZZ;
    public C2179741ASm LJIIIZ;
    public final Object LIZJ = new Object();
    public boolean LJ = false;
    public final RemoteCallbackList<InterfaceC2179861ASy> LJFF = new RemoteCallbackList<>();

    public final String LIZIZ() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return (String) this.LIZ.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.LIZ, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2179731ASl
    public final MediaSessionCompat.Callback LIZJ() {
        MediaSessionCompat.Callback callback;
        synchronized (this.LIZJ) {
            try {
                callback = this.LJIIIIZZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return callback;
    }

    @Override // X.InterfaceC2179731ASl
    public C2179741ASm LJ() {
        C2179741ASm c2179741ASm;
        synchronized (this.LIZJ) {
            try {
                c2179741ASm = this.LJIIIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2179741ASm;
    }

    @Override // X.InterfaceC2179731ASl
    public final PlaybackStateCompat LJIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC2179731ASl
    public void LIZLLL(C2179741ASm c2179741ASm) {
        synchronized (this.LIZJ) {
            try {
                this.LJIIIZ = c2179741ASm;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1ASf] */
    public C2179661ASe(Context context, String str) {
        MediaSession mediaSessionLIZ = LIZ(context, str);
        this.LIZ = mediaSessionLIZ;
        final C2179691ASh c2179691ASh = (C2179691ASh) this;
        this.LIZIZ = new MediaSessionCompat.Token(mediaSessionLIZ.getSessionToken(), new C1ATO() { // from class: X.1ASf
            @Override // X.C1ATP
            public final void LJII() {
            }

            @Override // X.C1ATP
            public final void LLJJIJIL() {
            }

            @Override // X.C1ATP
            public final void Y() {
            }

            @Override // X.C1ATP
            public final void E0() {
                c2179691ASh.getClass();
            }

            @Override // X.C1ATP
            public final PlaybackStateCompat LJIL() {
                C2179661ASe c2179661ASe = c2179691ASh;
                return MediaSessionCompat.LIZJ(c2179661ASe.LJI, c2179661ASe.LJII);
            }

            @Override // X.C1ATP
            public final MediaMetadataCompat LJJIFFI() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final long LJJJJIZL() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LJJJJLL() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final CharSequence LJLJLJ() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLFF() {
                c2179691ASh.getClass();
            }

            @Override // X.C1ATP
            public final void LLIIIJ() {
                c2179691ASh.getClass();
            }

            @Override // X.C1ATP
            public final PendingIntent LLJJJIL() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLZ() {
                c2179691ASh.getClass();
            }

            @Override // X.C1ATP
            public final boolean LLZILL() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void W0() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final String getPackageName() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final Bundle getSessionInfo() {
                if (c2179691ASh.LIZLLL == null) {
                    return null;
                }
                return new Bundle(c2179691ASh.LIZLLL);
            }

            @Override // X.C1ATP
            public final String getTag() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final ParcelableVolumeInfo j() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void next() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void pause() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void play() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void prepare() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void previous() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void stop() {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void C(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LJIIJ(long j) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LJLLI(boolean z) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLIILII(int i) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLIZLLLIL(float f) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLLFFI(InterfaceC2179861ASy interfaceC2179861ASy) {
                if (c2179691ASh.LJ) {
                    return;
                }
                c2179691ASh.LJFF.register(interfaceC2179861ASy, new C2179741ASm("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (c2179691ASh.LIZJ) {
                    try {
                        c2179691ASh.getClass();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.C1ATP
            public final void LLLLLL(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLLLLLZ(int i) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLLZZIL(int i) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void T0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final boolean l(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void t(long j) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void w0(InterfaceC2179861ASy interfaceC2179861ASy) {
                c2179691ASh.LJFF.unregister(interfaceC2179861ASy);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (c2179691ASh.LIZJ) {
                    try {
                        c2179691ASh.getClass();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.C1ATP
            public final void H0(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void L0(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LJZL(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLII(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLIIJI(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLLIIII(int i, int i2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void LLLLZLL(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void M0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void U0(int i, int i2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void e1(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void h0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.C1ATP
            public final void l0(String str2, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }
        });
        this.LIZLLL = null;
        mediaSessionLIZ.setFlags(3);
    }

    public MediaSession LIZ(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void LJFF(MediaSessionCompat.Callback callback, Handler handler) {
        C2179721ASk c2179721ASk;
        synchronized (this.LIZJ) {
            try {
                this.LJIIIIZZ = callback;
                MediaSession mediaSession = this.LIZ;
                if (callback == null) {
                    c2179721ASk = null;
                } else {
                    c2179721ASk = callback.LIZIZ;
                }
                mediaSession.setCallback(c2179721ASk, handler);
                if (callback != null) {
                    callback.LJIIJJI(this, handler);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
