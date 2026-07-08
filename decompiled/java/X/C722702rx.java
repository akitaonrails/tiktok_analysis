package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722702rx {
    public static final C722702rx LIZJ;
    public final List<C722602rw> LIZ;
    public final List<C722602rw> LIZIZ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZJ = new C722702rx(c13bv, c13bv);
    }

    public C722702rx(List<C722602rw> list, List<C722602rw> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    public static String LIZ(String str, List list, Map map) {
        boolean zContains;
        String str2 = str;
        while (str2 != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C722602rw c722602rw = (C722602rw) it2.next();
                    if (Intrinsics.LJFF(c722602rw.LIZ, str2)) {
                        if (!c722602rw.LIZIZ.isEmpty()) {
                            zContains = c722602rw.LIZIZ.contains(str);
                        } else {
                            if (!(!c722602rw.LIZJ.isEmpty())) {
                                return str2;
                            }
                            zContains = !c722602rw.LIZJ.contains(str);
                        }
                        if (zContains) {
                            return str2;
                        }
                    }
                }
            }
            str2 = (String) map.get(str2);
        }
        return null;
    }
}
