package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.150P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150P implements InterfaceC20477315At {
    public String LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C150E LJ;
    public boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C150P)) {
            return false;
        }
        C150P c150p = (C150P) obj;
        return Intrinsics.LJFF(this.LIZ, c150p.LIZ) && Float.compare(this.LIZIZ, c150p.LIZIZ) == 0 && this.LIZJ == c150p.LIZJ && this.LIZLLL == c150p.LIZLLL && Intrinsics.LJFF(this.LJ, c150p.LJ) && this.LJFF == c150p.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextConfig(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", iconInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        return new C150P(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, 32);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        C150E c150e = this.LJ;
        return ((iHashCode + (c150e == null ? 0 : c150e.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJFF = z;
    }

    public C150P(String str, float f, int i, int i2, C150E c150e, int i3) {
        i2 = (i3 & 8) != 0 ? R.style.a9c : i2;
        c150e = (i3 & 16) != 0 ? null : c150e;
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = c150e;
        this.LJFF = false;
    }
}
