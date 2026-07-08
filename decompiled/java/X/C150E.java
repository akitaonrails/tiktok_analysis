package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.150E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150E {
    public final String LIZ;
    public final EnumC20439114yL LIZIZ;
    public final float LIZJ;
    public final Integer LIZLLL;
    public final EnumC992470bvx LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C150E)) {
            return false;
        }
        C150E c150e = (C150E) obj;
        return Intrinsics.LJFF(this.LIZ, c150e.LIZ) && this.LIZIZ == c150e.LIZIZ && Float.compare(this.LIZJ, c150e.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c150e.LIZLLL) && this.LJ == c150e.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconInfo(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconResStyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", colorResStyle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode();
    }

    public C150E(String str, EnumC20439114yL enumC20439114yL, float f, int i) {
        Integer numValueOf;
        enumC20439114yL = (i & 2) != 0 ? EnumC20439114yL.ATTR_TYPE : enumC20439114yL;
        f = (i & 4) != 0 ? 0.0f : f;
        if ((i & 8) != 0) {
            numValueOf = Integer.valueOf(R.attr.exp);
        } else {
            numValueOf = null;
        }
        EnumC992470bvx enumC992470bvx = (i & 16) != 0 ? EnumC992470bvx.ATTR_STYLE : null;
        this.LIZ = str;
        this.LIZIZ = enumC20439114yL;
        this.LIZJ = f;
        this.LIZLLL = numValueOf;
        this.LJ = enumC992470bvx;
    }
}
