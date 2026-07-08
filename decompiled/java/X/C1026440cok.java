package X;

import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterDeeplinkModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;

/* JADX INFO: renamed from: X.0cok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026440cok {
    public static final C1026790cpJ LIZIZ(CRouterCoreModel cRouterCoreModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
        String url;
        CRouterDeeplinkModel deeplinkModel = cRouterCoreModel.getDeeplinkModel();
        if (deeplinkModel != null && (url = deeplinkModel.getUrl()) != null) {
            return new C1026790cpJ(c1025880cnq, c1025520cnG, url, c1025520cnG.LJIIIIZZ);
        }
        return null;
    }

    public static final C1026780cpI LIZ(CRouterCoreModel cRouterCoreModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, ICRouterMainDelegate iCRouterMainDelegate) {
        String url;
        CRouterWebModel webModel = cRouterCoreModel.getWebModel();
        if (webModel == null) {
            return null;
        }
        if (((!webModel.isBOC() || webModel.isUniversal()) && !iCRouterMainDelegate.LJI(c1025880cnq.LIZJ, c1025520cnG.LJI)) || (url = webModel.getUrl()) == null) {
            return null;
        }
        return new C1026780cpI(c1025880cnq, c1025520cnG, url);
    }

    public static final C1026800cpK LIZJ(CRouterCoreModel cRouterCoreModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1026910cpV c1026910cpV) {
        String url;
        CRouterDeeplinkModel deeplinkModel = cRouterCoreModel.getDeeplinkModel();
        if (deeplinkModel != null && (url = deeplinkModel.getUrl()) != null) {
            return new C1026800cpK(c1025880cnq, c1025520cnG, c1026910cpV, url);
        }
        return null;
    }

    public static final C1026810cpL LIZLLL(CRouterCoreModel cRouterCoreModel, C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1026910cpV c1026910cpV) {
        String url;
        boolean zIsUniversal;
        CRouterWebModel webModel = cRouterCoreModel.getWebModel();
        if (webModel != null && (url = webModel.getUrl()) != null) {
            CRouterWebModel webModel2 = cRouterCoreModel.getWebModel();
            if (webModel2 != null) {
                zIsUniversal = webModel2.isUniversal();
            } else {
                zIsUniversal = false;
            }
            return new C1026810cpL(c1025880cnq, c1025520cnG, c1026910cpV, url, zIsUniversal);
        }
        return null;
    }
}
