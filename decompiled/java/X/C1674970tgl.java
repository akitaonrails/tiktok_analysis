package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674970tgl {
    public final C1668880tWw LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;

    public C1674970tgl() {
        this(null, null, null, null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674970tgl)) {
            return false;
        }
        C1674970tgl c1674970tgl = (C1674970tgl) obj;
        return Intrinsics.LJFF(this.LIZ, c1674970tgl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674970tgl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674970tgl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1674970tgl.LIZLLL) && Intrinsics.LJFF(this.LJ, c1674970tgl.LJ) && Intrinsics.LJFF(this.LJFF, c1674970tgl.LJFF) && this.LJI == c1674970tgl.LJI;
    }

    public final int hashCode() {
        C1668880tWw c1668880tWw = this.LIZ;
        int iHashCode = (c1668880tWw == null ? 0 : c1668880tWw.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HangoutInteractModel(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundImageKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultBackgroundColorHex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", btnTitle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", innerFeedMgAggId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1674970tgl(C1668880tWw c1668880tWw, String str, String str2, String str3, String str4, String str5, int i) {
        this.LIZ = c1668880tWw;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = i;
    }
}
