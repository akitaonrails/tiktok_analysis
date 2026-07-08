package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236141Cfc extends Message.Builder<C2236121Cfa, C2236141Cfc> {
    public C2236151Cfd LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236121Cfa build() {
        C2236151Cfd c2236151Cfd = this.LIZLLL;
        if (c2236151Cfd != null && this.LJ != null) {
            return new C2236121Cfa(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236151Cfd, "param", this.LJ, "callback");
        throw null;
    }
}
