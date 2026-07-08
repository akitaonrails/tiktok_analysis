package X;

import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import webcast.api.smb.SMBVerificationInfoResponse;

/* JADX INFO: renamed from: X.0wY4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784900wY4 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final void LIZLLL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_upsell_content_topic_select_page_confirm_popup");
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        c474500IjALIZ.LJJII(this.LIZIZ, "show_entrance");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_upsell_content_topic_select_page_confirm_popup");
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        c474500IjALIZ.LJJII(this.LIZIZ, "show_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }

    public final C474500IjA LIZ(C1784660wXg c1784660wXg, String str) {
        boolean z;
        boolean z2;
        C1781540wSe next;
        String str2;
        Integer numValueOf;
        Object obj;
        Object obj2;
        SMBVerificationInfo sMBVerificationInfo;
        SMBKYBInfo sMBKYBInfo;
        SMBVerificationInfoResponse.Data data = c1784660wXg.LLJIJIL;
        if (data != null && (sMBVerificationInfo = data.verificationInfo) != null && (sMBKYBInfo = sMBVerificationInfo.kybInfo) != null) {
            z = sMBKYBInfo.enabled;
        } else {
            z = false;
        }
        if (!c1784660wXg.LLJJIII && !c1784660wXg.LLJJIJI) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.LIZJ) {
            str2 = "is_onboarding";
        } else if (c1784660wXg.LLIZLLLIL == 0) {
            str2 = "has_upsell_no_industry";
        } else {
            Iterator<C1781540wSe> it2 = c1784660wXg.LLILLJJLI.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (next.LIZ != c1784660wXg.LLIZLLLIL);
            C1781540wSe c1781540wSe = next;
            if (c1781540wSe != null && (numValueOf = Integer.valueOf(c1781540wSe.LJFF)) != null && numValueOf.intValue() == 2) {
                str2 = "has_upsell_black_industry";
            } else {
                str2 = "has_upsell_valid_industry";
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        boolean z3 = this.LIZJ;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z3) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_onboarding");
        c474500IjALIZ.LJJII(this.LIZIZ, "show_entrance");
        c474500IjALIZ.LJJII("1", "is_service_plus");
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "region_support_kyb");
        if (z2) {
            str3 = "1";
        }
        c474500IjALIZ.LJJII(str3, "existing_verification");
        c474500IjALIZ.LJJII(str2, "upsell_industry_type");
        return c474500IjALIZ;
    }

    public final void LIZIZ(C1784660wXg c1784660wXg, String str) {
        Integer numValueOf;
        C1781540wSe next;
        String strValueOf;
        String string;
        Iterator<C1781540wSe> it2 = c1784660wXg.LLILLJJLI.iterator();
        while (true) {
            numValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == c1784660wXg.LLILLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1781540wSe c1781540wSe = next;
        if (c1781540wSe != null) {
            numValueOf = Integer.valueOf(c1781540wSe.LJFF);
        }
        C474500IjA c474500IjALIZ = LIZ(c1784660wXg, "livesdk_upsell_content_topic_select_page_click");
        long j = c1784660wXg.LLILLL;
        String str2 = "";
        if (j == 0) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(j);
        }
        c474500IjALIZ.LJJII(strValueOf, "industry_id");
        if (numValueOf != null && (string = numValueOf.toString()) != null) {
            str2 = string;
        }
        c474500IjALIZ.LJJII(str2, "topic_level");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }

    public C1784900wY4(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
