package X;

import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.CommentLikeStatusSyncPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.DebugTagPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.ExactLynxHeightPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.ExactLynxPreHeightPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.ExactLynxPreWidthPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.FollowStatusSyncPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.JSLaunchPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.LynxControlPLayPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.ProcessRenderPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.VideoCollectStatusSyncPlugin;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl.VideoLikeStatusSyncPlugin;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1D67, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D67 {
    public final ConcurrentHashMap<String, Class<? extends InterfaceC2250311D5x>> LIZ = new ConcurrentHashMap<>();

    public C1D67() {
        for (Class<? extends InterfaceC2250311D5x> cls : C1697810uHb.LJIIJJI(C1D6Q.class, CommentLikeStatusSyncPlugin.class, C1D6J.class, DebugTagPlugin.class, C1D6R.class, C1D6O.class, ExactLynxHeightPlugin.class, ExactLynxPreHeightPlugin.class, ExactLynxPreWidthPlugin.class, C1D6X.class, FollowStatusSyncPlugin.class, C1D6Y.class, JSLaunchPlugin.class, C1D6T.class, LynxControlPLayPlugin.class, C1D6S.class, ProcessRenderPlugin.class, C1D6I.class, C1D6M.class, C1D6U.class, C1D6G.class, C1D6K.class, C1D6H.class, VideoCollectStatusSyncPlugin.class, VideoLikeStatusSyncPlugin.class, C1D6N.class)) {
            this.LIZ.put(cls.getSimpleName(), cls);
        }
    }
}
