package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1ARp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179511ARp {
    public final C1ARK LIZ;
    public final C1ARI LIZIZ;
    public final InterfaceC2179551ARt LIZJ;
    public final MediaSessionCompat LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(1));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(0));

    public final C821000WIo LIZ() {
        return (C821000WIo) this.LJFF.getValue();
    }

    public final void LIZIZ() {
        try {
            MediaSessionCompat mediaSessionCompat = this.LIZLLL;
            mediaSessionCompat.LJFF(false);
            mediaSessionCompat.LJI(null, null);
            mediaSessionCompat.LJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ() {
        C1ANF c1anfLIZJ = this.LIZ.LIZJ();
        int i = C1ANJ.LIZ[c1anfLIZJ.ordinal()];
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
        ((C2179641ASc) this.LJ.getValue()).LJFF = 822L;
        ((C2179641ASc) this.LJ.getValue()).LIZIZ(i2, this.LIZ.LIZIZ());
        this.LIZLLL.LJIIIIZZ(((C2179641ASc) this.LJ.getValue()).LIZ());
        this.LIZLLL.LJFF(c1anfLIZJ != C1ANF.PLAYBACK_STATE_STOPPED);
    }

    public C2179511ARp(Context context, C1ARK c1ark, C1ARI c1ari, InterfaceC2179551ARt interfaceC2179551ARt, ComponentName componentName) {
        this.LIZ = c1ark;
        this.LIZIZ = c1ari;
        this.LIZJ = interfaceC2179551ARt;
        final MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(componentName), 67108864));
        mediaSessionCompat.LJI(new MediaSessionCompat.Callback() { // from class: X.1ARq
            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJ() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZ.LJIIIIZZ(new C0NIR("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJFF() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZ.LJII(null);
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIIZZ() {
                if (mediaSessionCompat.LIZLLL() && this.LIZIZ.LJI()) {
                    this.LIZJ.LJIILJJIL(new C0NIR("operation_from_media_session_skip_to_next"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIIZ() {
                if (mediaSessionCompat.LIZLLL() && this.LIZIZ.LJFF()) {
                    this.LIZJ.LJIJ(new C0NIR("operation_from_media_session_skip_to_prev"));
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public final void LJIIJ() {
                if (mediaSessionCompat.LIZLLL()) {
                    this.LIZ.LIZLLL(new C0NIR("STOP_FROM_MEDIA_SESSION_CALLBACK"));
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
                    this.LIZ.LJJ(j, null);
                }
            }
        }, null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LIZLLL = mediaSessionCompat;
    }
}
