package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0MIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566150MIj {
    public static List LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> finalVideoList;
        TimeSpeedModelExtension timeSpeedModelExtension;
        AiMeStyleInfo aiMeStyleInfo;
        List<String> editEffectIds;
        Object c098200Yq;
        boolean z;
        boolean z2 = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ai_self_effects_panel_improvement_enabled", true, false)) {
            new Object() { // from class: X.0MIk
            }.getClass();
            try {
                c098200Yq = Class.forName("com.ss.android.ugc.aweme.aime.services.AIMEServicesImpl");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2 && (finalVideoList = videoPublishEditModel.getFinalVideoList()) != null && finalVideoList.size() == 1 && (timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJJLL(finalVideoList)) != null && (aiMeStyleInfo = timeSpeedModelExtension.getAiMeStyleInfo()) != null && (editEffectIds = aiMeStyleInfo.getEditEffectIds()) != null && (!editEffectIds.isEmpty())) {
            return editEffectIds;
        }
        AISelfModel aISelfModel = videoPublishEditModel.creativeModel.aiSelfModel;
        if (aISelfModel.isTemplateStyle) {
            return C13BV.INSTANCE;
        }
        return aISelfModel.originalEditEffectIds;
    }
}
