package X;

import com.google.gson.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343540DdQ extends AbstractC343530DdP {
    public final Map<String, Pair<k, k>> LIZIZ;
    public final HashMap<String, Pair<k, k>> LIZJ;

    @Override // X.AbstractC343530DdP
    public final List<C343690Ddf> LIZIZ() {
        String strLIZ;
        String strLIZ2;
        if (this.LIZJ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        HashMap<String, Pair<k, k>> map = this.LIZJ;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Pair<k, k>> entry : map.entrySet()) {
            String key = entry.getKey();
            k first = entry.getValue().getFirst();
            k second = entry.getValue().getSecond();
            String str = "";
            if (first == null || (strLIZ = AbstractC343530DdP.LIZ(first)) == null) {
                strLIZ = "";
            }
            if (second != null && (strLIZ2 = AbstractC343530DdP.LIZ(second)) != null) {
                str = strLIZ2;
            }
            arrayList.add(new C343690Ddf(key, strLIZ, str));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C343540DdQ(Map<String, ? extends Pair<? extends k, ? extends k>> map, HashMap<String, Pair<k, k>> map2) {
        super(EnumC343590DdV.SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_OTHER);
        this.LIZIZ = map;
        this.LIZJ = map2;
    }
}
