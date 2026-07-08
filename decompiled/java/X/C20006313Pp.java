package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006313Pp extends C20004613Oy {
    public static List<String> LJIIJ;
    public static final C13Q8 LJIIJJI = new C13SP() { // from class: X.13Q8
        @Override // X.C13SP
        public final boolean LIZ(String str) {
            List<String> list;
            if (C504670Jqj.LIZIZ(str) || (list = C20006313Pp.LJIIJ) == null || !((ArrayList) list).contains(str)) {
                return false;
            }
            return true;
        }
    };
    public final C20008613Qm LJIIIZ;

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final void LJIIL(List<String> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            Regex regex = C13SG.LJJ;
            arrayList.add(C13SJ.LIZJ(str));
        }
        LJIIJ = arrayList;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftList draftList: ");
        sbLIZ.append(list);
        sbLIZ.append("  draftAllowList: ");
        sbLIZ.append(LJIIJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("AlgorithmModelCache", strLIZIZ);
    }

    public final C20006813Pu LJIJ(String str) {
        Object next;
        String strLJIIJJI;
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        Set<String> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            Iterator<T> it2 = setLIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(C20006413Pq.LIZLLL((String) next), strLIZJ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 == null || (strLJIIJJI = LJIIJJI(str2)) == null) {
                return null;
            }
            return new C20006813Pu(strLJIIJJI);
        }
        return null;
    }

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final void LIZLLL(String str, String str2) {
        Object next;
        Set<String> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            Iterator<T> it2 = setLIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String strLIZLLL = C20006413Pq.LIZLLL((String) next);
                    Regex regex = C13SG.LJJ;
                    if (Intrinsics.LJFF(strLIZLLL, C13SJ.LIZJ(str))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str3 = (String) next;
            if (str3 != null) {
                super.LIZLLL(str3, str);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20006313Pp(C13RD c13rd, String str, int i, C20008613Qm c20008613Qm) {
        C13Q8 c13q8;
        if (C19997713Mh.LIZJ) {
            c13q8 = LJIIJJI;
        } else {
            c13q8 = null;
        }
        super(str, i, Long.MAX_VALUE, c13q8, c13rd.LJJJJLI, null, "effect_model", 68);
        this.LJIIIZ = c20008613Qm;
    }
}
