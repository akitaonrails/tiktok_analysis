package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412610mrb {
    public static final C0LAB LIZLLL(C0LAB c0lab, Integer num) {
        if (num != null) {
            num.intValue();
            c0lab.LIZ(num.intValue(), "autocut_speed_variation_type");
        }
        return c0lab;
    }

    public static final void LJ(C0LAB c0lab, Integer num) {
        if (num == null) {
            return;
        }
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.CUT_SAME;
        if (num.intValue() == enumC1412640mre.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre));
            return;
        }
        EnumC1412640mre enumC1412640mre2 = EnumC1412640mre.PUGC_TEMPLATE;
        if (num.intValue() == enumC1412640mre2.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre2));
            return;
        }
        EnumC1412640mre enumC1412640mre3 = EnumC1412640mre.AIGT;
        if (num.intValue() == enumC1412640mre3.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre3));
            return;
        }
        EnumC1412640mre enumC1412640mre4 = EnumC1412640mre.SGT;
        if (num.intValue() == enumC1412640mre4.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre4));
            return;
        }
        EnumC1412600mra enumC1412600mra = EnumC1412600mra.SOUND_SYNC_TEMPLATE;
        if (num.intValue() == enumC1412600mra.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZJ(enumC1412600mra));
            return;
        }
        EnumC1412600mra enumC1412600mra2 = EnumC1412600mra.EFFECT_TEMPLATE;
        if (num.intValue() == enumC1412600mra2.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZJ(enumC1412600mra2));
            return;
        }
        EnumC1412600mra enumC1412600mra3 = EnumC1412600mra.EFFECT_MUSIC_TEMPLATE;
        if (num.intValue() == enumC1412600mra3.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZJ(enumC1412600mra3));
            return;
        }
        EnumC1412600mra enumC1412600mra4 = EnumC1412600mra.SLIDESHOW_TEMPLATE;
        if (num.intValue() == enumC1412600mra4.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZJ(enumC1412600mra4));
            return;
        }
        EnumC1412640mre enumC1412640mre5 = EnumC1412640mre.AI_ALIVE_TEMPLATE;
        if (num.intValue() == enumC1412640mre5.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre5));
            return;
        }
        EnumC1412640mre enumC1412640mre6 = EnumC1412640mre.AUTO_PICK_TEMPLATE;
        if (num.intValue() == enumC1412640mre6.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre6));
            return;
        }
        EnumC1412640mre enumC1412640mre7 = EnumC1412640mre.UGC_TEMPLATE;
        if (num.intValue() == enumC1412640mre7.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre7));
            return;
        }
        EnumC1412640mre enumC1412640mre8 = EnumC1412640mre.LYRICS_RULE_TEMPLATE;
        if (num.intValue() == enumC1412640mre8.getValue()) {
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre8));
        } else {
            c0lab.LJ("tt_template_type", "autocut_algo");
        }
    }

    public static final C0LAB LIZ(C0LAB c0lab, Integer num, String str) {
        if (num == null) {
            return c0lab;
        }
        if (num.intValue() == EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()) {
            str = "";
        }
        c0lab.LJ("autocut_template_id", str);
        return c0lab;
    }

    public static final void LIZIZ(C0LAB c0lab, String str, List list) {
        int iHashCode;
        String str2;
        String str3;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (Object obj : list) {
                int i2 = i + 1;
                String str4 = null;
                if (i >= 0) {
                    AutoCutTitle autoCutTitle = (AutoCutTitle) obj;
                    if (autoCutTitle != null) {
                        str2 = autoCutTitle.caption;
                    } else {
                        str2 = null;
                    }
                    sb.append(str2);
                    if (autoCutTitle != null) {
                        str3 = autoCutTitle.captionFontId;
                    } else {
                        str3 = null;
                    }
                    sb2.append(str3);
                    if (autoCutTitle != null) {
                        str4 = autoCutTitle.originCaptionLocation;
                    }
                    sb3.append(str4);
                    if (i != list.size() - 1) {
                        sb.append("^");
                        sb2.append(",");
                        sb3.append(";");
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (str != null && ((iHashCode = str.hashCode()) == -795442013 ? str.equals("enter_video_post_page") : iHashCode == -369458823 ? str.equals("enter_video_edit_page") : iHashCode == -235365105 && str.equals("publish"))) {
                c0lab.LJ("autocut_caption_font_id", sb2.toString());
                c0lab.LJ("autocut_caption_location", sb3.toString());
            } else {
                c0lab.LJ("caption", sb.toString());
                c0lab.LJ("caption_font_id", sb2.toString());
                c0lab.LJ("caption_location", sb3.toString());
            }
        }
    }

    public static final C0LAB LIZJ(C0LAB c0lab, TemplateDynamicSlotModel templateDynamicSlotModel, String str) {
        if (templateDynamicSlotModel == null || !Intrinsics.LJFF(templateDynamicSlotModel.templateId, str)) {
            return c0lab;
        }
        c0lab.LIZ(templateDynamicSlotModel.contentCount, "tt_template_content_cnt");
        c0lab.LIZ(templateDynamicSlotModel.reuseContentCount, "tt_template_reuse_content_cnt");
        c0lab.LJ("tt_template_non_replaceable_content_loc", templateDynamicSlotModel.nonReplaceableContentLoc);
        c0lab.LJ("tt_template_content_duration", templateDynamicSlotModel.contentDuration);
        c0lab.LIZ(templateDynamicSlotModel.isUseSameContent, "is_use_same_content");
        return c0lab;
    }

    public static final void LJFF(C0LAB c0lab, Integer num, String str) {
        int value = EnumC1412640mre.SGT.getValue();
        if (num != null && num.intValue() == value && str != null && str.length() != 0) {
            c0lab.LJ("template_tier_type", str);
        }
    }
}
