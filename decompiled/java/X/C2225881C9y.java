package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225881C9y extends Message.Builder<C2225861C9w, C2225881C9y> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225861C9w build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2225861C9w(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
