package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591100NGi {
    public final C0NGO LIZ;
    public final C591420NHo LIZIZ;
    public final C0NGM LIZJ;
    public int LIZLLL;
    public final List<InterfaceC591200NGs> LJ = new ArrayList();
    public final Map<String, Integer> LJFF = new LinkedHashMap();
    public final C01GW LJI = C452501pT.LIZIZ(new C591210NGt());
    public final C01GW LJII = C452501pT.LIZIZ(new C591160NGo());

    public final void LIZ() {
        C0NH1 c0nh1 = C0NH1.LIZ;
        Map<String, Integer> map = this.LJFF;
        int i = this.LIZLLL;
        c0nh1.getClass();
        n nVar = new n();
        int i2 = 0;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            i2 += iIntValue;
            nVar.LJJIII(Integer.valueOf(iIntValue), str);
        }
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        C591300NHc.LIZ().getClass();
        EnumC308730C8h.Companion.getClass();
        C20684815ws.LJIJ("cache_feed_status_check", C591500NHw.LIZ(new Pair("max_cache_cnt", Integer.valueOf(C308750C8j.LIZ().getCapacity())), new Pair("cache_type", 2), new Pair("remaining_cache_cnt", Integer.valueOf(i)), new Pair("delete_cache_cnt", Integer.valueOf(i2)), new Pair("delete_cache_reason", nVar.toString())));
        C0NH6.LJIILLIIL.LJIIJJI(new C591140NGm(this));
        C0NGM c0ngm = this.LIZJ;
        if (c0ngm != null) {
            c0ngm.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C0NGO> r15) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C591100NGi.LIZJ(X.05Vn):java.lang.Object");
    }

    public final List<CacheEntry> LIZIZ(InterfaceC591200NGs interfaceC591200NGs, List<? extends CacheEntry> list) {
        int i;
        int iIntValue;
        C591190NGr c591190NGrLIZ = interfaceC591200NGs.LIZ(list);
        int i2 = c591190NGrLIZ.LIZJ;
        if (i2 > 0) {
            this.LIZLLL -= i2;
            Map<String, Integer> map = this.LJFF;
            String str = c591190NGrLIZ.LIZ;
            if (map.containsKey(str)) {
                Integer num = (Integer) ((LinkedHashMap) this.LJFF).get(c591190NGrLIZ.LIZ);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                i = iIntValue + c591190NGrLIZ.LIZJ;
            } else {
                i = c591190NGrLIZ.LIZJ;
            }
            map.put(str, Integer.valueOf(i));
        }
        return c591190NGrLIZ.LIZIZ;
    }

    public C591100NGi(C0NGO c0ngo, C0NGR c0ngr, C591420NHo c591420NHo, C0NGO c0ngo2) {
        this.LIZ = c0ngo;
        this.LIZIZ = c591420NHo;
        this.LIZJ = c0ngo2;
    }
}
