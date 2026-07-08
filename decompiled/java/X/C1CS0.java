package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CS0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS0 extends Message.Builder<C2230561CRy, C1CS0> {
    public EnumC2183371Ach LIZLLL;
    public EnumC2183371Ach LJ;
    public C2233401CbC LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230561CRy build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C2230561CRy(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "old_arch_type", this.LJ, "new_arch_type", this.LJFF, "source");
        throw null;
    }
}
