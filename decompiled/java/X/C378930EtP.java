package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378930EtP {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final List<C380190EvR> LJII;

    public C378930EtP() {
        this(false, false, false, false, null, null, false, C13BV.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378930EtP)) {
            return false;
        }
        C378930EtP c378930EtP = (C378930EtP) obj;
        return this.LIZ == c378930EtP.LIZ && this.LIZIZ == c378930EtP.LIZIZ && this.LIZJ == c378930EtP.LIZJ && this.LIZLLL == c378930EtP.LIZLLL && Intrinsics.LJFF(this.LJ, c378930EtP.LJ) && Intrinsics.LJFF(this.LJFF, c378930EtP.LJFF) && this.LJI == c378930EtP.LJI && Intrinsics.LJFF(this.LJII, c378930EtP.LJII);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelInitState(isFromAddPip=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCreateTemplate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelModifyState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isResultsPageI2VReentry=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentSlotId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", i2VSlotId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFirstAuthorized=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", modelList=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378930EtP(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, List<C380190EvR> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = z5;
        this.LJII = list;
    }
}
