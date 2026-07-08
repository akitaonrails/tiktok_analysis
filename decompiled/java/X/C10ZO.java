package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZO {
    public static final C10ZO LIZ = new C10ZO();
    public static final Map<String, C19267310Zj> LIZIZ = new LinkedHashMap();
    public static final C1DEV LIZJ = C2191201ApK.LIZ();

    public static final void LIZIZ() throws Throwable {
        try {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C10ZM(null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("ShortLinkCacheManager_cleanExpiredLinkCache", e, mapLIZJ);
        }
    }

    public static final boolean LJ() {
        Boolean boolLJLI = a0.LJLI(C10ZP.LIZ("ShortLinkCache", "kCacheSaveEnable"));
        if (boolLJLI != null) {
            return boolLJLI.booleanValue();
        }
        return false;
    }

    public static Map LJFF() {
        Map<String, C19267310Zj> map = LIZIZ;
        if (!map.isEmpty()) {
            return map;
        }
        String strLIZ = C10ZP.LIZ("ShortLinkCache", "kShortLinkResultCacheKey");
        if (strLIZ.length() > 0) {
            try {
                C13IV c13iv = C19253410Ua.LIZ;
                c13iv.getClass();
                for (C10ZQ c10zq : (List) c13iv.LIZIZ(new C19979613Fi(C10ZQ.Companion.serializer()), strLIZ)) {
                    LIZIZ.put(c10zq.LIZ, new C19267310Zj(c10zq.LIZIZ, c10zq.LIZJ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZIZ;
    }

    public static void LJII() {
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(LIZIZ);
        ArrayList arrayList = new ArrayList(mapLJIIZILJ.size());
        for (Map.Entry entry : mapLJIIZILJ.entrySet()) {
            String str = (String) entry.getKey();
            C19267310Zj c19267310Zj = (C19267310Zj) entry.getValue();
            arrayList.add(new C10ZQ(str, c19267310Zj.LIZ, c19267310Zj.LIZIZ));
        }
        try {
            C13IV c13iv = C19253410Ua.LIZ;
            c13iv.getClass();
            C10ZP.LIZJ("ShortLinkCache", "kShortLinkResultCacheKey", c13iv.LIZJ(new C19979613Fi(C10ZQ.Companion.serializer()), arrayList));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(String str) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        C1865740yeS.LIZ.getClass();
        if (!C1865740yeS.LIZ()) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Short2LongCache_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1865740yeS.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("key: ");
                sbLIZ2.append((String) entry.getKey());
                sbLIZ2.append("\ncreate_time: ");
                sbLIZ2.append(((C19267310Zj) entry.getValue()).LIZIZ);
                iNewUserDebugServiceLIZIZ.LJI(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public static final String LJI(String str) throws Throwable {
        boolean z;
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        INewUserDebugService iNewUserDebugServiceLIZIZ2;
        try {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String strLIZ = C2669011n.LIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cache_");
                sbLIZ.append(strLIZ);
                String strLIZ2 = C10ZP.LIZ("ShortLinkCache", C2188811AlT.LIZIZ(sbLIZ));
                if (strLIZ2.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    C1865740yeS.LIZ.getClass();
                    if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ2 = C1865740yeS.LIZIZ()) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("light cache for key:");
                        sbLIZ2.append(strLIZ);
                        sbLIZ2.append(" exist");
                        iNewUserDebugServiceLIZIZ2.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    return strLIZ2;
                }
                C1865740yeS.LIZ.getClass();
                if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("no cache key for key:");
                    sbLIZ3.append(strLIZ);
                    iNewUserDebugServiceLIZIZ.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ3));
                    return "";
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("ShortLinkCacheManager_getLongLinkURLString", e, mapLIZJ);
        }
        return "";
    }

    public static final void LJIIIIZZ(boolean z) {
        C10ZP.LIZJ("ShortLinkCache", "kCacheSaveEnable", String.valueOf(z));
    }

    public static void LIZ(String str, String str2, String str3) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        LJII();
        C1865740yeS.LIZ.getClass();
        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add item key: ");
            sbLIZ.append(str);
            sbLIZ.append("\ncreate_time: ");
            sbLIZ.append(str3);
            iNewUserDebugServiceLIZIZ.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(long j, long j2, boolean z) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        INewUserDebugService iNewUserDebugServiceLIZIZ2;
        Object next;
        long jLongValue;
        long jLongValue2;
        Object objLJJJLIIL;
        long jLongValue3;
        INewUserDebugService iNewUserDebugServiceLIZIZ3;
        if (j2 <= 0) {
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ3 = C1865740yeS.LIZIZ()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cleanupExpiredEntries return, maxCacheTimeLimit: ");
                sbLIZ.append(j2);
                iNewUserDebugServiceLIZIZ3.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        Map mapLJFF = LJFF();
        long j3 = j2 * 1000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapLJFF;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(((C19267310Zj) entry.getValue()).LIZIZ);
            if (lLJIILIIL != null) {
                jLongValue3 = lLJIILIIL.longValue();
            } else {
                jLongValue3 = 0;
            }
            if (j - jLongValue3 > j3) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set<String> setLLIIIZ = C13LP.LLIIIZ(linkedHashMap.keySet());
        if (z && setLLIIIZ.isEmpty()) {
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(((C19267310Zj) ((Map.Entry) next).getValue()).LIZIZ);
                    if (lLJIILIIL2 != null) {
                        jLongValue = lLJIILIIL2.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    do {
                        Object next2 = it2.next();
                        Long lLJIILIIL3 = C2095008Iq.LJIILIIL(((C19267310Zj) ((Map.Entry) next2).getValue()).LIZIZ);
                        if (lLJIILIIL3 != null) {
                            jLongValue2 = lLJIILIIL3.longValue();
                        } else {
                            jLongValue2 = Long.MAX_VALUE;
                        }
                        if (jLongValue > jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            if ((entry2 != null && (objLJJJLIIL = entry2.getKey()) != null) || (objLJJJLIIL = C13LP.LJJJLIIL(linkedHashMap2.keySet())) != null) {
                setLLIIIZ.add(objLJJJLIIL);
            }
        }
        C1865740yeS.LIZ.getClass();
        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ2 = C1865740yeS.LIZIZ()) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cleanupExpiredEntries, expiredKeys: ");
            sbLIZ2.append(setLLIIIZ);
            iNewUserDebugServiceLIZIZ2.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (setLLIIIZ.isEmpty()) {
            return;
        }
        for (String str : setLLIIIZ) {
            LIZIZ.remove(str);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Cache_");
            sbLIZ3.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            Keva kevaLIZIZ = C10ZP.LIZIZ("ShortLinkCache");
            if (kevaLIZIZ != null) {
                kevaLIZIZ.erase(strLIZIZ);
            }
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("remove item\n:");
                sbLIZ4.append(str);
                iNewUserDebugServiceLIZIZ.LJI("Short2LongCache", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        LJII();
        LIZLLL("after clean expired items");
    }

    public static final void LJIIIZ(int i, String str, long j, String str2) {
        try {
            if (str.length() != 0 && str2.length() != 0) {
                long jLongValue = 0;
                if (j > 0 && i > 0) {
                    String strLIZ = C2669011n.LIZ(str);
                    String strValueOf = String.valueOf(C19267610Zm.LIZ.now().toEpochMilliseconds());
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(strValueOf);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C10ZN(strLIZ, i, jLongValue, j, str2, strValueOf, null), 3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("ShortLinkCacheManager_saveShortLink_maxCacheTimeLimit", e, mapLIZJ);
        }
    }
}
