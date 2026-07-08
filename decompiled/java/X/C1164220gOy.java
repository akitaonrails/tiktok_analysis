package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164220gOy {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(Integer num, String str, List list) {
        List listLJJJJLI;
        boolean z;
        boolean z2;
        int i;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PoiDetailApi.PoiCategoryItems poiCategoryItems = (PoiDetailApi.PoiCategoryItems) it2.next();
                List<PoiListApi.PoiMergedListItem> list2 = poiCategoryItems.itemList;
                Integer num2 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (list2 == null || (listLJJJJLI = C13LP.LJJJJLI(list2)) == null) {
                    listLJJJJLI = C13BV.INSTANCE;
                }
                if (!listLJJJJLI.isEmpty()) {
                    int i2 = 0;
                    arrayList.add(new C1183810guZ(str, new PoiListApi.PoiMergedListItem(null, null, null, null, null, null, null, null, null), 52702, i2, i2, num, poiCategoryItems.name, num2, 152));
                    if (listLJJJJLI.size() % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    for (Object obj : listLJJJJLI) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            PoiListApi.PoiMergedListItem poiMergedListItem = (PoiListApi.PoiMergedListItem) obj;
                            if (!z && i3 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i = 52700;
                            } else {
                                i = 52701;
                            }
                            int i5 = 0;
                            arrayList.add(new C1183810guZ(str, poiMergedListItem, i, i5, i5, num, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 216));
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
