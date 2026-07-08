package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS107S1000000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531840pxu {
    public static long LIZ(Map map) {
        Object c098200Yq;
        Long l;
        Object c098200Yq2;
        String strLJJLIL;
        String strLJJLL;
        Integer numLJIIJJI;
        int iIntValue;
        Integer numLJIIJJI2;
        String str = (String) map.get("date");
        Object obj = null;
        if (str != null) {
            try {
                Date date = C1531820pxs.LJIILIIL.parse(str);
                if (date != null) {
                    c098200Yq = Long.valueOf(date.getTime());
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            l = (Long) c098200Yq;
        } else {
            l = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = (String) map.get("cache-control");
        if (str2 != null && (strLJJLIL = a0.LJJLIL(str2, "max-age=", str2)) != null && (strLJJLL = a0.LJJLL(',', strLJJLIL, strLJJLIL)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJJLL)) != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            String str3 = (String) map.get("age");
            if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                iIntValue2 -= iIntValue;
            }
            return jCurrentTimeMillis + (((long) iIntValue2) * 1000);
        }
        String str4 = (String) map.get("expires");
        if (str4 != null) {
            try {
                Date date2 = C1531820pxs.LJIILIIL.parse(str4);
                if (date2 != null) {
                    c098200Yq2 = Long.valueOf(date2.getTime());
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Long l2 = (Long) obj;
            if (l2 != null) {
                return l2.longValue();
            }
            return jCurrentTimeMillis;
        }
        return jCurrentTimeMillis;
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_query");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_expired_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_version");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Map LIZLLL(Map map, Map map2) {
        Iterable iterableLJJLIIIJILLIZJL;
        Object obj;
        String string;
        String lowerCase;
        HashMap map3 = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            map3.put(((String) entry.getKey()).toLowerCase(Locale.ENGLISH), entry.getValue());
        }
        String str = (String) map3.get("vary");
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ENGLISH)) == null || (iterableLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(lowerCase, new String[]{","}, 0, 6)) == null) {
            iterableLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        List<String> listLJLLJ = C13LP.LJLLJ(iterableLJJLIIIJILLIZJL);
        map3.put("vary", C13LP.LJJLIIIJ(listLJLLJ, ",", null, null, 0, null, null, 62));
        for (String str2 : listLJLLJ) {
            if (map == null || (obj = map.get(str2)) == null) {
                obj = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forest-append-");
            sbLIZ.append(str2);
            map3.put(C2188811AlT.LIZIZ(sbLIZ), obj);
        }
        return map3;
    }

    public static C1531820pxs LIZIZ(String str, String str2, C1531990py9 c1531990py9) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap;
        long jLongValue;
        C1531860pxw c1531860pxw;
        Keva keva = C1531200pws.LIZIZ;
        if (!keva.contains(str2)) {
            return null;
        }
        C1532920pze c1532920pze = C1532920pze.LIZJ;
        c1532920pze.LIZJ(new AwS107S1000000_23(str, 26));
        List listLJJLIIIJ = a0.LJJLIIIJ(a0.LJJLL('.', str2, str2), new char[]{'-'}, false, 0, 6);
        C0VSJ c0vsj = new C0VSJ(C1529330ptr.LIZ(), str2);
        if (!c0vsj.isFile()) {
            c0vsj = null;
        }
        if (c0vsj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache file not exists for url ");
            sbLIZ.append(str);
            c1532920pze.LIZIZ("HTTPCache", "createDiskCache", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (c0vsj.length() == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cache file length is 0 for url ");
            sbLIZ2.append(str);
            c1532920pze.LIZIZ("HTTPCache", "createDiskCache", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        String stringJustDisk = keva.getStringJustDisk(LJ(str2), null);
        if (stringJustDisk != null) {
            try {
                c098200Yq = (LinkedHashMap) GsonProtectorUtils.fromJson(C1531810pxr.LIZ, stringJustDisk, (Class) new LinkedHashMap().getClass());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1532760pzO.LIZ(C1532920pze.LIZJ, "HTTPCache", "createDiskCache", "error occurs when get query from keva", thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("cache_key", str2), new Pair("value", stringJustDisk), new Pair("res_src", str)));
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            linkedHashMap = (LinkedHashMap) c098200Yq;
        } else {
            linkedHashMap = null;
        }
        if (listLJJLIIIJ.size() == 2) {
            List<String> list = C1531200pws.LIZ;
            String strLJFF = LJFF(str2);
            Keva keva2 = C1531200pws.LIZIZ;
            String stringJustDisk2 = keva2.getStringJustDisk(strLJFF, null);
            if (stringJustDisk2 != null) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(a0.LJJLIIIJ(a0.LJJLL('.', stringJustDisk2, stringJustDisk2), new char[]{'-'}, false, 0, 6), 1));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    C1532760pzO.LIZJ(C1532920pze.LIZJ, "HTTPCache", "createDiskCache", "cannot get update key", null, C2097608Jq.LJIIIIZZ(new Pair("current_state", str2), new Pair("cache_key", stringJustDisk2), new Pair("res_src", str)), 16);
                    return null;
                }
            } else {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJ, 1));
                if (lLJIILIIL2 != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    C1532760pzO.LIZJ(C1532920pze.LIZJ, "HTTPCache", "createDiskCache", "unknown format of cache key", null, C2097608Jq.LJIIIIZZ(new Pair("cache_key", str2), new Pair("res_src", str)), 16);
                }
            }
            Long lValueOf = Long.valueOf(keva2.getLong(LJI(str2), -1L));
            if (lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(jLongValue);
            if (linkedHashMap != null) {
                c1531860pxw = new C1531860pxw(linkedHashMap, null);
            } else {
                c1531860pxw = null;
            }
            C1531820pxs c1531820pxs = new C1531820pxs(str2, lValueOf2, lValueOf, c0vsj, c1531860pxw, c1531990py9);
            c1531990py9.LIZ(c1531820pxs);
            return c1531820pxs;
        }
        return null;
    }

    public static C1531820pxs LIZJ(C1532710pzJ c1532710pzJ, C1532030pyD c1532030pyD, Map map, ARunnableS92S0200000_23 aRunnableS92S0200000_23) {
        Map mapLJ;
        Long lLJIILIIL;
        String str;
        C1531940py4 c1531940py4 = c1532710pzJ.LJJIJ;
        if (c1531940py4 != null) {
            Pair pair = new Pair(c1531940py4.LIZ(), c1531940py4.LIZLLL);
            C1532720pzK c1532720pzK = (C1532720pzK) pair.getFirst();
            C1531990py9 c1531990py9 = (C1531990py9) pair.getSecond();
            if (c1531990py9 == null) {
                C1532760pzO.LIZJ(C1532920pze.LIZJ, "HTTPCache", "createHttpCache", "cannot get cache pool", null, null, 48);
                return null;
            }
            String str2 = c1532720pzK.LIZIZ;
            C1531860pxw c1531860pxwLIZ = c1532720pzK.LIZ();
            Map<String, String> map2 = c1532710pzJ.LJIILIIL;
            if (map == null) {
                mapLJ = C2097608Jq.LJ();
            } else {
                mapLJ = map;
            }
            Map mapLIZLLL = LIZLLL(map2, mapLJ);
            if (map != null && (str = (String) map.get("x-gecko-proxy-pkgid")) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str);
            } else {
                lLJIILIIL = null;
            }
            C1531820pxs c1531820pxs = new C1531820pxs(null, null, lLJIILIIL, null, c1531860pxwLIZ, c1531990py9);
            c1531990py9.LIZ(c1531820pxs);
            c1531820pxs.LJII = new WeakReference<>(c1532030pyD);
            c1531820pxs.LJIIIIZZ = new WeakReference<>(mapLIZLLL);
            c1531820pxs.LJIIJ = new RunnableC1531850pxv(c1532030pyD, c1532710pzJ, aRunnableS92S0200000_23, c1532720pzK, str2, mapLIZLLL, c1531820pxs, lLJIILIIL, c1531990py9);
            AwS602S0100000_23 awS602S0100000_23 = new AwS602S0100000_23(c1531820pxs, 59);
            if (c1532030pyD.LJIIJJI()) {
                try {
                    awS602S0100000_23.invoke(c1532030pyD);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return c1531820pxs;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return c1531820pxs;
                }
            }
            if (c1532030pyD.LLJI == null) {
                try {
                    c1532030pyD.LLIZLLLIL.writeLock().lock();
                    if (c1532030pyD.LJIIJJI()) {
                        try {
                            awS602S0100000_23.invoke(c1532030pyD);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    } else if (c1532030pyD.LLJI == null) {
                        c1532030pyD.LLJI = awS602S0100000_23;
                    }
                    c1532030pyD.LLIZLLLIL.writeLock().unlock();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c1532030pyD.LLIZLLLIL.writeLock().unlock();
                    throw th3;
                }
            }
            return c1531820pxs;
        }
        C1532760pzO.LIZJ(C1532920pze.LIZJ, "HTTPCache", "createHttpCache", "cannot get urlBundle", null, null, 48);
        return null;
    }
}
