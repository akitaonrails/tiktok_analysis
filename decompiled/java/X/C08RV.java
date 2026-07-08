package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08RV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RV {
    public static final Map<String, String> LIZ(Bundle bundle) {
        Object obj;
        final C08QU c08quLJIIJ = C09RB.LJIIJ(new C1939607ik(bundle.keySet()), AFwS231S0000000_3.get$arr$(130));
        Sequence<Object> sequence = new Sequence<Object>() { // from class: X.08RW
            @Override // kotlin.sequences.Sequence
            public final Iterator<Object> iterator() {
                List listLJJIII = C09RB.LJJIII(c08quLJIIJ);
                C08XD.LJIL(listLJJIII);
                return listLJJIII.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : sequence) {
            String string = null;
            try {
                obj = bundle.get((String) obj2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof Bundle) {
                    string = LIZ((Bundle) obj).toString();
                } else if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Enum)) {
                    if (obj instanceof Class) {
                        string = ((Class) obj).getName();
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(obj.getClass().getName());
                        sbLIZ.append(':');
                        sbLIZ.append(obj);
                        string = C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else {
                    string = obj.toString();
                }
            }
            linkedHashMap.put(obj2, string);
        }
        return linkedHashMap;
    }
}
