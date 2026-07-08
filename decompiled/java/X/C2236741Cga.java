package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236741Cga extends Message.Builder<C2236721CgY, C2236741Cga> {
    public Long LIZLLL;
    public Long LJ;
    public EnumC2231921CXe LJFF;
    public Boolean LJI;
    public EnumC2232051CXr LJII;
    public EnumC2231931CXf LJIIIIZZ;
    public String LJIIIZ;
    public Long LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Boolean LJIILJJIL;
    public Long LJIILL;
    public Long LJIILLIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236721CgY build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIJ != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILJJIL != null && this.LJIILL != null && this.LJIILLIIL != null) {
            return new C2236721CgY(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "link_type", this.LJ, "anchor_id", this.LJFF, "user_return_type", this.LJI, "follow", this.LJII, "share_revenue_setting", this.LJIIIIZZ, "share_revenue_setting_ratio", this.LJIIJ, "join_game_session_id", this.LJIIL, "enter_action", this.LJIILIIL, "enter_action_reason", this.LJIILJJIL, "lineup_resume_link", this.LJIILL, "inviter_role", this.LJIILLIIL, "inviter_user_id");
        throw null;
    }
}
