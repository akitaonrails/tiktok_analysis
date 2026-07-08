package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293490jlT implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final InterfaceC1293620jlg<PointF, PointF> LIZIZ;
    public final C1293140jku LIZJ;
    public final C1292960jkc LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RectangleShape{position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        return new C1293400jlK(c1291430ji9, abstractC1292630jk5, this);
    }

    public C1293490jlT(String str, InterfaceC1293620jlg<PointF, PointF> interfaceC1293620jlg, C1293140jku c1293140jku, C1292960jkc c1292960jkc) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1293620jlg;
        this.LIZJ = c1293140jku;
        this.LIZLLL = c1292960jkc;
    }
}
