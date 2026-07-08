package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;

/* JADX INFO: renamed from: X.0lQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357670lQz {
    public static final C1357670lQz LIZ = new C1357670lQz();
    public static volatile String LIZIZ = "";

    public static final boolean LIZ(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        EnumC1373410lqN enumC1373410lqNLJIIIZ = ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIIZ(str, str2);
        if (enumC1373410lqNLJIIIZ != EnumC1373410lqN.SHARE_VIDEO && enumC1373410lqNLJIIIZ != EnumC1373410lqN.SHARE_PHOTO_VIDEO && enumC1373410lqNLJIIIZ != EnumC1373410lqN.SHARE_COMMENT && enumC1373410lqNLJIIIZ != EnumC1373410lqN.SHARE_STORY) {
            return false;
        }
        return true;
    }
}
