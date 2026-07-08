package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20532315Vx implements C15W0 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final LogPbBean LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final long LJIIL;
    public final HashMap<String, String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final Long LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public String LJIJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20532315Vx)) {
            return false;
        }
        C20532315Vx c20532315Vx = (C20532315Vx) obj;
        return Intrinsics.LJFF(this.LIZ, c20532315Vx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20532315Vx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20532315Vx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20532315Vx.LIZLLL) && Intrinsics.LJFF(this.LJ, c20532315Vx.LJ) && Intrinsics.LJFF(this.LJFF, c20532315Vx.LJFF) && Intrinsics.LJFF(this.LJI, c20532315Vx.LJI) && Intrinsics.LJFF(this.LJII, c20532315Vx.LJII) && this.LJIIIIZZ == c20532315Vx.LJIIIIZZ && this.LJIIIZ == c20532315Vx.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c20532315Vx.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c20532315Vx.LJIIJJI) && this.LJIIL == c20532315Vx.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c20532315Vx.LJIILIIL) && this.LJIILJJIL == c20532315Vx.LJIILJJIL && this.LJIILL == c20532315Vx.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c20532315Vx.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c20532315Vx.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c20532315Vx.LJIJ) && Intrinsics.LJFF(this.LJIJI, c20532315Vx.LJIJI);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LogPbBean logPbBean = this.LJII;
        int iHashCode7 = (((((iHashCode6 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31;
        String str5 = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJJI;
        int iHashCode9 = (((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Y2(this.LJIIL)) * 31;
        HashMap<String, String> map = this.LJIILIIL;
        int iHashCode10 = (((((iHashCode9 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + this.LJIILL) * 31;
        Long l = this.LJIILLIIL;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.LJIIZILJ;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIJ;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIJI;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return "DisappearExploreCardET(enterFrom=" + this.LIZ + ", enterMethod=" + this.LIZIZ + ", cardPosition=" + this.LIZJ + ", cardIndex=" + this.LIZLLL + ", groupId=" + this.LJ + ", authorId=" + this.LJFF + ", requestId=" + this.LJI + ", logPb=" + this.LJII + ", isAccurate=" + this.LJIIIIZZ + ", awemeType=" + this.LJIIIZ + ", displayedTitle=" + this.LJIIJ + ", modifiedTitle=" + this.LJIIJJI + ", duration=" + this.LJIIL + ", showTitleParams=" + this.LJIILIIL + ", isCachedItem=" + this.LJIILJJIL + ", modelSource=" + this.LJIILL + ", topicId=" + this.LJIILLIIL + ", topicName=" + this.LJIIZILJ + ", fromExplorePage=" + this.LJIJ + ", showCommentNumber=" + this.LJIJI + ')';
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("card_position", this.LIZJ);
        c2344009Gk.LJ(this.LIZLLL, "card_index");
        c2344009Gk.LJIIIIZZ("group_id", this.LJ);
        c2344009Gk.LJIIIIZZ("author_id", this.LJFF);
        c2344009Gk.LJIIIIZZ("request_id", this.LJI);
        c2344009Gk.LJ(this.LJII, "log_pb");
        c2344009Gk.LIZJ(this.LJIIIZ, "aweme_type");
        c2344009Gk.LJIIIIZZ("displayed_title", this.LJIIJ);
        c2344009Gk.LJIIIIZZ("modified_title", this.LJIIJJI);
        c2344009Gk.LIZLLL(this.LJIIL, "duration");
        c2344009Gk.LIZJ(this.LJIILL, "model_source");
        c2344009Gk.LJIIIIZZ("show_comment_number", this.LJIJI);
        c2344009Gk.LJI(this.LJIILIIL);
        C15WT.LIZIZ.LJIILIIL(c2344009Gk, this.LIZ, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ);
        return c2344009Gk.LIZ;
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LJIJJ;
    }

    public C20532315Vx(String str, String str2, String str3, Integer num, String str4, String str5, String str6, LogPbBean logPbBean, boolean z, int i, String str7, String str8, long j, HashMap<String, String> map, boolean z2, int i2, Long l, String str9, String str10, String str11) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = logPbBean;
        this.LJIIIIZZ = z;
        this.LJIIIZ = i;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
        this.LJIIL = j;
        this.LJIILIIL = map;
        this.LJIILJJIL = z2;
        this.LJIILL = i2;
        this.LJIILLIIL = l;
        this.LJIIZILJ = str9;
        this.LJIJ = str10;
        this.LJIJI = str11;
        this.LJIJJ = "disappear_explore_card";
        if (z2) {
            this.LJIJJ = "disappear_explore_card_cache";
            if (z) {
                this.LJIJJ = "disappear_explore_card_cache_accurate";
                return;
            }
            return;
        }
        if (!z) {
            return;
        }
        this.LJIJJ = "disappear_explore_card_accurate";
    }
}
