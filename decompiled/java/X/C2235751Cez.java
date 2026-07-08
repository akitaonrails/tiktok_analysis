package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235751Cez extends Message.Builder<C2235731Cex, C2235751Cez> {
    public String LIZLLL;
    public C1CX8 LJ;
    public Boolean LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235731Cex build() {
        C1CX8 c1cx8 = this.LJ;
        if (c1cx8 != null && this.LJFF != null && this.LJI != null) {
            return new C2235731Cex(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cx8, "recharge_reason", this.LJFF, "is_force", this.LJI, "arch_data_error");
        throw null;
    }
}
