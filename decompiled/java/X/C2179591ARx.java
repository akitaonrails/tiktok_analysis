package X;

import Y.AObjectS397S0100000_23;
import Y.AObjectS80S0000000_33;
import Y.ARunnableS106S0100000_6;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayAbilityConfig;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayDataModel;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ARx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179591ARx {
    public final BgPlayService LIZ;
    public MediaSessionCompat LIZIZ;
    public int LIZLLL;
    public InterfaceC1528040prm LJFF;
    public BgPlayAbilityConfig LJI;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS80S0000000_33(0));
    public int LJ = 2;
    public final C1487450ooJ LJII = C1487370ooB.LJFF;
    public float LJIIIIZZ = 1.0f;

    public final void LIZ() {
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.LIZ, "BgMediaSessionController", null, null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        BgPlayService bgPlayService = this.LIZ;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        BgPlayService bgPlayService2 = this.LIZ;
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getService(bgPlayService, 0, intent.setComponent(new ComponentName(bgPlayService2, bgPlayService2.getClass())), Build.VERSION.SDK_INT >= 31 ? 67108864 : 0));
        this.LIZIZ = mediaSessionCompat;
        MediaSessionCompat.Callback callback = new MediaSessionCompat.Callback() { // from class: X.0prn
            public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIJ() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LIZJ() {
                LJIIL(new AObjectS397S0100000_23(this.LJI, 6));
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJ() {
                LJIIL(new AObjectS397S0100000_23(this.LJI, 7));
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJFF() {
                LJIIL(new AObjectS397S0100000_23(this.LJI, 8));
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJI() {
                LJIIL(new AObjectS397S0100000_23(this.LJI, 4));
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIIZZ() {
                C2179591ARx c2179591ARx = this.LJI;
                BgPlayAbilityConfig bgPlayAbilityConfig = c2179591ARx.LJI;
                if (bgPlayAbilityConfig != null) {
                    if (bgPlayAbilityConfig.canPlayNext) {
                        LJIIL(new AObjectS397S0100000_23(c2179591ARx, 5));
                    } else if (bgPlayAbilityConfig.canPlayFastForward) {
                        LIZJ();
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIZ() {
                C2179591ARx c2179591ARx = this.LJI;
                BgPlayAbilityConfig bgPlayAbilityConfig = c2179591ARx.LJI;
                if (bgPlayAbilityConfig != null) {
                    if (bgPlayAbilityConfig.canPlayPrevious) {
                        LJIIL(new AObjectS397S0100000_23(c2179591ARx, 9));
                    } else if (bgPlayAbilityConfig.canPlayFastBackWard) {
                        LJI();
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "FAST_FORWARD")) {
                    LIZJ();
                } else {
                    if (!Intrinsics.LJFF(str, "REWIND")) {
                        return;
                    }
                    LJI();
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJII(final long j) {
                final C2179591ARx c2179591ARx = this.LJI;
                LJIIL(new Function0() { // from class: X.0pro
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C2179591ARx c2179591ARx2 = c2179591ARx;
                        long j2 = j;
                        MediaSessionCompat mediaSessionCompat2 = c2179591ARx2.LIZIZ;
                        if (mediaSessionCompat2 != null && mediaSessionCompat2.LIZLLL()) {
                            c2179591ARx2.LJII.LJIIL();
                            InterfaceC1528040prm interfaceC1528040prm = c2179591ARx2.LJFF;
                            if (interfaceC1528040prm != null) {
                                interfaceC1528040prm.LJIIJ(j2);
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            }

            public final void LJIIL(Function0<Unit> function0) {
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    function0.invoke();
                } else {
                    C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS106S0100000_6((Function0) function0, 14));
                }
            }
        };
        MediaSessionCompat mediaSessionCompat2 = this.LIZIZ;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.LJI(callback, null);
        }
    }

    public C2179591ARx(BgPlayService bgPlayService) {
        this.LIZ = bgPlayService;
    }

    public final void LIZJ(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        try {
            ((C821000WIo) this.LIZJ.getValue()).LIZIZ(bitmap, "android.media.metadata.ART");
            MediaSessionCompat mediaSessionCompat = this.LIZIZ;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.LJII(((C821000WIo) this.LIZJ.getValue()).LIZ());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(BgPlayDataModel bgPlayDataModel) {
        this.LIZLLL = bgPlayDataModel.duration;
        try {
            this.LJI = bgPlayDataModel.bgPlayAbilityConfig;
            C821000WIo c821000WIo = (C821000WIo) this.LIZJ.getValue();
            c821000WIo.LIZLLL("android.media.metadata.MEDIA_ID", bgPlayDataModel.aid);
            c821000WIo.LIZLLL("android.media.metadata.TITLE", bgPlayDataModel.desc);
            c821000WIo.LIZLLL("android.media.metadata.DISPLAY_SUBTITLE", bgPlayDataModel.userName);
            c821000WIo.LIZLLL("android.media.metadata.ARTIST", bgPlayDataModel.userName);
            c821000WIo.LIZJ(this.LIZLLL);
            c821000WIo.LIZIZ(null, "android.media.metadata.ART");
            c821000WIo.LIZLLL("android.media.metadata.ALBUM_ART_URI", UriProtector.parse(bgPlayDataModel.coverImageUrl).toString());
            MediaSessionCompat mediaSessionCompat = this.LIZIZ;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.LJII(((C821000WIo) this.LIZJ.getValue()).LIZ());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ(int i, long j) {
        long j2;
        MediaSessionCompat mediaSessionCompat;
        boolean z;
        InterfaceC2179601ARy interfaceC2179601ARy;
        InterfaceC2179601ARy interfaceC2179601ARy2;
        C2179641ASc c2179641ASc = new C2179641ASc();
        this.LJ = i;
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    j2 = 304;
                } else {
                    j2 = 307;
                }
            } else {
                j2 = 309;
            }
        } else {
            j2 = 310;
        }
        c2179641ASc.LJFF = j2;
        float f = this.LJIIIIZZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c2179641ASc.LIZIZ = i;
        c2179641ASc.LIZJ = j;
        c2179641ASc.LJIIIIZZ = jElapsedRealtime;
        c2179641ASc.LJ = f;
        BgPlayAbilityConfig bgPlayAbilityConfig = this.LJI;
        if (bgPlayAbilityConfig != null && bgPlayAbilityConfig.canPlayFastBackWard && (interfaceC2179601ARy2 = C1487370ooB.LIZLLL) != null) {
            interfaceC2179601ARy2.LIZJ();
        }
        BgPlayAbilityConfig bgPlayAbilityConfig2 = this.LJI;
        if (bgPlayAbilityConfig2 != null && bgPlayAbilityConfig2.canPlayFastForward && (interfaceC2179601ARy = C1487370ooB.LIZLLL) != null) {
            interfaceC2179601ARy.LIZ();
        }
        MediaSessionCompat mediaSessionCompat2 = this.LIZIZ;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.LJIIIIZZ(c2179641ASc.LIZ());
        }
        MediaSessionCompat mediaSessionCompat3 = this.LIZIZ;
        if ((mediaSessionCompat3 == null || !mediaSessionCompat3.LIZLLL()) && (mediaSessionCompat = this.LIZIZ) != null) {
            if (i != 7) {
                z = true;
                if (i == 1) {
                    z2 = false;
                }
            } else {
                z = false;
            }
            mediaSessionCompat.LJFF(z & z2);
        }
    }
}
