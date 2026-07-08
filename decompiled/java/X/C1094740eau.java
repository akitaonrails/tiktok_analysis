package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094740eau {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;
    public final ImageModel LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1094740eau)) {
            return false;
        }
        C1094740eau c1094740eau = (C1094740eau) obj;
        return Intrinsics.LJFF(this.LIZ, c1094740eau.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1094740eau.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1094740eau.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1094740eau.LIZLLL) && Intrinsics.LJFF(this.LJ, c1094740eau.LJ) && Intrinsics.LJFF(this.LJFF, c1094740eau.LJFF) && this.LJI == c1094740eau.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        ImageModel imageModel = this.LJFF;
        return ((iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfoGuideAnimData(businessType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", geckoChannel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lottieFileName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", subtitleText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", iconModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", timeOut=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1094740eau(String str, String str2, String str3, Map<String, String> map, String str4, ImageModel imageModel, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = str4;
        this.LJFF = imageModel;
        this.LJI = j;
    }
}
