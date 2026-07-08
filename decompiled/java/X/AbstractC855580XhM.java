package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC855580XhM {
    public InterfaceC855710XhZ LIZ;

    public abstract void LIZIZ(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, C0YUR c0yur);

    public final String LIZ() {
        InterfaceC855710XhZ interfaceC855710XhZ = this.LIZ;
        return interfaceC855710XhZ != null ? ((C855010XgR) interfaceC855710XhZ).LIZ.LJIIJ() : "";
    }

    public final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("creation_id", videoPublishEditModel.getCreationId());
        map.put("enter_from", "video_post_page");
        map.put("content_type", "video");
        map.put("shoot_way", videoPublishEditModel.mShootWay);
        ((C855010XgR) this.LIZ).LIZ.setTag(map);
    }

    public AbstractC855580XhM(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z, C0YUR c0yur) {
        LIZIZ(tikTokPublishGroupSceneFragment, view, c0yur);
    }
}
