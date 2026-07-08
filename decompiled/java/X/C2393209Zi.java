package X;

import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogDiffInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogFieldChange;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2393209Zi {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Pair<Object, Object>> LIZJ;

    public static LogDiffInfo LIZ(C2393209Zi c2393209Zi) {
        C0CHQ.LIZ().LJIIJJI();
        int iIntValue = ((Number) C2393309Zj.LIZ.getValue()).intValue();
        Map<String, Object> map = c2393209Zi.LIZ;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(new LogFieldChange(entry.getKey(), null, LIZIZ(iIntValue, entry.getValue())));
        }
        ArrayList arrayList2 = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        Map<String, Object> map2 = c2393209Zi.LIZIZ;
        ArrayList arrayList3 = new ArrayList(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            arrayList3.add(new LogFieldChange(entry2.getKey(), LIZIZ(iIntValue, entry2.getValue()), null));
        }
        if (!(!arrayList3.isEmpty())) {
            arrayList3 = null;
        }
        Map<String, Pair<Object, Object>> map3 = c2393209Zi.LIZJ;
        ArrayList arrayList4 = new ArrayList(map3.size());
        for (Map.Entry<String, Pair<Object, Object>> entry3 : map3.entrySet()) {
            arrayList4.add(new LogFieldChange(entry3.getKey(), LIZIZ(iIntValue, entry3.getValue().getFirst()), LIZIZ(iIntValue, entry3.getValue().getSecond())));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2 = arrayList4;
        }
        return new LogDiffInfo(arrayList, arrayList3, arrayList2);
    }

    public static Object LIZIZ(int i, Object obj) {
        String string;
        if (obj != null && (string = obj.toString()) != null) {
            if (i > 0 && string.length() > i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C13LN.LJZL(i, string));
                sbLIZ.append("...");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return string;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2393209Zi(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Pair<? extends Object, ? extends Object>> map3) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
    }
}
