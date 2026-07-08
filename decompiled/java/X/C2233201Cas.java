package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233201Cas extends Message.Builder<C2233171Cap, C2233201Cas> {
    public Long LIZLLL;
    public C1CW4 LJ;
    public C1CO9 LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233171Cap build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2233171Cap(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "spot_id");
        throw null;
    }
}
