package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0gw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184710gw1 {
    public final Map<String, List<Integer>> LIZ = new LinkedHashMap();
    public EnumC1184760gw6 LIZIZ;
    public EnumC1184760gw6 LIZJ;

    public final boolean LIZIZ() {
        int i = C1184820gwC.LIZ[this.LIZJ.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
        } else if (this.LIZIZ == EnumC1184760gw6.CACHE) {
            return true;
        }
        return false;
    }

    public C1184710gw1() {
        EnumC1184760gw6 enumC1184760gw6 = EnumC1184760gw6.UNKNOWN;
        this.LIZIZ = enumC1184760gw6;
        this.LIZJ = enumC1184760gw6;
    }

    public final void LIZJ(EnumC1184760gw6 enumC1184760gw6) {
        EnumC1184760gw6 enumC1184760gw62 = EnumC1184760gw6.CACHE;
        if (enumC1184760gw6 == enumC1184760gw62 && this.LIZJ != enumC1184760gw62) {
            ((LinkedHashMap) this.LIZ).clear();
        }
        this.LIZIZ = this.LIZJ;
        this.LIZJ = enumC1184760gw6;
    }

    public final EnumC1184770gw7 LIZ(int i, String str) {
        int i2 = C1184820gwC.LIZ[this.LIZJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return EnumC1184770gw7.FIRE_NORMAL;
                }
                throw new C1954807lC();
            }
            if (this.LIZIZ == EnumC1184760gw6.CACHE) {
                List list = (List) ((LinkedHashMap) this.LIZ).get(str);
                if (list != null && list.contains(Integer.valueOf(i))) {
                    return EnumC1184770gw7.SKIP;
                }
                return EnumC1184770gw7.FIRE_AS_DEDUP;
            }
            return EnumC1184770gw7.FIRE_NORMAL;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(Integer.valueOf(i));
        return EnumC1184770gw7.FIRE_AS_CACHE;
    }
}
