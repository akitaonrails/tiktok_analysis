package X;

import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigData;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0yk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1869220yk4 {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 0));

    public abstract EcomImageAdaptSizeConfigData LIZ();

    public final List<EcomImageAdaptSizeConfigModel> LIZIZ() {
        EcomImageAdaptSizeConfigData ecomImageAdaptSizeConfigDataLIZ = LIZ();
        List<EcomImageAdaptSizeConfigModel> list = ecomImageAdaptSizeConfigDataLIZ.configs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EcomImageAdaptSizeConfigModel> it2 = list.iterator();
        while (it2.hasNext()) {
            EcomImageAdaptSizeConfigModel next = it2.next();
            List<String> list2 = next.keys;
            if (list2 != null && !list2.isEmpty()) {
                for (Map.Entry<String, EcomImageAdaptSizeConfigModel> entry : ecomImageAdaptSizeConfigDataLIZ.configMap.entrySet()) {
                    if (list2.contains(entry.getKey())) {
                        EcomImageAdaptSizeConfigModel value = entry.getValue();
                        next.getClass();
                        List<String> list3 = next.keys;
                        if (list3 == null) {
                            list3 = value.keys;
                        }
                        String str = next.scene;
                        if (str == null) {
                            str = value.scene;
                        }
                        List<String> list4 = next.scenes;
                        if (list4 == null) {
                            list4 = value.scenes;
                        }
                        Map<String, EcomImageXConfigAdaptTemplate> map = next.adaptTemplate;
                        if (map == null) {
                            map = value.adaptTemplate;
                        }
                        String str2 = next.width;
                        if (str2 == null) {
                            str2 = value.width;
                        }
                        List<Integer> list5 = next.widthStages;
                        if (list5 == null) {
                            list5 = value.widthStages;
                        }
                        String str3 = next.adaptType;
                        if (str3 == null) {
                            str3 = value.adaptType;
                        }
                        String str4 = next.screenAdaptType;
                        if (str4 == null) {
                            str4 = value.screenAdaptType;
                        }
                        List<Integer> list6 = next.screenWidthStages;
                        if (list6 == null) {
                            list6 = value.screenWidthStages;
                        }
                        List<Integer> list7 = next.configScreenWidthStages;
                        if (list7 == null) {
                            list7 = value.configScreenWidthStages;
                        }
                        String str5 = next.adaptStrategy;
                        if (str5 == null) {
                            str5 = value.adaptStrategy;
                        }
                        Map<String, EcomImageXConfigAdaptTemplate> map2 = map;
                        String str6 = str2;
                        String str7 = str;
                        List<String> list8 = list4;
                        List<String> list9 = list3;
                        next = new EcomImageAdaptSizeConfigModel(list9, str7, list8, map2, str6, list5, str3, str4, list6, list7, str5);
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
