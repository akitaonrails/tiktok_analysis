package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0os2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489760os2 {
    public static C1489770os3 LIZ(List list) {
        C1489770os3 c1489770os3 = new C1489770os3();
        if (list != null && (!list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (Intrinsics.LJFF("x-nx-chunk-size", c080u.LIZ)) {
                    Iterator it3 = a0.LJJLIIIJILLIZJL(c080u.LIZIZ, new String[]{","}, 0, 6).iterator();
                    while (it3.hasNext()) {
                        ((ArrayList) c1489770os3.LIZ).add(Integer.valueOf(CastIntegerProtector.parseInt((String) it3.next())));
                    }
                } else if (Intrinsics.LJFF("x-nx-chunk", c080u.LIZ)) {
                    c1489770os3.LIZIZ = Intrinsics.LJFF("1.0", c080u.LIZIZ);
                }
            }
        }
        return c1489770os3;
    }
}
