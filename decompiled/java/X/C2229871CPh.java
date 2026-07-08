package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229871CPh extends Message.Builder<C2229861CPg, C2229871CPh> {
    public EnumC2183371Ach LIZLLL;
    public C2233531CbP LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229861CPg build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C2229861CPg(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "layout_data", this.LJFF, "parse_layout_cost_ms");
        throw null;
    }
}
