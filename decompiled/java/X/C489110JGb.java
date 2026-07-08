package X;

import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseDescVAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.AwS92S1000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0JGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489110JGb {
    public static final /* synthetic */ int LIZ = 0;

    public static int LJIILLIIL(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static String LIZ(Integer num, Integer num2) {
        if (num != null && num.intValue() == 3) {
            return "review_in_progress";
        }
        if (num2 != null) {
            if (num2.intValue() == 1) {
                return "review_pass";
            }
            if (num2.intValue() == 2) {
                return "detach_fail";
            }
            if (num2.intValue() == 3) {
                return "detach_in_progess";
            }
            if (num2.intValue() == 4) {
                return "detach_success";
            }
            return "";
        }
        return "";
    }

    public static void LIZIZ(C0JHC c0jhc, String str) {
        Long l;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_music_review_reminder");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str2 = c0jhc.LLILLL;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "show_entrance");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str, "music_review_result");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(C0JHC c0jhc, String str) {
        Long l;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_pinned_notice_module");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str2 = c0jhc.LLILLL;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "show_entrance");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(C0JHC c0jhc, String str) {
        Long l;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_submit_toast");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str2 = c0jhc.LLILLL;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "show_entrance");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str, "toast_content");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C0JHC c0jhc, String str, String str2) {
        Long l;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_discard_confirm_popup");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 2));
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(C0JHC c0jhc, String str, String str2) {
        Long l;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_pinned_notice_edit_halfpage");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 6));
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(C0JHC c0jhc, String str, String str2) {
        Long l;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_video_item_more_option_panel");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 9));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(C0JHC c0jhc, String str, String str2) {
        Long l;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_edit_video_module");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 12));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(C0JHC c0jhc, PcsCourseManageVM pcsCourseManageVM, String str, String str2) {
        Long l;
        String str3;
        String str4;
        Long l2;
        String strI90;
        Boolean boolValueOf;
        SMBCourse sMBCourse;
        SubPackagePriceInfo subPackagePriceInfo;
        IPcsCourseDescVAbility iPcsCourseDescVAbilityYQ2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_management_page");
        c474500IjALIZ.LJIL();
        Boolean boolValueOf2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        if (c0jhc != null) {
            str4 = c0jhc.LLILZ;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "previous_page");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 3));
        c474500IjALIZ.LJJII(str2, "action_type");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        } else {
            l2 = null;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        if (pcsCourseManageVM != null && (iPcsCourseDescVAbilityYQ2 = pcsCourseManageVM.yQ2()) != null) {
            strI90 = iPcsCourseDescVAbilityYQ2.I90();
        } else {
            strI90 = null;
        }
        c474500IjALIZ.LJJII(strI90, "course_description");
        AwS92S1000000_7 awS92S1000000_7 = new AwS92S1000000_7(str, 4);
        if (pcsCourseManageVM != null) {
            boolValueOf = Boolean.valueOf(!pcsCourseManageVM.CQ2());
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJIIZ(Integer.valueOf(LJIILLIIL(boolValueOf)), "is_default_name", awS92S1000000_7);
        AwS92S1000000_7 awS92S1000000_72 = new AwS92S1000000_7(str, 5);
        if (pcsCourseManageVM != null) {
            PriceTier priceTier = pcsCourseManageVM.getState().LLILZIL;
            boolean z = false;
            if (priceTier != null) {
                GetSMBCourseDetailResponse.Data data = pcsCourseManageVM.getState().LLILLJJLI;
                if (data != null && (sMBCourse = data.course) != null && (subPackagePriceInfo = sMBCourse.priceInfo) != null && priceTier.priceTierGrade == subPackagePriceInfo.priceTierId) {
                    z = true;
                }
                z = !z;
            }
            boolValueOf2 = Boolean.valueOf(!z);
        }
        c474500IjALIZ.LJJIIZ(Integer.valueOf(LJIILLIIL(boolValueOf2)), "is_default_tier", awS92S1000000_72);
        c474500IjALIZ.LIZ();
    }

    public static void LJI(C0JHC c0jhc, String str, String str2, PriceTier priceTier) {
        Long l;
        String str3;
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_price_tier_popup");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 7));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        AwS92S1000000_7 awS92S1000000_7 = new AwS92S1000000_7(str, 8);
        if (priceTier != null) {
            objValueOf = Long.valueOf(priceTier.priceTierGrade);
        } else {
            objValueOf = "";
        }
        c474500IjALIZ.LJJIIZ(objValueOf, "tier", awS92S1000000_7);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(C0JHC c0jhc, PcsCourseManageVM pcsCourseManageVM, String str, String str2) {
        Long l;
        String str3;
        Long l2;
        C488550JDx state;
        GetSMBCourseDetailResponse.Data data;
        SMBCourse sMBCourse;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_video_item_delete_confirm_popup");
        c474500IjALIZ.LJIL();
        Integer numValueOf = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJIIZ(str, "click_position", new AwS92S1000000_7(str2, 10));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        } else {
            l2 = null;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        if (pcsCourseManageVM != null && (state = pcsCourseManageVM.getState()) != null && (data = state.LLILLJJLI) != null && (sMBCourse = data.course) != null) {
            numValueOf = Integer.valueOf(LJIILLIIL(Boolean.valueOf(sMBCourse.hasCustomers)));
        }
        c474500IjALIZ.LJJII(numValueOf, "has_customer");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.C0JHC r11, X.InterfaceC489200JGk r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C489110JGb.LJIIJJI(X.0JHC, X.0JGk, java.lang.String, java.lang.String):void");
    }

    public static void LJIILJJIL(C0JHC c0jhc, String str, String str2, String str3) {
        Long l;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_video_preview_page");
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str4 = c0jhc.LLILLL;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "show_entrance");
        c474500IjALIZ.LJJIIZ(str2, "click_position", new AwS92S1000000_7(str3, 14));
        c474500IjALIZ.LJJII(str3, "action_type");
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII("", "video_id");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "mute_status");
        c474500IjALIZ.LJJII(str, "music_review_result");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(C0JHC c0jhc, String str, boolean z, String str2, String str3, String str4) {
        Long l;
        String str5;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_upload_check_page");
        c474500IjALIZ.LJIL();
        Long l2 = null;
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str5 = c0jhc.LLILLL;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "show_entrance");
        c474500IjALIZ.LJJIIZ(str3, "click_position", new AwS92S1000000_7(str4, 13));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str4, "action_type");
        c474500IjALIZ.LJJII(str, "video_id");
        c474500IjALIZ.LJJII(str2, "music_review_result");
        c474500IjALIZ.LJJII(Integer.valueOf(LJIILLIIL(Boolean.valueOf(z))), "is_visible");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILL(C0JHC c0jhc, String str, String str2, InterfaceC489200JGk interfaceC489200JGk, int i, int i2, int i3) {
        Long l;
        String str3;
        Long l2;
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        Long lValueOf = null;
        if ((i3 & 8) != 0) {
            interfaceC489200JGk = null;
        }
        if ((i3 & 16) != 0) {
            i = -1;
        }
        if ((i3 & 32) != 0) {
            i2 = -1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_video_sort_page");
        c474500IjALIZ.LJIL();
        if (c0jhc != null) {
            l = c0jhc.LL;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c0jhc != null) {
            str3 = c0jhc.LLILLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJIIZ(str2, "click_position", new AwS88S1000000_3(str, 21));
        if (c0jhc != null) {
            l2 = c0jhc.LLILLJJLI;
        } else {
            l2 = null;
        }
        c474500IjALIZ.LJJII(l2, "course_id");
        c474500IjALIZ.LJJII(str, "action_type");
        AwS92S1000000_7 awS92S1000000_7 = new AwS92S1000000_7(str, 15);
        if (interfaceC489200JGk != null) {
            lValueOf = Long.valueOf(interfaceC489200JGk.LJ(false));
        }
        c474500IjALIZ.LJJIIZ(String.valueOf(lValueOf), "video_id", awS92S1000000_7);
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i), "from_position", new AwS92S1000000_7(str, 16));
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i2), "to_position", new AwS92S1000000_7(str, 17));
        c474500IjALIZ.LIZ();
    }
}
