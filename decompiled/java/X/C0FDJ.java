package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0FDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDJ {
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, Effect effect, String str, String str2) {
        String shootWay;
        String contentSource;
        String storyShootEntrance;
        String contentType;
        String effectId = effect.getEffectId();
        IFoundationAVService iFoundationAVService = (IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class);
        iFoundationAVService.setLastInfo(new C1179004jM(effectId));
        iFoundationAVService.setLastInfo(new C1259004wG(effect.getResourceId()));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("effect_name", effect.getName());
        c0lab.LJ("effect_id", effectId);
        AVETParameter avetParameter = videoPublishEditModel.getAvetParameter();
        String str3 = "";
        if (avetParameter == null || (shootWay = avetParameter.getShootWay()) == null) {
            shootWay = "";
        }
        c0lab.LJ("shoot_way", shootWay);
        String creationId = videoPublishEditModel.getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        AVETParameter avetParameter2 = videoPublishEditModel.getAvetParameter();
        if (avetParameter2 == null || (contentSource = avetParameter2.getContentSource()) == null) {
            contentSource = "";
        }
        c0lab.LJ("content_source", contentSource);
        AVETParameter avetParameter3 = videoPublishEditModel.getAvetParameter();
        if (avetParameter3 == null || (storyShootEntrance = avetParameter3.getStoryShootEntrance()) == null) {
            storyShootEntrance = "";
        }
        c0lab.LJ("shoot_entrance", storyShootEntrance);
        AVETParameter avetParameter4 = videoPublishEditModel.getAvetParameter();
        if (avetParameter4 != null && (contentType = avetParameter4.getContentType()) != null) {
            str3 = contentType;
        }
        c0lab.LJ("content_type", str3);
        c0lab.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        c0lab.LJ("to_status", str);
        c0lab.LJ("tab_name", str2);
        c0lab.LJ("voice_modify_id", effectId);
        C20684815ws.LJIILLIIL("select_voice_effect", c0lab.LIZ);
    }
}
