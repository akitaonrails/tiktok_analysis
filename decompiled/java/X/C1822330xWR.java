package X;

import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SMBServicePinInfo;

/* JADX INFO: renamed from: X.0xWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822330xWR implements InterfaceC2753014t {
    public final String LL;
    public String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public C1784870wY1 LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final String LLJJIJIIJIL;
    public final C0KUO LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final Integer LLJJL;
    public SMBVerificationInfo LLJJLIIIJLLLLLLLZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822330xWR)) {
            return false;
        }
        C1822330xWR c1822330xWR = (C1822330xWR) obj;
        return Intrinsics.LJFF(this.LL, c1822330xWR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1822330xWR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1822330xWR.LLILLL) && this.LLILZ == c1822330xWR.LLILZ && this.LLILZIL == c1822330xWR.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1822330xWR.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1822330xWR.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1822330xWR.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1822330xWR.LLJ) && Intrinsics.LJFF(this.LLJI, c1822330xWR.LLJI) && this.LLJIJIL == c1822330xWR.LLJIJIL && this.LLJILJIL == c1822330xWR.LLJILJIL && this.LLJILJILJ == c1822330xWR.LLJILJILJ && this.LLJILLL == c1822330xWR.LLJILLL && this.LLJJ == c1822330xWR.LLJJ && this.LLJJI == c1822330xWR.LLJJI && this.LLJJIII == c1822330xWR.LLJJIII && this.LLJJIJI == c1822330xWR.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c1822330xWR.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1822330xWR.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1822330xWR.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1822330xWR.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1822330xWR.LLJJJJ) && this.LLJJJJJIL == c1822330xWR.LLJJJJJIL && this.LLJJJJLIIL == c1822330xWR.LLJJJJLIIL && Intrinsics.LJFF(this.LLJJL, c1822330xWR.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1822330xWR.LLJJLIIIJLLLLLLLZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C1784870wY1 c1784870wY1 = this.LLILZLL;
        int iHashCode2 = (((((((((((((((((((((((((((iHashCode + (c1784870wY1 == null ? 0 : c1784870wY1.hashCode())) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + this.LLJJIJIIJIL.hashCode()) * 31;
        C0KUO c0kuo = this.LLJJIJIL;
        int iHashCode3 = (((((((((((iHashCode2 + (c0kuo == null ? 0 : c0kuo.hashCode())) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + this.LLJJJJJIL) * 31) + C786410Ut5.Z2(this.LLJJJJLIIL)) * 31;
        Integer num = this.LLJJL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SMBVerificationInfo sMBVerificationInfo = this.LLJJLIIIJLLLLLLLZ;
        return iHashCode4 + (sMBVerificationInfo != null ? sMBVerificationInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PcsServiceBioSource(showEntrance=" + this.LL + ", secAnchorId=" + this.LLILLJJLI + ", roomId=" + this.LLILLL + ", isAnchor=" + this.LLILZ + ", isModerator=" + this.LLILZIL + ", cache=" + this.LLILZLL + ", dmSchema=" + this.LLIZ + ", formSchema=" + this.LLIZLLLIL + ", anchorId=" + this.LLJ + ", userId=" + this.LLJI + ", hasSuggestedQuestion=" + this.LLJIJIL + ", suggestedQuestionCount=" + this.LLJILJIL + ", hasForm=" + this.LLJILJILJ + ", hasSub=" + this.LLJILLL + ", hasSuperFan=" + this.LLJJ + ", hasCourse=" + this.LLJJI + ", hasCalendly=" + this.LLJJIII + ", hasThirdParty=" + this.LLJJIJI + ", avatar=" + this.LLJJIJIIJIL + ", iPcsServiceBioDialogCallback=" + this.LLJJIJIL + ", email=" + this.LLJJJ + ", phone=" + this.LLJJJIL + ", serviceType=" + this.LLJJJJ + ", skuCount=" + this.LLJJJJJIL + ", useMockData=" + this.LLJJJJLIIL + ", fragmentHashCode=" + this.LLJJL + ", verificationInfo=" + this.LLJJLIIIJLLLLLLLZ + ')';
    }

    public final boolean LIZ() {
        SMBPreviewResponse.ResponseData responseData;
        SMBServicePinInfo sMBServicePinInfo;
        List<SimplePinCardInfo> list;
        C1784870wY1 c1784870wY1 = this.LLILZLL;
        if (c1784870wY1 == null || (responseData = c1784870wY1.LIZJ) == null || (sMBServicePinInfo = responseData.smbServicePinInfo) == null || (list = sMBServicePinInfo.pinCardList) == null) {
            return false;
        }
        return C500260Jjc.LJJIJIIJI(list);
    }

    public final boolean LIZIZ() {
        SMBKYBInfo sMBKYBInfo;
        SMBVerificationInfo sMBVerificationInfo = this.LLJJLIIIJLLLLLLLZ;
        return (sMBVerificationInfo == null || (sMBKYBInfo = sMBVerificationInfo.kybInfo) == null || sMBKYBInfo.status != 2) ? false : true;
    }

    public final boolean LIZJ() {
        SMBKYCInfo sMBKYCInfo;
        SMBVerificationInfo sMBVerificationInfo = this.LLJJLIIIJLLLLLLLZ;
        return (sMBVerificationInfo == null || (sMBKYCInfo = sMBVerificationInfo.kycInfo) == null || sMBKYCInfo.status != 2) ? false : true;
    }

    public C1822330xWR(String str, String str2, String str3, boolean z, boolean z2, C1784870wY1 c1784870wY1, String str4, String str5, String str6, String str7, String str8, C0KUO c0kuo, int i, boolean z3, Integer num, int i2) {
        String str9;
        String str10;
        Integer num2 = num;
        boolean z4 = z3;
        int i3 = i;
        C0KUO c0kuo2 = c0kuo;
        C1784870wY1 c1784870wY12 = (i2 & 32) != 0 ? null : c1784870wY1;
        c0kuo2 = (i2 & 524288) != 0 ? null : c0kuo2;
        if ((i2 & 1048576) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((i2 & 2097152) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        String str11 = (i2 & 4194304) == 0 ? null : "";
        i3 = (i2 & 8388608) != 0 ? 0 : i3;
        z4 = (i2 & 16777216) != 0 ? false : z4;
        num2 = (i2 & 33554432) != 0 ? null : num2;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c1784870wY12;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = false;
        this.LLJILJIL = 0;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = str8;
        this.LLJJIJIL = c0kuo2;
        this.LLJJJ = str9;
        this.LLJJJIL = str10;
        this.LLJJJJ = str11;
        this.LLJJJJJIL = i3;
        this.LLJJJJLIIL = z4;
        this.LLJJL = num2;
        this.LLJJLIIIJLLLLLLLZ = null;
    }
}
