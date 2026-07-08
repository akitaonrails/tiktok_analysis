package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230021CPw extends Message.Builder<C2230001CPu, C2230021CPw> {
    public Long LIZLLL;
    public C1CQM LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230001CPu build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2230001CPu(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "parallel_state_id", this.LJ, "state");
        throw null;
    }
}
