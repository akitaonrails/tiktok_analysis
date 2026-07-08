package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ijj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253970ijj extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final Map<String, String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1253970ijj)) {
            return false;
        }
        C1253970ijj c1253970ijj = (C1253970ijj) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1253970ijj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1253970ijj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1253970ijj.LIZLLL) && Intrinsics.LJFF(this.LJ, c1253970ijj.LJ) && Intrinsics.LJFF(this.LJFF, c1253970ijj.LJFF) && Intrinsics.LJFF(this.LJI, c1253970ijj.LJI) && this.LJII == c1253970ijj.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJI;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowRecUserCellTracker(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", homepageUid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", imprOrder=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isRelatedRec=");
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

    public C1253970ijj(String str, User user, String str2, String str3, String str4, Integer num, boolean z) {
        this.LIZIZ = str;
        this.LIZJ = user;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = num;
        this.LJII = z;
        this.LJIIIIZZ = "show_recommend_user_cell";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        c2344009Gk.LJIIIIZZ("homepage_uid", str4);
        c2344009Gk.LJ(num, "impr_order");
        c2344009Gk.LJIIIIZZ("rec_uid", user.getUid());
        String friendTypeStr = user.getFriendTypeStr();
        String str5 = null;
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                friendTypeStr = matchedFriendStruct.relationType;
            } else {
                friendTypeStr = null;
            }
        }
        c2344009Gk.LJIIIIZZ("relation_type", friendTypeStr);
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                str5 = matchedFriendStruct2.recType;
            }
        } else {
            str5 = recType;
        }
        c2344009Gk.LJIIIIZZ("rec_type", str5);
        c2344009Gk.LJIIIIZZ("req_id", user.getRequestId());
        c2344009Gk.LJIIIIZZ("is_related_rec", AbstractC1223210hw7.LIZJ(z));
        this.LJIIIZ = c2344009Gk.LIZ;
    }

    public /* synthetic */ C1253970ijj(String str, User user, String str2, String str3, String str4, Integer num, int i) {
        this(str, user, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? num : null, false);
    }
}
