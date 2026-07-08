package X;

import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0coj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026430coj {
    public static final C1026790cpJ LIZJ(GMTBaseModel gMTBaseModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
        String openUrl = gMTBaseModel.getOpenUrl();
        if (openUrl != null) {
            return new C1026790cpJ(c1025880cnq, c1025520cnG, openUrl, c1025520cnG.LJIIIIZZ);
        }
        return null;
    }

    public static final C1026680cp8 LIZ(GMTBaseModel gMTBaseModel, C1025520cnG c1025520cnG, C1025880cnq c1025880cnq, boolean z) {
        String webUrl;
        if ((z || gMTBaseModel.getBrowserConfig() != null) && (webUrl = gMTBaseModel.getWebUrl()) != null && !a0.LJJJIL(webUrl)) {
            String webUrl2 = gMTBaseModel.getWebUrl();
            BrowserConfig browserConfig = gMTBaseModel.getBrowserConfig();
            if (browserConfig == null) {
                browserConfig = new BrowserConfig(1, 0, null, null, 0L);
            }
            return new C1026680cp8(c1025880cnq, c1025520cnG, webUrl2, browserConfig);
        }
        String webUrl3 = gMTBaseModel.getWebUrl();
        BrowserConfig browserConfig2 = gMTBaseModel.getBrowserConfig();
        if (webUrl3 != null && browserConfig2 != null) {
            return new C1026680cp8(c1025880cnq, c1025520cnG, webUrl3, browserConfig2);
        }
        return null;
    }

    public static final C1026780cpI LIZIZ(GMTBaseModel gMTBaseModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, ICRouterMainDelegate iCRouterMainDelegate) {
        String strLJIILIIL;
        if ((!gMTBaseModel.isOpenSystemBrowser() && !iCRouterMainDelegate.LJI(c1025880cnq.LIZJ, c1025520cnG.LJI)) || (strLJIILIIL = iCRouterMainDelegate.LJIILIIL(c1025880cnq.LIZLLL)) == null) {
            return null;
        }
        return new C1026780cpI(c1025880cnq, c1025520cnG, strLJIILIIL);
    }

    public static final C1026800cpK LIZLLL(GMTBaseModel gMTBaseModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1026910cpV c1026910cpV) {
        if (gMTBaseModel.getOpenUrl() == null) {
            return null;
        }
        return new C1026800cpK(c1025880cnq, c1025520cnG, c1026910cpV, gMTBaseModel.getOpenUrl());
    }
}
