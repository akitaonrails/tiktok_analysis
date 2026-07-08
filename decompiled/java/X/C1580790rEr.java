package X;

import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarListItemIcon;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580790rEr implements InterfaceC1580740rEm {
    public final SideBarListItemIcon LIZ;
    public final String LIZIZ;
    public final SideBarComponentAction LIZJ;
    public final List<SideBarComponentEventParams> LIZLLL;
    public final Map<String, Object> LJ;
    public final int LJFF;

    public C1580790rEr() {
        this(null, null, null, null, null);
    }

    @Override // X.InterfaceC1580740rEm
    public final int LIZIZ(int i) {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580790rEr)) {
            return false;
        }
        C1580790rEr c1580790rEr = (C1580790rEr) obj;
        return Intrinsics.LJFF(this.LIZ, c1580790rEr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1580790rEr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1580790rEr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1580790rEr.LIZLLL) && Intrinsics.LJFF(this.LJ, c1580790rEr.LJ);
    }

    public final int hashCode() {
        SideBarListItemIcon sideBarListItemIcon = this.LIZ;
        int iHashCode = (sideBarListItemIcon == null ? 0 : sideBarListItemIcon.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SideBarComponentAction sideBarComponentAction = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (sideBarComponentAction == null ? 0 : sideBarComponentAction.hashCode())) * 31;
        List<SideBarComponentEventParams> list = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.LJ;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarBoxListItemConfig(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", customInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1580740rEm
    public final int getContentType() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1580750rEn
    public final boolean LIZ(InterfaceC1580740rEm interfaceC1580740rEm) {
        return Intrinsics.LJFF(interfaceC1580740rEm, this);
    }

    public C1580790rEr(SideBarListItemIcon sideBarListItemIcon, String str, SideBarComponentAction sideBarComponentAction, List<SideBarComponentEventParams> list, Map<String, ? extends Object> map) {
        this.LIZ = sideBarListItemIcon;
        this.LIZIZ = str;
        this.LIZJ = sideBarComponentAction;
        this.LIZLLL = list;
        this.LJ = map;
        this.LJFF = 50001;
    }
}
