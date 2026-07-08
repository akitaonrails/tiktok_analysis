package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.ThirdPartyLinkDisplayInfo;

/* JADX INFO: renamed from: X.0xX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822730xX5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1822950xXR c1822950xXR) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        boolean z;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj4;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Object obj5;
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_audience_page");
        C1822330xWR c1822330xWR = c1822950xXR.LJII;
        Object logValue = null;
        if (c1822330xWR != null) {
            obj = c1822330xWR.LLJ;
        } else {
            obj = null;
        }
        c474500IjALIZ.LJJII(obj, "anchor_id");
        C1822330xWR c1822330xWR2 = c1822950xXR.LJII;
        if (c1822330xWR2 != null) {
            obj2 = c1822330xWR2.LLILLL;
        } else {
            obj2 = null;
        }
        c474500IjALIZ.LJJII(obj2, "room_id");
        C1822330xWR c1822330xWR3 = c1822950xXR.LJII;
        if (c1822330xWR3 != null) {
            obj3 = c1822330xWR3.LL;
        } else {
            obj3 = null;
        }
        c474500IjALIZ.LJJII(obj3, "show_entrance");
        C1822330xWR c1822330xWR4 = c1822950xXR.LJII;
        int i2 = 0;
        if (c1822330xWR4 != null) {
            i = c1822330xWR4.LLJILJIL;
        } else {
            i = 0;
        }
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_suggested_question_access");
        C1822330xWR c1822330xWR5 = c1822950xXR.LJII;
        if (c1822330xWR5 != null) {
            boolValueOf = Boolean.valueOf(c1822330xWR5.LLJIJIL);
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "has_dm");
        C1822330xWR c1822330xWR6 = c1822950xXR.LJII;
        if (c1822330xWR6 != null) {
            boolValueOf2 = Boolean.valueOf(c1822330xWR6.LLJILJILJ);
        } else {
            boolValueOf2 = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0), "has_form_access");
        C1822330xWR c1822330xWR7 = c1822950xXR.LJII;
        if (c1822330xWR7 != null && c1822330xWR7.LLJILLL && c1822330xWR7.LLJJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "has_superfan_access");
        C1822330xWR c1822330xWR8 = c1822950xXR.LJII;
        if (c1822330xWR8 != null && c1822330xWR8.LLJJI && !c1822330xWR8.LLILZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "has_course");
        C1822330xWR c1822330xWR9 = c1822950xXR.LJII;
        if (c1822330xWR9 != null && c1822330xWR9.LLJJIII) {
            z4 = true;
        } else {
            z4 = false;
        }
        Object obj6 = "1";
        if (z4) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj4, "has_calendly");
        C1822330xWR c1822330xWR10 = c1822950xXR.LJII;
        if (c1822330xWR10 == null || !c1822330xWR10.LLJJIJI) {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj6, "has_third_party");
        C1822330xWR c1822330xWR11 = c1822950xXR.LJII;
        if (c1822330xWR11 != null) {
            boolValueOf3 = Boolean.valueOf(c1822330xWR11.LIZIZ());
        } else {
            boolValueOf3 = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf3) ? 1 : 0), "has_kyb_verified");
        C1822330xWR c1822330xWR12 = c1822950xXR.LJII;
        if (c1822330xWR12 != null) {
            boolValueOf4 = Boolean.valueOf(c1822330xWR12.LIZJ());
        } else {
            boolValueOf4 = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf4) ? 1 : 0), "has_kyc_verified");
        c474500IjALIZ.LJJII(c1822950xXR.LIZ, "action_type");
        C1822330xWR c1822330xWR13 = c1822950xXR.LJII;
        if (c1822330xWR13 != null) {
            if (c1822330xWR13.LLILZ) {
                obj5 = "anchor";
            } else if (c1822330xWR13.LLILZIL) {
                obj5 = "moderator";
            } else {
                obj5 = "audience";
            }
        } else {
            obj5 = "";
        }
        c474500IjALIZ.LJJII(obj5, "user_type");
        C1822330xWR c1822330xWR14 = c1822950xXR.LJII;
        if (c1822330xWR14 != null) {
            objValueOf = Integer.valueOf(c1822330xWR14.LLJJJJJIL);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "sku_cnt");
        if (Intrinsics.LJFF(c1822950xXR.LIZ, "click")) {
            c474500IjALIZ.LJJII(c1822950xXR.LIZIZ, "click_position");
            EnumC1420700n4e enumC1420700n4e = c1822950xXR.LJI;
            if (enumC1420700n4e != null) {
                logValue = enumC1420700n4e.getLogValue();
            }
            c474500IjALIZ.LJJII(logValue, "click_method");
        }
        c474500IjALIZ.LJJII(c1822950xXR.LIZLLL, "question_id");
        c474500IjALIZ.LJJII(c1822950xXR.LJ, "form_id");
        c474500IjALIZ.LJJII(c1822950xXR.LJFF, "event_template_id");
        c474500IjALIZ.LJJIIZ(String.valueOf(c1822950xXR.LIZJ), "course_id", new C1822940xXQ(c1822950xXR));
        Function0 c1823120xXi = new C1823120xXi(c1822950xXR);
        C1822330xWR c1822330xWR15 = c1822950xXR.LJII;
        if (c1822330xWR15 != null) {
            i2 = c1822330xWR15.LLJILJIL;
        }
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i2), "suggested_question_cnt", c1823120xXi);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(EnumC1123040fKY enumC1123040fKY, C1822330xWR c1822330xWR) {
        String str;
        if (c1822330xWR != null && c1822330xWR.LLILZ) {
            return;
        }
        if (c1822330xWR == null || (str = c1822330xWR.LLILLJJLI) == null) {
            str = "";
        }
        C1107060eum.LIZ(str, enumC1123040fKY.getValue(), EnumC993080bww.CLICK.getValue(), (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), 0);
    }

    public static void LIZJ(C1822330xWR c1822330xWR, String str, boolean z) {
        Object obj;
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_preview_page_show");
        c474500IjALIZ.LJJII(str, "anchor_id");
        Object objValueOf2 = null;
        if (c1822330xWR != null) {
            obj = c1822330xWR.LL;
        } else {
            obj = null;
        }
        c474500IjALIZ.LJJII(obj, "show_entrance");
        if (c1822330xWR != null) {
            objValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWR.LIZIZ())) ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "has_kyb_verified");
        if (c1822330xWR != null) {
            objValueOf2 = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWR.LIZJ())) ? 1 : 0);
        }
        c474500IjALIZ.LJJII(objValueOf2, "has_kyc_verified");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_single_sku");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, C1822330xWR c1822330xWR) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object objValueOf;
        boolean z;
        Object obj6;
        String str3;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_single_sku_page_title");
        Object objValueOf2 = null;
        if (c1822330xWR != null) {
            obj = c1822330xWR.LLJ;
        } else {
            obj = null;
        }
        c474500IjALIZ.LJJII(obj, "anchor_id");
        if (c1822330xWR != null) {
            obj2 = c1822330xWR.LLILLL;
        } else {
            obj2 = null;
        }
        c474500IjALIZ.LJJII(obj2, "room_id");
        if (c1822330xWR != null) {
            obj3 = c1822330xWR.LL;
        } else {
            obj3 = null;
        }
        c474500IjALIZ.LJJII(obj3, "show_entrance");
        if (c1822330xWR != null) {
            obj4 = c1822330xWR.LLJJJJ;
        } else {
            obj4 = null;
        }
        c474500IjALIZ.LJJII(obj4, "service_type");
        if (c1822330xWR != null) {
            if (c1822330xWR.LLILZ) {
                obj5 = "anchor";
            } else if (c1822330xWR.LLILZIL) {
                obj5 = "moderator";
            } else {
                obj5 = "audience";
            }
        } else {
            obj5 = "";
        }
        c474500IjALIZ.LJJII(obj5, "user_type");
        c474500IjALIZ.LJJII(str, "action_type");
        if (c1822330xWR != null) {
            objValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWR.LIZIZ())) ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "has_kyb_verified");
        if (c1822330xWR != null) {
            objValueOf2 = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWR.LIZJ())) ? 1 : 0);
        }
        c474500IjALIZ.LJJII(objValueOf2, "has_kyc_verified");
        c474500IjALIZ.LJJIIZ(str2, "click_position", new C1823110xXh(str));
        if (c1822330xWR != null && (str4 = c1822330xWR.LLJJJ) != null && str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj7 = "1";
        if (z) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj6, "has_email");
        if (c1822330xWR == null || (str3 = c1822330xWR.LLJJJIL) == null || str3.length() <= 0) {
            obj7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj7, "has_phone");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(String str, String str2, C496700Jds c496700Jds, String str3) {
        String str4;
        ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_audience_page_title");
        c474500IjALIZ.LJJII(c496700Jds.LIZLLL, "anchor_id");
        c474500IjALIZ.LJJII(c496700Jds.LJ, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(c496700Jds.LJFF, "service_type");
        c474500IjALIZ.LJJII(Integer.valueOf(c496700Jds.LJI), "sku_cnt");
        c474500IjALIZ.LJJII(c496700Jds.LJII, "sku_id");
        c474500IjALIZ.LJJII(c496700Jds.LIZJ, "page_type");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(str3, "badge_type");
        C496750Jdx c496750Jdx = new C496750Jdx(c496700Jds);
        SMBPreviewResponse.ResponseData responseData = c496700Jds.LIZ;
        if (responseData == null || (thirdPartyLinkDisplayInfo = responseData.thirdPartyLinkInfo) == null || (str4 = thirdPartyLinkDisplayInfo.platformName) == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJIIZ(str4, "third_party_service_name", c496750Jdx);
        c474500IjALIZ.LIZ();
    }
}
