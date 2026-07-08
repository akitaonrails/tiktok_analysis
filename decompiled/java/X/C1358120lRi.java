package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;

/* JADX INFO: renamed from: X.0lRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358120lRi {
    public static UpvotePanelListViewModel LIZ(C19EG c19eg) {
        Object objLJIILLIIL;
        ViewModelProvider viewModelProviderOf;
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        if (c19eg != null) {
            objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        } else {
            objLJIILLIIL = null;
        }
        if ((objLJIILLIIL instanceof Fragment) && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL((Fragment) objLJIILLIIL)) != null) {
            return (UpvotePanelListViewModel) ViewModelProviders.of(fragmentLIZLLL).get(UpvotePanelListViewModel.class);
        }
        if (c19eg == null || (viewModelProviderOf = ViewModelProviders.of(c19eg)) == null) {
            return null;
        }
        return (UpvotePanelListViewModel) viewModelProviderOf.get(UpvotePanelListViewModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358120lRi.LIZIZ(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.String):java.lang.String");
    }
}
