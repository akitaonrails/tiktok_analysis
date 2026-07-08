package X;

import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549290LgV implements InterfaceC549230LgP {
    public final String LIZ;
    public final AITheaterCameoImageModel LIZIZ;
    public final AITheaterCameoSetting LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549290LgV)) {
            return false;
        }
        C549290LgV c549290LgV = (C549290LgV) obj;
        return Intrinsics.LJFF(this.LIZ, c549290LgV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c549290LgV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c549290LgV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c549290LgV.LIZLLL) && Intrinsics.LJFF(this.LJ, c549290LgV.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Integer num = this.LJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Available(cameoId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cameoSetting=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", faceIdCreatedWay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", activateFilter=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C549290LgV(String str, AITheaterCameoImageModel aITheaterCameoImageModel, AITheaterCameoSetting aITheaterCameoSetting) {
        this(str, aITheaterCameoImageModel, aITheaterCameoSetting, "", null);
    }

    public C549290LgV(String str, AITheaterCameoImageModel aITheaterCameoImageModel, AITheaterCameoSetting aITheaterCameoSetting, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = aITheaterCameoImageModel;
        this.LIZJ = aITheaterCameoSetting;
        this.LIZLLL = str2;
        this.LJ = num;
    }
}
