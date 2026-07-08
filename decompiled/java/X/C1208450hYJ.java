package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0hYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208450hYJ {
    public static final C1208450hYJ LIZ = new C1208450hYJ();

    public static C1209840haY LJ(n nVar) {
        int iIntValue;
        int iIntValue2;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transformGlobalFreqConfig: ");
        sbLIZ.append(nVar);
        C1798620wuC.LIZLLL("ControlConfigs", C2188811AlT.LIZIZ(sbLIZ));
        C2192781Ars c2192781Ars = EnumC2192761Arq.Companion;
        Integer numLJ = C1208500hYO.LJ(nVar, "type");
        int iIntValue3 = 0;
        if (numLJ != null) {
            iIntValue = numLJ.intValue();
        } else {
            iIntValue = 0;
        }
        c2192781Ars.getClass();
        EnumC2192761Arq enumC2192761ArqLIZ = C2192781Ars.LIZ(iIntValue);
        C1216880hlu c1216880hlu = EnumC1208400hYE.Companion;
        Integer numLJ2 = C1208500hYO.LJ(nVar, "target");
        if (numLJ2 != null) {
            iIntValue3 = numLJ2.intValue();
        }
        c1216880hlu.getClass();
        EnumC1208400hYE enumC1208400hYELIZ = C1216880hlu.LIZ(iIntValue3);
        Integer numLJ3 = C1208500hYO.LJ(nVar, "result");
        int iIntValue4 = -1;
        if (numLJ3 != null) {
            iIntValue2 = numLJ3.intValue();
        } else {
            iIntValue2 = -1;
        }
        Integer numLJ4 = C1208500hYO.LJ(nVar, "max_count");
        if (numLJ4 != null) {
            iIntValue4 = numLJ4.intValue();
        }
        return new C1209840haY(enumC2192761ArqLIZ, new C1208410hYF(enumC1208400hYELIZ, iIntValue2, iIntValue4, LJI(C1208500hYO.LIZIZ(nVar, "popup_freq_config"))));
    }

    public static List LJI(h hVar) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : hVar) {
            kVar.getClass();
            if (kVar instanceof q) {
                arrayList.add(Long.valueOf(kVar.LJIIZILJ()));
            }
        }
        return arrayList;
    }

    public static C00R9 LJII(n nVar) {
        int iIntValue;
        long jLongValue;
        Long lValueOf;
        Integer numLJ = C1208500hYO.LJ(nVar, "accuracy_level");
        if (numLJ != null) {
            iIntValue = numLJ.intValue();
        } else {
            iIntValue = 0;
        }
        k kVarLJJIIZ = nVar.LJJIIZ("cache_time");
        ArrayList arrayList = null;
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q) && (lValueOf = Long.valueOf(kVarLJJIIZ.LJIIZILJ())) != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 3600;
        }
        h hVarLJFF = C1208500hYO.LJFF(nVar, "allowed_signals");
        if (hVarLJFF != null) {
            arrayList = new ArrayList();
            for (k kVar : hVarLJFF) {
                kVar.getClass();
                if ((kVar instanceof q) && (kVar.LJIILJJIL().LL instanceof String)) {
                    arrayList.add(kVar.LJIL());
                }
            }
        }
        C00R9 c00r9 = new C00R9(iIntValue, jLongValue, arrayList, 1);
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transformLocationConfig: ");
        sbLIZ.append(c00r9);
        sbLIZ.append(" from ");
        sbLIZ.append(nVar);
        C1798620wuC.LIZLLL("ControlConfigs", C2188811AlT.LIZIZ(sbLIZ));
        return c00r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021f A[Catch: all -> 0x0239, TRY_LEAVE, TryCatch #3 {all -> 0x0239, blocks: (B:105:0x0204, B:107:0x020c, B:95:0x01d4, B:97:0x01dc, B:99:0x01e7, B:100:0x01eb, B:102:0x01f3, B:109:0x021f, B:108:0x0218), top: B:140:0x0204 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1208190hXt LIZ(com.google.gson.n r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208450hYJ.LIZ(com.google.gson.n, boolean):X.0hXt");
    }

    public static C1208180hXs LIZIZ(n nVar, String str) {
        Object c098200Yq;
        int iIntValue;
        C1210150hb3 c1210150hb3LJFF;
        Object obj = null;
        try {
            Integer numLJ = C1208500hYO.LJ(nVar, "max_count");
            if (numLJ != null) {
                iIntValue = numLJ.intValue();
            } else {
                iIntValue = 1;
            }
            List listLJI = LJI(C1208500hYO.LIZIZ(nVar, str));
            String strLIZLLL = C1208500hYO.LIZLLL(nVar, "title", str);
            String strLIZLLL2 = C1208500hYO.LIZLLL(nVar, "content", str);
            String strLIZLLL3 = C1208500hYO.LIZLLL(nVar, "styled_content", str);
            C1210150hb3 c1210150hb3LJFF2 = LJFF(C1208500hYO.LIZJ(nVar, str), "key1", str);
            n nVarLJI = C1208500hYO.LJI(nVar, "key2");
            if (nVarLJI != null) {
                c1210150hb3LJFF = LJFF(nVarLJI, "key2", "consent_config");
            } else {
                c1210150hb3LJFF = null;
            }
            c098200Yq = new C1208180hXs(str, iIntValue, listLJI, strLIZLLL, strLIZLLL2, strLIZLLL3, c1210150hb3LJFF2, c1210150hb3LJFF);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            obj = c098200Yq;
        } else {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transformConsentConfig error: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1798620wuC.LIZJ("ControlConfigs", C2188811AlT.LIZIZ(sbLIZ), null);
            C185100nR c185100nR = C185100nR.LIZ;
            C185300nT.LIZ("consent_config", thM5exceptionOrNullimpl.getMessage(), nVar.toString());
        }
        return (C1208180hXs) obj;
    }

    public static C1208270hY1 LIZJ(n nVar, String str) throws C1210240hbC {
        C1210150hb3 c1210150hb3LJFF = null;
        if (nVar == null) {
            return null;
        }
        String strLIZLLL = C1208500hYO.LIZLLL(nVar, "title", str);
        String strLIZLLL2 = C1208500hYO.LIZLLL(nVar, "content", str);
        String strLJII = C1208500hYO.LJII(nVar, "styled_content");
        String strLJII2 = C1208500hYO.LJII(nVar, "dialog_name");
        C1210150hb3 c1210150hb3LJFF2 = LJFF(C1208500hYO.LIZJ(nVar, str), "key1", str);
        n nVarLJI = C1208500hYO.LJI(nVar, "key2");
        if (nVarLJI != null) {
            LIZ.getClass();
            c1210150hb3LJFF = LJFF(nVarLJI, "key2", str);
        }
        return new C1208270hY1(strLIZLLL, strLIZLLL2, strLJII, strLJII2, c1210150hb3LJFF2, c1210150hb3LJFF);
    }

    public static C1208410hYF LIZLLL(n nVar, String str) throws C1210240hbC {
        int iIntValue;
        C1216880hlu c1216880hlu = EnumC1208400hYE.Companion;
        int iLIZ = C1208500hYO.LIZ(nVar, "target", str);
        c1216880hlu.getClass();
        EnumC1208400hYE enumC1208400hYELIZ = C1216880hlu.LIZ(iLIZ);
        int iLIZ2 = C1208500hYO.LIZ(nVar, "max_count", str);
        List listLJI = LJI(C1208500hYO.LIZIZ(nVar, str));
        Integer numLJ = C1208500hYO.LJ(nVar, "result");
        if (numLJ != null) {
            iIntValue = numLJ.intValue();
        } else {
            iIntValue = -1;
        }
        return new C1208410hYF(enumC1208400hYELIZ, iIntValue, iLIZ2, listLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1208160hXq LJIIIIZZ(com.google.gson.n r18, java.lang.String r19) throws X.C1210240hbC {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208450hYJ.LJIIIIZZ(com.google.gson.n, java.lang.String):X.0hXq");
    }

    public static C1210150hb3 LJFF(n nVar, String str, String str2) throws C1210240hbC {
        C12QJ next;
        int iLIZ = C1208500hYO.LIZ(nVar, "action", str);
        C12QJ.Companion.getClass();
        Iterator<C12QJ> it2 = C12QJ.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == iLIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C12QJ c12qj = next;
        if (c12qj == null) {
            c12qj = C12QJ.NONE;
        }
        if (c12qj != C12QJ.NONE) {
            return new C1210150hb3(C1208500hYO.LIZLLL(nVar, "text", str2), c12qj);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action=");
        sbLIZ.append(iLIZ);
        throw new C1210240hbC(str2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
