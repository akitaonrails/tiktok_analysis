package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233391CbB extends Message.Builder<C2233371Cb9, C2233391CbB> {
    public EnumC2183371Ach LIZLLL;
    public List<C1CZJ> LJ = C1516540pZE.LJIIIIZZ();
    public C2233351Cb7 LJFF;
    public C2233401CbC LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233371Cb9 build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJI != null) {
            return new C2233371Cb9(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJI, "source");
        throw null;
    }
}
