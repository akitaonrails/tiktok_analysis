package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252006o {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;
    public final String LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C0252006o() {
        this((String) null, (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0252006o)) {
            return false;
        }
        C0252006o c0252006o = (C0252006o) obj;
        return Intrinsics.LJFF(this.LIZ, c0252006o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0252006o.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0252006o.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0252006o.LIZLLL) && Intrinsics.LJFF(this.LJ, c0252006o.LJ) && this.LJFF == c0252006o.LJFF && Intrinsics.LJFF(this.LJI, c0252006o.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode5 = (((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str3 = this.LJI;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerPreviewConfig(previewUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previewUrlList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewUri=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isAnimated=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0252006o(String str, List list, String str2, Integer num, Integer num2, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (List<String>) ((i & 2) != 0 ? null : list), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? false : z, (String) null);
    }

    public C0252006o(String str, List<String> list, String str2, Integer num, Integer num2, boolean z, String str3) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = z;
        this.LJI = str3;
    }
}
