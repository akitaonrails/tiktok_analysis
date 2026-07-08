package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CZM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZM extends Message.Builder<C1CZJ, C1CZM> {
    public String LIZLLL;
    public Long LJ;
    public String LJFF;
    public C2228421CJs LJI;
    public C2228421CJs LJII;
    public C1CWO LJIIIIZZ;
    public C1CWW LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;
    public Boolean LJIIL;
    public C1CWY LJIILIIL;
    public C1CXN LJIILJJIL;
    public Long LJIILL;
    public C1CW4 LJIILLIIL;
    public Boolean LJIIZILJ;
    public Boolean LJIJ;
    public C2233181Caq LJIJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZJ build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJI != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILJJIL != null && this.LJIILL != null && this.LJIILLIIL != null && this.LJIIZILJ != null && this.LJIJ != null && this.LJIJI != null) {
            return new C1CZJ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, FollowStatusChangeMethod.PARAM_UID, this.LJ, "spot_id", this.LJI, "view_info", this.LJIIIIZZ, "win_state", this.LJIIIZ, "online_state", this.LJIIJ, "video_muted", this.LJIIJJI, "audio_muted", this.LJIIL, "audio_occupied", this.LJIILIIL, "rtc_connection", this.LJIILJJIL, "network_state", this.LJIILL, "z_order", this.LJIILLIIL, "ui_pos", this.LJIIZILJ, "is_self", this.LJIJ, "is_room_owner", this.LJIJI, "extra");
        throw null;
    }
}
