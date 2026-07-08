package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQG extends Message.Builder<C1CQD, C1CQG> {
    public C2229141CMm LIZLLL;
    public Long LJ;
    public C1CQI LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQD build() {
        C2229141CMm c2229141CMm = this.LIZLLL;
        if (c2229141CMm != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C1CQD(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229141CMm, "error", this.LJ, "new_branch_id", this.LJFF, "new_root_flow", this.LJI, "new_state_id");
        throw null;
    }
}
