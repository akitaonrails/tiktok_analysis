package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ARo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179501ARo {
    public final Context LIZ;
    public final C1ARK LIZIZ;
    public final C1ARI LIZJ;
    public final InterfaceC2179551ARt LIZLLL;
    public final C01GW LJ;
    public final MediaSessionCompat LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    public final C821000WIo LIZ() {
        return (C821000WIo) this.LJII.getValue();
    }

    public final void LIZIZ() {
        try {
            MediaSessionCompat mediaSessionCompat = this.LJFF;
            mediaSessionCompat.LJFF(false);
            mediaSessionCompat.LJI(null, null);
            mediaSessionCompat.LJ();
            C786410Ut5.LJJIFFI(this.LIZ, (C2189451AmV) this.LJ.getValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ() {
        C1ANF c1anfLIZJ = this.LIZIZ.LIZJ();
        int i = C1ANI.LIZ[c1anfLIZJ.ordinal()];
        int i2 = 3;
        if (i != 1 && i != 2) {
            if (i == 3) {
                i2 = 2;
            } else {
                if (i != 4 && i != 5) {
                    throw new C1954807lC();
                }
                i2 = 1;
            }
        }
        ((C2179641ASc) this.LJI.getValue()).LJFF = 822L;
        ((C2179641ASc) this.LJI.getValue()).LIZIZ(i2, this.LIZIZ.LIZIZ());
        this.LJFF.LJIIIIZZ(((C2179641ASc) this.LJI.getValue()).LIZ());
        this.LJFF.LJFF(c1anfLIZJ != C1ANF.PLAYBACK_STATE_STOPPED);
    }

    public final void LIZLLL() {
        C821000WIo c821000WIoLIZ = LIZ();
        InterfaceC2179261AQq interfaceC2179261AQqLIZ = this.LIZJ.LIZ();
        long duration = interfaceC2179261AQqLIZ != null ? interfaceC2179261AQqLIZ.getDuration() : 0L;
        long duration2 = this.LIZIZ.getDuration();
        if (duration2 > 0) {
            duration = duration2;
        }
        c821000WIoLIZ.LIZJ(duration);
        this.LJFF.LJII(LIZ().LIZ());
    }

    public final void LIZJ(Bitmap bitmap) {
        if (Intrinsics.LJFF(Build.MANUFACTURER, "Xiaomi")) {
            if (bitmap != null && bitmap.isRecycled()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("coverBitmap(");
                sbLIZ.append(bitmap);
                sbLIZ.append(") already recycled.");
                C2178901APg.LIZJ("MediaSessionController", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LIZ().LIZIZ(bitmap, "android.media.metadata.ART");
            this.LJFF.LJII(LIZ().LIZ());
        }
    }

    public C2179501ARo(Context context, C0NIP c0nip, C2179441ARi c2179441ARi, C591760NIw c591760NIw, ComponentName componentName) throws Exception {
        this.LIZ = context;
        this.LIZIZ = c0nip;
        this.LIZJ = c2179441ARi;
        this.LIZLLL = c591760NIw;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4106));
        this.LJ = c01gwLIZIZ;
        this.LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(614));
        this.LJII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(613));
        final MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getService(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(componentName), 67108864));
        mediaSessionCompat.LJI(new MediaSessionCompat.Callback() { // from class: X.1ARr
            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJ() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZIZ.LJIIIIZZ(new C0NIR("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJFF() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZIZ.LJII(null);
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIIZZ() {
                if (mediaSessionCompat.LIZLLL() && this.LIZJ.LJI()) {
                    this.LIZLLL.LJIILJJIL(new C0NIR("operation_from_media_session_skip_to_next"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIZ() {
                if (mediaSessionCompat.LIZLLL() && this.LIZJ.LJFF()) {
                    this.LIZLLL.LJIJ(new C0NIR("operation_from_media_session_skip_to_prev"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIJ() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZIZ.LIZLLL(new C0NIR("STOP_FROM_MEDIA_SESSION_CALLBACK"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final boolean LIZLLL(Intent intent) {
                Integer numValueOf;
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    numValueOf = Integer.valueOf(keyEvent.getKeyCode());
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 86) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_STOP");
                    } else if (numValueOf.intValue() == 79) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_HEADSETHOOK");
                    } else if (numValueOf.intValue() == 85) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY_PAUSE");
                    } else if (numValueOf.intValue() == 87) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_NEXT");
                    } else if (numValueOf.intValue() == 88) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PREVIOUS");
                    } else if (numValueOf.intValue() == 127) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PAUSE");
                    } else if (numValueOf.intValue() == 126) {
                        C2178901APg.LIZIZ("MediaSessionController", "KEYCODE_MEDIA_PLAY");
                    }
                }
                return super.LIZLLL(intent);
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJII(long j) {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZIZ.LJJ(j, null);
                }
            }
        }, null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LJFF = mediaSessionCompat;
        C786410Ut5.LJIJJ(context, (BroadcastReceiver) c01gwLIZIZ.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}
