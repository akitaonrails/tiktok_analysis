package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQH extends Message.Builder<C1CQC, C1CQH> {
    public C2229141CMm LIZLLL;
    public C1CQI LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQC build() {
        C2229141CMm c2229141CMm = this.LIZLLL;
        if (c2229141CMm != null && this.LJ != null && this.LJFF != null) {
            return new C1CQC(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229141CMm, "error", this.LJ, "new_root_flow", this.LJFF, "new_state_id");
        throw null;
    }
}
