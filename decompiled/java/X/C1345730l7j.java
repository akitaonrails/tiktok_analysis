package X;

import com.ss.android.ugc.aweme.experiment.CommentSingleActOptConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService;

/* JADX INFO: renamed from: X.0l7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345730l7j {
    public static final C1345730l7j LIZ = new C1345730l7j();
    public static final CommentSingleActOptConfig LIZIZ;
    public static final C01GW LIZJ;

    static {
        IPostModeDebugService iPostModeDebugService = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null);
        if (iPostModeDebugService != null) {
            iPostModeDebugService.LIZ();
        }
        IPostModeDebugService iPostModeDebugService2 = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null);
        if (iPostModeDebugService2 != null) {
            iPostModeDebugService2.LIZ();
        }
        LIZIZ = new CommentSingleActOptConfig(false, false, false, false, false, false);
        LIZJ = C452501pT.LIZIZ(new C1345740l7k());
    }

    public static CommentSingleActOptConfig LIZ() {
        return (CommentSingleActOptConfig) LIZJ.getValue();
    }
}
