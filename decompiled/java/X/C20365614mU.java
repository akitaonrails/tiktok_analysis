package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14mU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20365614mU implements InterfaceC951240arS<Object> {
    public final C20359414lU LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final List<C20365514mT> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20365614mU)) {
            return false;
        }
        C20365614mU c20365614mU = (C20365614mU) obj;
        return Intrinsics.LJFF(this.LIZ, c20365614mU.LIZ) && this.LIZIZ == c20365614mU.LIZIZ && this.LIZJ == c20365614mU.LIZJ && Intrinsics.LJFF(this.LIZLLL, c20365614mU.LIZLLL) && Intrinsics.LJFF(this.LJ, c20365614mU.LJ) && this.LJFF == c20365614mU.LJFF && Intrinsics.LJFF(this.LJI, c20365614mU.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorStepItem(playbookStep=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", step=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stepCondition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", autoRunMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDesignCollectionStep=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", taskModels=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        List<String> list;
        List<String> list2;
        File file;
        File file2;
        Float fValueOf;
        Float fValueOf2;
        String str;
        String str2;
        String str3;
        if (!(obj instanceof C20365614mU)) {
            return false;
        }
        C20365614mU c20365614mU = (C20365614mU) obj;
        if (c20365614mU.LIZIZ != this.LIZIZ || c20365614mU.LIZJ != this.LIZJ || !Intrinsics.LJFF(c20365614mU.LIZLLL, this.LIZLLL) || !Intrinsics.LJFF(c20365614mU.LJ, this.LJ) || c20365614mU.LJFF != this.LJFF || c20365614mU.LJI.size() != this.LJI.size()) {
            return false;
        }
        ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(c20365614mU.LJI, this.LJI);
        if (!arrayList.isEmpty()) {
            for (Pair pair : arrayList) {
                C20365514mT c20365514mT = (C20365514mT) pair.getFirst();
                C20365514mT c20365514mT2 = (C20365514mT) pair.getSecond();
                if (c20365514mT.LIZJ != c20365514mT2.LIZJ || !Intrinsics.LJFF(c20365514mT.LIZIZ, c20365514mT2.LIZIZ) || !Intrinsics.LJFF(c20365514mT.LIZLLL, c20365514mT2.LIZLLL) || c20365514mT.LJIIIZ != c20365514mT2.LJIIIZ) {
                    return false;
                }
                C20365714mV c20365714mV = c20365514mT.LJFF;
                String str4 = null;
                if (c20365714mV != null) {
                    list = c20365714mV.LIZ;
                } else {
                    list = null;
                }
                C20365714mV c20365714mV2 = c20365514mT2.LJFF;
                if (c20365714mV2 != null) {
                    list2 = c20365714mV2.LIZ;
                } else {
                    list2 = null;
                }
                if (!Intrinsics.LJFF(list, list2)) {
                    return false;
                }
                C20365714mV c20365714mV3 = c20365514mT.LJFF;
                if (c20365714mV3 != null) {
                    file = c20365714mV3.LIZIZ;
                } else {
                    file = null;
                }
                C20365714mV c20365714mV4 = c20365514mT2.LJFF;
                if (c20365714mV4 != null) {
                    file2 = c20365714mV4.LIZIZ;
                } else {
                    file2 = null;
                }
                if (!Intrinsics.LJFF(file, file2)) {
                    return false;
                }
                C20365714mV c20365714mV5 = c20365514mT.LJFF;
                if (c20365714mV5 != null) {
                    fValueOf = Float.valueOf(c20365714mV5.LIZLLL);
                } else {
                    fValueOf = null;
                }
                C20365714mV c20365714mV6 = c20365514mT2.LJFF;
                if (c20365714mV6 != null) {
                    fValueOf2 = Float.valueOf(c20365714mV6.LIZLLL);
                } else {
                    fValueOf2 = null;
                }
                if (!Intrinsics.LJ(fValueOf, fValueOf2)) {
                    return false;
                }
                C20365714mV c20365714mV7 = c20365514mT.LJFF;
                if (c20365714mV7 != null) {
                    str = c20365714mV7.LJFF;
                } else {
                    str = null;
                }
                C20365714mV c20365714mV8 = c20365514mT2.LJFF;
                if (c20365714mV8 != null) {
                    str2 = c20365714mV8.LJFF;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str, str2)) {
                    return false;
                }
                C20365714mV c20365714mV9 = c20365514mT.LJFF;
                if (c20365714mV9 != null) {
                    str3 = c20365714mV9.LJI;
                } else {
                    str3 = null;
                }
                C20365714mV c20365714mV10 = c20365514mT2.LJFF;
                if (c20365714mV10 != null) {
                    str4 = c20365714mV10.LJI;
                }
                if (!Intrinsics.LJFF(str3, str4) || !Intrinsics.LJFF(c20365514mT.LJ, c20365514mT2.LJ) || !Intrinsics.LJFF(c20365514mT.LJI, c20365514mT2.LJI)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C20365614mU;
    }

    public C20365614mU(C20359414lU c20359414lU, long j, int i, String str, String str2, boolean z, List<C20365514mT> list) {
        this.LIZ = c20359414lU;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = list;
    }
}
