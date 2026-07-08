package X;

import android.content.Context;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0i4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228500i4e implements InterfaceC1228540i4i {
    public static final C1228500i4e LIZIZ = new C1228500i4e();

    public static List LIZLLL(List list, List list2) {
        if (list == null || list.isEmpty() || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(Integer.valueOf(((GroupAccessCriteriaCollection) obj).collectionId))) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    @Override // X.InterfaceC1228540i4i
    public final C1226980i2C LIZ(Context context, C1228650i4t c1228650i4t) {
        return C1228530i4h.LIZIZ(context, c1228650i4t);
    }

    @Override // X.InterfaceC1228540i4i
    public final C1228470i4b LIZIZ(String str, String str2, boolean z) {
        return C1228530i4h.LIZ(str, str2, z);
    }

    public static C1228470i4b LIZJ(GroupAccessCriteriaCollection groupAccessCriteriaCollection, List list, C1228470i4b c1228470i4b, Context context) {
        C1228650i4t c1228650i4t = c1228470i4b.LIZ;
        return C1228470i4b.LIZ(c1228470i4b, C1228650i4t.LIZ(c1228470i4b.LIZ, null, null, null, null, 0, null, false, new C1228710i4z(LIZLLL(list, c1228650i4t.LJJIIJZLJL), c1228650i4t.LJ, groupAccessCriteriaCollection, C1228910i5J.LIZLLL(context, groupAccessCriteriaCollection)), null, false, null, false, false, 0, 0, false, false, false, null, null, false, false, null, -129, 1), null, 2);
    }
}
