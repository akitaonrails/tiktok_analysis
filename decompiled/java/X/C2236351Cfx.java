package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236351Cfx extends Message.Builder<C2236331Cfv, C2236351Cfx> {
    public String LIZLLL;
    public EnumC2231981CXk LJ;
    public C2232021CXo LJFF;
    public C2232021CXo LJI;
    public C2236421Cg4 LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236331Cfv build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2236331Cfv(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "reply_type", this.LJFF, "invitor", this.LJI, "operator_p", this.LJII, "biz_params");
        throw null;
    }
}
