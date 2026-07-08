package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226601CCs extends Message.Builder<C2226591CCr, C2226601CCs> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226591CCr build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2226591CCr(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "layout_layer");
        throw null;
    }
}
