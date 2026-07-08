package X;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072550e17 extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC1070410dxf LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ = "authorize_card_show";
    public final Map<String, String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1072550e17)) {
            return false;
        }
        C1072550e17 c1072550e17 = (C1072550e17) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1072550e17.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1072550e17.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1072550e17.LIZLLL) && Intrinsics.LJFF(this.LJ, c1072550e17.LJ) && this.LJFF == c1072550e17.LJFF && Intrinsics.LJFF(this.LJI, c1072550e17.LJI) && this.LJII == c1072550e17.LJII;
    }

    public final int hashCode() {
        return (((((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthorizeCardShowTrack(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", homepageUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", followerCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJIIIZ;
    }

    public C1072550e17(String str, String str2, String str3, String str4, EnumC1070410dxf enumC1070410dxf, String str5, int i) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = enumC1070410dxf;
        this.LJI = str5;
        this.LJII = i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str4);
        c2344009Gk.LJIIIIZZ("homepage_uid", str3);
        c2344009Gk.LJIIIIZZ("position", str5);
        c2344009Gk.LJIIIIZZ("is_auth", AbstractC1223210hw7.LIZJ(false));
        c2344009Gk.LJIIIIZZ("platform", enumC1070410dxf.name().toLowerCase(Locale.ENGLISH));
        c2344009Gk.LJIIIIZZ("did_status", C1071810dzv.LIZ(enumC1070410dxf));
        c2344009Gk.LJIIIIZZ("uid_status", "off");
        if (i >= 0) {
            c2344009Gk.LJFF("to_user_id_follower_cnt", String.valueOf(i));
        }
        this.LJIIIZ = c2344009Gk.LIZ;
    }
}
