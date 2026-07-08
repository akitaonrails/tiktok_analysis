package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230521CRu extends Message.Builder<C2230511CRt, C2230521CRu> {
    public EnumC2183371Ach LIZLLL;
    public C2230471CRp LJ;
    public C2233401CbC LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230511CRt build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C2230511CRt(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "error", this.LJFF, "source");
        throw null;
    }
}
