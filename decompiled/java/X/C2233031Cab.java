package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233031Cab extends Message.Builder<C2233011CaZ, C2233031Cab> {
    public C2232021CXo LIZLLL;
    public C2232021CXo LJ;
    public C2232021CXo LJFF;
    public String LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233011CaZ build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2233011CaZ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "invitor", this.LJ, "invitee", this.LJFF, "operator_p", this.LJI, "layout_id", this.LJII, "scene_version");
        throw null;
    }
}
