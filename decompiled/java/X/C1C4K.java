package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C4K, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4K extends Message.Builder<C1C4J, C1C4K> {
    public String LIZLLL;
    public C1CXP LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C4J build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1C4J(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "content_id", this.LJ, "content_type");
        throw null;
    }
}
