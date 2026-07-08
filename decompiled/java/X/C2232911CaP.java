package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232911CaP extends Message.Builder<C2232891CaN, C2232911CaP> {
    public C2232021CXo LIZLLL;
    public C2232021CXo LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232891CaN build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null) {
            return new C2232891CaN(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "invitee", this.LJ, "invite_operator", this.LJFF, "is_agree");
        throw null;
    }
}
