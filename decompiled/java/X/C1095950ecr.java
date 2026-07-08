package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0ecr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1095950ecr implements InterfaceC1096360edW {
    public boolean LIZ;
    public boolean LIZIZ;
    public EnumC1096020ecy LIZJ;
    public C1095140ebY LIZLLL;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public boolean LJFF;
    public boolean LJI;
    public final long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;

    @Override // X.InterfaceC1096360edW
    public boolean LIZLLL() {
        return false;
    }

    public void LJIIJJI() {
        throw null;
    }

    @Override // X.InterfaceC1096360edW
    public void onRelease() {
        this.LIZLLL = null;
        this.LJI = false;
        BPEAHandler bPEAHandler = this.LJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC1096360edW
    public final void LLLILZJ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        LJIIJJI();
    }

    public C1095950ecr() {
        FansClubDynamicConfig fansClubDynamicConfig;
        FansClubConfig fansClubConfig = FansClubSettings.INSTANCE.getFansClubConfig();
        this.LJII = (fansClubConfig == null || (fansClubDynamicConfig = fansClubConfig.fansClubDynamicConfig) == null) ? 4000L : fansClubDynamicConfig.playGuideAnimDelayTime;
        this.LJIIJ = "normal";
    }

    public final void LJIIL(DataChannel dataChannel, boolean z, boolean z2, String str, C1096070ed3 c1096070ed3, boolean z3, EnumC1095860eci enumC1095860eci, Long l, boolean z4, String str2, Map map) {
        String str3 = null;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            boolean z5 = this.LIZ;
            long j = this.LJIIIIZZ;
            if (c1096070ed3 != null) {
                str3 = c1096070ed3.LIZ;
            }
            C518180KTw.LJI(dataChannel, z5, z, z2, str, j, str3, z3, enumC1095860eci, l, false, str2, map);
            return;
        }
        boolean z6 = this.LIZ;
        long j2 = this.LJIIIIZZ;
        if (c1096070ed3 != null) {
            str3 = c1096070ed3.LIZ;
        }
        C518180KTw.LJIIJ(dataChannel, z6, z, z2, str, j2, str3, z3, enumC1095860eci, l, false, z4, false, str2, map);
    }

    public final void LJIILJJIL(DataChannel dataChannel, boolean z, boolean z2, boolean z3, String str, C1096070ed3 c1096070ed3, boolean z4, EnumC1095860eci enumC1095860eci, Long l, boolean z5, String str2, boolean z6, Map map) {
        if (!z2) {
            if (this.LIZIZ) {
                return;
            } else {
                this.LIZIZ = true;
            }
        }
        String str3 = null;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            boolean z7 = this.LIZ;
            long j = this.LJIIIIZZ;
            if (c1096070ed3 != null) {
                str3 = c1096070ed3.LIZ;
            }
            C518180KTw.LJI(dataChannel, z7, z, z3, str, j, str3, z4, enumC1095860eci, l, z2, str2, map);
            return;
        }
        boolean z8 = this.LIZ;
        long j2 = this.LJIIIIZZ;
        if (c1096070ed3 != null) {
            str3 = c1096070ed3.LIZ;
        }
        C518180KTw.LJIIJ(dataChannel, z8, z, z3, str, j2, str3, z4, enumC1095860eci, l, z2, z5, z6, str2, map);
    }
}
