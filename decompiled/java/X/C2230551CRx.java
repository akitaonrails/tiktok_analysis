package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230551CRx extends Message.Builder<C2230531CRv, C2230551CRx> {
    public EnumC2183371Ach LIZLLL;
    public String LJ;
    public C2233401CbC LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230531CRv build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C2230531CRv(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "layout_key", this.LJFF, "source");
        throw null;
    }
}
