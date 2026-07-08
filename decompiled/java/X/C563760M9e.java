package X;

import com.ss.android.ugc.aweme.album.IToolsAlbumService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0M9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563760M9e {
    public static String LIZ(EnterStoryParam enterStoryParam) {
        String shootEnterFrom = enterStoryParam.getShootEnterFrom();
        if (shootEnterFrom != null && shootEnterFrom.length() > 0) {
            return shootEnterFrom;
        }
        String shootEnterFrom2 = enterStoryParam.getShootExtraData().getShootEnterFrom();
        if (shootEnterFrom2 != null && shootEnterFrom2.length() > 0) {
            return shootEnterFrom2;
        }
        return enterStoryParam.getEnterFrom();
    }

    public static String LIZIZ(EnterStoryParam enterStoryParam) {
        String shootEnterMethod = enterStoryParam.getShootEnterMethod();
        if (shootEnterMethod != null && shootEnterMethod.length() > 0) {
            return shootEnterMethod;
        }
        String shootEnterMethod2 = enterStoryParam.getShootExtraData().getShootEnterMethod();
        if (shootEnterMethod2 != null && shootEnterMethod2.length() > 0) {
            return shootEnterMethod2;
        }
        return enterStoryParam.getEnterMethod();
    }

    public static void LIZJ(EnterStoryParam enterStoryParam, ShortVideoContext shortVideoContext) {
        IToolsAlbumService iToolsAlbumService = (IToolsAlbumService) PluggableExtentionKt.pluggableSpi$default(IToolsAlbumService.class, false, false, false, 14, null);
        if (iToolsAlbumService != null) {
            iToolsAlbumService.LIZIZ(shortVideoContext.getCreationId(), enterStoryParam.getShootWay(), enterStoryParam.getEnterFrom(), enterStoryParam.getEnterMethod(), enterStoryParam.getRequestId(), new AwS587S0100000_8(enterStoryParam, 608));
        }
    }
}
