package X;

import com.bytedance.pumbaa.entry.service.PathMatchRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885107Zx {
    public static boolean LIZ(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!a0.LJJJIL((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static List LIZIZ(List list, boolean z) {
        PathMatchRule pathMatchRule;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String string = a0.LJLIIIL((String) it2.next()).toString();
            if (string.length() != 0) {
                if (Intrinsics.LJFF(string, "*")) {
                    pathMatchRule = new PathMatchRule("regex", ".*");
                } else {
                    if (z) {
                        string = string.toLowerCase(Locale.US);
                    }
                    pathMatchRule = C1885207Zy.LIZ(string);
                    if (pathMatchRule != null) {
                    }
                }
                arrayList.add(pathMatchRule);
            }
        }
        return arrayList;
    }
}
