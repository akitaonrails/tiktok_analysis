package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236711CgX extends Message.Builder<C2236691CgV, C2236711CgX> {
    public EnumC2232071CXt LIZLLL;
    public EnumC2231981CXk LJ;
    public EnumC2231921CXe LJFF;
    public EnumC2232051CXr LJI;
    public EnumC2231931CXf LJII;
    public EnumC2231881CXa LJIIIIZZ;
    public Long LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236691CgV build() {
        EnumC2232071CXt enumC2232071CXt = this.LIZLLL;
        if (enumC2232071CXt != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2236691CgV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2232071CXt, "link_type", this.LJ, "reply_type", this.LJFF, "user_return_type", this.LJI, "share_revenue_setting", this.LJII, "share_revenue_setting_ratio", this.LJIIIIZZ, "outside_room_invite_source", this.LJIIIZ, "join_direct_type");
        throw null;
    }
}
