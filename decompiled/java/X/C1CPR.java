package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPR extends Message.Builder<C1CPQ, C1CPR> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public EnumC972740bQ8 LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPQ build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C1CPQ(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "kickouter", this.LJFF, "kickout_reason");
        throw null;
    }
}
