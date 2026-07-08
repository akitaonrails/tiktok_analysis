package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228351CJl extends Message.Builder<C2228331CJj, C2228351CJl> {
    public Long LIZLLL;
    public C2232561CZq LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228331CJj build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2228331CJj(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "container", this.LJ, "frame", this.LJFF, "z_order");
        throw null;
    }
}
