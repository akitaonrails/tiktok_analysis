package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228321CJi extends Message.Builder<C2228301CJg, C2228321CJi> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228301CJg build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2228301CJg(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "parent", this.LJ, "child", this.LJFF, "z_order");
        throw null;
    }
}
