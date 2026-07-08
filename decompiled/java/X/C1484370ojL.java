package X;

import Y.AComparatorS42S0000000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ojL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484370ojL {
    public List<String> LIZ;

    public final ConditionConfig LIZ(List<ConditionConfig> list) {
        String str;
        List<String> list2 = this.LIZ;
        if (list2 != null && list2.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (ConditionConfig conditionConfig : (ArrayList) list) {
                ArrayList arrayList2 = new ArrayList();
                Map<String, List<String>> map = conditionConfig.clientFilterRequirement;
                Map<String, List<String>> map2 = conditionConfig.serverFilterRequirement;
                if (map != null) {
                    arrayList2.addAll(map.keySet());
                }
                if (map2 != null) {
                    arrayList2.addAll(map2.keySet());
                }
                if (arrayList2.size() != 0) {
                    int size = arrayList2.size();
                    char[] cArr = new char[size];
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            int iIndexOf = this.LIZ.indexOf(ListProtector.get(arrayList2, i));
                            if (iIndexOf < 0) {
                                str = null;
                                break;
                            }
                            cArr[i] = (char) (iIndexOf + 48);
                            i++;
                        } else {
                            Arrays.sort(cArr);
                            str = new String(cArr);
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(new C1484420ojQ(conditionConfig, str));
                    }
                }
            }
            Collections.sort(arrayList, new AComparatorS42S0000000_23(3));
            if (arrayList.size() == 0) {
                return (ConditionConfig) ListProtector.get(list, 0);
            }
            return ((C1484420ojQ) ListProtector.get(arrayList, 0)).LIZ;
        }
        return (ConditionConfig) ListProtector.get(list, 0);
    }

    public final void LIZIZ(C1484380ojM c1484380ojM) {
        if (this.LIZ == null) {
            this.LIZ = (List) C12843050v.LIZ(c1484380ojM.LIZLLL, new TypeToken<List<String>>() { // from class: X.04ZD
            }.getType());
        }
    }
}
