package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageDataModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003700cE4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel] */
    public static final IABLoadingFormatModel LIZ(AwemeRawAd awemeRawAd) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        Object c098200Yq;
        ?? r3;
        LandingPageDataModel landingPageDataModel = null;
        String landingPageDataString = null;
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (Intrinsics.LJFF(((AnoleComponentModel) obj).slotID, "tt_iab_loading_format")) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Map<String, ? extends Object> map2 = ((AnoleComponentModel) it2.next()).data;
                C259800zU c259800zU = new C259800zU();
                try {
                    Gson gson = C7740030o.LIZ().getGson();
                    if (gson != null) {
                        r3 = (IABLoadingFormatModel) gson.LJII(gson.LJIILL(map2), IABLoadingFormatModel.class);
                    } else {
                        r3 = 0;
                    }
                    c259800zU.element = r3;
                    if (r3 != 0) {
                        Gson gson2 = C7740030o.LIZ().getGson();
                        if (gson2 != null) {
                            IABLoadingFormatModel iABLoadingFormatModel = (IABLoadingFormatModel) c259800zU.element;
                            if (iABLoadingFormatModel != null) {
                                landingPageDataString = iABLoadingFormatModel.getLandingPageDataString();
                            }
                            landingPageDataModel = (LandingPageDataModel) gson2.LJII(landingPageDataString, LandingPageDataModel.class);
                        }
                        r3.setLandingPageData(landingPageDataModel);
                    }
                    c098200Yq = (IABLoadingFormatModel) c259800zU.element;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m8isSuccessimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getLoadingFormatData() parse failed ,reason = ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C189200o6.m7isFailureimpl(c098200Yq);
                return (IABLoadingFormatModel) c259800zU.element;
            }
        }
        return null;
    }

    public static final boolean LIZIZ(AwemeRawAd awemeRawAd, String str) {
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        ArrayList arrayList = new ArrayList();
        AnoleModel anoleModel = awemeRawAd.getAnoleModel();
        if (anoleModel != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collectionValues) {
                if (arrayList.add(((AnoleComponentModel) obj).slotID)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList.contains(str);
    }
}
