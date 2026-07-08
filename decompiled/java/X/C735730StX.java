package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0StX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735730StX {
    public static int LIZ(Aweme aweme) {
        boolean z;
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJI(aweme) || (C298660BnE.LIZ() && C735280Sso.LJIIIIZZ(aweme))) {
            z = true;
        } else {
            z = false;
        }
        if (((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIJL(aweme) && z) {
            return R.raw.icon_2pt_playlist_fill;
        }
        return R.raw.icon_2pt_playlist;
    }
}
