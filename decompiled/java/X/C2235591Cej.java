package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235591Cej extends Message.Builder<C2235571Ceh, C2235591Cej> {
    public C2235601Cek LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235571Ceh build() {
        C2235601Cek c2235601Cek = this.LIZLLL;
        if (c2235601Cek != null) {
            return new C2235571Ceh(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235601Cek, "ret");
        throw null;
    }
}
