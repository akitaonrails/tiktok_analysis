package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248911D0n extends Message.Builder<C2248891D0l, C2248911D0n> {
    public C2248921D0o LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2248891D0l build() {
        C2248921D0o c2248921D0o = this.LIZLLL;
        if (c2248921D0o != null) {
            return new C2248891D0l(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2248921D0o, "stats");
        throw null;
    }
}
