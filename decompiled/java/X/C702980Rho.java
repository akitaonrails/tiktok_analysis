package X;

import Y.AObjectS311S0200000_11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Rho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702980Rho {
    public static final /* synthetic */ int LIZ = 0;

    public static C700400Rde LIZIZ(C005V c005v) {
        C700400Rde c700400Rde = new C700400Rde(c005v.LIZ);
        LIZJ(new LinkedHashSet(), c005v, C2097608Jq.LJII(new Pair(c005v.LIZ, c700400Rde)), c005v.LIZ);
        return c700400Rde;
    }

    public static C700400Rde LJ(C700400Rde c700400Rde) {
        String str = c700400Rde.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(c700400Rde, linkedHashMap);
        return LIZIZ(new C005V(str, linkedHashMap));
    }

    public static final void LJFF(C700400Rde c700400Rde, LinkedHashMap linkedHashMap) {
        List listLJLLJ = C13LP.LJLLJ(C13LP.LJJJJI(C13LP.LLIIII(c700400Rde.LIZJ.keySet())));
        if (!listLJLLJ.isEmpty()) {
            linkedHashMap.put(c700400Rde.LIZ, listLJLLJ);
        }
        c700400Rde.LIZIZ(new C703130Ri3(linkedHashMap));
    }

    public static final C700400Rde LIZLLL(C700400Rde c700400Rde, C700400Rde c700400Rde2, LinkedHashMap linkedHashMap) {
        C700400Rde c700400Rde3 = new C700400Rde(c700400Rde.LIZ);
        if (linkedHashMap.put(c700400Rde.LIZ, c700400Rde3) == null) {
            if (c700400Rde2 != null) {
                c700400Rde2.LIZ(c700400Rde3);
            }
            c700400Rde.LIZIZ(new AObjectS311S0200000_11(c700400Rde3, linkedHashMap, 2));
            return c700400Rde3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Duplicate slotId in tree: ");
        sbLIZ.append(c700400Rde.LIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(LinkedHashSet<String> linkedHashSet, C005V c005v, LinkedHashMap<String, C700400Rde> linkedHashMap, String str) {
        if (!linkedHashSet.add(str)) {
            return;
        }
        C700400Rde c700400Rde = linkedHashMap.get(str);
        if (c700400Rde == null) {
            c700400Rde = new C700400Rde(str);
            linkedHashMap.put(str, c700400Rde);
        }
        C700400Rde c700400Rde2 = c700400Rde;
        List<String> list = c005v.LIZIZ.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (String str2 : C13LP.LJLLJ(C13LP.LJJJJI(list))) {
            C700400Rde c700400Rde3 = linkedHashMap.get(str2);
            if (c700400Rde3 == null) {
                c700400Rde3 = new C700400Rde(str2);
                linkedHashMap.put(str2, c700400Rde3);
            }
            C700400Rde c700400Rde4 = c700400Rde3;
            if (c700400Rde4.LIZIZ == null) {
                c700400Rde2.LIZ(c700400Rde4);
            }
            LIZJ(linkedHashSet, c005v, linkedHashMap, str2);
        }
        linkedHashSet.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[PHI: r1
      0x0050: PHI (r1v6 X.0Rde) = (r1v3 X.0Rde), (r1v7 X.0Rde) binds: [B:41:0x006c, B:26:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(java.util.LinkedHashSet<java.lang.String> r7, java.util.LinkedHashSet<java.lang.String> r8, java.util.LinkedHashMap<java.lang.String, X.C700060Rd6> r9, java.lang.String r10, java.util.LinkedHashSet<java.lang.String> r11, java.util.LinkedHashSet<java.lang.String> r12, X.C700400Rde r13, java.util.Map<java.lang.String, X.C700400Rde> r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C702980Rho.LIZ(java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashMap, java.lang.String, java.util.LinkedHashSet, java.util.LinkedHashSet, X.0Rde, java.util.Map, java.lang.String):boolean");
    }
}
