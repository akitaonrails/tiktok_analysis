package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B3O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3O extends C1B3W {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1B3O() {
        String str = null;
        this(str, str, str, str, str, str, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1B3O)) {
            return false;
        }
        C1B3O c1b3o = (C1B3O) obj;
        return Intrinsics.LJFF(this.LIZ, c1b3o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1b3o.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1b3o.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1b3o.LIZLLL) && Intrinsics.LJFF(this.LJ, c1b3o.LJ) && Intrinsics.LJFF(this.LJFF, c1b3o.LJFF) && Intrinsics.LJFF(this.LJI, c1b3o.LJI) && Intrinsics.LJFF(this.LJII, c1b3o.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1b3o.LJIIIIZZ);
    }

    @Override // X.C1B3W
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.LJII;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIIIZZ;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthResponse(authCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", grantedPermissions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorDescription=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", redirectUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", netErrorMessage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", netErrorCode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", netErrorStatusCode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1B3W
    public final void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        C786410Ut5.LJJJI("_bytedance_params_authcode", this.LIZ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_state", this.LIZIZ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_granted_permission", this.LIZJ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_auth_error", this.LIZLLL, bundle);
        C786410Ut5.LJJJI("_bytedance_params_auth_error_description", this.LJ, bundle);
    }

    public /* synthetic */ C1B3O(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null, null, null, null);
    }

    public C1B3O(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = num;
        this.LJIIIIZZ = num2;
    }
}
