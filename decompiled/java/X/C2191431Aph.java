package X;

import Y.AComparatorS21S0000000_2;
import Y.AComparatorS28S0000000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS1S1400200_34;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS5S1400100_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import ttpobfuscated.e3;
import v7.o;

/* JADX INFO: renamed from: X.1Aph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191431Aph {
    public static final C2191431Aph LIZ = new C2191431Aph();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LIZ));
    public static final ConcurrentHashMap<String, C2190991Aoz> LIZJ = new ConcurrentHashMap<>();

    public static String LJ(List list) {
        if (list != null && !list.isEmpty()) {
            return "custom";
        }
        return "default";
    }

    public static String LJIIJJI(k kVar) {
        kVar.getClass();
        if (kVar instanceof m) {
            return "null";
        }
        if (kVar instanceof q) {
            return kVar.toString();
        }
        if (kVar instanceof h) {
            return C13LP.LJJLIIIJ(kVar.LJIIL(), ",", e3.e, e3.f, 0, null, AFwS229S0000000_2.get$arr$(892), 24);
        }
        if (kVar instanceof n) {
            return C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS21S0000000_2(28), kVar.LJIILIIL().entrySet()), ",", "{", "}", 0, null, AFwS229S0000000_2.get$arr$(893), 24);
        }
        return kVar.toString();
    }

    public static C2190991Aoz LJIIL(C675200Qe6 c675200Qe6) {
        ConcurrentHashMap<String, C2190991Aoz> concurrentHashMap = LIZJ;
        C2190991Aoz c2190991Aoz = concurrentHashMap.get(c675200Qe6.LIZ);
        if (c2190991Aoz != null) {
            return c2190991Aoz;
        }
        C2190991Aoz c2190991Aoz2 = new C2190991Aoz();
        C2190991Aoz c2190991AozPutIfAbsent = concurrentHashMap.putIfAbsent(c675200Qe6.LIZ, c2190991Aoz2);
        if (c2190991AozPutIfAbsent != null) {
            return c2190991AozPutIfAbsent;
        }
        return c2190991Aoz2;
    }

    public static String LIZ(List list, Map map) {
        if (list != null && !list.isEmpty()) {
            return C13LP.LJJLIIIJ(list, "&", null, null, 0, null, new AwS368S0200000_2(map, 165), 30);
        }
        return LIZJ(map, null);
    }

    public static void LIZIZ(C2190991Aoz c2190991Aoz, long j) {
        C118300cf c118300cf = new C118300cf();
        for (Map.Entry<String, C2191441Api> entry : c2190991Aoz.LIZ.entrySet()) {
            String key = entry.getKey();
            C2191441Api value = entry.getValue();
            if (j > value.LJ && c2190991Aoz.LIZ.remove(key, value)) {
                c118300cf.element++;
            }
        }
        if (c118300cf.element > 0) {
            new AwS435S0200000_34(c118300cf, c2190991Aoz, 27);
            C034X.LIZIZ();
        }
    }

    public static String LIZJ(Map map, n nVar) throws NoSuchAlgorithmException {
        Collection<Map.Entry> collectionLJLLLL;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        LJIIZILJ(messageDigest, "q:");
        boolean z = true;
        if (map != null && !map.isEmpty()) {
            if (map instanceof SortedMap) {
                collectionLJLLLL = ((SortedMap) map).entrySet();
            } else {
                collectionLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(27), map.entrySet());
            }
            for (Map.Entry entry : collectionLJLLLL) {
                if (!z) {
                    LJIIZILJ(messageDigest, "&");
                } else {
                    z = false;
                }
                LJIIZILJ(messageDigest, (String) entry.getKey());
                LJIIZILJ(messageDigest, "=");
                LJIIZILJ(messageDigest, (String) entry.getValue());
            }
        }
        LJIIZILJ(messageDigest, "|b:");
        if (nVar != null && nVar.size() > 0) {
            LJIJ(nVar, messageDigest);
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(messageDigest.digest());
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            CharsKt__CharJVMKt.checkRadix(16);
            sb.append(Integer.toString((b >> 4) & 15, 16));
            CharsKt__CharJVMKt.checkRadix(16);
            sb.append(Integer.toString(b & 15, 16));
        }
        return sb.toString();
    }

    public static boolean LIZLLL(C2190991Aoz c2190991Aoz, EnumC994770bzf enumC994770bzf) {
        List<String> list;
        Collection<C2191441Api> collectionValues = c2190991Aoz.LIZ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        for (C2191441Api c2191441Api : collectionValues) {
            if (c2191441Api.LJFF == enumC994770bzf && ((list = c2191441Api.LIZIZ) == null || list.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static String LJFF(EnumC994770bzf enumC994770bzf, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC994770bzf);
        sbLIZ.append('#');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJ(C675200Qe6 c675200Qe6, C05XL c05xl) {
        C2190991Aoz c2190991AozLJIIL = LJIIL(c675200Qe6);
        C118300cf c118300cf = new C118300cf();
        for (Map.Entry<String, C2191441Api> entry : c2190991AozLJIIL.LIZ.entrySet()) {
            String key = entry.getKey();
            C2191441Api value = entry.getValue();
            if (Intrinsics.LJFF(value.LIZJ, c05xl) || Intrinsics.LJFF(value.LIZLLL, c05xl)) {
                if (c2190991AozLJIIL.LIZ.remove(key, value)) {
                    c118300cf.element++;
                }
            }
        }
        if (c118300cf.element > 0) {
            new AwS254S0300000_10(c675200Qe6, (C675200Qe6<Object>) c118300cf, (C118300cf) c05xl, (C05XL<C1515820pY4<Object>>) 24);
            C034X.LIZIZ();
        }
    }

    public static void LJIIZILJ(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(Charsets.UTF_8));
    }

    public static void LJIJ(k kVar, MessageDigest messageDigest) {
        kVar.getClass();
        if (kVar instanceof m) {
            LJIIZILJ(messageDigest, "null");
            return;
        }
        if (kVar instanceof q) {
            LJIIZILJ(messageDigest, kVar.toString());
            return;
        }
        int i = 0;
        if (kVar instanceof h) {
            LJIIZILJ(messageDigest, e3.e);
            for (k kVar2 : kVar.LJIIL()) {
                int i2 = i + 1;
                if (i >= 0) {
                    k kVar3 = kVar2;
                    if (i > 0) {
                        LIZ.getClass();
                        LJIIZILJ(messageDigest, ",");
                    }
                    LIZ.getClass();
                    LJIJ(kVar3, messageDigest);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LJIIZILJ(messageDigest, e3.f);
            return;
        }
        if (kVar instanceof n) {
            LJIIZILJ(messageDigest, "{");
            for (Object obj : C13LP.LJLLLL(new AComparatorS28S0000000_9(28), kVar.LJIILIIL().entrySet())) {
                int i3 = i + 1;
                if (i >= 0) {
                    Map.Entry entry = (Map.Entry) obj;
                    String str = (String) entry.getKey();
                    k kVar4 = (k) entry.getValue();
                    if (i > 0) {
                        LIZ.getClass();
                        LJIIZILJ(messageDigest, ",");
                    }
                    LIZ.getClass();
                    LJIIZILJ(messageDigest, "\"");
                    LJIIZILJ(messageDigest, str);
                    LJIIZILJ(messageDigest, "\":");
                    LJIJ(kVar4, messageDigest);
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LJIIZILJ(messageDigest, "}");
            return;
        }
        LJIIZILJ(messageDigest, kVar.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C675130Qdz LJIILIIL(C675200Qe6 c675200Qe6, Map map, List list) {
        C675140Qe0 c675140Qe0LJIILL;
        EnumC1158510gFl enumC1158510gFl;
        String str;
        EnumC1158510gFl enumC1158510gFl2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2190991Aoz c2190991Aoz = LIZJ.get(c675200Qe6.LIZ);
        C15O7 c15o7 = null;
        if (c2190991Aoz == null) {
            String strLIZ = LIZ(list, map);
            String strLJ = LJ(list);
            EnumC1158510gFl enumC1158510gFl3 = EnumC1158510gFl.NO_STORE;
            getClass();
            c675140Qe0LJIILL = LJI(c675200Qe6, strLIZ, strLJ, jCurrentTimeMillis, enumC1158510gFl3, null, null, null);
        } else if (c2190991Aoz.LIZ.isEmpty()) {
            String strLIZ2 = LIZ(list, map);
            String strLJ2 = LJ(list);
            EnumC1158510gFl enumC1158510gFl4 = EnumC1158510gFl.EMPTY_STORE;
            getClass();
            c675140Qe0LJIILL = LJI(c675200Qe6, strLIZ2, strLJ2, jCurrentTimeMillis, enumC1158510gFl4, null, null, null);
        } else {
            C259800zU c259800zU = new C259800zU();
            if (list != null && !list.isEmpty()) {
                String strLIZ3 = LIZ(list, map);
                Iterator it2 = C1697810uHb.LJIIJJI(EnumC994770bzf.PREREAD, EnumC994770bzf.NORMAL).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        EnumC994770bzf enumC994770bzf = (EnumC994770bzf) it2.next();
                        LIZ.getClass();
                        String strLJFF = LJFF(enumC994770bzf, strLIZ3);
                        C2191441Api c2191441Api = c2190991Aoz.LIZ.get(strLJFF);
                        if (c2191441Api != null && c2191441Api.LJFF == enumC994770bzf && (c675140Qe0LJIILL = LJIILLIIL(jCurrentTimeMillis, c2190991Aoz, c259800zU, c675200Qe6, strLJFF, c2191441Api)) != null) {
                            break;
                        }
                    } else {
                        LIZIZ(c2190991Aoz, jCurrentTimeMillis);
                        C2191441Api c2191441Api2 = (C2191441Api) c259800zU.element;
                        if (c2191441Api2 != null) {
                            C2191431Aph c2191431Aph = LIZ;
                            String str2 = c2191441Api2.LIZ;
                            List<String> list2 = c2191441Api2.LIZIZ;
                            c2191431Aph.getClass();
                            c675140Qe0LJIILL = LJI(c675200Qe6, str2, LJ(list2), jCurrentTimeMillis, EnumC1158510gFl.EXPIRED, c2191441Api2.LJFF, Long.valueOf(c2191441Api2.LJI), Long.valueOf(c2191441Api2.LJ));
                        } else {
                            String strLJ3 = LJ(list);
                            if (c2190991Aoz.LIZ.isEmpty()) {
                                enumC1158510gFl2 = EnumC1158510gFl.EMPTY_STORE;
                            } else {
                                enumC1158510gFl2 = EnumC1158510gFl.KEY_MISMATCH;
                            }
                            getClass();
                            c675140Qe0LJIILL = LJI(c675200Qe6, strLIZ3, strLJ3, jCurrentTimeMillis, enumC1158510gFl2, null, null, null);
                        }
                    }
                }
            } else {
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS435S0200000_34(map, 28));
                EnumC994770bzf enumC994770bzf2 = EnumC994770bzf.PREREAD;
                c675140Qe0LJIILL = LJIILL(c2190991Aoz, c01gwLIZIZ, jCurrentTimeMillis, c259800zU, c675200Qe6, enumC994770bzf2);
                if (c675140Qe0LJIILL == null && (c675140Qe0LJIILL = LJIILJJIL(c2190991Aoz, map, jCurrentTimeMillis, c259800zU, c675200Qe6, enumC994770bzf2)) == null) {
                    EnumC994770bzf enumC994770bzf3 = EnumC994770bzf.NORMAL;
                    c675140Qe0LJIILL = LJIILL(c2190991Aoz, c01gwLIZIZ, jCurrentTimeMillis, c259800zU, c675200Qe6, enumC994770bzf3);
                    if (c675140Qe0LJIILL == null && (c675140Qe0LJIILL = LJIILJJIL(c2190991Aoz, map, jCurrentTimeMillis, c259800zU, c675200Qe6, enumC994770bzf3)) == null) {
                        LIZIZ(c2190991Aoz, jCurrentTimeMillis);
                        C2191441Api c2191441Api3 = (C2191441Api) c259800zU.element;
                        if (c2191441Api3 != null) {
                            C2191431Aph c2191431Aph2 = LIZ;
                            String str3 = c2191441Api3.LIZ;
                            List<String> list3 = c2191441Api3.LIZIZ;
                            c2191431Aph2.getClass();
                            c675140Qe0LJIILL = LJI(c675200Qe6, str3, LJ(list3), jCurrentTimeMillis, EnumC1158510gFl.EXPIRED, c2191441Api3.LJFF, Long.valueOf(c2191441Api3.LJI), Long.valueOf(c2191441Api3.LJ));
                        } else {
                            if (c2190991Aoz.LIZ.isEmpty()) {
                                enumC1158510gFl = EnumC1158510gFl.EMPTY_STORE;
                            } else {
                                enumC1158510gFl = EnumC1158510gFl.KEY_MISMATCH;
                            }
                            if (!LIZLLL(c2190991Aoz, enumC994770bzf2) && !LIZLLL(c2190991Aoz, enumC994770bzf3)) {
                                str = null;
                            } else {
                                str = (String) c01gwLIZIZ.getValue();
                            }
                            String strLJ4 = LJ(null);
                            getClass();
                            c675140Qe0LJIILL = LJI(c675200Qe6, str, strLJ4, jCurrentTimeMillis, enumC1158510gFl, null, null, null);
                        }
                    }
                }
            }
        }
        C05XL<C1515820pY4<T>> c05xl = c675140Qe0LJIILL.LIZ;
        if (c05xl != 0) {
            o oVar = new o();
            C23250099c.LIZLLL(LIZIZ, null, null, new C23016090c(c05xl, oVar, null), 3);
            c15o7 = oVar.LIZ;
        }
        return new C675130Qdz(c15o7, c675140Qe0LJIILL.LIZIZ);
    }

    public static void LJIIIIZZ(C675200Qe6 c675200Qe6, Map map, List list, long j, String str, Function0 function0) {
        Object c098200Yq;
        C099F c099fLIZIZ = C090F.LIZIZ();
        try {
            c098200Yq = LJIIIZ(c675200Qe6, map, list, j, c099fLIZIZ, EnumC994770bzf.NORMAL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C598540Ndk c598540Ndk = (C598540Ndk) c098200Yq;
        if (c598540Ndk == null || !c598540Ndk.LIZIZ) {
            return;
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C0R1C(function0, str, c675200Qe6, c099fLIZIZ, null), 3);
    }

    public static C598540Ndk LJIIIZ(C675200Qe6 c675200Qe6, Map map, List list, long j, C099F c099f, EnumC994770bzf enumC994770bzf) {
        C2190991Aoz c2190991AozLJIIL = LJIIL(c675200Qe6);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZIZ(c2190991AozLJIIL, jCurrentTimeMillis);
        String strLIZ = LIZ(list, map);
        String strLJFF = LJFF(enumC994770bzf, strLIZ);
        while (true) {
            C2191441Api c2191441Api = c2190991AozLJIIL.LIZ.get(strLJFF);
            if (c2191441Api != null) {
                if (jCurrentTimeMillis <= c2191441Api.LJ) {
                    new AwS5S1400100_34(c675200Qe6, (C675200Qe6<Object>) enumC994770bzf, (EnumC994770bzf) list, (List<String>) strLIZ, (String) c2191441Api, (C2191441Api) jCurrentTimeMillis, 2L);
                    C034X.LIZIZ();
                    return new C598540Ndk(c2191441Api.LIZJ, false);
                }
                c2190991AozLJIIL.LIZ.remove(strLJFF, c2191441Api);
            } else {
                C099F c099fLIZIZ = c099f;
                new AwS1S1400200_34(c675200Qe6, enumC994770bzf, list, strLIZ, j, jCurrentTimeMillis, c099f, 2);
                C034X.LIZIZ();
                if (enumC994770bzf == EnumC994770bzf.PREREAD) {
                    c099fLIZIZ = C090F.LIZIZ();
                    C23250099c.LIZLLL(LIZIZ, null, null, new C2191211ApL(c099f, c099fLIZIZ, enumC994770bzf, null), 3);
                }
                if (c2190991AozLJIIL.LIZ.putIfAbsent(strLJFF, new C2191441Api(strLIZ, list, c099fLIZIZ, c099f, j, enumC994770bzf, jCurrentTimeMillis)) == null) {
                    return new C598540Ndk(c099fLIZIZ, true);
                }
            }
        }
    }

    public static final C675140Qe0 LJIILJJIL(C2190991Aoz c2190991Aoz, Map map, long j, C259800zU c259800zU, C675200Qe6 c675200Qe6, EnumC994770bzf enumC994770bzf) {
        List<String> list;
        C675140Qe0 c675140Qe0LJIILLIIL;
        Iterator<T> it2 = c2190991Aoz.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            C2191441Api c2191441Api = (C2191441Api) entry.getValue();
            if (c2191441Api.LJFF == enumC994770bzf && (list = c2191441Api.LIZIZ) != null && !list.isEmpty()) {
                C2191431Aph c2191431Aph = LIZ;
                Iterable iterable = c2191441Api.LIZIZ;
                c2191431Aph.getClass();
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                if (Intrinsics.LJFF(C13LP.LJJLIIIJ(iterable, "&", null, null, 0, null, new AwS368S0200000_2(map, 165), 30), c2191441Api.LIZ) && (c675140Qe0LJIILLIIL = LJIILLIIL(j, c2190991Aoz, c259800zU, c675200Qe6, str, c2191441Api)) != null) {
                    return c675140Qe0LJIILLIIL;
                }
            }
        }
        return null;
    }

    public static final C675140Qe0 LJIILL(C2190991Aoz c2190991Aoz, C01GW c01gw, long j, C259800zU c259800zU, C675200Qe6 c675200Qe6, EnumC994770bzf enumC994770bzf) {
        List<String> list;
        C2191431Aph c2191431Aph = LIZ;
        String str = (String) c01gw.getValue();
        c2191431Aph.getClass();
        String strLJFF = LJFF(enumC994770bzf, str);
        C2191441Api c2191441Api = c2190991Aoz.LIZ.get(strLJFF);
        if (c2191441Api == null || c2191441Api.LJFF != enumC994770bzf || ((list = c2191441Api.LIZIZ) != null && !list.isEmpty())) {
            return null;
        }
        return LJIILLIIL(j, c2190991Aoz, c259800zU, c675200Qe6, strLJFF, c2191441Api);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C675140Qe0 LJIILLIIL(long j, C2190991Aoz c2190991Aoz, C259800zU c259800zU, C675200Qe6 c675200Qe6, String str, C2191441Api c2191441Api) {
        if (j > c2191441Api.LJ) {
            c2190991Aoz.LIZ.remove(str, c2191441Api);
            c259800zU.element = c2191441Api;
            return null;
        }
        if (!c2190991Aoz.LIZ.remove(str, c2191441Api)) {
            new AwS435S0200000_34(c675200Qe6, (C675200Qe6<Object>) c2191441Api, (C2191441Api) 29);
            C034X.LIZIZ();
            return null;
        }
        new C2191451Apj(c675200Qe6, c2191441Api);
        C034X.LIZIZ();
        C2191431Aph c2191431Aph = LIZ;
        C05XL<C1515820pY4<?>> c05xl = c2191441Api.LIZJ;
        c2191431Aph.getClass();
        return new C675140Qe0(c05xl, new C674880Qda(true, c675200Qe6.LIZ, c2191441Api.LIZ, LJ(c2191441Api.LIZIZ), c2191441Api.LJFF, Long.valueOf(c2191441Api.LJI), j, Long.valueOf(c2191441Api.LJ), null));
    }

    public static C675140Qe0 LJI(C675200Qe6 c675200Qe6, String str, String str2, long j, EnumC1158510gFl enumC1158510gFl, EnumC994770bzf enumC994770bzf, Long l, Long l2) {
        new C2191461Apk(c675200Qe6, enumC1158510gFl, enumC994770bzf, str2, str);
        C034X.LIZIZ();
        return new C675140Qe0(null, new C674880Qda(false, c675200Qe6.LIZ, str, str2, enumC994770bzf, l, j, l2, enumC1158510gFl));
    }
}
