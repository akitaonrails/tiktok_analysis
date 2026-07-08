package X;

import X.InterfaceC1282004zy;
import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;

/* JADX INFO: renamed from: X.0mBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1386560mBa<PARAMS extends InterfaceC1282004zy> implements InterfaceC1386630mBh<PARAMS> {
    public static String LIZLLL(IFeedMobParamsProvider iFeedMobParamsProvider, BaseControllerContext baseControllerContext) {
        String strIm0;
        if (iFeedMobParamsProvider != null && (strIm0 = iFeedMobParamsProvider.im0()) != null && strIm0.length() > 0) {
            return iFeedMobParamsProvider.im0();
        }
        if (baseControllerContext != null) {
            return baseControllerContext.getEnterMethod();
        }
        return null;
    }
}
