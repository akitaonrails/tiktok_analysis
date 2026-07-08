package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CS6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS6 extends Message.Builder<C1CS4, C1CS6> {
    public EnumC2183371Ach LIZLLL;
    public C2232721Ca6 LJ;
    public C2233401CbC LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CS4 build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C1CS4(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "model", this.LJFF, "source");
        throw null;
    }
}
