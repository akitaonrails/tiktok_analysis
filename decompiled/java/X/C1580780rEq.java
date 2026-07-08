package X;

import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarListItemIcon;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580780rEq implements InterfaceC1580740rEm {
    public final String LIZ;
    public final String LIZIZ;
    public final SideBarListItemIcon LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final SideBarComponentAction LJFF;
    public final List<SideBarComponentEventParams> LJI;
    public final Map<String, Object> LJII;
    public final int LJIIIIZZ;

    public C1580780rEq() {
        this(null, null, null, null, null, null, 255);
    }

    @Override // X.InterfaceC1580740rEm
    public final int LIZIZ(int i) {
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580780rEq)) {
            return false;
        }
        C1580780rEq c1580780rEq = (C1580780rEq) obj;
        return Intrinsics.LJFF(this.LIZ, c1580780rEq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1580780rEq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1580780rEq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1580780rEq.LIZLLL) && Intrinsics.LJFF(this.LJ, c1580780rEq.LJ) && Intrinsics.LJFF(this.LJFF, c1580780rEq.LJFF) && Intrinsics.LJFF(this.LJI, c1580780rEq.LJI) && Intrinsics.LJFF(this.LJII, c1580780rEq.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SideBarListItemIcon sideBarListItemIcon = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (sideBarListItemIcon == null ? 0 : sideBarListItemIcon.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SideBarComponentAction sideBarComponentAction = this.LJFF;
        int iHashCode6 = (iHashCode5 + (sideBarComponentAction == null ? 0 : sideBarComponentAction.hashCode())) * 31;
        List<SideBarComponentEventParams> list = this.LJI;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.LJII;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarRowListItemConfig(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", customInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1580740rEm
    public final int getContentType() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1580750rEn
    public final boolean LIZ(InterfaceC1580740rEm interfaceC1580740rEm) {
        return Intrinsics.LJFF(interfaceC1580740rEm, this);
    }

    public C1580780rEq(SideBarListItemIcon sideBarListItemIcon, String str, String str2, SideBarComponentAction sideBarComponentAction, List list, Map map, int i) {
        sideBarListItemIcon = (i & 4) != 0 ? null : sideBarListItemIcon;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        sideBarComponentAction = (i & 32) != 0 ? null : sideBarComponentAction;
        list = (i & 64) != 0 ? null : list;
        map = (i & 128) != 0 ? null : map;
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = sideBarListItemIcon;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = sideBarComponentAction;
        this.LJI = list;
        this.LJII = map;
        this.LJIIIIZZ = 50000;
    }
}
