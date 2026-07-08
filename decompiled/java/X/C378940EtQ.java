package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378940EtQ {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final List<Integer> LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public C378940EtQ() {
        this(false, null, null, null, null, 0, 0, false, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378940EtQ)) {
            return false;
        }
        C378940EtQ c378940EtQ = (C378940EtQ) obj;
        return this.LIZ == c378940EtQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c378940EtQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378940EtQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c378940EtQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c378940EtQ.LJ) && this.LJFF == c378940EtQ.LJFF && this.LJI == c378940EtQ.LJI && this.LJII == c378940EtQ.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c378940EtQ.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c378940EtQ.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        String str = this.LJIIIIZZ;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenTask(isVideo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskReqKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", supportedAspectRatios=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", supportedDurations=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageMaxRefCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", imageOutputCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", shouldDefaultToOriginal=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", autoSelectAspectRatioValue=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", degradeReqKey=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378940EtQ(boolean z, String str, String str2, List list, List list2, int i, int i2, boolean z2, String str3, String str4, int i3) {
        z = (i3 & 1) != 0 ? false : z;
        str = (i3 & 2) != 0 ? "" : str;
        str2 = (i3 & 4) != 0 ? "" : str2;
        list = (i3 & 8) != 0 ? C13BV.INSTANCE : list;
        list2 = (i3 & 16) != 0 ? C13BV.INSTANCE : list2;
        i = (i3 & 32) != 0 ? 0 : i;
        i2 = (i3 & 64) != 0 ? 1 : i2;
        z2 = (i3 & 128) != 0 ? false : z2;
        str3 = (i3 & 256) != 0 ? null : str3;
        str4 = (i3 & 512) != 0 ? "" : str4;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
    }
}
