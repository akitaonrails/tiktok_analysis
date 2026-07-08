package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDA extends Message.Builder<C1CD8, C1CDA> {
    public C1CD5 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CD8 build() {
        C1CD5 c1cd5 = this.LIZLLL;
        if (c1cd5 != null) {
            return new C1CD8(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cd5, "window_extra");
        throw null;
    }
}
