package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0PPH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPH {
    public static final boolean LIZ(Aweme aweme, String str) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        String str2;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        ArrayList arrayList = null;
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                AnoleComponentModel value = it2.next().getValue();
                if (value != null && (str2 = value.slotID) != null) {
                    arrayList2.add(str2);
                }
            }
            arrayList = new ArrayList(arrayList2);
        }
        if (arrayList == null || str == null || str.length() == 0) {
            return false;
        }
        return arrayList.contains(str);
    }
}
