package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230051CPz extends Message.Builder<C2230031CPx, C2230051CPz> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230031CPx build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2230031CPx(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "parallel_state_id", this.LJ, "branch_id");
        throw null;
    }
}
