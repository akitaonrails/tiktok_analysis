package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460970I5v implements C0I5T {
    public final UrlModel LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Function1<C1331670kl3, C1331670kl3> LIZLLL;
    public final String LJ;
    public final UrlModel LJFF;
    public final String LJI;
    public final EnumC460760I5a LJII;

    public C460970I5v() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedPreview(urlModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fallbackRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bgDrawableRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lightenConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", authorUrlModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", authorNickname=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", badgeType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        List<String> urlList = this.LIZ.getUrlList();
        int iHashCode = (((urlList != null ? urlList.hashCode() : 0) * 31) + this.LJ.hashCode()) * 31;
        List<String> urlList2 = this.LJFF.getUrlList();
        return ((iHashCode + (urlList2 != null ? urlList2.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public final boolean equals(Object obj) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        String str;
        String str2;
        String str3;
        String str4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460970I5v)) {
            return false;
        }
        List<String> urlList = this.LIZ.getUrlList();
        String strLIZ4 = null;
        if (urlList != null && (str4 = (String) C13LP.LJJJLL(urlList)) != null) {
            strLIZ = C0I6D.LIZ(str4);
        } else {
            strLIZ = null;
        }
        C460970I5v c460970I5v = (C460970I5v) obj;
        List<String> urlList2 = c460970I5v.LIZ.getUrlList();
        if (urlList2 != null && (str3 = (String) C13LP.LJJJLL(urlList2)) != null) {
            strLIZ2 = C0I6D.LIZ(str3);
        } else {
            strLIZ2 = null;
        }
        if (Intrinsics.LJFF(strLIZ, strLIZ2) && Intrinsics.LJFF(this.LJ, c460970I5v.LJ)) {
            List<String> urlList3 = this.LJFF.getUrlList();
            if (urlList3 != null && (str2 = (String) C13LP.LJJJLL(urlList3)) != null) {
                strLIZ3 = C0I6D.LIZ(str2);
            } else {
                strLIZ3 = null;
            }
            List<String> urlList4 = c460970I5v.LJFF.getUrlList();
            if (urlList4 != null && (str = (String) C13LP.LJJJLL(urlList4)) != null) {
                strLIZ4 = C0I6D.LIZ(str);
            }
            if (Intrinsics.LJFF(strLIZ3, strLIZ4) && Intrinsics.LJFF(this.LJI, c460970I5v.LJI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C460970I5v(UrlModel urlModel, Integer num, String str, UrlModel urlModel2, String str2, EnumC460760I5a enumC460760I5a) {
        this.LIZ = urlModel;
        this.LIZIZ = num;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = str;
        this.LJFF = urlModel2;
        this.LJI = str2;
        this.LJII = enumC460760I5a;
    }
}
