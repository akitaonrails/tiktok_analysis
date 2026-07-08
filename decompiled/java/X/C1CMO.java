package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMO extends Message.Builder<C1CMM, C1CMO> {
    public C1CMP LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMM build() {
        C1CMP c1cmp = this.LIZLLL;
        if (c1cmp != null) {
            return new C1CMM(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cmp, "res");
        throw null;
    }
}
