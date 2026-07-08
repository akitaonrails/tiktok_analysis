package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0RYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697800RYs {
    public final String LIZ;
    public final List<EnumC697290RWt> LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C697840RYw LJ;
    public final ConcurrentHashMap<String, AbstractC1879407Xs> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, AbstractC1879407Xs> LJI = new ConcurrentHashMap<>();
    public final Map<String, String> LJII = new LinkedHashMap();

    public final C697840RYw LIZ() {
        AbstractC1879407Xs abstractC1879407Xs;
        C697830RYv c697830RYv;
        C697840RYw c697840RYw;
        if (this.LIZJ && (c697840RYw = this.LJ) != null) {
            return c697840RYw;
        }
        this.LIZJ = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = ((LinkedHashMap) this.LJII).get(EnumC695830RRd.ANCHOR_KEY.getValue());
        ConcurrentHashMap<String, AbstractC1879407Xs> concurrentHashMap = this.LJFF;
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_ANCHOR_FCP;
        if (concurrentHashMap.get(enumC697290RWt.getEnd()) != null && obj == null) {
            this.LJFF.remove(enumC697290RWt.getEnd());
        }
        long jLIZ = -1;
        long jLIZIZ = -1;
        for (EnumC697290RWt enumC697290RWt2 : this.LIZIZ) {
            AbstractC1879407Xs abstractC1879407Xs2 = this.LJFF.get(enumC697290RWt2.getStart());
            AbstractC1879407Xs abstractC1879407Xs3 = this.LJFF.get(enumC697290RWt2.getEnd());
            if (abstractC1879407Xs2 != null) {
                if (abstractC1879407Xs3 != null && abstractC1879407Xs2.LIZJ() == abstractC1879407Xs3.LIZJ()) {
                    c697830RYv = new C697830RYv(enumC697290RWt2.getPointName(), abstractC1879407Xs3, abstractC1879407Xs3.LIZ() - abstractC1879407Xs2.LIZ(), abstractC1879407Xs2.LIZJ());
                }
                linkedHashMap.put(enumC697290RWt2.getPointName(), c697830RYv);
                if (abstractC1879407Xs3 != null && abstractC1879407Xs3.LIZIZ() > jLIZ) {
                    jLIZ = abstractC1879407Xs3.LIZ();
                    linkedHashMap.put("final_point", c697830RYv);
                }
                if (abstractC1879407Xs2 == null && (jLIZIZ == -1 || (abstractC1879407Xs2.LIZIZ() > 1 && abstractC1879407Xs2.LIZIZ() < jLIZIZ))) {
                    jLIZIZ = abstractC1879407Xs2.LIZIZ();
                    linkedHashMap.put("start_point", c697830RYv);
                }
            } else if (abstractC1879407Xs3 == null) {
            }
            c697830RYv = new C697830RYv(enumC697290RWt2.getPointName(), abstractC1879407Xs3, 0L, 0);
            linkedHashMap.put(enumC697290RWt2.getPointName(), c697830RYv);
            if (abstractC1879407Xs3 != null) {
                jLIZ = abstractC1879407Xs3.LIZ();
                linkedHashMap.put("final_point", c697830RYv);
            }
            if (abstractC1879407Xs2 == null) {
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, AbstractC1879407Xs> entry : this.LJI.entrySet()) {
            String key = entry.getKey();
            AbstractC1879407Xs value = entry.getValue();
            linkedHashMap2.put(key, new C697830RYv(key, null, value.LIZ(), value.LIZJ()));
        }
        long j = jLIZ - jLIZIZ;
        C697830RYv c697830RYv2 = (C697830RYv) linkedHashMap.get(EnumC697290RWt.P_CELL_SELECTED.getPointName());
        long jLIZIZ2 = (c697830RYv2 == null || (abstractC1879407Xs = c697830RYv2.LIZIZ) == null) ? -1L : abstractC1879407Xs.LIZIZ();
        AbstractC1879407Xs abstractC1879407Xs4 = this.LJFF.get(EnumC697290RWt.P_CELL_SCROLL_END.getEnd());
        long jLIZIZ3 = abstractC1879407Xs4 != null ? abstractC1879407Xs4.LIZIZ() : -1L;
        C697840RYw c697840RYw2 = new C697840RYw(this.LIZ, linkedHashMap, linkedHashMap2, j, jLIZIZ2 > 0 ? jLIZ - jLIZIZ2 : -1L, jLIZIZ3 > 0 ? jLIZ - jLIZIZ3 : -1L, this.LJII);
        this.LJ = c697840RYw2;
        return c697840RYw2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C697800RYs(String str, List<? extends EnumC697290RWt> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
