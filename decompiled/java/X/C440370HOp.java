package X;

/* JADX INFO: renamed from: X.0HOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440370HOp {
    public static final C440370HOp LIZ = new C440370HOp();

    public static void LJIIIZ(EnumC441640HTm enumC441640HTm) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        C20684815ws.LJIILLIIL("imagine_studio_show_need_avatar_toast", c2344009Gk.LIZ);
    }

    public static String LJIIL(InterfaceC440090HNn interfaceC440090HNn) {
        if (interfaceC440090HNn instanceof C435610H6h) {
            return ((C435610H6h) interfaceC440090HNn).LIZ.text;
        }
        if (interfaceC440090HNn instanceof C435750H6v) {
            return ((C435750H6v) interfaceC440090HNn).LIZJ;
        }
        if (interfaceC440090HNn instanceof C440660HPs) {
            return ((C440660HPs) interfaceC440090HNn).LIZJ;
        }
        return null;
    }

    public static C0HGY LJIILIIL(InterfaceC440090HNn interfaceC440090HNn) {
        if (interfaceC440090HNn instanceof C435610H6h) {
            return C0HGY.EMOJI;
        }
        if (interfaceC440090HNn instanceof C440070HNl) {
            return C0HGY.IMAGE;
        }
        if (interfaceC440090HNn instanceof C0HGK) {
            return C0HGY.TEXT;
        }
        if (interfaceC440090HNn instanceof C440100HNo) {
            return C0HGY.TEXT;
        }
        if (interfaceC440090HNn instanceof C435750H6v) {
            return C0HGY.MEME;
        }
        if (interfaceC440090HNn instanceof C440660HPs) {
            return C0HGY.STICKER;
        }
        throw new C1954807lC();
    }

    public static EnumC440390HOr LJIILJJIL(AbstractC440540HPg abstractC440540HPg) {
        if (abstractC440540HPg instanceof C441120HRm) {
            return EnumC440390HOr.MORE_GENERATING;
        }
        if (abstractC440540HPg instanceof C441130HRn) {
            return EnumC440390HOr.COMPLETE;
        }
        return EnumC440390HOr.COMPLETE;
    }

    public static Integer LJIILL(InterfaceC440090HNn interfaceC440090HNn) {
        if (interfaceC440090HNn instanceof C440660HPs) {
            return Integer.valueOf(((C440660HPs) interfaceC440090HNn).LIZLLL);
        }
        return null;
    }

    public static void LJ(EnumC441640HTm enumC441640HTm, C0HT1 c0ht1) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
        c2344009Gk.LJIIIIZZ("action_type", c0ht1.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_click_share_result_panel", c2344009Gk.LIZ);
    }

    public static void LJFF(EnumC441640HTm enumC441640HTm, EnumC440260HOe enumC440260HOe) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
        c2344009Gk.LJIIIIZZ("action_type", enumC440260HOe.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_click_upgrade_image_panel", c2344009Gk.LIZ);
    }

    public static void LJI(EnumC441640HTm enumC441640HTm, EnumC440250HOd enumC440250HOd, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LJIIIIZZ("action_type", enumC440250HOd.getParam());
        if (str != null) {
            c2344009Gk.LJFF("chat_type", str);
        }
        C20684815ws.LJIILLIIL("imagine_studio_create_avatar_panel", c2344009Gk.LIZ);
    }

    public static void LJII(EnumC441640HTm enumC441640HTm, C0HGY c0hgy, EnumC440430HOv enumC440430HOv) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LJIIIIZZ("action_type", enumC440430HOv.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_discard_results_popup", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(int i, long j, boolean z, EnumC441640HTm enumC441640HTm) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "sticker_position");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_generate_more");
        C20684815ws.LJIILLIIL("ttsocial_imagine_studio_sticker_load_duration", c2344009Gk.LIZ);
    }

    public static void LJIIJ(EnumC441640HTm enumC441640HTm, C0HGY c0hgy, EnumC440990HQz enumC440990HQz, EnumC440400HOs enumC440400HOs) {
        String param;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LJIIIIZZ("error_type", enumC440990HQz.getParam());
        if (enumC440400HOs == null || (param = enumC440400HOs.getParam()) == null) {
            param = "";
        }
        c2344009Gk.LJIIIIZZ("error_detail", param);
        C20684815ws.LJIILLIIL("imagine_studio_show_result_panel_error_toast", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(EnumC441640HTm enumC441640HTm, C0HR1 c0hr1, EnumC440360HOo enumC440360HOo, boolean z, C0HGY c0hgy, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LJIIIIZZ("action_type", c0hr1.getParam());
        c2344009Gk.LJIIIIZZ("enter_method", enumC440360HOo.getParam());
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        if (str != null) {
            c2344009Gk.LJFF("element_id", str);
        }
        C20684815ws.LJIILLIIL("imagine_studio_terminate_generation_popup", c2344009Gk.LIZ);
    }

    public static void LIZ(EnumC441640HTm enumC441640HTm, boolean z, C0HGY c0hgy, C0H7H c0h7h, EnumC436720HAo enumC436720HAo, Integer num, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        c2344009Gk.LJIIIIZZ("element_provider", c0h7h.getParam());
        c2344009Gk.LJIIIIZZ("action_page", enumC436720HAo.getParam());
        if (str != null) {
            c2344009Gk.LJFF("element_id", str);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "element_position");
        }
        C20684815ws.LJIILLIIL("imagine_studio_add_element_success", c2344009Gk.LIZ);
    }

    public static void LIZLLL(EnumC441640HTm enumC441640HTm, EnumC440380HOq enumC440380HOq, boolean z, C0HGY c0hgy, String str, EnumC440390HOr enumC440390HOr, int i, long j, int i2, boolean z2, EnumC440980HQy enumC440980HQy, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LJIIIIZZ("enter_method", enumC440380HOq.getParam());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LJIIIIZZ("panel_status", enumC440390HOr.getParam());
        c2344009Gk.LIZLLL(j, "sticker_id");
        c2344009Gk.LIZJ(i, "sticker_cnt");
        c2344009Gk.LIZJ(i2, "sticker_list_rank");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_sa_animated");
        if (str != null) {
            c2344009Gk.LJFF("element_id", str);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("chat_type", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("selected_id", str3);
        }
        c2344009Gk.LJIIIIZZ("action_type", enumC440980HQy.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_click_result_panel", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C440370HOp c440370HOp, EnumC441640HTm enumC441640HTm, boolean z, EnumC440220HOa enumC440220HOa, boolean z2, C0HGY c0hgy, C0H7H c0h7h, Integer num, String str, String str2, String str3, Integer num2, Integer num3, String str4) {
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LJIIIIZZ("action_type", enumC440220HOa.getParam());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        if (c0hgy != null) {
            c2344009Gk.LJFF("element", c0hgy.getParam());
        }
        if (c0h7h != null) {
            c2344009Gk.LJFF("element_provider", c0h7h.getParam());
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "element_position");
        }
        if (str != null) {
            c2344009Gk.LJFF("element_id", str);
        }
        if (z2) {
            c2344009Gk.LIZJ(1, "has_generation_history");
        }
        if (str2 != null) {
            c2344009Gk.LJFF("chat_type", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("selected_id", str3);
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "available_id_cnt");
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "selected_id_cnt");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("default_id", str4);
        }
        C20684815ws.LJIILLIIL("imagine_studio_click_creation_panel", c2344009Gk.LIZ);
    }

    public static void LIZJ(EnumC441640HTm enumC441640HTm, boolean z, C0HGY c0hgy, C0H7H c0h7h, EnumC440340HOm enumC440340HOm, String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, String str5, Integer num4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTm);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        c2344009Gk.LJIIIIZZ("element", c0hgy.getParam());
        c2344009Gk.LJIIIIZZ("element_provider", c0h7h.getParam());
        c2344009Gk.LJ(num, "element_position");
        c2344009Gk.LJIIIIZZ("action_page", enumC440340HOm.getParam());
        if (str != null) {
            c2344009Gk.LJFF("element_id", str);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("chat_type", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("selected_id", str3);
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "available_id_cnt");
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "selected_id_cnt");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("default_id", str4);
        }
        if (str5 != null) {
            c2344009Gk.LJFF("added_text", str5);
        }
        if (num4 != null) {
            c2344009Gk.LIZJ(num4.intValue(), "sticker_type");
        }
        C20684815ws.LJIILLIIL("imagine_studio_click_generate", c2344009Gk.LIZ);
    }
}
