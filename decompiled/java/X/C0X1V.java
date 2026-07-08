package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import xlp.c;

/* JADX INFO: renamed from: X.0X1V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1V {
    public final String[] LIZ;

    public final long LIZ() {
        String[] strArr = this.LIZ;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.LIZ[i].length();
        }
        return length;
    }

    public final Set<String> LJFF() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(LJ(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final C0X1U LJI() {
        C0X1U c0x1u = new C0X1U();
        Collections.addAll(c0x1u.LIZ, this.LIZ);
        return c0x1u;
    }

    public final int LJIIIIZZ() {
        return this.LIZ.length / 2;
    }

    public final Map<String, List<String>> LJIIIZ() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = LJ(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(LJIIJ(i));
        }
        return treeMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZ);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(LJ(i));
            sb.append(": ");
            sb.append(LJIIJ(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public C0X1V(C0X1U c0x1u) {
        ArrayList arrayList = (ArrayList) c0x1u.LIZ;
        this.LIZ = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void LIZIZ(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(c.LJIIJJI("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static C0X1V LJII(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i = 0; i < strArr2.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                LIZIZ(str2);
                LIZJ(str3, str2);
            }
            return new C0X1V(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    public final String LIZLLL(String str) {
        String[] strArr = this.LIZ;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String LJ(int i) {
        return this.LIZ[i * 2];
    }

    public final String LJIIJ(int i) {
        return this.LIZ[(i * 2) + 1];
    }

    public final List<String> LJIIJJI(String str) {
        int length = this.LIZ.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(LJ(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(LJIIJ(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0X1V) && Arrays.equals(((C0X1V) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }

    public C0X1V(String[] strArr) {
        this.LIZ = strArr;
    }

    public static void LIZJ(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31) {
                    if (cCharAt != '\t') {
                        throw new IllegalArgumentException(c.LJIIJJI("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                    }
                } else {
                    if (cCharAt >= 127) {
                        throw new IllegalArgumentException(c.LJIIJJI("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                    }
                }
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("value for name ");
        sbLIZ.append(str2);
        sbLIZ.append(" == null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
