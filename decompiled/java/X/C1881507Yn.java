package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.FansPopUpData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.FansPopUpDatas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.07Yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1881507Yn {
    public static final FansPopUpData LIZ(FansPopUpDatas fansPopUpDatas) {
        Map<String, FansPopUpData> map = fansPopUpDatas.productData;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<String, FansPopUpData>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getValue());
            }
            return (FansPopUpData) C13LP.LJJJLL(arrayList);
        }
        return null;
    }
}
