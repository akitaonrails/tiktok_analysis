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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS171S0101000_34;
import kotlin.jvm.internal.AwS1S1400200_34;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS5S1400100_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Ape, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191401Ape<T> {
    public final InterfaceC497601wk LIZ;
    public final HashMap<String, C2191421Apg<T>> LIZIZ = new HashMap<>();
    public final ConcurrentHashMap<String, C2191421Apg<T>> LIZJ = new ConcurrentHashMap<>();

    public C2191401Ape(C054G c054g) {
        this.LIZ = c054g;
    }

    public static String LJI(List list) {
        if (list != null && !list.isEmpty()) {
            return "custom";
        }
        return "default";
    }

    public final void LIZ(long j) {
        Iterator<Map.Entry<String, C2191421Apg<T>>> it2 = this.LIZIZ.entrySet().iterator();
        C118300cf c118300cf = new C118300cf();
        while (it2.hasNext()) {
            if (j > it2.next().getValue().LIZLLL) {
                it2.remove();
                c118300cf.element++;
            }
        }
        if (c118300cf.element > 0) {
            new AwS435S0200000_34(c118300cf, (C118300cf) this, 19);
            C034X.LIZIZ();
        }
    }

    public final void LIZIZ(long j) {
        C118300cf c118300cf = new C118300cf();
        for (Map.Entry<String, C2191421Apg<T>> entry : this.LIZJ.entrySet()) {
            String key = entry.getKey();
            C2191421Apg<T> value = entry.getValue();
            if (j > value.LIZLLL && this.LIZJ.remove(key, value)) {
                c118300cf.element++;
            }
        }
        if (c118300cf.element > 0) {
            new AwS435S0200000_34(c118300cf, (C118300cf) this, 20);
            C034X.LIZIZ();
        }
    }

    public final boolean LJFF(EnumC994780bzg enumC994780bzg) {
        List<String> list;
        Collection<C2191421Apg<T>> collectionValues = this.LIZIZ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            C2191421Apg c2191421Apg = (C2191421Apg) it2.next();
            if (c2191421Apg.LJ == enumC994780bzg && ((list = c2191421Apg.LIZIZ) == null || list.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ(C05XL<C1515820pY4<T>> c05xl) {
        synchronized (this) {
            try {
                Iterator<Map.Entry<String, C2191421Apg<T>>> it2 = this.LIZIZ.entrySet().iterator();
                C118300cf c118300cf = new C118300cf();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getValue().LIZJ, c05xl)) {
                        it2.remove();
                        c118300cf.element++;
                    }
                }
                if (c118300cf.element > 0) {
                    new AwS427S0200000_26(c118300cf, (C118300cf) c05xl, 99);
                    C034X.LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI(C05XL<C1515820pY4<T>> c05xl) {
        C118300cf c118300cf = new C118300cf();
        for (Map.Entry<String, C2191421Apg<T>> entry : this.LIZJ.entrySet()) {
            String key = entry.getKey();
            C2191421Apg<T> value = entry.getValue();
            if (Intrinsics.LJFF(value.LIZJ, c05xl) && this.LIZJ.remove(key, value)) {
                c118300cf.element++;
            }
        }
        if (c118300cf.element > 0) {
            new AwS427S0200000_26(c118300cf, (C118300cf) c05xl, 100);
            C034X.LIZIZ();
        }
    }

    public final String LJIIL(k kVar) {
        kVar.getClass();
        if (kVar instanceof m) {
            return "null";
        }
        if (kVar instanceof q) {
            return kVar.toString();
        }
        if (kVar instanceof h) {
            return C13LP.LJJLIIIJ(kVar.LJIIL(), ",", e3.e, e3.f, 0, null, new AwS581S0100000_2(this, 670), 24);
        }
        if (kVar instanceof n) {
            return C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS21S0000000_2(27), kVar.LJIILIIL().entrySet()), ",", "{", "}", 0, null, new AwS581S0100000_2(this, 671), 24);
        }
        return kVar.toString();
    }

    public static String LIZLLL(Map map, n nVar) throws NoSuchAlgorithmException {
        Collection<Map.Entry> collectionLJLLLL;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        LJIJI(messageDigest, "q:");
        boolean z = true;
        if (map != null && !map.isEmpty()) {
            if (map instanceof SortedMap) {
                collectionLJLLLL = ((SortedMap) map).entrySet();
            } else {
                collectionLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(25), map.entrySet());
            }
            for (Map.Entry entry : collectionLJLLLL) {
                if (!z) {
                    LJIJI(messageDigest, "&");
                } else {
                    z = false;
                }
                LJIJI(messageDigest, (String) entry.getKey());
                LJIJI(messageDigest, "=");
                LJIJI(messageDigest, (String) entry.getValue());
            }
        }
        LJIJI(messageDigest, "|b:");
        if (nVar != null && nVar.size() > 0) {
            LJIJJ(nVar, messageDigest);
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

    public static boolean LJ(Map map, EnumC994780bzg enumC994780bzg) {
        List<String> list;
        Collection<C2191421Apg> collectionValues = ((ConcurrentHashMap) map).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (C2191421Apg c2191421Apg : collectionValues) {
                if (c2191421Apg.LJ == enumC994780bzg && ((list = c2191421Apg.LIZIZ) == null || list.isEmpty())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String LJII(EnumC994780bzg enumC994780bzg, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC994780bzg);
        sbLIZ.append('#');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIJI(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(Charsets.UTF_8));
    }

    public static void LJIJJ(k kVar, MessageDigest messageDigest) {
        kVar.getClass();
        if (kVar instanceof m) {
            LJIJI(messageDigest, "null");
            return;
        }
        if (kVar instanceof q) {
            LJIJI(messageDigest, kVar.toString());
            return;
        }
        int i = 0;
        if (kVar instanceof h) {
            LJIJI(messageDigest, e3.e);
            for (k kVar2 : kVar.LJIIL()) {
                int i2 = i + 1;
                if (i >= 0) {
                    k kVar3 = kVar2;
                    if (i > 0) {
                        LJIJI(messageDigest, ",");
                    }
                    LJIJJ(kVar3, messageDigest);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LJIJI(messageDigest, e3.f);
            return;
        }
        if (kVar instanceof n) {
            LJIJI(messageDigest, "{");
            for (Object obj : C13LP.LJLLLL(new AComparatorS28S0000000_9(26), kVar.LJIILIIL().entrySet())) {
                int i3 = i + 1;
                if (i >= 0) {
                    Map.Entry entry = (Map.Entry) obj;
                    String str = (String) entry.getKey();
                    k kVar4 = (k) entry.getValue();
                    if (i > 0) {
                        LJIJI(messageDigest, ",");
                    }
                    LJIJI(messageDigest, "\"");
                    LJIJI(messageDigest, str);
                    LJIJI(messageDigest, "\":");
                    LJIJJ(kVar4, messageDigest);
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LJIJI(messageDigest, "}");
            return;
        }
        LJIJI(messageDigest, kVar.toString());
    }

    public final C1771400wCI<T> LJIILIIL(Map<String, String> map, n nVar) {
        C1771400wCI<T> c1771400wCI;
        C2191421Apg<T> c2191421Apg;
        C2191421Apg<T> c2191421Apg2;
        synchronized (this) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LIZ(jCurrentTimeMillis);
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS278S0300000_34(nVar, this, map, 5));
                EnumC994780bzg enumC994780bzg = EnumC994780bzg.PREREAD;
                c1771400wCI = null;
                if (LJFF(enumC994780bzg) && (c2191421Apg2 = this.LIZIZ.get(LJII(enumC994780bzg, (String) c01gwLIZIZ.getValue()))) != null) {
                    new AwS578S0100000_34(c2191421Apg2, 186);
                    C034X.LIZIZ();
                    c1771400wCI = new C1771400wCI<>(c2191421Apg2.LIZJ, enumC994780bzg);
                } else {
                    C2191421Apg c2191421ApgLJIILJJIL = LJIILJJIL(this, jCurrentTimeMillis, map, nVar, enumC994780bzg);
                    if (c2191421ApgLJIILJJIL != null) {
                        new AwS578S0100000_34(c2191421ApgLJIILJJIL, 187);
                        C034X.LIZIZ();
                        c1771400wCI = new C1771400wCI<>(c2191421ApgLJIILJJIL.LIZJ, enumC994780bzg);
                    } else {
                        EnumC994780bzg enumC994780bzg2 = EnumC994780bzg.NORMAL;
                        if (LJFF(enumC994780bzg2) && (c2191421Apg = this.LIZIZ.get(LJII(enumC994780bzg2, (String) c01gwLIZIZ.getValue()))) != null) {
                            new AwS578S0100000_34(c2191421Apg, 188);
                            C034X.LIZIZ();
                            c1771400wCI = new C1771400wCI<>(c2191421Apg.LIZJ, enumC994780bzg2);
                        } else {
                            C2191421Apg c2191421ApgLJIILJJIL2 = LJIILJJIL(this, jCurrentTimeMillis, map, nVar, enumC994780bzg2);
                            if (c2191421ApgLJIILJJIL2 != null) {
                                new AwS578S0100000_34(c2191421ApgLJIILJJIL2, 189);
                                C034X.LIZIZ();
                                c1771400wCI = new C1771400wCI<>(c2191421ApgLJIILJJIL2.LIZJ, enumC994780bzg2);
                            } else {
                                new AwS435S0200000_34(this, c01gwLIZIZ, (C01GW<String>) 21);
                                C034X.LIZIZ();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1771400wCI;
    }

    public final C1515820pY4<T> LJIJJLI(final C1515820pY4<T> c1515820pY4, boolean z) {
        EnumC994780bzg enumC994780bzg;
        C1494600ozq requestInfo;
        if (z) {
            enumC994780bzg = EnumC994780bzg.PREREAD;
        } else {
            enumC994780bzg = EnumC994780bzg.NORMAL;
        }
        if (enumC994780bzg == EnumC994780bzg.PREREAD) {
            C034X.LIZIZ();
            final C2190961Aow c2190961Aow = new C2190961Aow();
            final C1515820pY4<T> c1515820pY42 = new C1515820pY4<>(new InterfaceC644200POo() { // from class: X.1Aos
                @Override // X.InterfaceC644200POo
                public final void LIZ(C0POE<T> c0poe) {
                    C2190961Aow<T> c2190961Aow2 = c2190961Aow;
                    synchronized (c2190961Aow2) {
                        try {
                            int size = ((ArrayList) c2190961Aow2.LIZ).size();
                            if (size > 0 || c2190961Aow2.LIZJ) {
                                new AwS171S0101000_34(size, (int) c2190961Aow2, 2);
                                C034X.LIZIZ();
                            }
                            for (Object obj : (ArrayList) c2190961Aow2.LIZ) {
                                if (obj instanceof C2190931Aot) {
                                    c0poe.onNext(((C2190931Aot) obj).LIZ);
                                } else if (obj instanceof C2190951Aov) {
                                    c0poe.onComplete();
                                } else if (obj instanceof C2190941Aou) {
                                    c0poe.onFailed(((C2190941Aou) obj).LIZ);
                                }
                            }
                            if (!c2190961Aow2.LIZJ) {
                                ((ArrayList) c2190961Aow2.LIZIZ).add(c0poe);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }, Boolean.TRUE);
            try {
                requestInfo = c1515820pY4.getRequestInfo();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                requestInfo = null;
            }
            new AwS270S0300000_26(c1515820pY4, c1515820pY42, (C1515820pY4<Object>) requestInfo, (C1494600ozq<?>) 152);
            C034X.LIZIZ();
            if (requestInfo != null) {
                try {
                    c1515820pY42.setRequestInfo(requestInfo);
                    new AwS570S0100000_26(c1515820pY42, (C1515820pY4<Object>) 1593);
                    C034X.LIZIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    new AwS546S0100000_2(th2, 1201);
                    C034X.LIZIZ();
                }
            }
            try {
                c1515820pY42.LLILLL = c1515820pY4.LLILLL;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                c1515820pY4.LLILZLL = new InterfaceC1515700pXs() { // from class: X.1ApN
                    @Override // X.InterfaceC1515700pXs
                    public final void LIZ(C1494600ozq c1494600ozq) {
                        new AwS278S0300000_34((C1515820pY4) c1515820pY4, c1515820pY42, (C1515820pY4<Object>) c1494600ozq, (C1494600ozq) 8);
                        C034X.LIZIZ();
                        try {
                            c1515820pY42.setRequestInfo(c1494600ozq);
                            new AwS578S0100000_34(c1515820pY42, (C1515820pY4<Object>) 193);
                            C034X.LIZIZ();
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            new AwS578S0100000_34(th4, 194);
                            C034X.LIZIZ();
                        }
                    }
                };
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                new AwS546S0100000_2(th4, 1202);
                C034X.LIZIZ();
            }
            C23250099c.LIZLLL(this.LIZ, C0PEM.LIZJ, null, new C2191001Ap0(c1515820pY4, c2190961Aow, null), 2);
            return c1515820pY42;
        }
        return c1515820pY4;
    }

    public static C1771400wCI LJIILL(C2191401Ape c2191401Ape, Map map, n nVar) {
        c2191401Ape.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c2191401Ape.LIZIZ(jCurrentTimeMillis);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS278S0300000_34(nVar, c2191401Ape, map, 7));
        EnumC994780bzg enumC994780bzg = EnumC994780bzg.PREREAD;
        Pair pairLJIIZILJ = LJIIZILJ(c2191401Ape, jCurrentTimeMillis, c01gwLIZIZ, enumC994780bzg);
        if (pairLJIIZILJ != null) {
            return LJIJ(true, c2191401Ape, enumC994780bzg, "default", (String) pairLJIIZILJ.getFirst(), (C2191421Apg) pairLJIIZILJ.getSecond());
        }
        Pair pairLJIILLIIL = LJIILLIIL(c2191401Ape, jCurrentTimeMillis, map, nVar, enumC994780bzg);
        if (pairLJIILLIIL != null) {
            return LJIJ(true, c2191401Ape, enumC994780bzg, "custom", (String) pairLJIILLIIL.getFirst(), (C2191421Apg) pairLJIILLIIL.getSecond());
        }
        EnumC994780bzg enumC994780bzg2 = EnumC994780bzg.NORMAL;
        Pair pairLJIIZILJ2 = LJIIZILJ(c2191401Ape, jCurrentTimeMillis, c01gwLIZIZ, enumC994780bzg2);
        if (pairLJIIZILJ2 != null) {
            return LJIJ(true, c2191401Ape, enumC994780bzg2, "default", (String) pairLJIIZILJ2.getFirst(), (C2191421Apg) pairLJIIZILJ2.getSecond());
        }
        Pair pairLJIILLIIL2 = LJIILLIIL(c2191401Ape, jCurrentTimeMillis, map, nVar, enumC994780bzg2);
        if (pairLJIILLIIL2 != null) {
            return LJIJ(true, c2191401Ape, enumC994780bzg2, "custom", (String) pairLJIILLIIL2.getFirst(), (C2191421Apg) pairLJIILLIIL2.getSecond());
        }
        new AwS435S0200000_34(c2191401Ape, c01gwLIZIZ, (C01GW<String>) 24);
        C034X.LIZIZ();
        return null;
    }

    public final String LIZJ(n nVar, List list, Map map) {
        List list2 = list;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        return C13LP.LJJLIIIJ(list2, "&", null, null, 0, null, new AwS211S0300000_2(nVar, this, map, 29), 30);
    }

    public static final <T> Pair<String, C2191421Apg<T>> LJIIZILJ(C2191401Ape<T> c2191401Ape, long j, C01GW<String> c01gw, EnumC994780bzg enumC994780bzg) {
        List<String> list;
        String value = c01gw.getValue();
        c2191401Ape.getClass();
        String strLJII = LJII(enumC994780bzg, value);
        C2191421Apg<T> c2191421Apg = c2191401Ape.LIZJ.get(strLJII);
        if (c2191421Apg == null || c2191421Apg.LJ != enumC994780bzg || (((list = c2191421Apg.LIZIZ) != null && !list.isEmpty()) || j > c2191421Apg.LIZLLL)) {
            return null;
        }
        return new Pair<>(strLJII, c2191421Apg);
    }

    public static final <T> C2191421Apg<T> LJIILJJIL(C2191401Ape<T> c2191401Ape, long j, Map<String, String> map, n nVar, EnumC994780bzg enumC994780bzg) {
        T next;
        List<String> list;
        Iterator<T> it2 = c2191401Ape.LIZIZ.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C2191421Apg<T> c2191421Apg = (C2191421Apg) next;
                if (c2191421Apg.LJ == enumC994780bzg && (list = c2191421Apg.LIZIZ) != null && !list.isEmpty() && j <= c2191421Apg.LIZLLL && Intrinsics.LJFF(c2191401Ape.LIZJ(nVar, c2191421Apg.LIZIZ, map), c2191421Apg.LIZ)) {
                    break;
                }
            } else {
                next = (T) null;
                break;
            }
        }
        return next;
    }

    public static final <T> Pair<String, C2191421Apg<T>> LJIILLIIL(C2191401Ape<T> c2191401Ape, long j, Map<String, String> map, n nVar, EnumC994780bzg enumC994780bzg) {
        T next;
        List<String> list;
        Iterator<T> it2 = c2191401Ape.LIZJ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C2191421Apg c2191421Apg = (C2191421Apg) ((Map.Entry) next).getValue();
                if (c2191421Apg.LJ == enumC994780bzg && (list = c2191421Apg.LIZIZ) != null && !list.isEmpty() && j <= c2191421Apg.LIZLLL && Intrinsics.LJFF(c2191401Ape.LIZJ(nVar, c2191421Apg.LIZIZ, map), c2191421Apg.LIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    public static final <T> C1771400wCI<T> LJIJ(boolean z, C2191401Ape<T> c2191401Ape, EnumC994780bzg enumC994780bzg, String str, String str2, C2191421Apg<T> c2191421Apg) {
        if (z) {
            c2191401Ape.LIZJ.remove(str2, c2191421Apg);
        }
        new C2191411Apf(enumC994780bzg, str, c2191421Apg, z);
        C034X.LIZIZ();
        return new C1771400wCI<>(c2191421Apg.LIZJ, enumC994780bzg);
    }

    public final C05XL LJIIIIZZ(Map map, n nVar, List list, long j, C099F c099f, EnumC994780bzg enumC994780bzg) {
        String strLIZLLL;
        C05XL<C1515820pY4<T>> c05xl = c099f;
        synchronized (this) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LIZ(jCurrentTimeMillis);
                if (list != null && !list.isEmpty()) {
                    strLIZLLL = LIZJ(nVar, list, map);
                } else {
                    strLIZLLL = LIZLLL(map, nVar);
                }
                String strLJII = LJII(enumC994780bzg, strLIZLLL);
                C2191421Apg<T> c2191421Apg = this.LIZIZ.get(strLJII);
                if (c2191421Apg != null && jCurrentTimeMillis <= c2191421Apg.LIZLLL) {
                    new AwS5S1400100_34(enumC994780bzg, (EnumC994780bzg) this, (C2191401Ape<Object>) list, (List<String>) strLIZLLL, (String) c2191421Apg, (C2191421Apg<Object>) jCurrentTimeMillis, 0L);
                    C034X.LIZIZ();
                    c05xl = c2191421Apg.LIZJ;
                } else {
                    new AwS1S1400200_34(enumC994780bzg, this, list, strLIZLLL, j, jCurrentTimeMillis, c05xl, 0);
                    C034X.LIZIZ();
                    this.LIZIZ.put(strLJII, new C2191421Apg<>(strLIZLLL, list, c05xl, j, enumC994780bzg));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c05xl;
    }

    public final C05XL LJIIIZ(Map map, n nVar, List list, long j, C099F c099f, EnumC994780bzg enumC994780bzg) throws NoSuchAlgorithmException {
        String strLIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZIZ(jCurrentTimeMillis);
        if (list != null && !list.isEmpty()) {
            strLIZLLL = LIZJ(nVar, list, map);
        } else {
            strLIZLLL = LIZLLL(map, nVar);
        }
        String strLJII = LJII(enumC994780bzg, strLIZLLL);
        while (true) {
            C2191421Apg<T> c2191421Apg = this.LIZJ.get(strLJII);
            if (c2191421Apg != null) {
                if (jCurrentTimeMillis <= c2191421Apg.LIZLLL) {
                    new AwS5S1400100_34(enumC994780bzg, (EnumC994780bzg) this, (C2191401Ape<Object>) list, (List<String>) strLIZLLL, (String) c2191421Apg, (C2191421Apg<Object>) jCurrentTimeMillis, 1L);
                    C034X.LIZIZ();
                    return c2191421Apg.LIZJ;
                }
                this.LIZJ.remove(strLJII, c2191421Apg);
            } else {
                new AwS1S1400200_34(enumC994780bzg, this, list, strLIZLLL, j, jCurrentTimeMillis, c099f, 1);
                C034X.LIZIZ();
                if (this.LIZJ.putIfAbsent(strLJII, new C2191421Apg<>(strLIZLLL, list, c099f, j, enumC994780bzg)) == null) {
                    return c099f;
                }
            }
        }
    }
}
