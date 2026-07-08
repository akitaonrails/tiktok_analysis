package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMA extends Message.Builder<C1CM8, C1CMA> {
    public Long LIZLLL;
    public C1CMV LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CM8 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CM8(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "retry_count", this.LJ, "error");
        throw null;
    }
}
