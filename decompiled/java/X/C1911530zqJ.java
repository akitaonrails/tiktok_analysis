package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911530zqJ {
    public static final C1911530zqJ LIZ = new C1911530zqJ();

    public static final long LIZ(Aweme aweme) {
        if (aweme.getVideo() != null && aweme.getVideo().getDuration() != 0) {
            return aweme.getVideo().getDuration();
        }
        return 1L;
    }

    public static final void LIZIZ(Aweme aweme, boolean z) {
        if (aweme.getHasPromoteEntry() == 5 || aweme.getHasPromoteEntry() == 6) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJ(z);
        }
    }
}
