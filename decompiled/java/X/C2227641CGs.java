package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227641CGs extends Message.Builder<C2227631CGr, C2227641CGs> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227631CGr build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2227631CGr(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "not_suggest_to_uid");
        throw null;
    }
}
