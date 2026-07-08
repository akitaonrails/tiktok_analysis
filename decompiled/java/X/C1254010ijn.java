package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ijn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254010ijn extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final Map<String, String> LJIILL;

    public C1254010ijn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254010ijn)) {
            return false;
        }
        C1254010ijn c1254010ijn = (C1254010ijn) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1254010ijn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1254010ijn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1254010ijn.LIZLLL) && Intrinsics.LJFF(this.LJ, c1254010ijn.LJ) && Intrinsics.LJFF(this.LJFF, c1254010ijn.LJFF) && Intrinsics.LJFF(this.LJI, c1254010ijn.LJI) && Intrinsics.LJFF(this.LJII, c1254010ijn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1254010ijn.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1254010ijn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1254010ijn.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1254010ijn.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1254010ijn.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1254010ijn.LJIILIIL);
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
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        Map<String, String> map = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJJI;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIL;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIILIIL;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "EnterProfileTracker(enterFrom=" + this.LIZIZ + ", user=" + this.LIZJ + ", enterMethod=" + this.LIZLLL + ", previousPage=" + this.LJ + ", homepageUid=" + this.LJFF + ", imprOrder=" + this.LJI + ", tabName=" + this.LJII + ", extra=" + this.LJIIIIZZ + ", searchKeyword=" + this.LJIIIZ + ", searchResultId=" + this.LJIIJ + ", searchId=" + this.LJIIJJI + ", friendsTabVersion=" + this.LJIIL + ", logPb=" + this.LJIILIIL + ')';
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJIILJJIL;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJIILL;
    }

    public C1254010ijn(String str, User user, String str2, String str3, String str4, Integer num, String str5, Map map, String str6, String str7, String str8, String str9, String str10, int i) {
        Integer num2 = num;
        String str11 = str5;
        Map map2 = map;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        String str15 = str9;
        String str16 = str10;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        num2 = (i & 32) != 0 ? null : num2;
        str11 = (i & 64) != 0 ? "" : str11;
        map2 = (i & 128) != 0 ? null : map2;
        str12 = (i & 256) != 0 ? null : str12;
        str13 = (i & 512) != 0 ? null : str13;
        str14 = (i & 1024) != 0 ? null : str14;
        str15 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str15;
        str16 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str16;
        this.LIZIZ = str;
        this.LIZJ = user;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = num2;
        this.LJII = str11;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = str12;
        this.LJIIJ = str13;
        this.LJIIJJI = str14;
        this.LJIIL = str15;
        this.LJIILIIL = str16;
        this.LJIILJJIL = "enter_personal_detail";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        c2344009Gk.LJIIIIZZ("homepage_uid", str4);
        c2344009Gk.LJ(num2, "impr_order");
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recType = matchedFriendStruct.recType;
            } else {
                recType = null;
            }
        }
        c2344009Gk.LJIIIIZZ("rec_type", recType);
        c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
        c2344009Gk.LJIIIIZZ("req_id", user.getRequestId());
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                friendTypeStr = matchedFriendStruct2.relationType;
            } else {
                friendTypeStr = null;
            }
        }
        c2344009Gk.LJIIIIZZ("relation_type", friendTypeStr);
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(user));
        c2344009Gk.LJIIIIZZ("tab_name", str11);
        if (C123100dR.LIZ(str12)) {
            c2344009Gk.LJFF("search_keyword", str12);
        }
        if (C123100dR.LIZ(str13)) {
            c2344009Gk.LJFF("search_result_id", str13);
        }
        if (C123100dR.LIZ(str14)) {
            c2344009Gk.LJFF("search_id", str14);
        }
        if (C123100dR.LIZ(str15)) {
            c2344009Gk.LJFF("friends_tab_version", str15);
        }
        if (C123100dR.LIZ(str16)) {
            c2344009Gk.LJFF("log_pb", str16);
        }
        C1365450ldX.LJ(c2344009Gk, user);
        c2344009Gk.LJII(map2);
        this.LJIILL = c2344009Gk.LIZ;
    }
}
