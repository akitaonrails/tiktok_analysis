package X;

import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigData;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeGlobalBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20156113tn {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 464));

    public abstract EcomImageXConfigData LIZ();

    public final List<EcomImageXConfigModel> LIZIZ() {
        EcomImageXConfigData ecomImageXConfigDataLIZ = LIZ();
        List<EcomImageXConfigModel> list = ecomImageXConfigDataLIZ.config;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EcomImageXConfigModel> it2 = list.iterator();
        while (it2.hasNext()) {
            EcomImageXConfigModel next = it2.next();
            List<String> list2 = next.key;
            if (list2 != null && !list2.isEmpty()) {
                for (Map.Entry<String, EcomImageXConfigModel> entry : ecomImageXConfigDataLIZ.configMap.entrySet()) {
                    if (list2.contains(entry.getKey())) {
                        EcomImageXConfigModel value = entry.getValue();
                        next.getClass();
                        String str = next.scene;
                        if (str == null) {
                            str = value.scene;
                        }
                        String str2 = next.page;
                        if (str2 == null) {
                            str2 = value.page;
                        }
                        String str3 = next.f56default;
                        if (str3 == null) {
                            str3 = value.f56default;
                        }
                        List<String> list3 = next.origin;
                        if (list3 == null) {
                            list3 = value.origin;
                        }
                        String str4 = next.template;
                        if (str4 == null) {
                            str4 = value.template;
                        }
                        String str5 = next.quality;
                        if (str5 == null) {
                            str5 = value.quality;
                        }
                        String str6 = next.format;
                        if (str6 == null) {
                            str6 = value.format;
                        }
                        String str7 = next.operationType;
                        if (str7 == null) {
                            str7 = value.operationType;
                        }
                        String str8 = next.width;
                        if (str8 == null) {
                            str8 = value.width;
                        }
                        Integer num = next.lowWidth;
                        if (num == null) {
                            num = value.lowWidth;
                        }
                        Integer num2 = next.highWidth;
                        if (num2 == null) {
                            num2 = value.highWidth;
                        }
                        String str9 = str;
                        String str10 = str2;
                        String str11 = str3;
                        next = new EcomImageXConfigModel(null, str9, str10, str11, list3, str4, str5, str6, str7, str8, num, num2);
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public final List<EcomImageXConfigModel> LIZJ(String str) {
        if (LIZ().serviceID.contains(str)) {
            EcomImageAdaptSizeGlobalBean ecomImageAdaptSizeGlobalBean = C20156813tu.LIZ;
            if (C20156813tu.LIZIZ) {
                return LIZIZ();
            }
            return (List) this.LIZ.getValue();
        }
        return null;
    }
}
