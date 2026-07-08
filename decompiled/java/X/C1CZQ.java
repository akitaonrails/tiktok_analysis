package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZQ extends Message.Builder<C1CZO, C1CZQ> {
    public C2232021CXo LIZLLL;
    public C1CZV LJ;
    public C1CXW LJFF;
    public C1CXW LJI;
    public EnumC2231731CWl LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZO build() {
        C1CZV c1czv = this.LJ;
        if (c1czv != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C1CZO(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c1czv, "user_link_state", this.LJFF, "new_state", this.LJI, "old_state", this.LJII, "trigger_event");
        throw null;
    }
}
