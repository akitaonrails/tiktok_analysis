package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJM extends Message.Builder<C1CJK, C1CJM> {
    public Double LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJK build() {
        Double d = this.LIZLLL;
        if (d != null && this.LJ != null && this.LJFF != null) {
            return new C1CJK(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(d, "ratio", this.LJ, "width", this.LJFF, "height");
        throw null;
    }
}
