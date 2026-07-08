package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C664000Q2s implements Serializable {
    public final int backPressFlag;
    public final String enterFrom;
    public final int feedSearchBarFlag;
    public final String isFromComment;
    public final String isFromVideo;
    public final boolean keepTabPosition;
    public final String previousPage;
    public final boolean shouldShowScanView;
    public final boolean shouldShowSug;
    public final String takoEnterMethod;
    public final String takoMessageId;
    public final String takoProcessId;

    public C664000Q2s() {
        this("discovery", null, true, true, "", "", 0, 0, false, "", "", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664000Q2s)) {
            return false;
        }
        C664000Q2s c664000Q2s = (C664000Q2s) obj;
        return Intrinsics.LJFF(this.enterFrom, c664000Q2s.enterFrom) && Intrinsics.LJFF(this.previousPage, c664000Q2s.previousPage) && this.shouldShowScanView == c664000Q2s.shouldShowScanView && this.shouldShowSug == c664000Q2s.shouldShowSug && Intrinsics.LJFF(this.isFromComment, c664000Q2s.isFromComment) && Intrinsics.LJFF(this.isFromVideo, c664000Q2s.isFromVideo) && this.backPressFlag == c664000Q2s.backPressFlag && this.feedSearchBarFlag == c664000Q2s.feedSearchBarFlag && this.keepTabPosition == c664000Q2s.keepTabPosition && Intrinsics.LJFF(this.takoMessageId, c664000Q2s.takoMessageId) && Intrinsics.LJFF(this.takoProcessId, c664000Q2s.takoProcessId) && Intrinsics.LJFF(this.takoEnterMethod, c664000Q2s.takoEnterMethod);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previousPage;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.shouldShowScanView)) * 31) + C786410Ut5.Z2(this.shouldShowSug)) * 31;
        String str3 = this.isFromComment;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isFromVideo;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.backPressFlag) * 31) + this.feedSearchBarFlag) * 31) + C786410Ut5.Z2(this.keepTabPosition)) * 31;
        String str5 = this.takoMessageId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.takoProcessId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.takoEnterMethod;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "SearchCommonModel(enterFrom=" + this.enterFrom + ", previousPage=" + this.previousPage + ", shouldShowScanView=" + this.shouldShowScanView + ", shouldShowSug=" + this.shouldShowSug + ", isFromComment=" + this.isFromComment + ", isFromVideo=" + this.isFromVideo + ", backPressFlag=" + this.backPressFlag + ", feedSearchBarFlag=" + this.feedSearchBarFlag + ", keepTabPosition=" + this.keepTabPosition + ", takoMessageId=" + this.takoMessageId + ", takoProcessId=" + this.takoProcessId + ", takoEnterMethod=" + this.takoEnterMethod + ')';
    }

    /* JADX INFO: renamed from: isFromComment, reason: collision with other method in class */
    public final boolean m32isFromComment() {
        return Intrinsics.LJFF("1", this.isFromComment);
    }

    public final boolean isFromFeedSearchBar() {
        return this.feedSearchBarFlag != 0;
    }

    public final boolean isFromTako() {
        return C123100dR.LIZ(this.takoProcessId) && C123100dR.LIZ(this.takoMessageId);
    }

    public final boolean isFromVideoDetail() {
        return Intrinsics.LJFF("1", this.isFromVideo);
    }

    public final String isFromVideo() {
        return this.isFromVideo;
    }

    public final String isFromComment() {
        return this.isFromComment;
    }

    public C664000Q2s(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3, String str5, String str6, String str7) {
        this.enterFrom = str;
        this.previousPage = str2;
        this.shouldShowScanView = z;
        this.shouldShowSug = z2;
        this.isFromComment = str3;
        this.isFromVideo = str4;
        this.backPressFlag = i;
        this.feedSearchBarFlag = i2;
        this.keepTabPosition = z3;
        this.takoMessageId = str5;
        this.takoProcessId = str6;
        this.takoEnterMethod = str7;
    }
}
