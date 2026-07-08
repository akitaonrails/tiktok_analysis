package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232421CZc extends Message.Builder<C1CZU, C2232421CZc> {
    public C2232021CXo LIZLLL;
    public C1CZV LJ;
    public C2232831CaH LJFF;
    public C2232831CaH LJI;
    public C1CXV LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZU build() {
        C1CZV c1czv = this.LJ;
        if (c1czv != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C1CZU(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c1czv, "user_link_state", this.LJFF, "new_rtc_state", this.LJI, "old_rtc_state", this.LJII, "trigger_source");
        throw null;
    }
}
