package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785370wYp {
    public final User LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final List<RankListV2Response.RankLabel> LJI;
    public final C1780260wQa LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final C1777970wMt LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785370wYp)) {
            return false;
        }
        C1785370wYp c1785370wYp = (C1785370wYp) obj;
        return Intrinsics.LJFF(this.LIZ, c1785370wYp.LIZ) && this.LIZIZ == c1785370wYp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1785370wYp.LIZJ) && this.LIZLLL == c1785370wYp.LIZLLL && Intrinsics.LJFF(this.LJ, c1785370wYp.LJ) && this.LJFF == c1785370wYp.LJFF && Intrinsics.LJFF(this.LJI, c1785370wYp.LJI) && Intrinsics.LJFF(this.LJII, c1785370wYp.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1785370wYp.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1785370wYp.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1785370wYp.LJIIJ);
    }

    public final int hashCode() {
        User user = this.LIZ;
        int iHashCode = (((user == null ? 0 : user.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
        List<RankListV2Response.RankLabel> list = this.LJI;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C1780260wQa c1780260wQa = this.LJII;
        int iHashCode5 = (iHashCode4 + (c1780260wQa == null ? 0 : c1780260wQa.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C1777970wMt c1777970wMt = this.LJIIJ;
        return iHashCode7 + (c1777970wMt != null ? c1777970wMt.hashCode() : 0);
    }

    public final String toString() {
        return "CreatorRankItem(user=" + this.LIZ + ", rank=" + this.LIZIZ + ", rankStr=" + this.LIZJ + ", score=" + this.LIZLLL + ", scoreDescription=" + this.LJ + ", roomId=" + this.LJFF + ", labels=" + this.LJI + ", interactAction=" + this.LJII + ", classLabelTipText=" + this.LJIIIIZZ + ", classLabelTextColor=" + this.LJIIIZ + ", gap=" + this.LJIIJ + ')';
    }

    public C1785370wYp(User user, long j, String str, long j2, String str2, long j3, List<RankListV2Response.RankLabel> list, C1780260wQa c1780260wQa, String str3, String str4, C1777970wMt c1777970wMt) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = j2;
        this.LJ = str2;
        this.LJFF = j3;
        this.LJI = list;
        this.LJII = c1780260wQa;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = c1777970wMt;
    }
}
