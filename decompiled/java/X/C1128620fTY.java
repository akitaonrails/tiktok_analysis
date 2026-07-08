package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0fTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128620fTY {
    public static C1128650fTb LIZ(List list) {
        Gift gift;
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = -1;
        }
        HashMap map = new HashMap(size);
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            Object obj2 = null;
            if (i >= 0) {
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) obj;
                if (abstractC1126600fQI != null) {
                    obj2 = abstractC1126600fQI.LIZIZ;
                }
                if ((obj2 instanceof Gift) && (gift = (Gift) obj2) != null) {
                    long j = gift.id;
                    i3++;
                    iArr[i] = i3;
                    arrayList.add(Long.valueOf(j));
                    map.putIfAbsent(Long.valueOf(j), Integer.valueOf(i));
                }
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C1128650fTb(iArr, map, arrayList);
    }
}
