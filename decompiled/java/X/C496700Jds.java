package X;

import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsViewerIndustryBadgeSetting;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0Jds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496700Jds {
    public final SMBPreviewResponse.ResponseData LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final Long LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final C01GW LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C496700Jds() {
        this((SMBPreviewResponse.ResponseData) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (Long) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C496700Jds)) {
            return false;
        }
        C496700Jds c496700Jds = (C496700Jds) obj;
        return Intrinsics.LJFF(this.LIZ, c496700Jds.LIZ) && Intrinsics.LJFF(this.LIZIZ, c496700Jds.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c496700Jds.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c496700Jds.LIZLLL) && Intrinsics.LJFF(this.LJ, c496700Jds.LJ) && Intrinsics.LJFF(this.LJFF, c496700Jds.LJFF) && this.LJI == c496700Jds.LJI && Intrinsics.LJFF(this.LJII, c496700Jds.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c496700Jds.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c496700Jds.LJIIIZ) && this.LJIIJ == c496700Jds.LJIIJ;
    }

    public final SMBVerificationInfo LIZIZ() {
        SMBPreviewResponse.ResponseData responseData = this.LIZ;
        if (responseData != null) {
            return responseData.verificationInfo;
        }
        return null;
    }

    public final String LIZ() {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo;
        SMBVerificationInfo sMBVerificationInfoLIZIZ = LIZIZ();
        if (sMBVerificationInfoLIZIZ == null) {
            return null;
        }
        if (C496680Jdq.LIZ(sMBVerificationInfoLIZIZ)) {
            return "kyb_verified";
        }
        if (LivePcsViewerIndustryBadgeSetting.INSTANCE.getValue() && (sMBIndustryVerificationInfo = sMBVerificationInfoLIZIZ.industryVerificationInfo) != null && sMBIndustryVerificationInfo.status == 3) {
            return "industry_verified";
        }
        if (C496680Jdq.LIZIZ(sMBVerificationInfoLIZIZ)) {
            return "kyc_verified";
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C496700Jds(SMBPreviewResponse.ResponseData responseData, String str, String str2, String str3, String str4, String str5, int i, Long l, String str6, String str7, int i2) {
        boolean z;
        String str8 = str6;
        Long l2 = l;
        int i3 = i;
        String str9 = str5;
        String str10 = str4;
        String str11 = str3;
        String str12 = str;
        String str13 = str2;
        SMBPreviewResponse.ResponseData responseData2 = (i2 & 1) != 0 ? null : responseData;
        str12 = (i2 & 2) != 0 ? "" : str12;
        str13 = (i2 & 4) != 0 ? "" : str13;
        str11 = (i2 & 8) != 0 ? "" : str11;
        str10 = (i2 & 16) != 0 ? "" : str10;
        str9 = (i2 & 32) != 0 ? "" : str9;
        i3 = (i2 & 64) != 0 ? 0 : i3;
        l2 = (i2 & 128) != 0 ? 0L : l2;
        str8 = (i2 & 256) != 0 ? "" : str8;
        String str14 = (i2 & 512) == 0 ? str7 : "";
        if ((i2 & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(responseData2, str12, str13, str11, str10, str9, i3, l2, str8, str14, z);
    }

    public C496700Jds(SMBPreviewResponse.ResponseData responseData, String str, String str2, String str3, String str4, String str5, int i, Long l, String str6, String str7, boolean z) {
        this.LIZ = responseData;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = i;
        this.LJII = l;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = z;
        this.LJIIJJI = C452501pT.LIZIZ(new C496730Jdv(this));
    }
}
