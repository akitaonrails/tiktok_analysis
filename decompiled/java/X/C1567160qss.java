package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567160qss {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C1567150qsr LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567160qss)) {
            return false;
        }
        C1567160qss c1567160qss = (C1567160qss) obj;
        return Intrinsics.LJFF(this.LIZ, c1567160qss.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1567160qss.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1567160qss.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1567160qss.LIZLLL) && Intrinsics.LJFF(this.LJ, c1567160qss.LJ) && this.LJFF == c1567160qss.LJFF && this.LJI == c1567160qss.LJI && Intrinsics.LJFF(this.LJII, c1567160qss.LJII) && this.LJIIIIZZ == c1567160qss.LJIIIIZZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int iHashCode5 = (((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        C1567150qsr c1567150qsr = this.LJII;
        return ((iHashCode5 + (c1567150qsr != null ? c1567150qsr.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelNoticeUiData(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", schemaText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showCloseButton=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showInfoIcon=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", autoLoginInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", linkExternalBrowser=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567160qss(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, C1567150qsr c1567150qsr, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = c1567150qsr;
        this.LJIIIIZZ = z3;
    }
}
