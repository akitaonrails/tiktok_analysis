package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233781Cbo extends Message.Builder<C2233761Cbm, C2233781Cbo> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233761Cbm build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2233761Cbm(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "width", this.LJ, "height");
        throw null;
    }
}
