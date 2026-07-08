package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224241C3q extends Message.Builder<C2224221C3o, C2224241C3q> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224221C3o build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2224221C3o(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
