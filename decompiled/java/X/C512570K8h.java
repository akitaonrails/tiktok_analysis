package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512570K8h {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;

    public C512570K8h() {
        this(null, null, null, null, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512570K8h)) {
            return false;
        }
        C512570K8h c512570K8h = (C512570K8h) obj;
        return this.LIZ == c512570K8h.LIZ && Intrinsics.LJFF(this.LIZIZ, c512570K8h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c512570K8h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c512570K8h.LIZLLL) && Intrinsics.LJFF(this.LJ, c512570K8h.LJ) && Intrinsics.LJFF(this.LJFF, c512570K8h.LJFF) && Intrinsics.LJFF(this.LJI, c512570K8h.LJI) && Intrinsics.LJFF(this.LJII, c512570K8h.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c512570K8h.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c512570K8h.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcPriceChangeNotifyData(fullScreen=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", profileUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hostName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", kindOfPlan=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", newPlanPrice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", oldPlanPrice=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nextBillingDate=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", noConfirmCancelContractDate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", confirmAction=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", dismissAction=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512570K8h(String str, String str2, String str3, String str4, String str5, String str6, String str7, C511760K5e c511760K5e, C511780K5g c511780K5g, int i) {
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        str5 = (i & 32) != 0 ? "" : str5;
        str6 = (i & 64) != 0 ? "" : str6;
        str7 = (i & 128) != 0 ? "" : str7;
        Function0<Unit> function0 = (i & 256) != 0 ? AFwS193S0000000_7.get$arr$(323) : c511760K5e;
        Function0<Unit> function02 = (i & 512) != 0 ? AFwS193S0000000_7.get$arr$(324) : c511780K5g;
        this.LIZ = false;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = function0;
        this.LJIIIZ = function02;
    }
}
