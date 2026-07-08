package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0pc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518270pc1 extends Message.Builder<C1518250pbz, C1518270pc1> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1518250pbz build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1518250pbz(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "value");
        throw null;
    }
}
