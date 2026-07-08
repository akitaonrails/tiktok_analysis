package X;

import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0ay2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955320ay2 {
    public final String LIZ;
    public final String LIZIZ;
    public final MultiGuestLayoutExtra LIZJ;
    public final String LIZLLL;
    public final MultiGuestLayoutNonSeiExtra LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalLayoutState(layoutId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", multiGuestLayoutExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cohostLayoutExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", multiGuestLayoutNonSeiExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostLayoutNonSeiExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C955320ay2(String str, String str2, MultiGuestLayoutExtra multiGuestLayoutExtra, String str3, MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra, int i) {
        this(str, str2, (i & 4) != 0 ? null : multiGuestLayoutExtra, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : multiGuestLayoutNonSeiExtra, (String) null);
    }

    public C955320ay2(String str, String str2, MultiGuestLayoutExtra multiGuestLayoutExtra, String str3, MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = multiGuestLayoutExtra;
        this.LIZLLL = str3;
        this.LJ = multiGuestLayoutNonSeiExtra;
        this.LJFF = str4;
    }
}
