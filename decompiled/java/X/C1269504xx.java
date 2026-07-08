package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1269504xx {
    public static final String LIZ(String str, AbstractC1261104wb abstractC1261104wb, List<String> list) {
        if (abstractC1261104wb instanceof C1261204wc) {
            return null;
        }
        if (abstractC1261104wb instanceof C1261004wa) {
            ((ArrayList) list).add(String.valueOf(((C1261004wa) abstractC1261104wb).LIZ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" = ?");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (abstractC1261104wb instanceof C1260704wX) {
            C1260704wX c1260704wX = (C1260704wX) abstractC1261104wb;
            if (c1260704wX.LIZ.isEmpty()) {
                return null;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c1260704wX.LIZ, ", ", null, null, 0, null, AFwS229S0000000_2.get$arr$(643), 30);
            List<Integer> list2 = c1260704wX.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().intValue()));
            }
            ((ArrayList) list).addAll(arrayList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" IN (");
            sbLIZ2.append(strLJJLIIIJ);
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!(abstractC1261104wb instanceof C1260404wU)) {
            if (abstractC1261104wb instanceof C1261504wf) {
                abstractC1261104wb.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" IS NULL");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            throw new C1954807lC();
        }
        abstractC1261104wb.getClass();
        throw null;
    }

    public static final String LIZIZ(String str, AbstractC1262004wk abstractC1262004wk, List<String> list) {
        if (abstractC1262004wk instanceof C1262304wn) {
            return null;
        }
        if (abstractC1262004wk instanceof C1262204wm) {
            ((ArrayList) list).add(String.valueOf(((C1262204wm) abstractC1262004wk).LIZIZ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" = ?");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (abstractC1262004wk instanceof C1260804wY) {
            C1260804wY c1260804wY = (C1260804wY) abstractC1262004wk;
            if (c1260804wY.LIZIZ.isEmpty()) {
                return null;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c1260804wY.LIZIZ, ", ", null, null, 0, null, AFwS229S0000000_2.get$arr$(644), 30);
            List<Long> list2 = c1260804wY.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().longValue()));
            }
            ((ArrayList) list).addAll(arrayList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" IN (");
            sbLIZ2.append(strLJJLIIIJ);
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!(abstractC1262004wk instanceof C1260504wV)) {
            if (abstractC1262004wk instanceof C1261604wg) {
                abstractC1262004wk.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" IS NULL");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            throw new C1954807lC();
        }
        abstractC1262004wk.getClass();
        throw null;
    }

    public static final String LIZJ(String str, C1270104y3 c1270104y3, List<String> list) {
        boolean z;
        StringBuilder sbLIZ;
        String str2;
        String str3;
        String str4;
        if (c1270104y3.LIZ == null && c1270104y3.LIZIZ == null && c1270104y3.LIZLLL == null && c1270104y3.LJFF == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Long l = c1270104y3.LIZ;
        if (l != null) {
            ((ArrayList) list).add(String.valueOf(l.longValue()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" = ?");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Long l2 = c1270104y3.LIZIZ;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (c1270104y3.LIZJ) {
                str4 = ">=";
            } else {
                str4 = ">";
            }
            ((ArrayList) list).add(String.valueOf(jLongValue));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(' ');
            sbLIZ3.append(str4);
            sbLIZ3.append(" ?");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        }
        Long l3 = c1270104y3.LIZLLL;
        if (l3 != null) {
            long jLongValue2 = l3.longValue();
            if (c1270104y3.LJ) {
                str3 = "<=";
            } else {
                str3 = "<";
            }
            ((ArrayList) list).add(String.valueOf(jLongValue2));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(' ');
            sbLIZ4.append(str3);
            sbLIZ4.append(" ?");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
        }
        Boolean bool = c1270104y3.LJFF;
        if (bool != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                str2 = " IS NOT NULL";
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                str2 = " IS NULL";
            }
            sbLIZ.append(str2);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (String) ListProtector.get(arrayList, 0);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append('(');
        sbLIZ5.append(C13LP.LJJLIIIJ(arrayList, " and ", null, null, 0, null, null, 62));
        sbLIZ5.append(')');
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    public static final String LIZLLL(String str, AbstractC1262404wo abstractC1262404wo, List<String> list) {
        if (abstractC1262404wo instanceof C1262504wp) {
            return null;
        }
        if (abstractC1262404wo instanceof C1261404we) {
            ((ArrayList) list).add(((C1261404we) abstractC1262404wo).LIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" = ?");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (abstractC1262404wo instanceof C1260904wZ) {
            C1260904wZ c1260904wZ = (C1260904wZ) abstractC1262404wo;
            if (c1260904wZ.LIZIZ.isEmpty()) {
                return null;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c1260904wZ.LIZIZ, ", ", null, null, 0, null, AFwS229S0000000_2.get$arr$(645), 30);
            ((ArrayList) list).addAll(c1260904wZ.LIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" IN (");
            sbLIZ2.append(strLJJLIIIJ);
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!(abstractC1262404wo instanceof C1260604wW)) {
            if (abstractC1262404wo instanceof C1261704wh) {
                abstractC1262404wo.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" IS NULL");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            throw new C1954807lC();
        }
        abstractC1262404wo.getClass();
        throw null;
    }
}
