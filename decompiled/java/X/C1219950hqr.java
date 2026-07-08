package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.fans.GroupInviteItem;

/* JADX INFO: renamed from: X.0hqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219950hqr {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final List<GroupInviteItem> LIZLLL;
    public final List<InterfaceC1891350zJl> LJ;
    public final Long LJFF;

    public C1219950hqr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219950hqr)) {
            return false;
        }
        C1219950hqr c1219950hqr = (C1219950hqr) obj;
        return this.LIZ == c1219950hqr.LIZ && this.LIZIZ == c1219950hqr.LIZIZ && this.LIZJ == c1219950hqr.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1219950hqr.LIZLLL) && Intrinsics.LJFF(this.LJ, c1219950hqr.LJ) && Intrinsics.LJFF(this.LJFF, c1219950hqr.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Long l = this.LJFF;
        return iZ2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupChooseGroupState(isLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isTotalEmpty=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rawGroups=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rows=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", selectedShortId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1219950hqr(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(true, false, false, c13bv, c13bv, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1219950hqr(boolean z, boolean z2, boolean z3, List<GroupInviteItem> list, List<? extends InterfaceC1891350zJl> list2, Long l) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = l;
    }

    public static C1219950hqr LIZ(C1219950hqr c1219950hqr, boolean z, boolean z2, boolean z3, List list, List list2, Long l, int i) {
        Long l2 = l;
        List list3 = list2;
        List list4 = list;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c1219950hqr.LIZ;
        }
        if ((i & 2) != 0) {
            z5 = c1219950hqr.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c1219950hqr.LIZJ;
        }
        if ((i & 8) != 0) {
            list4 = c1219950hqr.LIZLLL;
        }
        if ((i & 16) != 0) {
            list3 = c1219950hqr.LJ;
        }
        if ((i & 32) != 0) {
            l2 = c1219950hqr.LJFF;
        }
        c1219950hqr.getClass();
        return new C1219950hqr(z6, z5, z4, list4, list3, l2);
    }
}
