package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJ7 extends Message.Builder<C1CJ6, C1CJ7> {
    public EnumC2183371Ach LIZLLL;
    public C2233521CbO LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJ6 build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null) {
            return new C1CJ6(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "info");
        throw null;
    }
}
