package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: X.0ojJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484350ojJ {
    public C1484380ojM LIZ;
    public List<List<ConditionConfig>> LIZIZ;
    public List<ConditionConfig> LIZJ;

    public final List<List<ConditionConfig>> LIZ() {
        int i;
        Type type = new TypeToken<List<ConditionConfig>>() { // from class: X.0ojO
        }.getType();
        Collection collection = (Collection) C12843050v.LIZ(this.LIZ.LIZ, type);
        Collection collection2 = (Collection) C12843050v.LIZ(this.LIZ.LIZIZ, type);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            arrayList.addAll(collection);
        }
        if (collection2 != null) {
            arrayList.addAll(collection2);
        }
        Collections.sort(arrayList, new Comparator<ConditionConfig>() { // from class: X.0ojP
            @Override // java.util.Comparator
            public final int compare(ConditionConfig conditionConfig, ConditionConfig conditionConfig2) {
                return conditionConfig2.LIZ() - conditionConfig.LIZ();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        this.LIZJ = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int size2 = 0;
        while (size2 < size) {
            ArrayList arrayList4 = new ArrayList();
            while (i < size - size2) {
                int i2 = size2 + i;
                arrayList4.add(ListProtector.get(arrayList, i2));
                int i3 = i2 + 1;
                i = (i3 >= size || ((ConditionConfig) ListProtector.get(arrayList, i3)).LIZ() >= ((ConditionConfig) ListProtector.get(arrayList, size2)).LIZ()) ? i + 1 : 0;
            }
            arrayList3.add(arrayList4);
            size2 += arrayList4.size();
        }
        return arrayList3;
    }
}
