package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0dRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1050620dRk {
    public final Map<String, String> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1279));

    public abstract Object LIZLLL(String str);

    public final Map<Class<? extends Object>, Object> LJ() {
        return (Map) this.LIZIZ.getValue();
    }

    public AbstractC1050620dRk(int i) {
    }

    public final Map<String, String> LJFF(String... strArr) {
        for (String str : strArr) {
            LIZIZ(LIZLLL(str), str);
        }
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(Object obj) {
        if (!(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String)) {
            if (!(obj instanceof List) && !(obj instanceof Map)) {
                LJ().put(obj.getClass(), obj);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("withContext() does not support generic class type ");
            sbLIZ.append(obj.getClass());
            sbLIZ.append(" due to type erasure. It could potentially cause problem if you provide multiple of them.");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("withContext() does not support providing a primitive context ");
        sbLIZ2.append(obj.getClass());
        sbLIZ2.append(", since getContext() relies on provided values' Class.");
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIIZ(Object... objArr) {
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(objArr)).iterator();
        while (it2.hasNext()) {
            LJIIIIZZ(it2.next());
        }
    }

    public final void LIZ(Number number, String str) {
        this.LIZ.put(str, number.toString());
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj == null) {
            return;
        }
        this.LIZ.put(str, obj.toString());
    }

    public final void LIZJ(String str, String str2) {
        this.LIZ.put(str, str2);
    }

    public final void LJI(String str, Pair<String, ? extends Object>... pairArr) {
        Object second;
        for (Pair<String, ? extends Object> pair : pairArr) {
            if (pair.getSecond() instanceof C1839150xxZ) {
                second = LIZLLL(pair.getFirst());
            } else {
                second = pair.getSecond();
            }
            LIZIZ(second, pair.getFirst());
        }
        C20684815ws.LJIILLIIL(str, this.LIZ);
    }

    public final void LJII(String str, String... strArr) {
        for (String str2 : strArr) {
            LIZIZ(LIZLLL(str2), str2);
        }
        C20684815ws.LJIILLIIL(str, this.LIZ);
    }
}
