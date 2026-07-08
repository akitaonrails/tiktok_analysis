package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS369S0200000_3;

/* JADX INFO: renamed from: X.07cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899507cH {
    public Map<String, C1899507cH> LIZ;
    public boolean LIZIZ;
    public int LIZJ = 1;

    public final void LJFF() {
        Collection<C1899507cH> collectionValues;
        Map<String, C1899507cH> map = this.LIZ;
        if (map != null && map.size() == 1) {
            Map.Entry entry = (Map.Entry) C13LP.LJJJJZ(map.entrySet());
            C1899507cH c1899507cH = (C1899507cH) entry.getValue();
            String str = (String) entry.getKey();
            Map<String, C1899507cH> map2 = c1899507cH.LIZ;
            if (!c1899507cH.LIZIZ && map2 != null && (!map2.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, C1899507cH> entry2 : map2.entrySet()) {
                    String key = entry2.getKey();
                    C1899507cH value = entry2.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(key);
                    sbLIZ.append(str);
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), value);
                }
                this.LIZ = linkedHashMap;
                String str2 = (String) C13LP.LJJJLIIL(linkedHashMap.keySet());
                if (str2 != null) {
                    this.LIZJ = str2.length();
                }
            }
        }
        Map<String, C1899507cH> map3 = this.LIZ;
        if (map3 == null || (collectionValues = map3.values()) == null) {
            return;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            ((C1899507cH) it2.next()).LJFF();
        }
    }

    public final void LJI() {
        Collection<C1899507cH> collectionValues;
        int iIntValue;
        Map<String, C1899507cH> map = this.LIZ;
        if (map == null || map.isEmpty() || this.LIZIZ) {
            return;
        }
        Collection<C1899507cH> collectionValues2 = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C1899507cH) it2.next()).LJ(0)));
        }
        Integer num = (Integer) C13LP.LJJLL(arrayList);
        if (num != null && (iIntValue = num.intValue()) > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C1899507cH> entry : map.entrySet()) {
                Pair<String, C1899507cH> pairLIZLLL = entry.getValue().LIZLLL(iIntValue, entry.getKey());
                linkedHashMap.put(pairLIZLLL.getFirst(), pairLIZLLL.getSecond());
            }
            this.LIZ = linkedHashMap;
            this.LIZJ += iIntValue;
        }
        Map<String, C1899507cH> map2 = this.LIZ;
        if (map2 == null || (collectionValues = map2.values()) == null) {
            return;
        }
        Iterator<T> it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            ((C1899507cH) it3.next()).LJI();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LIZIZ) {
            sb.append("#leaf#");
        }
        if (this.LIZ == null) {
            sb.append("#nilSubNodes#");
        }
        Map<String, C1899507cH> map = this.LIZ;
        if (map != null && map.isEmpty()) {
            sb.append("#emptySubNodes#");
        }
        Map<String, C1899507cH> map2 = this.LIZ;
        if (map2 != null) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(((LinkedHashMap) map2).entrySet(), ",", null, null, 0, null, new AwS369S0200000_3(this, sb, 21), 30);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{[");
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append("]}");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return sb.toString();
    }

    public final int LJ(int i) {
        Map<String, C1899507cH> map = this.LIZ;
        if (map != null && !this.LIZIZ && map.size() == 1) {
            return ((C1899507cH) C13LP.LJJJJZ(map.values())).LJ(i + 1);
        }
        return i;
    }

    public final int LIZ(int i, String str) {
        int i2;
        if (i >= 0 && i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((this.LIZ == null || this.LIZIZ) && (C1244080iTm.LJ(cCharAt) || C1899607cI.LIZ(cCharAt))) {
                return 0;
            }
            C1899507cH c1899507cHLIZJ = LIZJ(i, str);
            if (c1899507cHLIZJ != null && (i2 = i - this.LIZJ) >= 0) {
                return c1899507cHLIZJ.LIZ(i2, str) - this.LIZJ;
            }
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    public final void LIZIZ(int i, String str) {
        if (i < 0) {
            return;
        }
        C1899507cH c1899507cHLIZJ = LIZJ(i, str);
        if (c1899507cHLIZJ != null) {
            if (i == 0) {
                c1899507cHLIZJ.LIZIZ = true;
                return;
            }
            int i2 = i - c1899507cHLIZJ.LIZJ;
            if (i2 >= 0) {
                c1899507cHLIZJ.LIZIZ(i2, str);
                return;
            }
            return;
        }
        C1899507cH c1899507cH = new C1899507cH();
        String strValueOf = String.valueOf(str.charAt(i));
        if (this.LIZ == null) {
            this.LIZ = new LinkedHashMap();
        }
        Map<String, C1899507cH> map = this.LIZ;
        if (map != null) {
            map.put(strValueOf, c1899507cH);
        }
        if (i != 0) {
            c1899507cH.LIZIZ(i - 1, str);
        } else {
            c1899507cH.LIZIZ = true;
        }
    }

    public final C1899507cH LIZJ(int i, String str) {
        String strSubstring;
        if (i < 0) {
            return null;
        }
        int i2 = (i - this.LIZJ) + 1;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == i) {
            strSubstring = String.valueOf(str.charAt(i));
        } else {
            strSubstring = str.substring(i2, i + 1);
        }
        Map<String, C1899507cH> map = this.LIZ;
        if (map == null) {
            return null;
        }
        return (C1899507cH) ((LinkedHashMap) map).get(strSubstring);
    }

    public final Pair<String, C1899507cH> LIZLLL(int i, String str) {
        if (i <= 0) {
            return new Pair<>(str, this);
        }
        Map<String, C1899507cH> map = this.LIZ;
        if (map != null && map.size() == 1) {
            Map.Entry entry = (Map.Entry) C13LP.LJJJJZ(map.entrySet());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append(str);
            return ((C1899507cH) entry.getValue()).LIZLLL(i - 1, C2188811AlT.LIZIZ(sbLIZ));
        }
        return new Pair<>(str, this);
    }
}
