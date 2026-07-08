package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218060hno implements InterfaceC636340Oxc<C1218060hno, C1218000hni> {
    public final C627660Ojc<C1218000hni> LL;
    public final EnumC1217960hne LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final List<Long> LLILZIL;
    public final C291001Au<String> LLILZLL;
    public final C291001Au<String> LLIZ;

    public C1218060hno() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218060hno)) {
            return false;
        }
        C1218060hno c1218060hno = (C1218060hno) obj;
        return Intrinsics.LJFF(this.LL, c1218060hno.LL) && this.LLILLJJLI == c1218060hno.LLILLJJLI && this.LLILLL == c1218060hno.LLILLL && this.LLILZ == c1218060hno.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1218060hno.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1218060hno.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1218060hno.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuditRequestListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", auditListSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enableSelectAll=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedApplyIdList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", successToast=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", failureToast=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1218000hni> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1218000hni> getListState() {
        return this.LL;
    }

    public C1218060hno(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC1217960hne.SINGLE, 0, false, C13BV.INSTANCE, new C291001Au(""), new C291001Au(""));
    }

    public C1218060hno(C627660Ojc<C1218000hni> c627660Ojc, EnumC1217960hne enumC1217960hne, int i, boolean z, List<Long> list, C291001Au<String> c291001Au, C291001Au<String> c291001Au2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC1217960hne;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = c291001Au;
        this.LLIZ = c291001Au2;
    }

    public static C1218060hno LIZ(C1218060hno c1218060hno, C627660Ojc c627660Ojc, EnumC1217960hne enumC1217960hne, int i, boolean z, List list, C291001Au c291001Au, C291001Au c291001Au2, int i2) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        List list2 = list;
        boolean z2 = z;
        int i3 = i;
        EnumC1217960hne enumC1217960hne2 = enumC1217960hne;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i2 & 1) != 0) {
            c627660Ojc2 = c1218060hno.LL;
        }
        if ((i2 & 2) != 0) {
            enumC1217960hne2 = c1218060hno.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c1218060hno.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z2 = c1218060hno.LLILZ;
        }
        if ((i2 & 16) != 0) {
            list2 = c1218060hno.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au4 = c1218060hno.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au3 = c1218060hno.LLIZ;
        }
        c1218060hno.getClass();
        return new C1218060hno(c627660Ojc2, enumC1217960hne2, i3, z2, list2, c291001Au4, c291001Au3);
    }
}
