package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324730kZr {
    public static final Set<String> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ConcurrentHashMap<String, List<Function0<Unit>>> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ(C1325710kbR c1325710kbR) {
        return C1324810kZz.LJI().LIZJ(c1325710kbR, null).toString();
    }

    public static final void LIZIZ(C1325710kbR c1325710kbR) {
        String strLIZ = LIZ(c1325710kbR);
        LIZ.remove(strLIZ);
        List<Function0<Unit>> listRemove = LIZIZ.remove(strLIZ);
        if (listRemove != null) {
            Iterator<Function0<Unit>> it2 = listRemove.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
    }
}
