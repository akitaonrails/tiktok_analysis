package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588660N6y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588660N6y)) {
            return false;
        }
        C588660N6y c588660N6y = (C588660N6y) obj;
        return Intrinsics.LJFF(this.LIZ, c588660N6y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c588660N6y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c588660N6y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c588660N6y.LIZLLL) && Intrinsics.LJFF(this.LJ, c588660N6y.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OmsdkFunnelModel(arch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", omsdkAdType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCarousel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C588660N6y(String str, String str2, String str3, String str4, int i) {
        String str5;
        String str6 = str4;
        String str7 = str2;
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        this(str, str5, (i & 4) != 0 ? "unknown" : str7, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str6);
    }

    public C588660N6y(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
