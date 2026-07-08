package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Chb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237371Chb extends Message.Builder<C2237351ChZ, C2237371Chb> {
    public C2237381Chc LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237351ChZ build() {
        C2237381Chc c2237381Chc = this.LIZLLL;
        if (c2237381Chc != null) {
            return new C2237351ChZ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2237381Chc, "layout_extra");
        throw null;
    }
}
