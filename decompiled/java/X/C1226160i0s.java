package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226160i0s extends C1224340hxw {
    public final EnumC1224390hy1 LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final List<String> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226160i0s)) {
            return false;
        }
        C1226160i0s c1226160i0s = (C1226160i0s) obj;
        return this.LJ == c1226160i0s.LJ && this.LJFF == c1226160i0s.LJFF && this.LJI == c1226160i0s.LJI && this.LJII == c1226160i0s.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1226160i0s.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LJ.hashCode() * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        List<String> list = this.LJIIIIZZ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveInviteDataInteractProtocolConfig(selectMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxSelectableCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hideSelectBoxWhenMeetMax=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showActiveStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1224340hxw
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.C1224340hxw
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.C1224340hxw
    public final EnumC1224390hy1 LIZJ() {
        return this.LJ;
    }

    @Override // X.C1224340hxw
    public final boolean LIZLLL() {
        return this.LJII;
    }

    public C1226160i0s(EnumC1224390hy1 enumC1224390hy1, int i, List list) {
        super(enumC1224390hy1, i, true, true);
        this.LJ = enumC1224390hy1;
        this.LJFF = i;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = list;
    }
}
