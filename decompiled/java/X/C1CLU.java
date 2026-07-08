package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLU extends Message.Builder<C1CLS, C1CLU> {
    public C1CLV LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLS build() {
        C1CLV c1clv = this.LIZLLL;
        if (c1clv != null) {
            return new C1CLS(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1clv, "ret");
        throw null;
    }
}
