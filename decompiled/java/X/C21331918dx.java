package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21331918dx {
    public final Map<String, String> LIZ = new LinkedHashMap();
    public final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public final Map<String, Integer> LIZJ = new LinkedHashMap();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final Set<String> LJ = new LinkedHashSet();
    public final Set<String> LJFF = new LinkedHashSet();
    public final Map<String, Integer> LJI = new LinkedHashMap();
    public final Map<String, Integer> LJII = new LinkedHashMap();

    public final int LIZ(String str) {
        int iIntValue;
        Integer num = (Integer) ((LinkedHashMap) this.LIZIZ).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i = iIntValue + 1;
        this.LIZIZ.put(str, Integer.valueOf(i));
        return i;
    }

    public final int LIZIZ(String str) {
        int iIntValue;
        Integer num = (Integer) ((LinkedHashMap) this.LIZJ).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i = iIntValue + 1;
        this.LIZJ.put(str, Integer.valueOf(i));
        return i;
    }

    public final boolean LIZJ(String str, boolean z) {
        int iIntValue;
        Integer num = (Integer) ((LinkedHashMap) this.LJII).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            int i = iIntValue + 1;
            this.LJII.put(str, Integer.valueOf(i));
            if (i < 1) {
                return false;
            }
            this.LJII.put(str, 0);
            return true;
        }
        this.LJII.put(str, 0);
        return false;
    }

    public final boolean LIZLLL(String str, boolean z) {
        int iIntValue;
        Integer num = (Integer) ((LinkedHashMap) this.LJI).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            int i = iIntValue + 1;
            this.LJI.put(str, Integer.valueOf(i));
            if (i < 1) {
                return false;
            }
            this.LJI.put(str, 0);
            return true;
        }
        this.LJI.put(str, 0);
        return false;
    }
}
