package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232441CZe extends Message.Builder<C1CZV, C2232441CZe> {
    public Long LIZLLL;
    public String LJ;
    public C1CXW LJFF;
    public C2232831CaH LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZV build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null && this.LJI != null) {
            return new C1CZV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJFF, "state", this.LJI, "rtc_state");
        throw null;
    }
}
