package X;

import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C5A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5A {
    public static volatile C0C5A LJIIIZ;
    public static final Object LJIIJ = new Object();
    public volatile C0C5H LIZLLL;
    public volatile InterfaceC292790Bdl LJ;
    public int LJFF;
    public final Map<String, Object> LIZ = new ConcurrentHashMap();
    public final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final Map<String, Object> LIZJ = new ConcurrentHashMap();
    public boolean LJI = false;
    public final Gson LJII = new Gson();
    public boolean LJIIIIZZ = false;

    public static C0C5A LIZJ() {
        if (LJIIIZ == null) {
            synchronized (C0C5A.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new C0C5A();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    public final void LIZ() {
        ((ConcurrentHashMap) this.LIZJ).clear();
        if (this.LJIIIIZZ) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                if (entry != null && entry.getValue() == LJIIJ && entry.getKey() != null) {
                    ((ConcurrentHashMap) this.LIZ).remove(entry.getKey());
                    ((ConcurrentHashMap) this.LIZIZ).remove(entry.getKey());
                }
            }
        }
    }

    public final void LJI(String str) {
        if (str != null) {
            ((ConcurrentHashMap) this.LIZ).remove(str);
            ((ConcurrentHashMap) this.LIZJ).remove(str);
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        }
    }

    public static C0C5C LJIIIZ(int i, String str, boolean z) {
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ;
        }
        if (i == 1) {
            return C0C4X.LIZJ;
        }
        C307730C4l c307730C4l = C307730C4l.LIZLLL;
        if (c307730C4l.contains(str)) {
            if (C308170C6d.LIZ) {
                C308160C6c.LIZ(str);
            }
            return c307730C4l;
        }
        if (z) {
            C307870C4z c307870C4z = C307870C4z.LIZJ;
            if (c307870C4z.contains(str)) {
                return c307870C4z;
            }
        }
        return C0C4Y.LIZJ;
    }

    public final Object LJ(Class cls, String str, Object obj) {
        Object obj2;
        if (this.LJ == null) {
            C0C46.LIZIZ("", new Throwable("mProvider is null"));
        }
        try {
            if (this.LIZLLL != null && this.LIZLLL.enable() && (obj2 = this.LIZLLL.get(str)) != null) {
                if (cls != null && !obj2.getClass().isAssignableFrom(cls) && (obj2 instanceof n)) {
                    return this.LJII.LIZJ((n) obj2, cls);
                }
                return obj2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": getValueFromMock error: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return obj;
    }

    public final Object LJFF(final String str, final SaveConfigType$ConfigType saveConfigType$ConfigType, final Class cls) {
        Object objCall = null;
        Object objLJ = LJ(cls, str, null);
        if (objLJ != null) {
            return objLJ;
        }
        try {
            Object obj = ((ConcurrentHashMap) this.LIZ).get(str);
            if (obj == null) {
                obj = ((ConcurrentHashMap) this.LIZJ).get(str);
                if (str != null) {
                    C292560BdO.LIZ(str);
                }
            } else if (str != null) {
                C292560BdO.LIZ(str);
            }
            if (obj == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getOverrideValue key: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    objCall = new C0C6T() { // from class: X.0C5D
                        @Override // X.C0C6T
                        public final Object call() {
                            String str2 = str;
                            SaveConfigType$ConfigType saveConfigType$ConfigType2 = saveConfigType$ConfigType;
                            Class cls2 = cls;
                            int iLJIIJJI = 0;
                            zLJ = false;
                            boolean zLJ = false;
                            boolean zLJ2 = false;
                            if (C0C5G.LIZJ) {
                                LinkedList<C0C5F> linkedList = C0C5G.LIZIZ;
                                if (linkedList.size() != 0) {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    Iterator<C0C5F> it2 = linkedList.iterator();
                                    while (it2.hasNext()) {
                                        concurrentHashMap.putAll(it2.next().LIZIZ());
                                    }
                                    C0C5G.LIZ = concurrentHashMap;
                                }
                                C0C5G.LIZJ = false;
                            }
                            k kVar = (k) ((ConcurrentHashMap) C0C5G.LIZ).get(str2);
                            if (kVar != null) {
                                switch (C0C4O.LIZ[saveConfigType$ConfigType2.ordinal()]) {
                                    case 1:
                                        if (!(kVar instanceof q) || !(kVar.LJIILJJIL().LL instanceof Number)) {
                                            zLJ2 = kVar.LJ();
                                        } else if (kVar.LJIIJJI() != 0) {
                                            zLJ2 = true;
                                        }
                                        return Boolean.valueOf(zLJ2);
                                    case 2:
                                        if (!(kVar instanceof q) || !(kVar.LJIILJJIL().LL instanceof Boolean)) {
                                            iLJIIJJI = kVar.LJIIJJI();
                                        } else if (kVar.LJ()) {
                                            iLJIIJJI = 1;
                                        }
                                        return Integer.valueOf(iLJIIJJI);
                                    case 3:
                                        return Long.valueOf(kVar.LJIIZILJ());
                                    case 4:
                                        return Double.valueOf(kVar.LJIIIZ());
                                    case 5:
                                        return Float.valueOf(kVar.LJIIJ());
                                    case 6:
                                        return kVar.LJIL();
                                    case 7:
                                        return GsonProtectorUtils.fromJson(C0C4Y.LIZJ.LJIIJ(), kVar, String[].class);
                                    case 8:
                                        C0C5A.LIZJ().getClass();
                                        C0C54 c0c54 = C0C54.LIZJ;
                                        C0C5R c0c5r = c0c54.LIZIZ;
                                        c0c5r.LIZ();
                                        n nVarLJIILIIL = c0c5r.LIZ.contains(str2) ? (n) c0c54.LIZLLL(str2, false) : (n) C0C5A.LJIIIZ(0, str2, false).LJII(str2, n.class);
                                        q qVarLJJIJIIJI = kVar.LJIILIIL().LJJIJIIJI("_replace");
                                        if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Boolean)) {
                                            zLJ = qVarLJJIJIIJI.LJ();
                                        }
                                        if (nVarLJIILIIL == null || zLJ) {
                                            nVarLJIILIIL = kVar.LJIILIIL();
                                        } else {
                                            Iterator<T> it3 = kVar.LJIILIIL().entrySet().iterator();
                                            while (it3.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it3.next();
                                                nVarLJIILIIL.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
                                            }
                                        }
                                        return (cls2 == null || Intrinsics.LJFF(cls2, String[].class) || Intrinsics.LJFF(kVar.getClass(), cls2)) ? nVarLJIILIIL : GsonProtectorUtils.fromJson(C0C5A.LIZJ().LJII, (k) nVarLJIILIIL, cls2);
                                }
                            }
                            return null;
                        }
                    }.call();
                    return objCall;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cause: ");
                    sbLIZ2.append(th);
                    sbLIZ2.append("--message: ");
                    sbLIZ2.append(strLIZIZ);
                    C0C46.LIZIZ("", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
                    return objCall;
                }
            }
            return obj;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (str != null) {
                C292560BdO.LIZ(str);
            }
            throw th2;
        }
    }

    public final void LJII(long j, String str, boolean z) {
        if (z) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, Long.valueOf(j));
        }
    }

    public final void LJIIIIZZ(Object obj, String str, boolean z, boolean z2) {
        C292560BdO.LJIILLIIL(str);
        if (!z2 && obj != null) {
            if (z) {
                ((ConcurrentHashMap) this.LIZ).put(str, obj);
            } else {
                ((ConcurrentHashMap) this.LIZJ).put(str, obj);
            }
        }
    }

    public static Object LIZLLL(String str, Object obj, C0C5C c0c5c, Class cls, C0C7M c0c7m) {
        switch (C0C5B.LIZ[c0c7m.ordinal()]) {
            case 1:
                int iLIZ = c0c5c.LIZ(str, Integer.MIN_VALUE);
                if (iLIZ != Integer.MIN_VALUE) {
                    break;
                }
                break;
            case 2:
                if (c0c5c.contains(str)) {
                }
                break;
            case 3:
                long jLJ = c0c5c.LJ(str, Long.MIN_VALUE);
                if (jLJ != Long.MIN_VALUE) {
                    break;
                }
                break;
            case 4:
                float fLIZLLL = c0c5c.LIZLLL(str, Float.MIN_VALUE);
                if (fLIZLLL != Float.MIN_VALUE) {
                    break;
                }
                break;
            case 5:
                double dLJI = c0c5c.LJI(str, Double.MIN_VALUE);
                if (dLJI != Double.MIN_VALUE) {
                    break;
                }
                break;
            case 8:
                if (cls != null) {
                }
                break;
        }
        return null;
    }

    public final Object LIZIZ(String str, Object obj, int i, boolean z, boolean z2, boolean z3, Class<?> cls, C0C7M c0c7m) {
        Object objLIZLLL;
        if (C0C5K.LIZ(i)) {
            Object objLIZLLL2 = LIZLLL(str, obj, C307760C4o.LIZJ, cls, c0c7m);
            if (objLIZLLL2 == null) {
                return obj;
            }
            return objLIZLLL2;
        }
        if (i == 1) {
            objLIZLLL = LIZLLL(str, obj, C0C4X.LIZJ, cls, c0c7m);
            if (objLIZLLL != null) {
                obj = objLIZLLL;
            }
        } else {
            objLIZLLL = LIZLLL(str, obj, C307730C4l.LIZLLL, cls, c0c7m);
            if (objLIZLLL != null) {
                if (C308170C6d.LIZ) {
                    C308160C6c.LIZ(str);
                }
                obj = objLIZLLL;
            } else if (z3) {
                Long lValueOf = (Long) ((ConcurrentHashMap) this.LIZIZ).get(str);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(C307870C4z.LIZJ.LJ(str, -1L));
                }
                if (lValueOf.longValue() != -1) {
                    LJII(lValueOf.longValue(), str, z);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(lValueOf);
                    sbLIZ.append("");
                    return LIZLLL(C2188811AlT.LIZIZ(sbLIZ), null, C307860C4y.LIZJ, cls, c0c7m);
                }
            }
        }
        if (c0c7m != C0C7M.STRING_ARRAY && c0c7m != C0C7M.OBJECT) {
            LJIIIIZZ(obj, str, z, z2);
            return obj;
        }
        if (obj == null && this.LJIIIIZZ) {
            LJIIIIZZ(LJIIJ, str, z, z2);
            return obj;
        }
        LJIIIIZZ(obj, str, z, z2);
        return obj;
    }
}
