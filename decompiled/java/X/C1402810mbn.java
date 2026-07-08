package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402810mbn {
    public static final C1402810mbn LIZ = new C1402810mbn();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        return c0lab;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        AutoCutThemeData next;
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.templateId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData = next;
        if (autoCutThemeData == null) {
            return;
        }
        s.LIZ.getClass();
        int iLIZLLL = C1403130mcJ.LIZLLL(s.LJJIFFI(autoCutModel), autoCutThemeData.indexFromSource, autoCutThemeData.LIZIZ()) + 1;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("tt_template_id", autoCutThemeData.templateId);
        c0lab.LIZ(autoCutThemeData.templateType, "tt_template_type");
        c0lab.LJ("autocut_click_from", C1428520nHG.LJJII(videoPublishEditModel, autoCutThemeData.LIZIZ(), null));
        c0lab.LIZ(iLIZLLL, "autocut_style_order");
        C20684815ws.LJIILLIIL("ttcrt_autocut_ai_generate_bubble_click", c0lab.LIZ);
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        AutoCutThemeData next;
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.templateId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData = next;
        if (autoCutThemeData == null) {
            return;
        }
        s.LIZ.getClass();
        int iLIZLLL = C1403130mcJ.LIZLLL(s.LJJIFFI(autoCutModel), autoCutThemeData.indexFromSource, autoCutThemeData.LIZIZ()) + 1;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("tt_template_id", autoCutThemeData.templateId);
        c0lab.LIZ(autoCutThemeData.templateType, "tt_template_type");
        c0lab.LJ("autocut_click_from", C1428520nHG.LJJII(videoPublishEditModel, autoCutThemeData.LIZIZ(), null));
        c0lab.LIZ(iLIZLLL, "autocut_style_order");
        C20684815ws.LJIILLIIL("ttcrt_autocut_ai_generate_bubble_show", c0lab.LIZ);
    }
}
