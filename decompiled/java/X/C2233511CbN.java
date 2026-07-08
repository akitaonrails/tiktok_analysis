package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233511CbN extends Message.Builder<C2233491CbL, C2233511CbN> {
    public EnumC2183371Ach LIZLLL;
    public C2233581CbU LJ;
    public List<C2233171Cap> LJFF = C1516540pZE.LJIIIIZZ();
    public C2233401CbC LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233491CbL build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJI != null) {
            return new C2233491CbL(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "layout_state", this.LJI, "source");
        throw null;
    }
}
