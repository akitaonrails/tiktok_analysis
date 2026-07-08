package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CV5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CV5 extends Message.Builder<C1CV3, C1CV5> {
    public C2231661CWe LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CV3 build() {
        C2231661CWe c2231661CWe = this.LIZLLL;
        if (c2231661CWe != null) {
            return new C1CV3(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2231661CWe, "im_model");
        throw null;
    }
}
