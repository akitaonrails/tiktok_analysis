package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233691Cbf extends Message.Builder<C2233671Cbd, C2233691Cbf> {
    public EnumC2183371Ach LIZLLL;
    public C2233461CbI LJ;
    public C2233761Cbm LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public List<C2233221Cau> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1CWT> LJIIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233671Cbd build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJI != null) {
            return new C2233671Cbd(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "container_info", this.LJI, "resolution");
        throw null;
    }
}
