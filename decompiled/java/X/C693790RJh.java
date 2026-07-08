package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693790RJh {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            boolean r0 = X.C1017070cZd.LLILIL(r2)
            if (r0 == 0) goto L47
            if (r2 == 0) goto L54
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r2.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getPseudoAdData()
        L12:
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L54
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r0 = r0.components
            if (r0 == 0) goto L54
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r0
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.slotID
            if (r0 == 0) goto L2b
            r2.add(r0)
            goto L2b
        L47:
            if (r2 == 0) goto L54
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
            goto L12
        L4e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C693790RJh.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
    }

    public static final List<String> LIZIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeRawAd styleInfo;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && (styleInfo = commerceVideoAuthInfo.getStyleInfo()) != null && (anoleModel = styleInfo.getAnoleModel()) != null && (map = anoleModel.components) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                String str = it2.next().getValue().slotID;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            List<String> listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }
}
