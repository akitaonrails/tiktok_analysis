package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0pqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527230pqT extends Message.Builder<C1527140pqK, C1527230pqT> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527140pqK build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1527140pqK(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "cursor");
        throw null;
    }
}
