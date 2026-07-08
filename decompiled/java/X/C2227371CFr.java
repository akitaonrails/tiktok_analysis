package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227371CFr extends Message.Builder<C2227361CFq, C2227371CFr> {
    public C2232021CXo LIZLLL;
    public C1CEH LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227361CFq build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null) {
            return new C2227361CFq(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "player");
        throw null;
    }
}
