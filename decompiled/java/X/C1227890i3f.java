package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227890i3f {
    public static final List<C1226750i1p> LIZ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            if (hashSet.add(str)) {
                arrayList2.add(str);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), "id_header_create_qr_group")) {
                arrayList.add(new C1227880i3e(null, null, EnumC1226770i1r.VISIBILITY, C0N0C.SELECTED_LIST_NOT_EMPTY, 63));
            }
        }
        return arrayList;
    }
}
