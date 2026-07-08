package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0ayV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955610ayV extends AbstractC962030b8r {
    public static final /* synthetic */ int LJII = 0;
    public final String LJI = "ttlive_client_audience_cohost_monitor";

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.AbstractC962030b8r
    public final void LJIILLIIL() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "current_user_id", Long.valueOf(interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L), true);
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }

    public final void LJJIFFI(int i, String str) {
        LJIIL(1, "cohost_identify_v2", true);
        LJIIL(str, "fallback_type", true);
        LJIIL(str, "fallback_type", true);
        LJIIL(Integer.valueOf(i), "linker_arch_type", true);
        LJIJJLI("cohost_recognition_opt");
    }

    public final void LJIL(int i, long j, long j2, String str) {
        LJIIL("cohost", "connection_type", true);
        LJIIL(1, "is_first_sei", true);
        LJIIL(Integer.valueOf(i), "linker_arch_type", true);
        LJIIL(str, "sei_fail_scene", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "duration", Long.valueOf(j2), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "channel_id", Long.valueOf(j), true);
        LJIJJLI("sei_identify_failed");
        C955500ayK c955500ayK = new C955500ayK();
        c955500ayK.LJIIL("cohost", "connection_type", true);
        c955500ayK.LJIIL(1, "is_first_sei", true);
        c955500ayK.LJIIL(Integer.valueOf(i), "linker_arch_type", true);
        c955500ayK.LJIIL(str, "sei_fail_scene", true);
        AbstractC962030b8r.LJIIJ(c955500ayK.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955500ayK.LIZLLL, "duration", Long.valueOf(j2), true);
        AbstractC962030b8r.LJIIJ(c955500ayK.LIZLLL, "channel_id", Long.valueOf(j), true);
        c955500ayK.LJIJJLI("sei_identify_failed");
    }

    public final void LJJ(int i, long j, long j2, String str) {
        LJIIL("cohost", "connection_type", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        LJIIL(1, "is_first_sei", true);
        LJIIL(Integer.valueOf(i), "linker_arch_type", true);
        LJIIL(str, "report_scene", true);
        LJIIL(Long.valueOf(j2), "enter_duration", true);
        LJIJJLI("sei_identify_start");
    }

    public final void LJJI(int i, long j, boolean z, boolean z2) {
        String str;
        LJIIL(Long.valueOf(j), "sei_channel_id", true);
        LJIIL(Integer.valueOf(z2 ? 1 : 0), "is_first_sei", true);
        if (C954660awy.LJ != 0) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "duration", Long.valueOf(SystemClock.uptimeMillis() - C954660awy.LJ), true);
        }
        LJIIL(Integer.valueOf(i), "linker_arch_type", true);
        if (z) {
            str = "room_enter";
        } else {
            str = "enter_message";
        }
        LJIIL(str, "identify_type", true);
        LJIJJLI("linked");
    }
}
