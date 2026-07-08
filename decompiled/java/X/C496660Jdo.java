package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.newui.PcsVerifiedIntroV2Dialog;

/* JADX INFO: renamed from: X.0Jdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496660Jdo {
    public static void LIZ(FragmentManager fragmentManager, String str, String str2, SMBVerificationInfo sMBVerificationInfo, String str3, String str4, String str5, String str6) {
        String str7;
        if (fragmentManager == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("avatar", str, bundle);
        C786410Ut5.LJJJI("nickname", str2, bundle);
        bundle.putBoolean("has_kyb_verified", C496680Jdq.LIZ(sMBVerificationInfo));
        bundle.putBoolean("has_kyc_verified", C496680Jdq.LIZIZ(sMBVerificationInfo));
        C786410Ut5.LJJJI("industry_display_name", str3, bundle);
        SMBKYBInfo sMBKYBInfo = sMBVerificationInfo.kybInfo;
        if (sMBKYBInfo == null || (str7 = sMBKYBInfo.identification) == null) {
            str7 = "";
        }
        C786410Ut5.LJJJI("kyb_identification", str7, bundle);
        C786410Ut5.LJJJI("anchor_id", str4, bundle);
        C786410Ut5.LJJJI("show_entrance", str5, bundle);
        C786410Ut5.LJJJI("previous_page", str6, bundle);
        C19322110iZ.LIZLLL(fragmentManager, PcsVerifiedIntroV2Dialog.class, "live_smb_verified_intro_v2_sheet", null, bundle);
    }
}
