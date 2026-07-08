package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229991CPt extends Message.Builder<C2229971CPr, C2229991CPt> {
    public Long LIZLLL;
    public C1CQM LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229971CPr build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2229971CPr(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "flow_id", this.LJ, "state");
        throw null;
    }
}
