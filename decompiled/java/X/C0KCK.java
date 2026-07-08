package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KCK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCK {
    public PGCTemplateListData LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public PGCTemplateInfo LIZLLL;
    public EnumC514050KDz LJ;
    public List<? extends C0KQD> LJFF;
    public Integer LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public C0KCK() {
        this(null, false, 0, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KCK)) {
            return false;
        }
        C0KCK c0kck = (C0KCK) obj;
        return Intrinsics.LJFF(this.LIZ, c0kck.LIZ) && this.LIZIZ == c0kck.LIZIZ && this.LIZJ == c0kck.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kck.LIZLLL) && this.LJ == c0kck.LJ && Intrinsics.LJFF(this.LJFF, c0kck.LJFF) && Intrinsics.LJFF(this.LJI, c0kck.LJI);
    }

    public final int hashCode() {
        PGCTemplateListData pGCTemplateListData = this.LIZ;
        int iHashCode = (((((pGCTemplateListData == null ? 0 : pGCTemplateListData.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31;
        PGCTemplateInfo pGCTemplateInfo = this.LIZLLL;
        int iHashCode2 = (iHashCode + (pGCTemplateInfo == null ? 0 : pGCTemplateInfo.hashCode())) * 31;
        EnumC514050KDz enumC514050KDz = this.LJ;
        int iHashCode3 = (iHashCode2 + (enumC514050KDz == null ? 0 : enumC514050KDz.hashCode())) * 31;
        List<? extends C0KQD> list = this.LJFF;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LJI;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraCallbackData(templateListData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subScenario=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activeContract=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preCheckResult=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", preCheckAllowPath=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", planChangeBlockStatus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KCK(PGCTemplateListData pGCTemplateListData, boolean z, int i, PGCTemplateInfo pGCTemplateInfo, int i2) {
        pGCTemplateListData = (i2 & 1) != 0 ? null : pGCTemplateListData;
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? 0 : i;
        pGCTemplateInfo = (i2 & 8) != 0 ? null : pGCTemplateInfo;
        this.LIZ = pGCTemplateListData;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = pGCTemplateInfo;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }
}
