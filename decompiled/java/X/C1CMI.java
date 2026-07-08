package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMI extends Message.Builder<C1CMG, C1CMI> {
    public C1CMD LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMG build() {
        C1CMD c1cmd = this.LIZLLL;
        if (c1cmd != null) {
            return new C1CMG(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cmd, "res");
        throw null;
    }
}
