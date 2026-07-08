package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.086l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20633086l {
    public static final Queue<List<EcSearchActivity>> LIZ = new LinkedList();

    public static boolean LIZ(C19EG c19eg) {
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), c19eg)) {
                    if (list.size() > 1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
