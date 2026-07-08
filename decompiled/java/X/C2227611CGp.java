package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227611CGp extends Message.Builder<C2227601CGo, C2227611CGp> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227601CGo build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2227601CGo(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "display_id");
        throw null;
    }
}
