package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0SQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQJ {
    public static final C0SQJ LIZ = new C0SQJ();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static final boolean LIZ(Aweme aweme) {
        boolean z;
        AwemeRawAd awemeRawAd;
        boolean z2 = ((IMainPageSlide) ServiceManager.get().getService(IMainPageSlide.class)).LIZIZ(aweme).LIZ;
        if (aweme != null) {
            if (aweme.getAwemeType() != 150 && aweme.getAwemeType() != 104) {
                z = false;
            } else {
                z = true;
            }
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isEnableLeftSlideGuide() && !z && !z2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
