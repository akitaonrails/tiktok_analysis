package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202330hOR implements C06W3 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public Boolean LJII;

    public C1202330hOR() {
        this(false, 3);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImmersiveConfig(autoDarkEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        C1202330hOR c1202330hOR;
        if (obj instanceof C1202330hOR) {
            c1202330hOR = (C1202330hOR) obj;
        } else {
            c1202330hOR = null;
        }
        if (c1202330hOR == null || this.LIZJ != c1202330hOR.LIZJ || this.LIZLLL != c1202330hOR.LIZLLL || this.LJ != c1202330hOR.LJ || this.LIZ != c1202330hOR.LIZ || !Intrinsics.LJFF(this.LJII, c1202330hOR.LJII) || this.LIZIZ != c1202330hOR.LIZIZ) {
            return false;
        }
        return true;
    }

    public C1202330hOR(boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 2) != 0 ? false : z;
        this.LIZ = z2;
        this.LIZIZ = z;
        this.LJFF = R.attr.z_;
        this.LJI = -1;
    }
}
