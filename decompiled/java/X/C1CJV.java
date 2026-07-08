package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJV extends Message.Builder<C1CJU, C1CJV> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJU build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CJU(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
