package X;

import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.UpsellIndustry;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0fJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122150fJ7 {
    public static final boolean LIZ(SMBOptInQualificationResponse.ResponseData responseData) {
        SMBKYCInfo sMBKYCInfo;
        SMBKYBInfo sMBKYBInfo;
        if (responseData != null) {
            SMBVerificationInfo sMBVerificationInfo = responseData.verificationInfo;
            if (sMBVerificationInfo != null && (sMBKYBInfo = sMBVerificationInfo.kybInfo) != null && sMBKYBInfo.status != 0) {
                return true;
            }
            SMBVerificationInfo sMBVerificationInfo2 = responseData.verificationInfo;
            if (sMBVerificationInfo2 != null && (sMBKYCInfo = sMBVerificationInfo2.kycInfo) != null && sMBKYCInfo.status != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String LIZIZ(SMBOptInQualificationResponse.ResponseData responseData) {
        UpsellIndustry upsellIndustry;
        Integer numValueOf;
        if (responseData != null) {
            int i = responseData.inferredIndustryType;
            if (i != 7) {
                if (i != 8) {
                    if (responseData != null && (upsellIndustry = responseData.selectedIndustryExtra) != null && (numValueOf = Integer.valueOf(upsellIndustry.industryType)) != null) {
                        if (numValueOf.intValue() != 7) {
                            if (numValueOf.intValue() == 8) {
                                return "entertainment";
                            }
                            return "smb_target";
                        }
                        return "e_commerce";
                    }
                    return "smb_target";
                }
                return "entertainment";
            }
            return "e_commerce";
        }
        return "smb_target";
    }

    public static final int LIZJ(SMBOptInQualificationResponse.ResponseData responseData) {
        int i;
        if (responseData != null) {
            i = responseData.inferredIndustryType;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() != 0) {
            return numValueOf.intValue();
        }
        return ((Number) C13LP.LJLJJI(C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 9), AbstractC19994813Le.Default)).intValue();
    }

    public static final boolean LIZLLL(SMBOptInQualificationResponse.ResponseData responseData) {
        SMBVerificationInfo sMBVerificationInfo;
        SMBKYBInfo sMBKYBInfo;
        if (responseData == null || (sMBVerificationInfo = responseData.verificationInfo) == null || (sMBKYBInfo = sMBVerificationInfo.kybInfo) == null || !sMBKYBInfo.enabled) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(SMBOptInQualificationResponse.ResponseData responseData) {
        if (responseData == null || responseData.inferredIndustryType == 0) {
            return false;
        }
        return true;
    }
}
