package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850670yG9 implements InterfaceC1850680yGA {
    public final List<C1850650yG7> LIZ;
    public final C1850700yGC LIZIZ;
    public final C1850700yGC LIZJ;

    public C1850670yG9() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1850670yG9)) {
            return false;
        }
        C1850670yG9 c1850670yG9 = (C1850670yG9) obj;
        return Intrinsics.LJFF(this.LIZ, c1850670yG9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1850670yG9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1850670yG9.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1850700yGC c1850700yGC = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1850700yGC == null ? 0 : c1850700yGC.hashCode())) * 31;
        C1850700yGC c1850700yGC2 = this.LIZJ;
        return iHashCode2 + (c1850700yGC2 != null ? c1850700yGC2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabBottomBarConfig(tabList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftBtnCfg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightBtnCfg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1850670yG9(List list, C1850700yGC c1850700yGC) {
        C1850700yGC c1850700yGC2 = new C1850700yGC(R.raw.icon_tick_fill, R.attr.uf, EnumC1850640yG6.APPLY);
        this.LIZ = list;
        this.LIZIZ = c1850700yGC;
        this.LIZJ = c1850700yGC2;
    }
}
