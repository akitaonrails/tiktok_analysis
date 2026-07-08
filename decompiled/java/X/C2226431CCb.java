package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226431CCb extends Message.Builder<C1CCZ, C2226431CCb> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CCZ build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CCZ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "related_user");
        throw null;
    }
}
