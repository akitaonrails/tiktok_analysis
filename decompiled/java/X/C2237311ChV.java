package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237311ChV extends Message.Builder<C2237291ChT, C2237311ChV> {
    public C2237321ChW LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237291ChT build() {
        C2237321ChW c2237321ChW = this.LIZLLL;
        if (c2237321ChW != null) {
            return new C2237291ChT(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2237321ChW, "spot_extra");
        throw null;
    }
}
