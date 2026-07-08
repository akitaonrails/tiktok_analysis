package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233451CbH extends Message.Builder<C2233431CbF, C2233451CbH> {
    public EnumC2183371Ach LIZLLL;
    public C2229791COz LJFF;
    public C2233461CbI LJI;
    public C2233351Cb7 LJIIIIZZ;
    public List<C2233221Cau> LJ = C1516540pZE.LJIIIIZZ();
    public List<C2233171Cap> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233431CbF build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJFF != null && this.LJI != null && this.LJIIIIZZ != null) {
            return new C2233431CbF(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJFF, "canvas_size", this.LJI, "sei_container_info", this.LJIIIIZZ, "layout_extra");
        throw null;
    }
}
