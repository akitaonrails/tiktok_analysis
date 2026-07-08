package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226861CDs extends Message.Builder<C2226841CDq, C2226861CDs> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226841CDq build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2226841CDq(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "message");
        throw null;
    }
}
