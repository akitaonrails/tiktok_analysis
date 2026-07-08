package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0mcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403480mcs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (!videoPublishEditModel.isIfAiMeStyleUsed().booleanValue()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it2 = videoPublishEditModel.getFinalVideoList().iterator();
        while (it2.hasNext()) {
            AiMeStyleInfo aiMeStyleInfo = it2.next().getAiMeStyleInfo();
            if (aiMeStyleInfo != null) {
                sb.append(aiMeStyleInfo.getCurrentStyleId());
                sb.append(",");
                sb2.append(aiMeStyleInfo.getEffectStyleSelectedFrom());
                sb2.append(",");
                sb3.append(aiMeStyleInfo.getTaskId());
                sb3.append(",");
                sb4.append(aiMeStyleInfo.getRootStyleId());
                sb4.append(",");
            }
        }
        LIZ(c0lab, sb2, sb3, sb, sb4);
    }

    public static void LIZJ(C0LAB c0lab, AiMeStyleInfo aiMeStyleInfo) {
        if (aiMeStyleInfo != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb.append(aiMeStyleInfo.getCurrentStyleId());
            sb.append(",");
            sb2.append(aiMeStyleInfo.getEffectStyleSelectedFrom());
            sb2.append(",");
            sb3.append(aiMeStyleInfo.getTaskId());
            sb3.append(",");
            sb4.append(aiMeStyleInfo.getRootStyleId());
            sb4.append(",");
            LIZ(c0lab, sb2, sb3, sb, sb4);
        }
    }

    public static void LIZ(C0LAB c0lab, StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4) {
        c0lab.LJ("style_selected_from", C13LN.LJLJLLL(sb).toString());
        c0lab.LJ("aime_task_id", C13LN.LJLJLLL(sb2).toString());
        c0lab.LJ("style_id", C13LN.LJLJLLL(sb3).toString());
        c0lab.LJ("root_style_id", C13LN.LJLJLLL(sb4).toString());
        c0lab.LIZ(1, "is_default_prompt");
        c0lab.LJ("aime_entrance", "prop_panel");
    }
}
