package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291501Az extends C09AY implements Function2<C03H5, String, Unit> {
    public C291501Az() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, String str) {
        ArrayList arrayList;
        Object c098200Yq;
        String string = C287210BNn.LIZLLL.getString("key_visit_card", "");
        if (string != null && string.length() != 0) {
            arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6));
        } else {
            arrayList = new ArrayList();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (str2.length() > 0) {
                try {
                    c098200Yq = Long.valueOf(CastLongProtector.parseLong(str2));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = 0L;
                }
                if (System.currentTimeMillis() - ((Number) c098200Yq).longValue() > 172800000) {
                    it2.remove();
                }
            }
        }
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        C287210BNn.LIZLLL.storeString("key_visit_card", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        return Unit.LIZ;
    }
}
