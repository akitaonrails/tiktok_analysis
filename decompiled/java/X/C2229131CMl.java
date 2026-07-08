package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229131CMl extends Message.Builder<C2229111CMj, C2229131CMl> {
    public C2229081CMg LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229111CMj build() {
        C2229081CMg c2229081CMg = this.LIZLLL;
        if (c2229081CMg != null && this.LJ != null) {
            return new C2229111CMj(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229081CMg, "request", this.LJ, "callback");
        throw null;
    }
}
