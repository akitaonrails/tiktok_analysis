package X;

import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502320pCI {
    public int LIZ;
    public final C1502330pCJ LIZIZ = new C1502330pCJ(this, "", null, null);

    public static List LIZ(String str) {
        return a0.LJJLIIIJILLIZJL(a0.LJJJJZ("/", a0.LJJJLL("/", a0.LJJLIL(str, "://", str))), new String[]{"/"}, 0, 6);
    }

    public final void LIZIZ(String str, C1529350ptt c1529350ptt) {
        C1502330pCJ c1502330pCJ = this.LIZIZ;
        Iterator it2 = LIZ(str).iterator();
        if (!it2.hasNext()) {
            return;
        }
        while (true) {
            String str2 = (String) it2.next();
            if (it2.hasNext()) {
                C1502330pCJ c1502330pCJLIZ = c1502330pCJ.LIZ(str2, null, null);
                if (c1502330pCJLIZ != null) {
                    c1502330pCJ = c1502330pCJLIZ;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value has already be assigned, content: ");
                    sbLIZ.append(c1502330pCJ.LIZ);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                c1502330pCJ.LIZ(str2, c1529350ptt, null);
                return;
            }
        }
    }

    public final void LIZJ(int i, String str) {
        int iIntValue;
        List listLIZ = LIZ(str);
        int size = listLIZ.size();
        Iterator it2 = listLIZ.iterator();
        do {
            C1502330pCJ c1502330pCJLIZ = this.LIZIZ;
            String str2 = null;
            while (it2.hasNext()) {
                str2 = (String) it2.next();
                if (!it2.hasNext()) {
                    break;
                }
                c1502330pCJLIZ = c1502330pCJLIZ.LIZ(str2, null, null);
                if (c1502330pCJLIZ != null) {
                    Integer num = c1502330pCJLIZ.LIZIZ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = Integer.MAX_VALUE;
                    }
                    if (iIntValue < i) {
                        return;
                    }
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unexpected error, cannot add null value to it");
                    C1532760pzO.LIZJ(C1532920pze.LIZJ, "PrefixMatchTree", "updatePrefix", "unexpected error, cannot add null value to it", illegalArgumentException, null, 32);
                    throw illegalArgumentException;
                }
            }
            if (str2 == null || c1502330pCJLIZ.LIZ(str2, null, Integer.valueOf(i)) != null) {
                return;
            }
        } while (size > 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected error, add subNode failed, duplicate prefix: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(strLIZIZ);
        C1532760pzO.LIZJ(C1532920pze.LIZJ, "PrefixMatchTree", "updatePrefix", strLIZIZ, illegalArgumentException2, null, 32);
        throw illegalArgumentException2;
    }
}
