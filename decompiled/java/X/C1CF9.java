package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CF9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF9 extends Message.Builder<C1CF8, C1CF9> {
    public C1CFA LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CF8 build() {
        C1CFA c1cfa = this.LIZLLL;
        if (c1cfa != null) {
            return new C1CF8(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cfa, "ret");
        throw null;
    }
}
