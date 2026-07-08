package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3C extends Message.Builder<C1C3A, C1C3C> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3A build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C3A(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "priority");
        throw null;
    }
}
