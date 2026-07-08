package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPO extends Message.Builder<C1CPN, C1CPO> {
    public C2232021CXo LIZLLL;
    public EnumC972740bQ8 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPN build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null) {
            return new C1CPN(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "offline_user", this.LJ, "kickout_reason");
        throw null;
    }
}
