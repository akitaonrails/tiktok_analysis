package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227551CGj extends Message.Builder<C2227531CGh, C2227551CGj> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227531CGh build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2227531CGh(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "anchor_id");
        throw null;
    }
}
