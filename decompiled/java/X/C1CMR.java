package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMR extends Message.Builder<C1CMP, C1CMR> {
    public String LIZLLL;
    public C1CMS LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMP build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CMP(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "content");
        throw null;
    }
}
