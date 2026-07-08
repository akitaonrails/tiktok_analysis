package X;

import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0pZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516830pZh {
    public static Object LIZ(n nVar, String str, boolean z) {
        boolean z2;
        try {
            SparseArray sparseArray = new SparseArray(nVar.size());
            int i = 0;
            for (String str2 : nVar.LJJIJIL()) {
                n nVarLJJIJ = nVar.LJJIJ(str2);
                if (nVarLJJIJ != null) {
                    C1516820pZg.LJIIIIZZ.getClass();
                    Object objLIZ = C1516840pZi.LIZ(nVarLJJIJ, str2, z);
                    C155000ia.LIZIZ(objLIZ);
                    C1516820pZg c1516820pZg = (C1516820pZg) objLIZ;
                    if (sparseArray.get(c1516820pZg.LIZIZ) == null) {
                        sparseArray.put(c1516820pZg.LIZIZ, c1516820pZg);
                        int i2 = c1516820pZg.LIZIZ;
                        if (i2 > i) {
                            i = i2;
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Duplicate tag ");
                        sbLIZ.append(c1516820pZg.LIZIZ);
                        sbLIZ.append(" in message '");
                        sbLIZ.append(str);
                        sbLIZ.append("' for field '");
                        sbLIZ.append(str2);
                        sbLIZ.append('\'');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Field '");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("' in message '");
                    sbLIZ2.append(str);
                    sbLIZ2.append("' must be an object: ");
                    sbLIZ2.append(nVar.LJJIIZ(str2));
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
            }
            int size = sparseArray.size();
            if (i > 256 && i > size * 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            C1516820pZg[] c1516820pZgArr = null;
            if (z2) {
                int i3 = i + 1;
                C1516820pZg[] c1516820pZgArr2 = new C1516820pZg[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    c1516820pZgArr2[i4] = null;
                }
                c1516820pZgArr = c1516820pZgArr2;
                int size2 = sparseArray.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    C1516820pZg c1516820pZg2 = (C1516820pZg) sparseArray.valueAt(i5);
                    c1516820pZgArr[c1516820pZg2.LIZIZ] = c1516820pZg2;
                }
            }
            C1516850pZj c1516850pZj = new C1516850pZj(sparseArray, c1516820pZgArr);
            C189200o6.m2constructorimpl(c1516850pZj);
            return c1516850pZj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
    }
}
