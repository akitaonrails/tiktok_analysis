package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225971CAh extends Message.Builder<C2225951CAf, C2225971CAh> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225951CAf build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2225951CAf(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "config");
        throw null;
    }
}
