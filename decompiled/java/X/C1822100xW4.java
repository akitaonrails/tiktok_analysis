package X;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import webcast.api.sub.BookingInfo;
import webcast.api.sub.DMInfo;
import webcast.api.sub.FormInfo;
import webcast.api.sub.PreviewDisplay;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.ThirdPartyLinkDisplayInfo;

/* JADX INFO: renamed from: X.0xW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822100xW4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public static final int LIZ(SMBPreviewResponse.ResponseData responseData) {
        int i;
        PreviewDisplay previewDisplay = responseData.displaySwitch;
        if (previewDisplay != null) {
            ?? r1 = previewDisplay.hasSuggestedQuestion;
            int size = r1;
            if (previewDisplay.hasForm) {
                size = r1 + responseData.formInfoList.size();
            }
            int size2 = size;
            if (previewDisplay.hasBooking) {
                size2 = size + responseData.bookingInfoList.size();
            }
            i = size2;
            if (previewDisplay.hasThirdPartyLink) {
                i = size2 + 1;
            }
        } else {
            i = 0;
        }
        return i + responseData.courseList.size();
    }

    public static final Long LIZIZ(SMBPreviewResponse.ResponseData responseData) {
        boolean z;
        ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo;
        if (LIZ(responseData) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        PreviewDisplay previewDisplay = responseData.displaySwitch;
        if (previewDisplay != null) {
            if (previewDisplay.hasSuggestedQuestion) {
                DMInfo dMInfo = responseData.dmInfo;
                if (dMInfo == null) {
                    return null;
                }
                return Long.valueOf(dMInfo.skuId);
            }
            if (previewDisplay.hasForm) {
                FormInfo formInfo = (FormInfo) C13LP.LJJJLL(responseData.formInfoList);
                if (formInfo == null) {
                    return null;
                }
                return Long.valueOf(formInfo.formId);
            }
        }
        if (responseData.courseList.size() > 0) {
            SMBCourse sMBCourse = (SMBCourse) C13LP.LJJJLL(responseData.courseList);
            if (sMBCourse == null) {
                return null;
            }
            return Long.valueOf(sMBCourse.courseId);
        }
        PreviewDisplay previewDisplay2 = responseData.displaySwitch;
        if (previewDisplay2 == null) {
            return null;
        }
        if (previewDisplay2.hasBooking) {
            BookingInfo bookingInfo = (BookingInfo) C13LP.LJJJLL(responseData.bookingInfoList);
            if (bookingInfo == null) {
                return null;
            }
            return Long.valueOf(bookingInfo.skuId);
        }
        if (!previewDisplay2.hasThirdPartyLink || (thirdPartyLinkDisplayInfo = responseData.thirdPartyLinkInfo) == null) {
            return null;
        }
        return Long.valueOf(thirdPartyLinkDisplayInfo.skuId);
    }

    public static final PcsVerifiedIntroItem[] LIZJ(SMBVerificationInfo sMBVerificationInfo, Context context) {
        String str;
        if (C496680Jdq.LIZ(sMBVerificationInfo)) {
            PcsVerifiedIntroItem[] pcsVerifiedIntroItemArr = new PcsVerifiedIntroItem[2];
            pcsVerifiedIntroItemArr[0] = new PcsVerifiedIntroItem(context.getString(2131850970), context.getString(2131850967));
            String string = context.getString(2131850969);
            SMBKYBInfo sMBKYBInfo = sMBVerificationInfo.kybInfo;
            if (sMBKYBInfo == null || (str = sMBKYBInfo.identification) == null) {
                str = "";
            }
            pcsVerifiedIntroItemArr[1] = new PcsVerifiedIntroItem(string, str);
            return pcsVerifiedIntroItemArr;
        }
        if (C496680Jdq.LIZIZ(sMBVerificationInfo)) {
            return new PcsVerifiedIntroItem[]{new PcsVerifiedIntroItem(context.getString(2131850970), context.getString(2131850968))};
        }
        return new PcsVerifiedIntroItem[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1822010xVv LIZLLL(webcast.api.sub.SMBPreviewResponse.ResponseData r18, java.lang.String r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1822100xW4.LIZLLL(webcast.api.sub.SMBPreviewResponse$ResponseData, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):X.0xVv");
    }
}
