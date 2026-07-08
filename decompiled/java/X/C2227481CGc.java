package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227481CGc extends Message.Builder<C2227471CGb, C2227481CGc> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227471CGb build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2227471CGb(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "anchor_id");
        throw null;
    }
}
