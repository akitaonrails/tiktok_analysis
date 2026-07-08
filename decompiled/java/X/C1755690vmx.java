package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755690vmx implements InterfaceC0148002o {
    public final String LL;
    public final TabBarItemVO LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;

    public C1755690vmx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1755690vmx)) {
            return false;
        }
        C1755690vmx c1755690vmx = (C1755690vmx) obj;
        return Intrinsics.LJFF(this.LL, c1755690vmx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1755690vmx.LLILLJJLI) && this.LLILLL == c1755690vmx.LLILLL && this.LLILZ == c1755690vmx.LLILZ && this.LLILZIL == c1755690vmx.LLILZIL && this.LLILZLL == c1755690vmx.LLILZLL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TabBarItemVO tabBarItemVO = this.LLILLJJLI;
        return ((((((((iHashCode + (tabBarItemVO != null ? tabBarItemVO.hashCode() : 0)) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpTabBarState(currentFocusModule=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabBarItemVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bodyContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", tabBarHeight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scrollOffset=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isTabClickInProgress=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1755690vmx(int i) {
        this(null, null, -1, 0, 0, false);
    }

    public C1755690vmx(String str, TabBarItemVO tabBarItemVO, int i, int i2, int i3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = tabBarItemVO;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = z;
    }

    public static C1755690vmx LIZ(C1755690vmx c1755690vmx, String str, TabBarItemVO tabBarItemVO, int i, int i2, int i3, boolean z, int i4) {
        boolean z2 = z;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        TabBarItemVO tabBarItemVO2 = tabBarItemVO;
        String str2 = str;
        if ((i4 & 1) != 0) {
            str2 = c1755690vmx.LL;
        }
        if ((i4 & 2) != 0) {
            tabBarItemVO2 = c1755690vmx.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i7 = c1755690vmx.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i6 = c1755690vmx.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i5 = c1755690vmx.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            z2 = c1755690vmx.LLILZLL;
        }
        c1755690vmx.getClass();
        return new C1755690vmx(str2, tabBarItemVO2, i7, i6, i5, z2);
    }
}
