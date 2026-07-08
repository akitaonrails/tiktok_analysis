package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156070gBp extends AbstractC1156110gBt {
    public final List<Long> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final Long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156070gBp)) {
            return false;
        }
        C1156070gBp c1156070gBp = (C1156070gBp) obj;
        return Intrinsics.LJFF(this.LIZ, c1156070gBp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156070gBp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1156070gBp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1156070gBp.LIZLLL) && Intrinsics.LJFF(this.LJ, c1156070gBp.LJ) && Intrinsics.LJFF(this.LJFF, c1156070gBp.LJFF) && Intrinsics.LJFF(this.LJI, c1156070gBp.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Long l = this.LJFF;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJI;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Create(toUserIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clientRequestId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", clientSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", entranceType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", preEntranceType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1156110gBt
    public final String LIZ() {
        return this.LJ;
    }

    public C1156070gBp(List<Long> list, String str, String str2, String str3, String str4, Long l, Long l2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = l;
        this.LJI = l2;
    }
}
