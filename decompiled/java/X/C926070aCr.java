package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0aCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926070aCr {
    public static final String LIZ(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
                return "open_invitation_panel";
            case 2:
                return "open_application_panel";
            case 3:
                return "direct_agree";
            case 4:
                return "direct_agree_and_open_cancel_application_panel";
            case 5:
                return "direct_leave";
            case 6:
                return "direct_leave_and_open_invitation_panel";
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown(");
                sbLIZ.append(i);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final String LIZIZ(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
                return "permitted_bg_to_fg";
            case 2:
                return "invited";
            case 3:
                return "private_message_card_enter_but_record_consumed";
            case 4:
                return "random_match_success";
            case 5:
                return "apply_suspend_permitted";
            case 6:
                return "apply_suspend_return";
            case 7:
                return "inroom_invited";
            case 8:
                return "inroom_apply_return";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "inroom_linked";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "random_match_fail";
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown(");
                sbLIZ.append(i);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final String LIZJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown(");
                    sbLIZ.append(i);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return "guest";
            }
            return "admin";
        }
        return "anchor";
    }
}
