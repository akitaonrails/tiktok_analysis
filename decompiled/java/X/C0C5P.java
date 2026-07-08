package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS73S0200000_4;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C5P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5P {
    public static volatile C0C5P LJIIJJI;
    public Application LIZ;
    public volatile C307970C5j LIZIZ;
    public volatile C307970C5j LIZJ;
    public volatile Boolean LIZLLL;
    public final Map<String, List<InterfaceC304970BxP>> LJ = new HashMap();
    public final ConcurrentLinkedDeque<InterfaceC308010C5n> LJFF = new ConcurrentLinkedDeque<>();
    public final Set<InterfaceC308020C5o> LJI = new HashSet();
    public final Set<InterfaceC308040C5q> LJII = new HashSet();
    public C0C4T LJIIIIZZ;
    public final C822650WOx LJIIIZ;
    public final C2115308Ql LJIIJ;

    public static C0C5P LIZJ() {
        if (LJIIJJI == null) {
            synchronized (C0C5P.class) {
                try {
                    if (LJIIJJI == null) {
                        LJIIJJI = new C0C5P();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIJJI;
    }

    public final boolean LJFF() {
        if (this.LIZLLL == null) {
            this.LIZLLL = Boolean.valueOf(this.LIZIZ.LIZIZ());
        }
        return this.LIZLLL.booleanValue();
    }

    public final void LJIIJ() {
        synchronized (this.LJII) {
            try {
                Iterator it2 = ((HashSet) this.LJII).iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC308040C5q) it2.next()).C0();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0C46.LIZIZ("FetchAB/ConfigManager", th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJIIZILJ() {
        if (this.LIZIZ != null) {
            this.LIZIZ.getClass();
        }
    }

    public C0C5P() {
        C822650WOx c822650WOx = new C822650WOx(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.LJIIIZ = c822650WOx;
        this.LJIIJ = new C2115308Ql();
        c822650WOx.allowCoreThreadTimeOut(true);
    }

    public static void LIZ(String str) {
        C292830Bdp c292830Bdp = (C292830Bdp) C292560BdO.LJI.getValue();
        c292830Bdp.getClass();
        List<String> listLIZIZ = C292830Bdp.LIZIZ(str);
        if (listLIZIZ != null) {
            c292830Bdp.LJ.LIZ(listLIZIZ);
        }
        C292560BdO.LJ();
        C292560BdO.LJ();
    }

    public static void LJIIL(final C308080C5u c308080C5u) {
        Map<String, Integer> map = C308300C6q.LIZ;
        try {
            new C0C6T() { // from class: X.0C5t
                @Override // X.C0C6T
                public final Object call() {
                    C308080C5u c308080C5u2 = c308080C5u;
                    if (c308080C5u2.LIZIZ == null) {
                        return Unit.LIZ;
                    }
                    C307870C4z c307870C4z = C0C5I.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c308080C5u2.LIZ);
                    sbLIZ.append("_CDN_CONFIG_VERSION_ID_LIST___");
                    String[] strArrLJFF = c307870C4z.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    Set setLJLIIIL = strArrLJFF != null ? C13LQ.LJLIIIL(strArrLJFF) : new LinkedHashSet();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (C308090C5v c308090C5v : c308080C5u2.LIZIZ) {
                        InputStream inputStream = c308090C5v.LIZ;
                        Throwable th = null;
                        try {
                            Map<String, Integer> map2 = C308300C6q.LIZ;
                            C308300C6q.LIZIZ(inputStream, c308080C5u2.LIZ, c308090C5v.LIZIZ, linkedHashSet, setLJLIIIL);
                            C2107108Nh.LIZ(inputStream, null);
                        } finally {
                            try {
                                try {
                                } catch (Throwable th2) {
                                    while (true) {
                                    }
                                }
                            } catch (Throwable th3) {
                            }
                        }
                    }
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj : setLJLIIIL) {
                        if (!C13LP.LJJJJ(obj, linkedHashSet)) {
                            arrayList.add(obj);
                        }
                    }
                    for (String str : arrayList) {
                        if (str != null) {
                            Map<String, Integer> map3 = C308300C6q.LIZ;
                            LinkedHashMap linkedHashMap = (LinkedHashMap) map3;
                            Integer num = (Integer) linkedHashMap.get(str);
                            if ((num != null ? num.intValue() : 0) > 1) {
                                Integer num2 = (Integer) linkedHashMap.get(str);
                                map3.put(str, Integer.valueOf((num2 != null ? num2.intValue() : 0) - 1));
                            } else {
                                C0C5A c0c5aLIZJ = C0C5A.LIZJ();
                                c0c5aLIZJ.getClass();
                                try {
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                }
                                if (!((ConcurrentHashMap) c0c5aLIZJ.LIZIZ).containsValue(Long.valueOf(Long.getLong(str).longValue()))) {
                                    C307860C4y.LIZJ.LJIIIIZZ().LIZ(str);
                                }
                            }
                            linkedHashSet.add(str);
                        }
                    }
                    C0C5I.LIZ.LJIIIIZZ().LJII(c308080C5u2.LIZ + "_CDN_CONFIG_VERSION_ID_LIST___", (String[]) linkedHashSet.toArray(new String[0]));
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public final void LJI(Set<String> set) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyChangedConfigs: ");
        sbLIZ.append(set);
        C0C5Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (set != null && !((HashSet) set).isEmpty()) {
            HashMap map = new HashMap();
            synchronized (this.LJ) {
                try {
                    for (Map.Entry entry : ((HashMap) this.LJ).entrySet()) {
                        map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS73S0200000_4(set, map, 41));
        }
    }

    public final void LJIILIIL(C0C5V c0c5v) {
        C844470XAv.LIZ.getClass();
        boolean zLJ = C08Q0.LJ(C844470XAv.LIZ(), "preload_ab_setting_creative_exp", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeStart ------>  remote = ");
        sbLIZ.append(zLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLJ) {
            C0C5U.LIZIZ = true;
        }
        LJIILJJIL(false, c0c5v, C0CFL.FINISH, C0C7W.GET_ALL_UPDATE);
        if (C0C5U.LIZIZ) {
            C293030Be9.LIZ.getClass();
            C293030Be9.LIZIZ();
            if (C0C5U.LIZ.LIZ.size() <= 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                if (!C293030Be9.LIZJ) {
                    for (Map.Entry entry : ((LinkedHashMap) C293030Be9.LIZLLL).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    C293030Be9.LIZ.getClass();
                    for (Map.Entry entry2 : ((LinkedHashMap) C293030Be9.LJFF).entrySet()) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                    C293030Be9.LIZ.getClass();
                    for (Map.Entry entry3 : ((LinkedHashMap) C293030Be9.LJ).entrySet()) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                    C293030Be9.LIZ.getClass();
                    for (Map.Entry entry4 : ((LinkedHashMap) C293030Be9.LJI).entrySet()) {
                        linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                    }
                    C293030Be9.LIZ.getClass();
                    for (Map.Entry entry5 : ((LinkedHashMap) C293030Be9.LJII).entrySet()) {
                        linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                    }
                    C293030Be9.LIZ.getClass();
                    for (Map.Entry entry6 : ((LinkedHashMap) C293030Be9.LJIIIIZZ).entrySet()) {
                        linkedHashMap6.put(entry6.getKey(), entry6.getValue());
                    }
                }
                C293030Be9.LIZ.getClass();
                C293030Be9.LIZJ();
                C0C5U.LIZ.LIZ();
                synchronized (C0C5U.LIZ) {
                    try {
                        C0C5U.LIZ.LIZ = linkedHashMap;
                        C0C5U.LIZ.LIZJ = linkedHashMap3;
                        C0C5U.LIZ.LJ = linkedHashMap5;
                        C0C5U.LIZ.LIZLLL = linkedHashMap4;
                        C0C5U.LIZ.LIZIZ = linkedHashMap2;
                        C0C5U.LIZ.LJFF = linkedHashMap6;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C0C5U.LIZ.LIZ();
            }
        }
    }

    public final void LJIILL(n nVar) {
        C307900C5c c307900C5c = new C307900C5c();
        c307900C5c.LIZ = nVar;
        LJIILJJIL(false, new C0C5V(c307900C5c), C0CFL.FINISH, C0C7W.GET_ALL_UPDATE);
    }

    public static void LIZIZ(List list, boolean z) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C292560BdO.LIZLLL((String) it2.next(), z);
        }
    }

    public final void LJ(Context context, C307970C5j c307970C5j) {
        this.LIZJ = c307970C5j;
        if (this.LIZJ != null && this.LIZJ.LIZIZ() && this.LIZJ.LIZ() != null) {
            this.LIZJ.LIZ().init(context);
        }
    }

    public final void LJIIIIZZ(C0C7N c0c7n, C0C7W c0c7w) {
        Iterator<InterfaceC308010C5n> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ(c0c7n, c0c7w);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0C46.LIZIZ("FetchAB/ConfigManager", th);
            }
        }
    }

    public final void LJIIIZ(C307980C5k c307980C5k, C0C7W c0c7w) {
        synchronized (this.LJI) {
            try {
                Iterator it2 = ((HashSet) this.LJI).iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC308020C5o) it2.next()).LIZ(c307980C5k);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0C46.LIZIZ("FetchAB/ConfigManager", th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJIIJJI(String str, InterfaceC304970BxP interfaceC304970BxP) {
        List arrayList;
        if (interfaceC304970BxP == null) {
            return;
        }
        synchronized (this.LJ) {
            try {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0C46.LIZIZ("FetchAB/ConfigManager", e);
                }
                if (((HashMap) this.LJ).containsKey(str)) {
                    arrayList = (List) ((HashMap) this.LJ).get(str);
                    if (arrayList != null) {
                    }
                } else {
                    arrayList = new ArrayList();
                    ((HashMap) this.LJ).put(str, arrayList);
                }
                if (!arrayList.contains(interfaceC304970BxP)) {
                    arrayList.add(interfaceC304970BxP);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJ(String str, InterfaceC304970BxP interfaceC304970BxP) {
        List list;
        if (interfaceC304970BxP == null) {
            return;
        }
        synchronized (this.LJ) {
            try {
                try {
                    list = (List) ((HashMap) this.LJ).get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0C46.LIZIZ("FetchAB/ConfigManager", e);
                }
                if (list == null) {
                    return;
                }
                list.remove(interfaceC304970BxP);
                if (list.isEmpty()) {
                    ((HashMap) this.LJ).remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(Application application, C307970C5j c307970C5j, boolean z) {
        long jNanoTime = System.nanoTime();
        this.LIZ = application;
        this.LIZIZ = c307970C5j;
        C0C5W c0c5w = C0C5W.LIZIZ;
        c0c5w.LIZ = new C307960C5i(this);
        C0C59 c0c59LJ = C0C59.LJ();
        Boolean boolValueOf = Boolean.valueOf(z);
        c0c59LJ.LIZIZ = c307970C5j;
        c0c59LJ.LIZJ = application;
        if (!boolValueOf.booleanValue()) {
            c0c59LJ.LJIILJJIL(0, true);
        }
        C307890C5b c307890C5b = new C307890C5b();
        c307890C5b.LIZIZ = "config_center_init";
        ((HashMap) c307890C5b.LIZ).put("cost", String.valueOf(System.nanoTime() - jNanoTime));
        c0c5w.onEvent(c307890C5b);
        C0C58 c0c58 = C0C58.LIZJ;
        C2115308Ql c2115308Ql = this.LJIIJ;
        InterfaceC307780C4q interfaceC307780C4q = c0c58.LIZ;
        if (interfaceC307780C4q != null) {
            interfaceC307780C4q.LIZLLL(c2115308Ql);
        }
    }

    public final void LJII(C0C7N c0c7n, C307980C5k c307980C5k, C0C7W c0c7w) {
        Iterator<InterfaceC308010C5n> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZIZ(c0c7n, c0c7w);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0C46.LIZIZ("FetchAB/ConfigManager", th);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILJJIL(boolean z, C0C5V c0c5v, C0CFL c0cfl, C0C7W c0c7w) {
        boolean z2;
        boolean z3;
        HashSet hashSet;
        String strLJIL;
        q qVarLJJIJIIJI;
        int i;
        q qVarLJJIJIIJI2;
        boolean z4;
        q qVarLJJIJIIJI3;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        k kVarLJJIIZ4;
        k kVarLJJIIZ5;
        System.currentTimeMillis();
        C307980C5k c307980C5k = new C307980C5k(null, c0c5v.LIZJ);
        if (c0cfl == C0CFL.FIRST || c0cfl == C0CFL.FIRST_FINISH) {
            LJII(C0C7N.HIGH_PRIORITY_DATA, c307980C5k, c0c7w);
        }
        if (c0cfl == C0CFL.FINISH || c0cfl == C0CFL.FIRST_FINISH) {
            LJII(C0C7N.ALL_DATA, c307980C5k, c0c7w);
            LJIIIZ(c307980C5k, c0c7w);
        }
        n nVar = c0c5v.LIZLLL;
        System.currentTimeMillis();
        if (nVar != null) {
            boolean z5 = C292560BdO.LIZ;
            String[] strArr = c0c5v.LJ;
            if (nVar.size() != 0) {
                if (((ArrayList) C292560BdO.LIZLLL).isEmpty()) {
                    C292560BdO.LJIIIZ();
                }
                HashMap map = (HashMap) C2502809rO.LIZIZ;
                Iterator it2 = map.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    boolean z6 = C292560BdO.LIZ;
                    if (zHasNext) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str = (String) entry.getKey();
                        SaveConfigType$ConfigType saveConfigType$ConfigType = ((ConfigItem) entry.getValue()).type;
                        if (saveConfigType$ConfigType == null) {
                            i = -1;
                        } else {
                            i = C0C4J.LIZ[saveConfigType$ConfigType.ordinal()];
                        }
                        switch (i) {
                            case 1:
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("key: ");
                                sbLIZ.append(str);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ = nVar.LJJIJ(str);
                                    if (nVarLJJIJ != null && (qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("val")) != null) {
                                        if (qVarLJJIJIIJI2.LL instanceof Number) {
                                            C0C4Y c0c4y = C0C4Y.LIZJ;
                                            if (qVarLJJIJIIJI2.LJIIJJI() != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c0c4y.LJIIJJI(str, z4);
                                        } else {
                                            C0C4Y.LIZJ.LJIIJJI(str, qVarLJJIJIIJI2.LJ());
                                        }
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("cause: ");
                                    sbLIZ2.append(th);
                                    sbLIZ2.append("--message: ");
                                    sbLIZ2.append(strLIZIZ);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
                                }
                                break;
                            case 2:
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("key: ");
                                sbLIZ3.append(str);
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ2 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ2 != null && (qVarLJJIJIIJI3 = nVarLJJIJ2.LJJIJIIJI("val")) != null) {
                                        if (qVarLJJIJIIJI3.LL instanceof Boolean) {
                                            C0C4Y.LIZJ.LJIIL(str, qVarLJJIJIIJI3.LJ() ? 1 : 0);
                                        } else {
                                            C0C4Y.LIZJ.LJIIL(str, qVarLJJIJIIJI3.LJIIJJI());
                                        }
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("cause: ");
                                    sbLIZ4.append(th2);
                                    sbLIZ4.append("--message: ");
                                    sbLIZ4.append(strLIZIZ2);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ4), th2));
                                }
                                break;
                            case 3:
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("key: ");
                                sbLIZ5.append(str);
                                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ3 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ3 != null && (kVarLJJIIZ = nVarLJJIJ3.LJJIIZ("val")) != null) {
                                        C0C4Y.LIZJ.LJIIIZ().LJIIIIZZ(str, kVarLJJIIZ.LJIIZILJ());
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("cause: ");
                                    sbLIZ6.append(th3);
                                    sbLIZ6.append("--message: ");
                                    sbLIZ6.append(strLIZIZ3);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ6), th3));
                                }
                                break;
                            case 4:
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("key: ");
                                sbLIZ7.append(str);
                                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ4 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ4 != null && (kVarLJJIIZ2 = nVarLJJIJ4.LJJIIZ("val")) != null) {
                                        C0C4Y.LIZJ.LJIIIZ().LJFF(str, kVarLJJIIZ2.LJIIIZ());
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("cause: ");
                                    sbLIZ8.append(th4);
                                    sbLIZ8.append("--message: ");
                                    sbLIZ8.append(strLIZIZ4);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ8), th4));
                                }
                                break;
                            case 5:
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("key: ");
                                sbLIZ9.append(str);
                                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ9);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ5 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ5 != null && (kVarLJJIIZ3 = nVarLJJIJ5.LJJIIZ("val")) != null) {
                                        C0C4Y.LIZJ.LJIIIZ().LJIIJ(str, kVarLJJIIZ3.LJIIJ());
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("cause: ");
                                    sbLIZ10.append(th5);
                                    sbLIZ10.append("--message: ");
                                    sbLIZ10.append(strLIZIZ5);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ10), th5));
                                }
                                break;
                            case 6:
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("key: ");
                                sbLIZ11.append(str);
                                String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ6 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ6 != null && (kVarLJJIIZ4 = nVarLJJIJ6.LJJIIZ("val")) != null) {
                                        C0C4Y.LIZJ.LJIILJJIL(str, kVarLJJIIZ4.LJIL());
                                    } else if (nVar.LJJIJIIJIL(str)) {
                                        C0C4Y.LIZJ.LJIILJJIL(str, null);
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                    sbLIZ12.append("cause: ");
                                    sbLIZ12.append(th6);
                                    sbLIZ12.append("--message: ");
                                    sbLIZ12.append(strLIZIZ6);
                                    C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ12), th6));
                                }
                                break;
                            case 7:
                                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                sbLIZ13.append("key: ");
                                sbLIZ13.append(str);
                                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ13);
                                try {
                                    C292560BdO.LJIILJJIL(nVar, str);
                                    n nVarLJJIJ7 = nVar.LJJIJ(str);
                                    if (nVarLJJIJ7 != null && (kVarLJJIIZ5 = nVarLJJIJ7.LJJIIZ("val")) != null) {
                                        C0C4Y c0c4y2 = C0C4Y.LIZJ;
                                        try {
                                            c0c4y2.LJIILIIL(str, (String[]) GsonProtectorUtils.fromJson(c0c4y2.LJIIJ(), kVarLJJIIZ5, String[].class));
                                        } catch (Throwable th7) {
                                            th = th7;
                                            TryCatchGuardChecker.doCheck(th);
                                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                            sbLIZ14.append("cause: ");
                                            sbLIZ14.append(th);
                                            sbLIZ14.append("--message: ");
                                            sbLIZ14.append(strLIZIZ7);
                                            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ14), th));
                                        }
                                    } else if (nVar.LJJIJIIJIL(str)) {
                                        C0C4Y.LIZJ.LJIILIIL(str, null);
                                    } else {
                                        C0C4Y.LIZJ.LJIIIIZZ(str);
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                                break;
                            case 8:
                                C292560BdO.LJIILIIL(nVar, str);
                                break;
                            default:
                                C292560BdO.LJIILIIL(nVar, str);
                                break;
                        }
                    } else {
                        for (String str2 : nVar.LJJIJIL()) {
                            n nVarLJJIJ8 = nVar.LJJIJ(str2);
                            if (nVarLJJIJ8 != null && (qVarLJJIJIIJI = nVarLJJIJ8.LJJIJIIJI("type")) != null) {
                                strLJIL = qVarLJJIJIIJI.LJIL();
                            } else {
                                strLJIL = null;
                            }
                            if (Intrinsics.LJFF(strLJIL, "1") && !map.containsKey(str2)) {
                                C292560BdO.LJIILJJIL(nVar, str2);
                            }
                        }
                        C292560BdO.LJIIL(strArr);
                        C292560BdO.LJ();
                    }
                }
            }
        }
        n nVar2 = c0c5v.LIZ;
        if (nVar2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        System.currentTimeMillis();
        if (z2) {
            try {
                if (C308050C5r.LIZ) {
                    C0C4Z.LIZ = nVar2;
                }
                C0C4Z.LJ(nVar2);
                C0C4Z.LJFF(nVar2);
                C0C4Z.LJIIJ(nVar2);
                try {
                    z3 = true;
                    try {
                        C0C4Y.LIZJ.LJIIJJI("config_center_saved", true);
                    } catch (Throwable th9) {
                        th = th9;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C0C46.LIZIZ("SaveConfigValue", th);
                        } catch (Throwable th10) {
                            th = th10;
                            TryCatchGuardChecker.doCheck(th);
                            C0C46.LIZIZ("SaveConfigValue", th);
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    z3 = true;
                }
            } catch (Throwable th12) {
                th = th12;
                z3 = true;
            }
        } else {
            z3 = true;
        }
        System.currentTimeMillis();
        final n nVar3 = c0c5v.LIZIZ;
        if (nVar3 != null) {
            final C307820C4u c307820C4u = C307820C4u.LIZJ;
            c307820C4u.getClass();
            C0C6R.LJIIIIZZ("ConfigMetaDataManager", "", new C0C6T() { // from class: X.0C4v
                public final /* synthetic */ Set LIZIZ = null;

                @Override // X.C0C6T
                public final Object call() {
                    C307820C4u c307820C4u2 = c307820C4u;
                    Set set = this.LIZIZ;
                    n nVar4 = nVar3;
                    c307820C4u2.getClass();
                    Map<String, ConfigItem> map2 = C2502809rO.LIZ;
                    HashSet hashSet2 = new HashSet();
                    if (C307820C4u.LIZLLL) {
                        hashSet2.addAll(c307820C4u2.LIZ().LJ());
                    }
                    Iterator it3 = ((HashMap) map2).entrySet().iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) ((Map.Entry) it3.next()).getKey();
                        if (str3 != null) {
                            c307820C4u2.LIZJ(str3, set, nVar4, hashSet2);
                        }
                    }
                    return null;
                }
            });
        }
        C0CFL c0cfl2 = C0CFL.FINISH;
        if (c0cfl == c0cfl2 || c0cfl == C0CFL.FIRST_FINISH) {
            if (c0c5v.LIZJ != null) {
                System.currentTimeMillis();
                c0c5v.LJFF = C0C5Q.LIZIZ(c0c5v.LIZJ);
            } else {
                z3 = false;
            }
            if (z2 || z3) {
                synchronized (this.LJ) {
                    try {
                        hashSet = new HashSet(((HashMap) this.LJ).keySet());
                    } catch (Throwable th13) {
                        TryCatchGuardChecker.doCheck(th13);
                        throw th13;
                    }
                }
                C0C5A.LIZJ().LIZ();
                LJI(hashSet);
            }
            LJIIJ();
        }
        if (c0cfl == C0CFL.FIRST) {
            LJIIIIZZ(C0C7N.HIGH_PRIORITY_DATA, c0c7w);
        } else if (c0cfl == c0cfl2) {
            LJIIIIZZ(C0C7N.ALL_DATA, c0c7w);
        } else if (c0cfl == C0CFL.FIRST_FINISH) {
            LJIIIIZZ(C0C7N.HIGH_PRIORITY_DATA, c0c7w);
            LJIIIIZZ(C0C7N.ALL_DATA, c0c7w);
        }
        if (z && (c0cfl == c0cfl2 || c0cfl == C0CFL.FIRST_FINISH)) {
            this.LJIIIZ.execute(new ARunnableS104S0100000_4(this, 119));
        }
        System.currentTimeMillis();
    }

    public final void LJIILLIIL(C0C5T c0c5t, C307980C5k c307980C5k, C0CFL c0cfl, C0C7W c0c7w) {
        HashSet hashSet;
        Object objLJ;
        q qVarLJJIJIIJI;
        String strLJIL;
        q qVarLJJIJIIJI2;
        Map<String, ConfigItem> configMap;
        System.currentTimeMillis();
        n nVar = c0c5t.LIZJ;
        if (c0cfl == C0CFL.FIRST || c0cfl == C0CFL.FIRST_FINISH) {
            LJII(C0C7N.HIGH_PRIORITY_DATA, c307980C5k, c0c7w);
        }
        if (c0cfl == C0CFL.FINISH || c0cfl == C0CFL.FIRST_FINISH) {
            C307980C5k c307980C5k2 = new C307980C5k(c0c5t.LJI, c0c5t.LJFF);
            LJII(C0C7N.ALL_DATA, c307980C5k2, c0c7w);
            LJIIIZ(c307980C5k2, c0c7w);
        }
        List<String> list = c307980C5k.LIZIZ;
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        Map<String, ConfigItem> map2 = C2502809rO.LIZIZ;
        Map<BaseConfigPlugin, Boolean> map3 = C307630C4b.LIZ().LIZ;
        HashMap map4 = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map3).entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue() && (configMap = ((BaseConfigPlugin) entry.getKey()).getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry2 : configMap.entrySet()) {
                    map4.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        final n nVar2 = c307980C5k.LIZ;
        C307730C4l.LJ = false;
        if (list != null) {
            InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
            if (interfaceC307670C4f == null) {
                interfaceC307670C4f = null;
            }
            Set<String> setLJ = interfaceC307670C4f.LJ();
            Set<String> setLJ2 = C307820C4u.LIZJ.LIZ().LJ();
            for (String str : list) {
                try {
                    if (setLJ.contains(str)) {
                        C292560BdO.LIZJ(str);
                    }
                    C307760C4o.LIZJ.LJIIIIZZ(str);
                    C307730C4l.LIZLLL.LJIIIIZZ(str);
                    C0C54 c0c54 = C0C54.LIZJ;
                    c0c54.getClass();
                    try {
                        C0C5R c0c5r = c0c54.LIZIZ;
                        try {
                            c0c5r.LIZ.LIZ(str);
                            c0c5r.LIZJ.remove(str);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("cause: ");
                                sbLIZ.append(th);
                                sbLIZ.append("--message: ");
                                sbLIZ.append("eraseKey");
                                C0C46.LIZIZ("UnregisteredRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (setLJ2.contains(str)) {
                        try {
                            C307820C4u.LIZJ.LIZJ(str, null, nVar2, null);
                        } catch (Throwable th4) {
                            th = th4;
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        ArrayList<C308000C5m> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList();
        ArrayList<String> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (nVar2 != null) {
            System.currentTimeMillis();
            for (String str2 : nVar2.LJJIJIL()) {
                n nVarLJJIJ = nVar2.LJJIJ(str2);
                if (nVarLJJIJ != null && (qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI("type")) != null) {
                    if ((qVarLJJIJIIJI.LL instanceof Number) && qVarLJJIJIIJI.LJIIJJI() == 21) {
                        q qVarLJJIJIIJI3 = nVarLJJIJ.LJJIJIIJI("vid");
                        if (nVar != null) {
                            nVar.LJJIFFI(str2, qVarLJJIJIIJI3);
                        }
                    } else {
                        ConfigItem configItem = (ConfigItem) ((HashMap) map2).get(str2);
                        if ("1".equals(qVarLJJIJIIJI.LJIL()) && (qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("vid")) != null) {
                            strLJIL = qVarLJJIJIIJI2.LJIL();
                        } else {
                            strLJIL = null;
                        }
                        if (configItem != null || strLJIL != null) {
                            arrayList.add(new C308000C5m(configItem, strLJIL, str2));
                            if (configItem != null) {
                                arrayList5.add(str2);
                                if (!configItem.isLaunch) {
                                    arrayList3.add(str2);
                                } else {
                                    arrayList2.add(str2);
                                }
                            }
                        }
                        ConfigItem configItem2 = (ConfigItem) ((HashMap) map).get(str2);
                        if (configItem2 == null) {
                            configItem2 = (ConfigItem) map4.get(str2);
                            if (configItem2 == null) {
                                if (0 == 0) {
                                    arrayList4.add(str2);
                                }
                            }
                        } else {
                            arrayList5.add(str2);
                        }
                        if (configItem2.isLaunch) {
                            arrayList2.add(str2);
                        } else {
                            arrayList3.add(str2);
                        }
                    }
                }
            }
        }
        try {
            System.currentTimeMillis();
            for (C308000C5m c308000C5m : arrayList) {
                boolean z = C292560BdO.LIZ;
                C292560BdO.LJIILL(c308000C5m.LIZJ, c308000C5m.LIZ, c308000C5m.LIZIZ);
            }
            for (String str3 : arrayList2) {
                ConfigItem configItem3 = (ConfigItem) ((HashMap) map).get(str3);
                if (configItem3 == null) {
                    configItem3 = (ConfigItem) map4.get(str3);
                }
                C307730C4l c307730C4l = C307730C4l.LIZLLL;
                SaveConfigType$ConfigType saveConfigType$ConfigType = configItem3.type;
                c307730C4l.getClass();
                if (saveConfigType$ConfigType == SaveConfigType$ConfigType.STRING_ARRAY) {
                    objLJ = C0C5A.LIZJ().LJ(String[].class, str3, null);
                } else {
                    objLJ = C0C5A.LIZJ().LJ(null, str3, null);
                }
                C307700C4i.LIZIZ(configItem3, nVar2, objLJ, str3);
            }
            boolean z2 = C292560BdO.LIZ;
            C292560BdO.LJIIIIZZ(c0c5t.LIZIZ, c0c5t.LJ);
            System.currentTimeMillis();
            for (String str4 : arrayList3) {
                ConfigItem configItem4 = (ConfigItem) ((HashMap) map).get(str4);
                if (configItem4 == null) {
                    configItem4 = (ConfigItem) map4.get(str4);
                }
                if (configItem4 != null) {
                    switch (C0C4Q.LIZ[configItem4.type.ordinal()]) {
                        case 1:
                            C0C5Q.LIZJ(nVar2, str4);
                            break;
                        case 2:
                            C0C5Q.LJI(nVar2, str4);
                            break;
                        case 3:
                            C0C5Q.LJII(nVar2, str4);
                            break;
                        case 4:
                            C0C5Q.LJ(nVar2, str4);
                            break;
                        case 5:
                            C0C5Q.LJFF(nVar2, str4);
                            break;
                        case 6:
                            C0C5Q.LJIIJ(nVar2, str4);
                            break;
                        case 7:
                            C0C5Q.LJIIIZ(nVar2, str4);
                            break;
                        default:
                            C0C5Q.LIZLLL(nVar2, str4);
                            break;
                    }
                }
            }
            System.currentTimeMillis();
            for (final String str5 : arrayList4) {
                final C0C54 c0c542 = C0C54.LIZJ;
                c0c542.getClass();
                C0C6R.LJIIIIZZ("UnregisteredRepo", "storeValue", new C0C6T() { // from class: X.0C55
                    @Override // X.C0C6T
                    public final Object call() {
                        C0C54 c0c543 = c0c542;
                        String str6 = str5;
                        n nVar3 = nVar2;
                        C0C5R c0c5r2 = c0c543.LIZIZ;
                        c0c5r2.LIZ.LIZIZ(str6, nVar3.LJJIIZ(str6).toString());
                        if (!c0c5r2.LIZJ.containsKey(str6)) {
                            return null;
                        }
                        c0c5r2.LIZJ.remove(str6);
                        return null;
                    }
                });
            }
            System.currentTimeMillis();
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                C307820C4u.LIZJ.LIZJ((String) it2.next(), null, nVar2, null);
            }
        } catch (Throwable th6) {
        }
        try {
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            C307730C4l.LIZLLL.LJIIJ("libra_config_center_saved", true);
        } catch (Throwable th8) {
            th = th8;
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C0CFL c0cfl2 = C0CFL.FINISH;
        if (c0cfl == c0cfl2 || c0cfl == C0CFL.FIRST_FINISH) {
            C0C5A.LIZJ().LIZ();
        }
        if (c0cfl == C0CFL.FIRST) {
            LJIIIIZZ(C0C7N.HIGH_PRIORITY_DATA, c0c7w);
        } else {
            if (c0cfl == c0cfl2) {
                LJIIIIZZ(C0C7N.ALL_DATA, c0c7w);
            } else if (c0cfl == C0CFL.FIRST_FINISH) {
                LJIIIIZZ(C0C7N.HIGH_PRIORITY_DATA, c0c7w);
                LJIIIIZZ(C0C7N.ALL_DATA, c0c7w);
            }
            synchronized (this.LJ) {
                try {
                    hashSet = new HashSet(((HashMap) this.LJ).keySet());
                } finally {
                    TryCatchGuardChecker.doCheck(th6);
                }
            }
            LJI(hashSet);
            if (c0c5t.LIZ) {
                this.LJIIIZ.execute(new ARunnableS104S0100000_4(this, 118));
            }
        }
        System.currentTimeMillis();
    }
}
