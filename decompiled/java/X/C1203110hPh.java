package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0hPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203110hPh {
    public static VideoViewerListVM LIZ(Fragment fragment, C19EG c19eg) {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        if ((objLJIILLIIL instanceof Fragment) && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL((Fragment) objLJIILLIIL)) != null) {
            VideoViewerListVM videoViewerListVM = (VideoViewerListVM) ViewModelProviders.of(fragmentLIZLLL).get(VideoViewerListVM.class);
            videoViewerListVM.yQ2(fragmentLIZLLL, c19eg);
            return videoViewerListVM;
        }
        VideoViewerListVM videoViewerListVM2 = (VideoViewerListVM) ViewModelProviders.of(c19eg).get(VideoViewerListVM.class);
        videoViewerListVM2.yQ2(fragment, c19eg);
        return videoViewerListVM2;
    }
}
