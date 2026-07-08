package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C4D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4D extends Message.Builder<C1C4B, C1C4D> {
    public Long LIZLLL;
    public C1CXP LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C4B build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1C4B(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "position", this.LJ, "content_type");
        throw null;
    }
}
