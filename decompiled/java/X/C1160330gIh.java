package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0gIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160330gIh {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            if (obj instanceof C1204470hRt) {
                if (i < ((ArrayList) list2).size()) {
                    arrayList.add(ListProtector.get(list2, i));
                    i++;
                }
            } else {
                arrayList.add(obj);
            }
        }
        while (i < ((ArrayList) list2).size()) {
            arrayList.add(ListProtector.get(list2, i));
            i++;
        }
        return arrayList;
    }
}
