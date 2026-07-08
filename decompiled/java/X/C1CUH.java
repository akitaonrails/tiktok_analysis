package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUH extends Message.Builder<C1CUF, C1CUH> {
    public C1CUI LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CUF build() {
        Long l = this.LJ;
        if (l != null) {
            return new C1CUF(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "retry_count");
        throw null;
    }
}
