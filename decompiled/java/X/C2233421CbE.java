package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233421CbE extends Message.Builder<C2233401CbC, C2233421CbE> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public C2233611CbX LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233401CbC build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2233401CbC(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "switch_id", this.LJ, "source_str", this.LJFF, "source_id");
        throw null;
    }
}
