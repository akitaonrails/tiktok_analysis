package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615710OCz {
    public static final List<BulletinBaseItem> LIZIZ(List<? extends BulletinBaseItem> list, List<? extends BulletinBaseItem> list2) {
        int i;
        int size = ((ArrayList) list).size() - 1;
        int size2 = list2.size() - 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (size < 0) {
                break;
            }
            while (size2 >= 0) {
                if (((BulletinBaseItem) ListProtector.get(list, size)).LJIIZILJ() < ((BulletinBaseItem) ListProtector.get(list2, size2)).LJIIZILJ()) {
                    arrayList.add(ListProtector.get(list2, size2));
                    size2--;
                }
            }
            do {
                i = size - 1;
                arrayList.add(ListProtector.get(list, size));
                size = i;
            } while (i >= 0);
            arrayList.add(ListProtector.get(list, size));
            size--;
        }
        while (size2 >= 0) {
            arrayList.add(ListProtector.get(list2, size2));
            size2--;
        }
        return arrayList;
    }

    public static final List<BulletinBaseItem> LIZ(List<? extends BulletinBaseItem> list, Long l, Long l2) {
        long jLongValue;
        long jLongValue2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemsByTime() - items.size = ");
        sbLIZ.append(list.size());
        sbLIZ.append(", beginTime = ");
        sbLIZ.append(l);
        sbLIZ.append(", endTime = ");
        sbLIZ.append(l2);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        for (BulletinBaseItem bulletinBaseItem : list) {
            long jLJIIZILJ = bulletinBaseItem.LJIIZILJ();
            if (jLongValue2 <= jLJIIZILJ && jLJIIZILJ <= jLongValue) {
                arrayList.add(bulletinBaseItem);
            }
        }
        return arrayList;
    }
}
