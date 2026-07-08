package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CS3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS3 extends Message.Builder<C1CS1, C1CS3> {
    public EnumC2183371Ach LIZLLL;
    public C1CSA LJ;
    public C2233401CbC LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CS1 build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C1CS1(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "result", this.LJFF, "source");
        throw null;
    }
}
