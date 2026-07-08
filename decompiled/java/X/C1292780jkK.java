package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0jkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292780jkK implements InterfaceC1292590jk1 {
    public final boolean LIZ;
    public final Path.FillType LIZIZ;
    public final String LIZJ;
    public final C1293050jkl LIZLLL;
    public final C1292990jkf LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapeFill{color=, fillEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        return new C1292770jkJ(c1291430ji9, abstractC1292630jk5, this);
    }

    public C1292780jkK(String str, boolean z, Path.FillType fillType, C1293050jkl c1293050jkl, C1292990jkf c1292990jkf) {
        this.LIZJ = str;
        this.LIZ = z;
        this.LIZIZ = fillType;
        this.LIZLLL = c1293050jkl;
        this.LJ = c1292990jkf;
    }
}
