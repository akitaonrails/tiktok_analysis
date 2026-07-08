package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1481905r7 {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"-1", "1"});
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final C1482005r8 LIZJ = new C1482005r8();
    public static final C1482005r8 LIZLLL = new C1482005r8();

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZJ(C1482005r8 c1482005r8) {
        String str;
        C259800zU c259800zU = new C259800zU();
        synchronized (c1482005r8.LIZ) {
            try {
                AnonymousClass0956 anonymousClass0956 = c1482005r8.LJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1482005r8.LJ = null;
                if (c1482005r8.LIZIZ.isEmpty()) {
                    return;
                }
                LinkedHashMap<String, List<InterfaceC1480505qt>> linkedHashMap = c1482005r8.LIZIZ;
                ?? linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj).getKey(), C13LP.LLIIII((List) ((Map.Entry) obj).getValue()));
                }
                c259800zU.element = linkedHashMap2;
                List listLLIIII = C13LP.LLIIII(c1482005r8.LIZJ);
                c1482005r8.LIZIZ.clear();
                c1482005r8.LIZJ.clear();
                c1482005r8.LJFF = 0L;
                c1482005r8.LIZLLL.addAll(((Map) c259800zU.element).keySet());
                List listLLIIII2 = C13LP.LLIIII(((Map) c259800zU.element).keySet());
                if ((listLLIIII.size() > 1 && listLLIIII2.size() > 1) || (str = (String) C13LP.LJJJLL(listLLIIII)) == null) {
                    str = "im_autobatch";
                }
                C23250099c.LIZLLL(LIZIZ, null, null, new C1481705r5(listLLIIII2, str, c259800zU, c1482005r8, null), 3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Object LIZ(Map map, List list, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        Collection collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (!((List) it2.next()).isEmpty()) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Object obj : list) {
                        linkedHashMap.put(((BaseContact) obj).getUid(), obj);
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1480605qu(map, linkedHashMap, null));
                    if (objLJI == C099R.LJFF()) {
                        return objLJI;
                    }
                    return Unit.LIZ;
                }
            }
        }
        return Unit.LIZ;
    }

    public static Object LIZIZ(Map map, Throwable th, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        List listLJIJJLI = C15438062q.LJIJJLI(map.values());
        if (((ArrayList) listLJIJJLI).isEmpty()) {
            return Unit.LIZ;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1480705qv(listLJIJJLI, th, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r11, java.lang.String r12, X.InterfaceC1480505qt r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1481905r7.LIZLLL(java.lang.String, java.lang.String, X.05qt):boolean");
    }
}
