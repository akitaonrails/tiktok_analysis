package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.042r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10343042r {
    public static C2280611EOl LIZ(int i) {
        int i2;
        List<C2280611EOl> list = C2280611EOl.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (C2280611EOl c2280611EOl : list) {
            C2280611EOl c2280611EOl2 = c2280611EOl;
            c2280611EOl2.getClass();
            try {
                i2 = CastIntegerProtector.parseInt(u.LJJIFFI(u.LJJIFFI(c2280611EOl2.LIZIZ, "+", "", false), " ", "", false));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                i2 = 86;
            }
            if (i2 == i) {
                arrayList.add(c2280611EOl);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C2280611EOl) ListProtector.get(arrayList, 0);
    }
}
