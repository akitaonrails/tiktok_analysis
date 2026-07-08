package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228411CJr extends Message.Builder<C2228391CJp, C2228411CJr> {
    public C2232561CZq LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228391CJp build() {
        C2232561CZq c2232561CZq = this.LIZLLL;
        if (c2232561CZq != null) {
            return new C2228391CJp(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232561CZq, "rect");
        throw null;
    }
}
