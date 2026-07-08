package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973560bRS {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list, List list2) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = (ArrayList) list2;
            if (arrayList.isEmpty() || list.size() < arrayList.size()) {
                return false;
            }
            return list.containsAll(list2);
        }
        return false;
    }

    public static boolean LIZIZ(List list, List list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return list.containsAll(list2);
    }

    public static boolean LIZJ(List list, List list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i))) {
                return false;
            }
        }
        return true;
    }
}
