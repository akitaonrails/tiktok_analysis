package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0C7T, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7T {
    public int LIZIZ;
    public int LIZJ;
    public final C0CJ1 LJFF;
    public final Set<String> LJI;
    public Set<String> LJII;
    public final n LJIIIIZZ;
    public C0C7X LJIIIZ;
    public int LJIIJ;
    public EnumC311630CJl LIZ = EnumC311630CJl.REQUEST_FAIL;
    public final String LIZLLL = "FetchAB/FetchManager";
    public final C0C7U LJ = new C0C7U();

    public C0C7T() {
        C0CJ1 c0cj1 = new C0CJ1();
        this.LJFF = c0cj1;
        this.LJI = new LinkedHashSet();
        this.LJIIIIZZ = new n();
        this.LJIIJ = -1;
        ((Keva) c0cj1.LJFF.getValue()).storeInt(c0cj1.LIZIZ, 2);
    }

    public static Set LIZ() {
        System.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> setLJ = C307730C4l.LIZLLL.LJIIIZ().LJ();
        if (setLJ != null) {
            linkedHashSet.addAll(setLJ);
        }
        Set<String> setLIZIZ = C0C54.LIZJ.LIZIZ();
        if (setLIZIZ != null) {
            linkedHashSet.addAll(setLIZIZ);
        }
        Set<String> setLJ2 = C307760C4o.LIZJ.LJIIIZ().LJ();
        if (setLJ2 != null) {
            linkedHashSet.addAll(setLJ2);
        }
        return linkedHashSet;
    }

    public static Map LIZJ(n nVar) {
        q qVarLJJIJIIJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJ());
        for (Map.Entry<String, k> entry : nVar.entrySet()) {
            try {
                qVarLJJIJIIJI = entry.getValue().LJIILIIL().LJJIJIIJI("group");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th);
                sbLIZ.append("  ,cdn config key: ");
                sbLIZ.append(entry);
                sbLIZ.append(".key");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Number)) {
                C0C7Y c0c7y = (C0C7Y) linkedHashMap.get(Integer.valueOf(qVarLJJIJIIJI.LJIIJJI()));
                if (c0c7y == null) {
                    c0c7y = new C0C7Y();
                    c0c7y.LIZ = qVarLJJIJIIJI.LJIIJJI();
                    c0c7y.LIZIZ = new LinkedHashSet();
                    linkedHashMap.put(Integer.valueOf(qVarLJJIJIIJI.LJIIJJI()), c0c7y);
                }
                c0c7y.LIZIZ.add(entry.getKey());
            } else {
                C0C7Y c0c7y2 = (C0C7Y) linkedHashMap.get(Integer.MAX_VALUE);
                if (c0c7y2 == null) {
                    c0c7y2 = new C0C7Y();
                    c0c7y2.LIZIZ = new LinkedHashSet();
                    linkedHashMap.put(Integer.MAX_VALUE, c0c7y2);
                }
                c0c7y2.LIZIZ.add(entry.getKey());
            }
        }
        return linkedHashMap;
    }

    public static C0C7X LIZIZ(C0C7T c0c7t, final int i) {
        Object objCall;
        if (c0c7t.LJIIIZ == null) {
            final C0C7U c0c7u = c0c7t.LJ;
            c0c7u.getClass();
            String str = c0c7u.LIZIZ;
            final boolean z = false;
            try {
                objCall = new C0C6T() { // from class: X.0C7V
                    @Override // X.C0C6T
                    public final Object call() {
                        List listLJJLIIIJILLIZJL;
                        C0C7U c0c7u2 = c0c7u;
                        boolean z2 = z;
                        int i2 = i;
                        Map<String, Object> map = c0c7u2.LIZ;
                        boolean z3 = (map == null || map.isEmpty()) ? c0c7u2.LIZIZ().getBoolean(c0c7u2.LJIIIIZZ, false) : false;
                        int i3 = c0c7u2.LIZIZ().getInt(c0c7u2.LJFF, -1);
                        if (z3 || z2 || !(i2 == c0c7u2.LIZIZ().getInt(c0c7u2.LJFF, -1) || i3 == -1)) {
                            c0c7u2.LIZ();
                        } else {
                            String string = c0c7u2.LIZIZ().getString(c0c7u2.LIZLLL, null);
                            if (string != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) != null) {
                                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                                return new C0C7X(numLJIIJJI != null ? numLJIIJJI.intValue() : 0, new ArrayList(listLJJLIIIJILLIZJL.subList(1, listLJJLIIIJILLIZJL.size())));
                            }
                        }
                        return null;
                    }
                }.call();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cause: ");
                sbLIZ.append(th);
                sbLIZ.append("--message: ");
                sbLIZ.append("");
                C0C46.LIZIZ(str, new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
                objCall = null;
            }
            c0c7t.LJIIIZ = (C0C7X) objCall;
        }
        return c0c7t.LJIIIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x039d A[Catch: all -> 0x03c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03c0, blocks: (B:178:0x035e, B:180:0x036f, B:183:0x0374, B:190:0x039d), top: B:245:0x035e }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0C5T r24, X.C311590CJh r25, com.google.gson.n r26, X.C0CFL r27, X.C0C7W r28, X.C0C7Z r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C7T.LIZLLL(X.0C5T, X.0CJh, com.google.gson.n, X.0CFL, X.0C7W, X.0C7Z):void");
    }

    public final void LJ(C0C5T c0c5t, C307980C5k c307980C5k, Collection collection, C0CFL c0cfl, C0C7W c0c7w, int i, AwS548S0100000_4 awS548S0100000_4) {
        Integer numValueOf;
        boolean z;
        Map<String, Object> map;
        Object obj;
        ConfigItem configItem;
        Boolean bool;
        Integer num;
        Long l;
        Double d;
        String str;
        String[] strArr;
        Float f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store configGroupKeys, size: ");
        sbLIZ.append(Integer.valueOf(collection.size()));
        sbLIZ.append(", need deleteKey: ");
        List<String> list = c307980C5k.LIZIZ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0c7w != C0C7W.CHUNK_ALL_UPDATE && c0c7w != C0C7W.CHUNK_INCREMENT_UPDATE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (c0cfl == C0CFL.FIRST || c0cfl == C0CFL.FIRST_FINISH) {
                C0CJ1 c0cj1 = this.LJFF;
                ((Keva) c0cj1.LJFF.getValue()).storeInt(c0cj1.LIZIZ, 2);
                C0C7U c0c7u = this.LJ;
                c0c7u.LIZIZ().storeInt(c0c7u.LJFF, i);
                C0C7U c0c7u2 = this.LJ;
                c0c7u2.LIZIZ().erase(c0c7u2.LIZLLL);
            }
        } else {
            C0CJ1 c0cj12 = this.LJFF;
            ((Keva) c0cj12.LJFF.getValue()).storeInt(c0cj12.LIZIZ, 2);
            C0C7U c0c7u3 = this.LJ;
            c0c7u3.LIZIZ().storeInt(c0c7u3.LJFF, i);
            C0C7U c0c7u4 = this.LJ;
            c0c7u4.LIZIZ().erase(c0c7u4.LIZLLL);
        }
        awS548S0100000_4.invoke();
        try {
            C0C5P.LIZJ().LJIILLIIL(c0c5t, c307980C5k, c0cfl, c0c7w);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C0C7Y c0c7y = (C0C7Y) it2.next();
                Set<String> set = c0c7y.LIZIZ;
                if (set != null) {
                    C0C7U c0c7u5 = this.LJ;
                    int i2 = c0c7y.LIZ;
                    c0c7u5.getClass();
                    String str2 = c0c7u5.LIZIZ;
                    try {
                        Keva kevaLIZIZ = c0c7u5.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c0c7u5.LJ);
                        sbLIZ2.append(i2);
                        kevaLIZIZ.storeString(C2188811AlT.LIZIZ(sbLIZ2), C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("cause: ");
                        sbLIZ3.append(th);
                        sbLIZ3.append("--message: ");
                        sbLIZ3.append("");
                        C0C46.LIZIZ(str2, new Throwable(C2188811AlT.LIZIZ(sbLIZ3), th));
                    }
                }
            }
            if (c0cfl == C0CFL.FIRST_FINISH || c0cfl == C0CFL.FINISH) {
                C0C7U c0c7u6 = this.LJ;
                c0c7u6.getClass();
                System.currentTimeMillis();
                if ((c0c7w == C0C7W.CHUNK_INCREMENT_UPDATE || c0c7w == C0C7W.POST_INCREMENT_UPDATE) && c0c5t != null && (map = c0c7u6.LIZ) != null && !map.isEmpty()) {
                    Iterator it3 = ((ArrayList) c0c5t.LJI).iterator();
                    while (it3.hasNext()) {
                        c0c7u6.LIZ.remove(it3.next());
                    }
                    Set<String> setLJJIJIL = c0c5t.LJFF.LJJIJIL();
                    Map<String, ConfigItem> map2 = C2502809rO.LIZ;
                    Map<String, ConfigItem> map3 = C2502809rO.LIZIZ;
                    for (String str3 : ((LinkedHashMap) c0c7u6.LIZ).keySet()) {
                        if (!setLJJIJIL.contains(str3) && (obj = ((LinkedHashMap) c0c7u6.LIZ).get(str3)) != null && ((configItem = (ConfigItem) ((HashMap) map2).get(str3)) != null || (configItem = (ConfigItem) ((HashMap) map3).get(str3)) != null)) {
                            SaveConfigType$ConfigType saveConfigType$ConfigType = configItem.type;
                            if (saveConfigType$ConfigType != null) {
                                switch (C0C4R.LIZ[saveConfigType$ConfigType.ordinal()]) {
                                    case 1:
                                        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                                            C307730C4l.LIZLLL.LJIIJ(str3, bool.booleanValue());
                                        }
                                        break;
                                    case 2:
                                        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                                            C307730C4l.LIZLLL.LJIILIIL(str3, num.intValue());
                                        }
                                        break;
                                    case 3:
                                        if ((obj instanceof Long) && (l = (Long) obj) != null) {
                                            C307730C4l.LIZLLL.LJIILL(str3, l.longValue());
                                        }
                                        break;
                                    case 4:
                                        if ((obj instanceof Double) && (d = (Double) obj) != null) {
                                            C307730C4l.LIZLLL.LJIIJJI(str3, d.doubleValue());
                                        }
                                        break;
                                    case 5:
                                    case 6:
                                        if ((obj instanceof String) && (str = (String) obj) != null) {
                                            C307730C4l.LIZLLL.LJIIZILJ(str3, str);
                                        }
                                        break;
                                    case 7:
                                        if ((obj instanceof String[]) && (strArr = (String[]) obj) != null) {
                                            C307730C4l.LIZLLL.LJIILLIIL(str3, strArr);
                                        }
                                        break;
                                    case 8:
                                        if ((obj instanceof Float) && (f = (Float) obj) != null) {
                                            C307730C4l.LIZLLL.LJIIL(str3, f.floatValue());
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    c0c7u6.LIZIZ().storeBoolean(c0c7u6.LJIIIIZZ, false);
                    System.currentTimeMillis();
                } else {
                    c0c7u6.LIZIZ().storeBoolean(c0c7u6.LJIIIIZZ, false);
                }
                C0C7X c0c7x = this.LJIIIZ;
                if (c0c7x != null) {
                    C0C7U c0c7u7 = this.LJ;
                    int i3 = c0c7x.LIZ;
                    List<String> list2 = c0c7x.LIZIZ;
                    c0c7u7.getClass();
                    String str4 = c0c7u7.LIZIZ;
                    try {
                        if (list2 == null) {
                            c0c7u7.LIZIZ().erase(c0c7u7.LIZLLL);
                            return;
                        }
                        c0c7u7.LIZIZ().storeString(c0c7u7.LIZLLL, i3 + "," + C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("cause: ");
                        sbLIZ4.append(th2);
                        sbLIZ4.append("--message: ");
                        sbLIZ4.append("");
                        C0C46.LIZIZ(str4, new Throwable(C2188811AlT.LIZIZ(sbLIZ4), th2));
                    }
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C0C46.LIZIZ(this.LIZLLL, th3);
            C0C7U c0c7u8 = this.LJ;
            c0c7u8.LIZIZ().erase(c0c7u8.LIZLLL);
            throw th3;
        }
    }
}
