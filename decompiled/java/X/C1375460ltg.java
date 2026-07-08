package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareConfiguration;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplaySharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: renamed from: X.0ltg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375460ltg {
    public static void LIZ(Activity activity, final LiveReplayShareData liveReplayShareData) {
        BaseTemplate baseTemplateLIZIZ;
        String str;
        String str2 = liveReplayShareData.contentPb;
        if (str2 != null && (baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, str2)) != null && (str = liveReplayShareData.shareScene) != null && str.length() != 0) {
            SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask(str, baseTemplateLIZIZ, new SendMessageEventParcel("live_replay_page", null, null, null, null, null, 62), null, false, 24);
            C1370940lmO c1370940lmOLJIIIIZZ = new AbstractC1377610lx9(liveReplayShareData) { // from class: X.0lvd
                public final LiveReplayShareData LIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "live_replay";
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    String str3 = this.LIZ.shareScene;
                    return str3 == null ? "" : str3;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return new LiveReplayShareModel(this.LIZ);
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    Bundle bundle = new Bundle();
                    String str3 = this.LIZ.imageURL;
                    C786410Ut5.LJJIZ(bundle, "video_cover", str3 != null ? StoryNoteDataCollectionKt.toUrlModel(str3) : null);
                    C786410Ut5.LJJJI("default_edit_text_msg", this.LIZ.contentDesc, bundle);
                    C786410Ut5.LJJJI("enter_from", "single_song", bundle);
                    C786410Ut5.LJJJI("enter_method", "button", bundle);
                    return bundle;
                }

                {
                    this.LIZ = liveReplayShareData;
                }
            }.LJIIIIZZ();
            c1370940lmOLJIIIIZZ.LJIIIIZZ = sendMessageTemplateTask;
            C621180OYa.LIZ.LJIIZILJ(new LiveReplaySharePackage(c1370940lmOLJIIIIZZ), activity, LiveReplayShareConfiguration.LLILLJJLI);
        }
    }
}
