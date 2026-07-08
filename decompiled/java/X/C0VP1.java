package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS247S0000000_13;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VP1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VP1 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(WeakHashMap weakHashMap) {
        StringBuilder sb = new StringBuilder("----------------------------");
        for (Map.Entry entry : weakHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n    ");
            sbLIZ.append(entry.getKey().getClass().getSimpleName());
            sbLIZ.append(" = ");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) entry.getValue();
            StringBuilder sb2 = new StringBuilder(e3.e);
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\n      ");
                sbLIZ2.append(((Number) entry2.getKey()).intValue());
                sbLIZ2.append(" <-> ");
                sbLIZ2.append((String) entry2.getValue());
                sbLIZ2.append(',');
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            sb2.append("\n    ]");
            sbLIZ.append(sb2.toString());
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String LIZIZ(List list) {
        StringBuilder sb = new StringBuilder("------------------------- \n");
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            sb.append(C13LP.LJJLIIIJ((Iterable) it2.next(), ",", e3.e, "\n]", 0, null, AFwS247S0000000_13.get$arr$(41), 24));
            sb.append("\n");
        }
        return sb.toString();
    }
}
