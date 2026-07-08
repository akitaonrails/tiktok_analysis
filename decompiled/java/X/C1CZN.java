package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZN extends Message.Builder<C1CZI, C1CZN> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public C1CWW LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public C1CWY LJIILIIL;
    public C1CXN LJIILJJIL;
    public C1CJR LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZI build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILJJIL != null) {
            return new C1CZI(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "user_room_id", this.LJ, "user_id", this.LJFF, "linkmic_id", this.LJI, "position_type", this.LJII, "position_link_position", this.LJIIIIZZ, "position_link_opt", this.LJIIIZ, "linked_time_nano", this.LJIIJ, "online_user_state", this.LJIIJJI, "audio_muted", this.LJIIL, "video_muted", this.LJIILIIL, "rtc_connection", this.LJIILJJIL, "network_state");
        throw null;
    }
}
