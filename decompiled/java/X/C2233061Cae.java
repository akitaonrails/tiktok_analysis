package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233061Cae extends Message.Builder<C2233041Cac, C2233061Cae> {
    public C2232021CXo LIZLLL;
    public C2232021CXo LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233041Cac build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null) {
            return new C2233041Cac(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "invitor", this.LJ, "invitee");
        throw null;
    }
}
