package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232431CZd extends Message.Builder<C1CZY, C2232431CZd> {
    public C2232401CZa LIZLLL;
    public C2232401CZa LJ;
    public C2232401CZa LJFF;
    public C2232861CaK LJI;
    public C2232861CaK LJII;
    public C1CXA LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZY build() {
        C2232401CZa c2232401CZa = this.LIZLLL;
        if (c2232401CZa != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C1CZY(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232401CZa, "all_link_state", this.LJ, "inner_arch_link_state", this.LJFF, "cross_arch_link_state", this.LJI, "new_rtc_state", this.LJII, "old_rtc_state", this.LJIIIIZZ, "trigger_source");
        throw null;
    }
}
