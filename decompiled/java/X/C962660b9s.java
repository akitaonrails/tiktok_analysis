package X;

import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962660b9s extends C955670ayb {
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final long LJII;
    public final EOYBanner.GradeInfo LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C962660b9s)) {
            return false;
        }
        C962660b9s c962660b9s = (C962660b9s) obj;
        return Intrinsics.LJFF(this.LJ, c962660b9s.LJ) && Intrinsics.LJFF(this.LJFF, c962660b9s.LJFF) && this.LJI == c962660b9s.LJI && this.LJII == c962660b9s.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c962660b9s.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c962660b9s.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LJ.hashCode() * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31;
        EOYBanner.GradeInfo gradeInfo = this.LJIIIIZZ;
        return ((iHashCode + (gradeInfo == null ? 0 : gradeInfo.hashCode())) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EoyBannerGlobalCampaignItem(title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", gradeInfo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C962660b9s(String str, String str2, long j, long j2, EOYBanner.GradeInfo gradeInfo, String str3) {
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = gradeInfo;
        this.LJIIIZ = str3;
    }
}
