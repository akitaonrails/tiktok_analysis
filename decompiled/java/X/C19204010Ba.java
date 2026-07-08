package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19204010Ba {
    public static final C19204010Ba LIZ = new C19204010Ba();

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getAdsAuthorizationSwitch()) {
            if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth() != null && !Intrinsics.LJFF(videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth(), "{}")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Context context) {
        ICreativePageService iCreativePageService = (ICreativePageService) PluggableExtentionKt.pluggableSpi$default(ICreativePageService.class, false, false, false, 14, null);
        if (iCreativePageService == null || !iCreativePageService.isVideoEditPage(C1388190mED.LIZ(context))) {
            return false;
        }
        return true;
    }
}
