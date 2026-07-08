package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228161CIs extends Message.Builder<C2228151CIr, C2228161CIs> {
    public EnumC2183371Ach LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228151CIr build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null) {
            return new C2228151CIr(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "ret");
        throw null;
    }
}
