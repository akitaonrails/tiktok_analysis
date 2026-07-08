package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1ARm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179481ARm extends C1ARJ {
    public final Context LLILLJJLI;
    public final InterfaceC2179561ARu LLILLL;
    public final C1ARM LLILZ;
    public final int LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4192));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4190));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4191));
    public C1AS5 LLJ;
    public C2179511ARp LLJI;
    public boolean LLJIJIL;

    public final void LJIJJLI() {
        InterfaceC2179561ARu interfaceC2179561ARu = this.LLILLL;
        if (interfaceC2179561ARu != null) {
            interfaceC2179561ARu.cancel();
        }
        try {
            LocalBroadcastManager.LIZ(this.LLILLJJLI).LIZLLL((C2189451AmV) this.LLILZLL.getValue());
            C786410Ut5.LJJIFFI(this.LLILLJJLI, (C2189451AmV) this.LLIZ.getValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1AS5 c1as5 = this.LLJ;
        if (c1as5 != null) {
            c1as5.LJ();
        }
        this.LLJ = null;
        C2179511ARp c2179511ARp = this.LLJI;
        if (c2179511ARp != null) {
            c2179511ARp.LIZIZ();
        }
        this.LLJI = null;
        this.LLJIJIL = false;
    }

    public final void LJIL() {
        C1ANF c1anfLIZJ;
        C1ARK c1ark;
        C2179511ARp c2179511ARp = this.LLJI;
        if (c2179511ARp != null) {
            c2179511ARp.LIZJ();
        }
        C1AS5 c1as5 = this.LLJ;
        if (c1as5 != null) {
            C1ARL c1arl = this.LL;
            if (c1arl == null || (c1ark = c1arl.LIZJ) == null || (c1anfLIZJ = c1ark.LIZJ()) == null) {
                c1anfLIZJ = C1ANF.PLAYBACK_STATE_STOPPED;
            }
            if (C1ANL.LIZ[c1anfLIZJ.ordinal()] == 1) {
                if (c1as5.LIZJ().LIZIZ) {
                    c1as5.LIZIZ().removeMessages(1);
                    c1as5.LIZIZ().removeMessages(2);
                    c1as5.LIZIZ().sendMessageDelayed(Message.obtain(c1as5.LIZIZ(), 2), 300L);
                    return;
                }
                return;
            }
            C2179491ARn c2179491ARn = c1as5.LJII;
            if (c2179491ARn != null) {
                c2179491ARn.LIZ = Boolean.valueOf(c1anfLIZJ.isPlayingState());
                c2179491ARn.LIZIZ = Boolean.valueOf(c1as5.LIZIZ.LJFF());
                c2179491ARn.LIZJ = Boolean.valueOf(c1as5.LIZIZ.LJI());
                c1as5.LJFF(c2179491ARn);
            }
        }
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void onPrepared() {
        C2179511ARp c2179511ARp = this.LLJI;
        if (c2179511ARp != null) {
            C821000WIo c821000WIoLIZ = c2179511ARp.LIZ();
            InterfaceC2179261AQq interfaceC2179261AQqLIZ = c2179511ARp.LIZIZ.LIZ();
            long duration = interfaceC2179261AQqLIZ != null ? interfaceC2179261AQqLIZ.getDuration() : 0L;
            long duration2 = c2179511ARp.LIZ.getDuration();
            if (duration2 > 0) {
                duration = duration2;
            }
            c821000WIoLIZ.LIZJ(duration);
            c2179511ARp.LIZLLL.LJII(c2179511ARp.LIZ().LIZ());
        }
    }

    @Override // X.C1ARN
    public final void onDetach() {
        LJIJJLI();
    }

    @Override // X.C1ARJ, X.C1AR6
    public final void LJI(InterfaceC2179261AQq interfaceC2179261AQq) throws Exception {
        if (interfaceC2179261AQq == null) {
            LJIJJLI();
            return;
        }
        if (!this.LLJIJIL) {
            C1ARL c1arl = this.LL;
            if (c1arl != null) {
                C2179511ARp c2179511ARp = new C2179511ARp(this.LLILLJJLI, c1arl.LIZJ, c1arl.LIZLLL, c1arl.LJ, (ComponentName) this.LLIZLLLIL.getValue());
                this.LLJ = new C1AS5(this.LLILLJJLI, c2179511ARp.LIZLLL.LIZ.LIZIZ, c1arl.LIZLLL, (ComponentName) this.LLIZLLLIL.getValue(), this.LLILZ, this.LLILZIL);
                this.LLJI = c2179511ARp;
            }
            LocalBroadcastManager.LIZ(this.LLILLJJLI).LIZIZ((BroadcastReceiver) this.LLILZLL.getValue(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
            C786410Ut5.LJIJJ(this.LLILLJJLI, (BroadcastReceiver) this.LLIZ.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.LLJIJIL = true;
        }
        C2179511ARp c2179511ARp2 = this.LLJI;
        if (c2179511ARp2 != null) {
            C821000WIo c821000WIoLIZ = c2179511ARp2.LIZ();
            c821000WIoLIZ.LIZLLL("android.media.metadata.TITLE", interfaceC2179261AQq.getSongName());
            c821000WIoLIZ.LIZLLL("android.media.metadata.ALBUM", interfaceC2179261AQq.getAlbumName());
            c821000WIoLIZ.LIZLLL("android.media.metadata.ARTIST", interfaceC2179261AQq.getArtistName());
            long duration = interfaceC2179261AQq.getDuration();
            long duration2 = c2179511ARp2.LIZ.getDuration();
            if (duration2 > 0) {
                duration = duration2;
            }
            c821000WIoLIZ.LIZJ(duration);
            c821000WIoLIZ.LIZIZ(null, "android.media.metadata.ART");
            c2179511ARp2.LIZLLL.LJFF(true);
            c2179511ARp2.LIZLLL.LJII(c2179511ARp2.LIZ().LIZ());
        }
        C1AS5 c1as5 = this.LLJ;
        if (c1as5 != null) {
            C2179491ARn c2179491ARn = new C2179491ARn(0);
            c2179491ARn.LIZ = Boolean.FALSE;
            c2179491ARn.LIZIZ = Boolean.valueOf(c1as5.LIZIZ.LJFF());
            c2179491ARn.LIZJ = Boolean.valueOf(c1as5.LIZIZ.LJI());
            c2179491ARn.LIZLLL = interfaceC2179261AQq.getSongName();
            c2179491ARn.LJ = interfaceC2179261AQq.getArtistName();
            c2179491ARn.LJFF = interfaceC2179261AQq.getAlbumName();
            c2179491ARn.LJI = null;
            c1as5.LJFF(c2179491ARn);
            c1as5.LJII = c2179491ARn;
        }
        InterfaceC2179561ARu interfaceC2179561ARu = this.LLILLL;
        if (interfaceC2179561ARu != null) {
            interfaceC2179561ARu.LIZ(interfaceC2179261AQq.getCoverUrl(), new AwS612S0100000_33(this, 279));
        }
        LJIL();
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void LJIILIIL(EnumC1778440wNe enumC1778440wNe) {
        LJIL();
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        boolean z;
        if (c1anf != C1ANF.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        C2179511ARp c2179511ARp = this.LLJI;
        if (c2179511ARp != null) {
            c2179511ARp.LIZLLL.LJFF(z);
        }
        C1AS5 c1as5 = this.LLJ;
        if (c1as5 != null) {
            c1as5.LIZJ().LIZ = z;
        }
        LJIL();
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void onPlaybackTimeChanged(long j) {
        C2179511ARp c2179511ARp = this.LLJI;
        if (c2179511ARp != null) {
            c2179511ARp.LIZJ();
        }
    }

    public C2179481ARm(Context context, InterfaceC2179561ARu interfaceC2179561ARu, C1ARM c1arm, int i) {
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC2179561ARu;
        this.LLILZ = c1arm;
        this.LLILZIL = i;
    }
}
