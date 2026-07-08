package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;

/* JADX INFO: renamed from: X.0RYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697680RYg {
    public static final boolean LIZ(VideoItemParams videoItemParams) {
        if (videoItemParams.getAweme().isAd()) {
            return false;
        }
        return ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIL(videoItemParams.getAweme(), videoItemParams.mEventType);
    }
}
