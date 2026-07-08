package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPI extends Message.Builder<C1CPH, C1CPI> {
    public String LIZLLL;
    public EnumC2189041Alq LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPH build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C1CPH(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "switch_id", this.LJ, "step", this.LJFF, "cost_ms");
        throw null;
    }
}
