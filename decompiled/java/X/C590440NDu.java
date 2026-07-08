package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localcache.DBUidExtBundle;
import defpackage.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590440NDu {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile boolean LJI;
    public static volatile boolean LJIIIZ;
    public static volatile String LIZ = "";
    public static volatile String LJII = "";
    public static volatile boolean LJIIIIZZ = true;

    public static int LJ() {
        x0 x0Var = x0.LIZ;
        C590420NDs.LIZ.getClass();
        String strLJIIJ = C590420NDs.LJIIJ();
        x0Var.getClass();
        int iLIZIZ = x0.LIZIZ(strLJIIJ) + x0.LIZIZ(C590420NDs.LJIILIIL());
        C590480NDy.LIZ.getClass();
        return iLIZIZ + x0.LIZIZ(C590480NDy.LJ());
    }

    public static int LJIIJ() {
        int iLIZIZ;
        C590480NDy.LIZ.getClass();
        C590480NDy.LIZ();
        if (C2268981DrU.LIZ() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C590420NDs.LIZ.getClass();
            sbLIZ.append(C590420NDs.LJIIL());
            sbLIZ.append(",");
            sbLIZ.append(C590480NDy.LJFF());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            x0.LIZ.getClass();
            iLIZIZ = x0.LIZIZ(strLIZIZ);
            int iLIZ = C2268981DrU.LIZ();
            if (iLIZIZ > iLIZ) {
                iLIZIZ = iLIZ;
            }
        } else {
            iLIZIZ = 0;
        }
        return ((Number) C1ES5.LJFF.getValue()).intValue() + iLIZIZ;
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C590420NDs.LIZ.getClass();
        sbLIZ.append(C590420NDs.LJIIJ());
        sbLIZ.append(",");
        sbLIZ.append(C590420NDs.LJIILIIL());
        sbLIZ.append(",");
        sbLIZ.append(C590420NDs.LJIILJJIL());
        sbLIZ.append(",");
        C590480NDy.LIZ.getClass();
        sbLIZ.append(C590480NDy.LJIIIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C590420NDs.LIZ.getClass();
        sbLIZ.append(C590420NDs.LJIILIIL());
        sbLIZ.append(",");
        C590480NDy.LIZ.getClass();
        if (C294330BgF.LIZ()) {
            synchronized (C590480NDy.LJI) {
                try {
                    C590480NDy.LIZJ();
                    strLIZIZ = "";
                    for (DBUidExtBundle dBUidExtBundle : C590480NDy.LJ.values()) {
                        if (dBUidExtBundle != null) {
                            if (!(dBUidExtBundle.coldCacheAids.length() == 0)) {
                                C590480NDy c590480NDy = C590480NDy.LIZ;
                                String str = dBUidExtBundle.coldCacheAids;
                                c590480NDy.getClass();
                                strLIZIZ = C590480NDy.LIZIZ(strLIZIZ, str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C590420NDs.LIZ.getClass();
        sbLIZ.append(C590420NDs.LJIIJ());
        sbLIZ.append(",");
        sbLIZ.append(C590420NDs.LJIILIIL());
        sbLIZ.append(",");
        sbLIZ.append(C590420NDs.LJIILJJIL());
        sbLIZ.append(",");
        C590480NDy.LIZ.getClass();
        sbLIZ.append(C590480NDy.LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C590420NDs.LIZ.getClass();
        sbLIZ.append(C590420NDs.LJIILIIL());
        sbLIZ.append(",");
        C590480NDy.LIZ.getClass();
        sbLIZ.append(C590480NDy.LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C590420NDs.LIZ.getClass();
        sbLIZ.append(C590420NDs.LJIILJJIL());
        sbLIZ.append(",");
        C590480NDy.LIZ.getClass();
        sbLIZ.append(C590480NDy.LJIIIIZZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(String str) {
        Object objLJJJLL;
        if (str.length() == 0) {
            return str;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            objLJJJLL = ListProtector.get(arrayList, 0);
        } else {
            objLJJJLL = C13LP.LJJJLL(arrayList);
        }
        String str2 = (String) objLJJJLL;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String LJII(String str) {
        String strLJFF;
        List listLJJLIIIJ;
        if (C294350BgH.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C590420NDs.LIZ.getClass();
            sbLIZ.append(C590420NDs.LJFF());
            sbLIZ.append(",");
            sbLIZ.append(C590420NDs.LIZ());
            strLJFF = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C590420NDs.LIZ.getClass();
            strLJFF = C590420NDs.LJFF();
        }
        if (strLJFF != null && (listLJJLIIIJ = a0.LJJLIIIJ(strLJFF, new char[]{','}, false, 0, 6)) != null && (!listLJJLIIIJ.isEmpty())) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), str)) {
                    return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                }
                arrayList.add(Unit.LIZ);
            }
            return "";
        }
        return "";
    }

    public static int LJIIIIZZ(boolean z) {
        int iLJIIJ;
        if (C1ES5.LIZ()) {
            iLJIIJ = LJIIJ() - LJ();
            if (iLJIIJ < 0) {
                iLJIIJ = 0;
            }
        } else {
            iLJIIJ = 2;
        }
        C01GW c01gw = C1ES5.LJIIIIZZ;
        if (((Number) c01gw.getValue()).intValue() > 0 && !z) {
            return Math.min(((Number) c01gw.getValue()).intValue(), iLJIIJ);
        }
        C01GW c01gw2 = C1ES5.LJIIIZ;
        if (((Number) c01gw2.getValue()).intValue() <= 0 || !z) {
            return iLJIIJ;
        }
        return Math.min(((Number) c01gw2.getValue()).intValue(), iLJIIJ);
    }

    public static void LJIIL(String str) {
        if (C797930VRv.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" videoGroup: ");
            C590420NDs.LIZ.getClass();
            sbLIZ.append(C590420NDs.LJIIJ());
            sbLIZ.append(" videoGroupDB: ");
            sbLIZ.append(C590420NDs.LJIILIIL());
            sbLIZ.append("\n videoGroupRecDB: ");
            sbLIZ.append(C590420NDs.LJIILJJIL());
            sbLIZ.append("\n inCompleteVideoGroupDB: ");
            sbLIZ.append(C590420NDs.LJFF());
            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIJJI(int i, String str) {
        if (str != null && str.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            for (String str2 : arrayList) {
                if (!C590390NDp.LIZIZ(i, str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("traverseCheckCacheExistAndRemove，video not exist ");
                    sbLIZ.append(str2);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    x0.LIZ.LJII(i, str2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233 A[EDGE_INSN: B:129:0x0233->B:102:0x0233 BREAK  A[LOOP:4: B:71:0x019e->B:85:0x01ff]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(int r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590440NDu.LIZJ(int, int, java.lang.String):java.lang.String");
    }
}
