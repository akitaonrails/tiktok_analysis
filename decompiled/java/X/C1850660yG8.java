package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850660yG8 implements InterfaceC1850680yGA {
    public final String LIZ;
    public final C1850700yGC LIZIZ;
    public final C1850700yGC LIZJ;
    public final C1850700yGC LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1850660yG8)) {
            return false;
        }
        C1850660yG8 c1850660yG8 = (C1850660yG8) obj;
        return Intrinsics.LJFF(this.LIZ, c1850660yG8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1850660yG8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1850660yG8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1850660yG8.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1850700yGC c1850700yGC = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1850700yGC == null ? 0 : c1850700yGC.hashCode())) * 31;
        C1850700yGC c1850700yGC2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c1850700yGC2 == null ? 0 : c1850700yGC2.hashCode())) * 31;
        C1850700yGC c1850700yGC3 = this.LIZLLL;
        return iHashCode3 + (c1850700yGC3 != null ? c1850700yGC3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonBottomBarConfig(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftBtnCfg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightBtnCfg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", centerBtnCfg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1850660yG8(String str, C1850700yGC c1850700yGC, C1850700yGC c1850700yGC2, int i) {
        c1850700yGC = (i & 2) != 0 ? new C1850700yGC(R.raw.icon_x_mark, R.attr.uf, EnumC1850640yG6.BACK) : c1850700yGC;
        c1850700yGC2 = (i & 4) != 0 ? new C1850700yGC(R.raw.icon_tick_fill, R.attr.uf, EnumC1850640yG6.APPLY) : c1850700yGC2;
        this.LIZ = str;
        this.LIZIZ = c1850700yGC;
        this.LIZJ = c1850700yGC2;
        this.LIZLLL = null;
    }
}
