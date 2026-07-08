package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20365514mT implements InterfaceC20365314mR {
    public final C20361214lm LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final C20365714mV LJFF;
    public final String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public C20365514mT() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20365514mT)) {
            return false;
        }
        C20365514mT c20365514mT = (C20365514mT) obj;
        return Intrinsics.LJFF(this.LIZ, c20365514mT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20365514mT.LIZIZ) && this.LIZJ == c20365514mT.LIZJ && Intrinsics.LJFF(this.LIZLLL, c20365514mT.LIZLLL) && Intrinsics.LJFF(this.LJ, c20365514mT.LJ) && Intrinsics.LJFF(this.LJFF, c20365514mT.LJFF) && Intrinsics.LJFF(this.LJI, c20365514mT.LJI) && Intrinsics.LJFF(this.LJII, c20365514mT.LJII) && this.LJIIIIZZ == c20365514mT.LJIIIIZZ && this.LJIIIZ == c20365514mT.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.LJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C20365714mV c20365714mV = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c20365714mV == null ? 0 : c20365714mV.hashCode())) * 31;
        String str2 = this.LJI;
        return ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorExtraModel(playbookTask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stateId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", parameter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paramStrList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", customIconImg=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", taskCondition=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", group=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", groupIndex=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20365314mR
    public final int LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC20365314mR
    public final C20361214lm LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC20365314mR
    public final String LJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC20365314mR
    public final void LIZ(int i) {
        this.LJIIIZ = i;
    }

    @Override // X.InterfaceC20365314mR
    public final void LJ(int i) {
        this.LJIIIIZZ = i;
    }

    @Override // X.InterfaceC20365314mR
    public final void LJIIIIZZ(String str) {
        this.LJII = str;
    }

    public C20365514mT(C20361214lm c20361214lm, String str, long j, String str2, List list, C20365714mV c20365714mV, String str3) {
        this.LIZ = c20361214lm;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = list;
        this.LJFF = c20365714mV;
        this.LJI = str3;
        this.LJII = "";
        this.LJIIIIZZ = 0;
        this.LJIIIZ = -1;
    }
}
