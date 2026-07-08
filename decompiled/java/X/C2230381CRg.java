package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230381CRg extends Message.Builder<C2230371CRf, C2230381CRg> {
    public C2232561CZq LIZLLL;
    public C2232561CZq LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230371CRf build() {
        C2232561CZq c2232561CZq = this.LIZLLL;
        if (c2232561CZq != null && this.LJ != null) {
            return new C2230371CRf(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232561CZq, "fullscreen", this.LJ, "central_operate_area");
        throw null;
    }
}
