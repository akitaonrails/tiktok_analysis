package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import java.util.UUID;

/* JADX INFO: renamed from: X.0ZQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQ7 implements InterfaceC461540I8a {
    public final SessionInfo LL;

    public C0ZQ7(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // X.InterfaceC461540I8a
    public final void o3(ShareMusicContent shareMusicContent) {
        String string = UUID.randomUUID().toString();
        String musicId = shareMusicContent.getMusicId();
        if (!TextUtils.isEmpty(musicId)) {
            Activity currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://music/detail/");
            sbLIZ.append(musicId);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(currentActivity, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("process_id", string);
            smartRouteBuildRoute.open();
        }
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
        if (iIMMessageAdapterAnalytics != null) {
            iIMMessageAdapterAnalytics.LJIIIIZZ(musicId, this.LL.getSingleChatFromUserId(), this.LL.getConversationId(), string, C0I0B.LJFF.LIZIZ());
        }
    }
}
