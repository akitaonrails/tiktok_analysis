package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoItemInfoModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.common.ProfileCustomConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531080KsE {
    public final boolean LIZ;
    public final String LIZIZ;
    public final AITheaterCameoItemInfoModel LIZJ;
    public final Integer LIZLLL;
    public final AIGCSocialModel LJ;
    public final AITheaterProfileEventModel LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final ProfileCustomConfig LJIIIZ;

    public C531080KsE() {
        this(false, null, null, null, null, null, false, false, false, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531080KsE)) {
            return false;
        }
        C531080KsE c531080KsE = (C531080KsE) obj;
        return this.LIZ == c531080KsE.LIZ && Intrinsics.LJFF(this.LIZIZ, c531080KsE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c531080KsE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c531080KsE.LIZLLL) && Intrinsics.LJFF(this.LJ, c531080KsE.LJ) && Intrinsics.LJFF(this.LJFF, c531080KsE.LJFF) && this.LJI == c531080KsE.LJI && this.LJII == c531080KsE.LJII && this.LJIIIIZZ == c531080KsE.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c531080KsE.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        AITheaterCameoItemInfoModel aITheaterCameoItemInfoModel = this.LIZJ;
        int iHashCode2 = (iHashCode + (aITheaterCameoItemInfoModel == null ? 0 : aITheaterCameoItemInfoModel.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AIGCSocialModel aIGCSocialModel = this.LJ;
        int iHashCode4 = (((((((((iHashCode3 + (aIGCSocialModel == null ? 0 : aIGCSocialModel.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        ProfileCustomConfig profileCustomConfig = this.LJIIIZ;
        return iHashCode4 + (profileCustomConfig != null ? profileCustomConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterProfileNavigateParams(refreshCameoState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startScreen=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initCameoInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", socialModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", profileEventModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", autoShowVisibilityScopeSheet=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showSucessPage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isNonProfileEntrance=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", customConfig=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531080KsE(boolean z, String str, AITheaterCameoItemInfoModel aITheaterCameoItemInfoModel, Integer num, AIGCSocialModel aIGCSocialModel, AITheaterProfileEventModel aITheaterProfileEventModel, boolean z2, boolean z3, boolean z4, ProfileCustomConfig profileCustomConfig, int i) {
        boolean z5 = z3;
        boolean z6 = z2;
        AITheaterProfileEventModel aITheaterProfileEventModel2 = aITheaterProfileEventModel;
        AIGCSocialModel aIGCSocialModel2 = aIGCSocialModel;
        Integer num2 = num;
        AITheaterCameoItemInfoModel aITheaterCameoItemInfoModel2 = aITheaterCameoItemInfoModel;
        String str2 = str;
        boolean z7 = (i & 1) != 0 ? false : z;
        str2 = (i & 2) != 0 ? null : str2;
        aITheaterCameoItemInfoModel2 = (i & 4) != 0 ? null : aITheaterCameoItemInfoModel2;
        num2 = (i & 8) != 0 ? null : num2;
        aIGCSocialModel2 = (i & 16) != 0 ? null : aIGCSocialModel2;
        aITheaterProfileEventModel2 = (i & 32) != 0 ? new AITheaterProfileEventModel(null, null, null, null, null, null, null, null, null, null, null, false, 4095) : aITheaterProfileEventModel2;
        z6 = (i & 64) != 0 ? false : z6;
        z5 = (i & 128) != 0 ? false : z5;
        boolean z8 = (i & 256) == 0 ? z4 : false;
        ProfileCustomConfig profileCustomConfig2 = (i & 512) == 0 ? profileCustomConfig : null;
        this.LIZ = z7;
        this.LIZIZ = str2;
        this.LIZJ = aITheaterCameoItemInfoModel2;
        this.LIZLLL = num2;
        this.LJ = aIGCSocialModel2;
        this.LJFF = aITheaterProfileEventModel2;
        this.LJI = z6;
        this.LJII = z5;
        this.LJIIIIZZ = z8;
        this.LJIIIZ = profileCustomConfig2;
    }
}
