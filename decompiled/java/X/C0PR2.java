package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PR2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PR2 {
    public static final Set<AnoleComponentModel> LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue().getRenderStrategy(), "idle_prerender") || Intrinsics.LJFF(entry.getValue().getRenderStrategy(), "idle_prerender")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Object value = ((Map.Entry) it2.next()).getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            return C13LP.LLIIJI(arrayList);
        }
        return null;
    }
}
