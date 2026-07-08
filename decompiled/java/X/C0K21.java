package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.subscribe.model.BannerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K21, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K21 {
    public final String LIZ;
    public final Object LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Object LJI;
    public final Long LJII;
    public final Boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K21)) {
            return false;
        }
        C0K21 c0k21 = (C0K21) obj;
        return Intrinsics.LJFF(this.LIZ, c0k21.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k21.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k21.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k21.LIZLLL) && Intrinsics.LJFF(this.LJ, c0k21.LJ) && Intrinsics.LJFF(this.LJFF, c0k21.LJFF) && Intrinsics.LJFF(this.LJI, c0k21.LJI) && Intrinsics.LJFF(this.LJII, c0k21.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0k21.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        int iHashCode2 = (((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        Object obj2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l = this.LJII;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.LJIIIIZZ;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubFestBannerData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activityName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bannerBackground=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bannerId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hideNavigationBar=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K21(String str, ImageModel imageModel, String str2, String str3, String str4, String str5, BannerBackground bannerBackground, Long l, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = imageModel;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = bannerBackground;
        this.LJII = l;
        this.LJIIIIZZ = bool;
    }
}
