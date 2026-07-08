package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C13FE;
import X.C1668650tWZ;
import X.C1681100tqe;
import X.C1681120tqg;
import X.C2188811AlT;
import X.InterfaceC1667470tUf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class MarqueeModifierElement extends AbstractC1685820tyG<C1681100tqe> {
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final InterfaceC1667470tUf LJFF;
    public final float LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.LIZIZ == marqueeModifierElement.LIZIZ && this.LIZJ == marqueeModifierElement.LIZJ && this.LIZLLL == marqueeModifierElement.LIZLLL && this.LJ == marqueeModifierElement.LJ && Intrinsics.LJFF(this.LJFF, marqueeModifierElement.LJFF) && C1668650tWZ.LIZJ(this.LJI, marqueeModifierElement.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarqueeModifierElement(iterations=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", animationMode=");
        sbLIZ.append((Object) C1681120tqg.LIZ(this.LIZJ));
        sbLIZ.append(", delayMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", initialDelayMillis=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", spacing=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", velocity=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LJI));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1681100tqe(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final int hashCode() {
        return (((((((((this.LIZIZ * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + Float.floatToIntBits(this.LJI);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1681100tqe c1681100tqe = (C1681100tqe) abstractC20055413dY;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        int i3 = this.LIZLLL;
        int i4 = this.LJ;
        InterfaceC1667470tUf interfaceC1667470tUf = this.LJFF;
        float f = this.LJI;
        ((C13FE) c1681100tqe.LLJJJJJIL).setValue(interfaceC1667470tUf);
        ((C13FE) c1681100tqe.LLJJJJLIIL).setValue(new C1681120tqg(i2));
        if (c1681100tqe.LLJJ != i || c1681100tqe.LLJJI != i3 || c1681100tqe.LLJJIII != i4 || !C1668650tWZ.LIZJ(c1681100tqe.LLJJIJI, f)) {
            c1681100tqe.LLJJ = i;
            c1681100tqe.LLJJI = i3;
            c1681100tqe.LLJJIII = i4;
            c1681100tqe.LLJJIJI = f;
            c1681100tqe.LLJJIJIIJIL();
        }
    }

    public MarqueeModifierElement(int i, int i2, int i3, int i4, InterfaceC1667470tUf interfaceC1667470tUf, float f) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = interfaceC1667470tUf;
        this.LJI = f;
    }
}
