package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C108900b9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(13));
    public static volatile int LIZIZ;

    public static final Pair<Long, Long> LIZ() {
        Object obj;
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) LIZ.getValue(), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong((String) it2.next())));
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null) {
            return new Pair<>(ListProtector.get(list, 0), ListProtector.get(list, 1));
        }
        return null;
    }
}
