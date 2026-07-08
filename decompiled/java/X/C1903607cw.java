package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903607cw {
    public static final C1903607cw LIZ = new C1903607cw();
    public static final C13BV LIZIZ = C13BV.INSTANCE;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(536));

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        List list = (List) LIZJ.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"/"}, 0, 6);
                String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                String str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                if (a0.LJJIIZI(str, str2, false) && a0.LJJIIZI(str, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
