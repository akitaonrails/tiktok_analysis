package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232961CaU extends Message.Builder<C2232931CaR, C2232961CaU> {
    public C2232021CXo LIZLLL;
    public Boolean LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public EnumC2231901CXc LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232931CaR build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2232931CaR(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "approver", this.LJ, "is_agree", this.LJFF, "group_channel_id", this.LJI, "self_group_linkmic_id", this.LJII, "target_group_linkmic_id", this.LJIIIIZZ, "msg_mode");
        throw null;
    }
}
