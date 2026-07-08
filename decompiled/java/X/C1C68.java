package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C68, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C68 extends Message.Builder<C1C66, C1C68> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C66 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C66(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "select_count");
        throw null;
    }
}
