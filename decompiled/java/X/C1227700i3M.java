package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227700i3M {
    public String LIZ;
    public String LIZIZ;
    public EnumC1227710i3N LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public final Map<String, Map<String, String>> LJIIIIZZ;

    public C1227700i3M() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227700i3M)) {
            return false;
        }
        C1227700i3M c1227700i3M = (C1227700i3M) obj;
        return Intrinsics.LJFF(this.LIZ, c1227700i3M.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1227700i3M.LIZIZ) && this.LIZJ == c1227700i3M.LIZJ && this.LIZLLL == c1227700i3M.LIZLLL && this.LJ == c1227700i3M.LJ && this.LJFF == c1227700i3M.LJFF && this.LJI == c1227700i3M.LJI && this.LJII == c1227700i3M.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1227700i3M.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateGroupData(bizLine=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasClickedHeader=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fromContactPanel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isFirstRequestInPanel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", createTotalDurationStart=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fakeWriteSuccessTimeStamp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", eventExtraParamsMap=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1227700i3M(Object obj) {
        EnumC1227710i3N enumC1227710i3N = EnumC1227710i3N.UNSTARTED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = enumC1227710i3N;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = true;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = linkedHashMap;
    }
}
