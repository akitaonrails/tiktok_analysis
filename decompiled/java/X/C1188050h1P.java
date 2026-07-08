package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188050h1P {
    public static final List<PoiListApi.PostTag> LIZ(List<PoiListApi.PostTag> list) {
        ArrayList arrayList = new ArrayList();
        for (PoiListApi.PostTag postTag : list) {
            String str = postTag.tagName;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                arrayList.add(postTag);
            }
        }
        return arrayList;
    }

    public static final int LIZIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((PoiListApi.PostTag) it2.next()).isSelected(), Boolean.TRUE)) {
                if (i >= 0) {
                    return i;
                }
            } else {
                i++;
            }
        }
        return 0;
    }
}
