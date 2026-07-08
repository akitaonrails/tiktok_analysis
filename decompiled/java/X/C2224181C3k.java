package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224181C3k extends Message.Builder<C2224161C3i, C2224181C3k> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224161C3i build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2224161C3i(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
