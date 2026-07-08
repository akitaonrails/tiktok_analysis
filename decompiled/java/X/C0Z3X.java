package X;

import com.ss.android.ugc.aweme.im.strategy.exp.DMResourceSampleRateSettingsData;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z3X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3X implements IDMResourceLoadService {
    public static final C0Z3X LIZ = new C0Z3X();
    public static final ConcurrentHashMap<String, InterfaceC1664506fT> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService
    public final InterfaceC893250Z2l LIZIZ() {
        return ((Number) C260690AJn.LIZ.getValue()).intValue() != 0 ? new InterfaceC893250Z2l() { // from class: X.0Z3a
            @Override // X.InterfaceC893250Z2l
            public final void LIZJ(String str, String str2, boolean z, Double d) {
                double dLIZ;
                if (d != null) {
                    dLIZ = d.doubleValue();
                } else {
                    dLIZ = C1844007Kc.LIZ(str);
                }
                if (!C0Z3X.LIZ.LIZ(dLIZ)) {
                    return;
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("dm_resource_separate_recall_rate", C2097608Jq.LJIIIIZZ(new Pair("resource_scene", str), new Pair("tag", str2), new Pair("is_denominator", String.valueOf(z))));
            }

            @Override // X.InterfaceC893250Z2l
            public final void LIZ(String str, String str2, String str3, Long l, boolean z, Double d) {
                double dLIZ;
                String string;
                String str4;
                C0Z3X c0z3x = C0Z3X.LIZ;
                if (d != null) {
                    dLIZ = d.doubleValue();
                } else {
                    dLIZ = C1844007Kc.LIZ(str);
                }
                if (!c0z3x.LIZ(dLIZ)) {
                    return;
                }
                C0I0B.LJFF.LIZIZ();
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("resource_scene", str);
                pairArr[1] = new Pair("item_type", str2);
                pairArr[2] = new Pair("from_path", str3);
                if (l != null) {
                    string = l.toString();
                } else {
                    string = null;
                }
                pairArr[3] = new Pair("interval_between_load_and_use", string);
                if (z) {
                    str4 = "use";
                } else {
                    str4 = "load";
                }
                pairArr[4] = new Pair("action_type", str4);
                C20684815ws.LJIILLIIL("dm_resource_separate_use_rate", C2097608Jq.LJIIIIZZ(pairArr));
            }

            @Override // X.InterfaceC893250Z2l
            public final void LIZIZ(String str, String str2, String str3, boolean z, String str4, Double d) {
                double dLIZ;
                C0Z3X c0z3x = C0Z3X.LIZ;
                if (d != null) {
                    dLIZ = d.doubleValue();
                } else {
                    dLIZ = C1844007Kc.LIZ(str);
                }
                if (!c0z3x.LIZ(dLIZ)) {
                    return;
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("dm_resource_separate_hit_rate", C2097608Jq.LJIIIIZZ(new Pair("resource_scene", str), new Pair("item_type", str2), new Pair("from_path", str3), new Pair("is_hit", String.valueOf(z)), new Pair("reason", str4)));
            }
        } : new InterfaceC893250Z2l() { // from class: X.0Z3Y
            @Override // X.InterfaceC893250Z2l
            public final void LIZ(String str, String str2, String str3, Long l, boolean z, Double d) {
            }

            @Override // X.InterfaceC893250Z2l
            public final void LIZIZ(String str, String str2, String str3, boolean z, String str4, Double d) {
            }

            @Override // X.InterfaceC893250Z2l
            public final void LIZJ(String str, String str2, boolean z, Double d) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService
    public final boolean LIZ(double d) {
        if (d <= 0.0d) {
            return false;
        }
        if (d <= 1.0d && ThreadLocalRandom.current().nextDouble() >= d) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService
    public final InterfaceC1664506fT LIZJ(C0Z3V c0z3v, boolean z) {
        String strLIZIZ;
        InterfaceC1664506fT interfaceC1664506fTPutIfAbsent;
        if (((Number) C260690AJn.LIZ.getValue()).intValue() != 0) {
            int i = C0Z3W.LIZ[c0z3v.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    strLIZIZ = c0z3v.getTag();
                } else {
                    throw new C1954807lC();
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0z3v.getTag());
                sbLIZ.append('_');
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                sbLIZ.append(curUserId);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (z) {
                ConcurrentHashMap<String, InterfaceC1664506fT> concurrentHashMap = LIZIZ;
                InterfaceC1664506fT interfaceC1664506fT = concurrentHashMap.get(strLIZIZ);
                if (interfaceC1664506fT == null && (interfaceC1664506fTPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (interfaceC1664506fT = new InterfaceC1664506fT() { // from class: X.0Z3b
                    public final C01GW LIZ = C452501pT.LIZIZ(new C1093004Pg());
                    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1093104Ph());
                    public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
                    public final C01GW LIZLLL = C452501pT.LIZIZ(new C893440Z3e());

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LIZJ(String str) {
                        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
                        AtomicBoolean atomicBoolean;
                        C893420Z3c c893420Z3c = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
                        if (c893420Z3c != null && (atomicBoolean = c893420Z3c.LIZJ) != null) {
                            atomicBoolean.compareAndSet(false, true);
                        }
                        C893420Z3c c893420Z3c2 = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
                        if (c893420Z3c2 != null && (concurrentHashMap2 = c893420Z3c2.LIZIZ) != null) {
                            concurrentHashMap2.clear();
                        }
                        return this;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LIZLLL(String str) {
                        C893430Z3d c893430Z3d;
                        Map mapLJIIIIZZ;
                        if (LJII(str) || (c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str)) == null || c893430Z3d.LIZJ.get()) {
                            return this;
                        }
                        int size = c893430Z3d.LIZIZ.size();
                        ConcurrentHashMap<String, Boolean> concurrentHashMap2 = c893430Z3d.LIZIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Boolean> entry : concurrentHashMap2.entrySet()) {
                            if (entry.getValue().booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        int size2 = linkedHashMap.size();
                        if (size != 0 && (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("resource_scene", c893430Z3d.LIZ), new Pair("load_count", String.valueOf(size)), new Pair("use_count", String.valueOf(size2)), new Pair("rate", String.valueOf(size2 / size)))) != null) {
                            C0I0B.LJFF.LIZIZ();
                            C20684815ws.LJIILLIIL("dm_resource_aggregated_use_rate", mapLJIIIIZZ);
                            return this;
                        }
                        return this;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LJ(String str) {
                        C893420Z3c c893420Z3c;
                        Map mapLJIIIIZZ;
                        if (LJII(str) || (c893420Z3c = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str)) == null || c893420Z3c.LIZJ.get()) {
                            return this;
                        }
                        int size = c893420Z3c.LIZIZ.size();
                        ConcurrentHashMap<String, Boolean> concurrentHashMap2 = c893420Z3c.LIZIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Boolean> entry : concurrentHashMap2.entrySet()) {
                            if (entry.getValue().booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        int size2 = linkedHashMap.size();
                        if (size != 0 && (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("resource_scene", c893420Z3c.LIZ), new Pair("get_count", String.valueOf(size)), new Pair("hit_count", String.valueOf(size2)), new Pair("rate", String.valueOf(size2 / size)))) != null) {
                            C0I0B.LJFF.LIZIZ();
                            C20684815ws.LJIILLIIL("dm_resource_aggregated_hit_rate", mapLJIIIIZZ);
                            return this;
                        }
                        return this;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LJFF(String str) {
                        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
                        AtomicBoolean atomicBoolean;
                        C893430Z3d c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
                        if (c893430Z3d != null && (atomicBoolean = c893430Z3d.LIZJ) != null) {
                            atomicBoolean.compareAndSet(false, true);
                        }
                        C893430Z3d c893430Z3d2 = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
                        if (c893430Z3d2 != null && (concurrentHashMap2 = c893430Z3d2.LIZIZ) != null) {
                            concurrentHashMap2.clear();
                        }
                        return this;
                    }

                    public final boolean LJII(String str) {
                        double dDoubleValue;
                        Map<String, Double> map;
                        Double d;
                        Boolean bool = this.LIZJ.get(str);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        C0Z3X c0z3x = C0Z3X.LIZ;
                        DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData = C1844007Kc.LIZ;
                        DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData2 = C1844007Kc.LIZ;
                        if (dMResourceSampleRateSettingsData2 != null && (map = dMResourceSampleRateSettingsData2.aggregateSampleData) != null && (d = map.get(str)) != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        boolean z2 = !c0z3x.LIZ(dDoubleValue);
                        this.LIZJ.put(str, Boolean.valueOf(z2));
                        return z2;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LIZ(String str, String str2) {
                        C893430Z3d c893430Z3d;
                        Boolean bool;
                        if (str2 != null && !LJII(str) && (c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str)) != null && !c893430Z3d.LIZJ.get() && (bool = c893430Z3d.LIZIZ.get(str2)) != null) {
                            bool.booleanValue();
                            c893430Z3d.LIZIZ.put(str2, Boolean.TRUE);
                        }
                        return this;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LJI(String str, String str2) {
                        Object objPutIfAbsent;
                        if (str2 == null || LJII(str)) {
                            return this;
                        }
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZIZ.getValue();
                        Object c893430Z3d = concurrentHashMap2.get(str);
                        if (c893430Z3d == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c893430Z3d = new C893430Z3d(str)))) != null) {
                            c893430Z3d = objPutIfAbsent;
                        }
                        C893430Z3d c893430Z3d2 = (C893430Z3d) c893430Z3d;
                        if (c893430Z3d2.LIZJ.get()) {
                            return this;
                        }
                        c893430Z3d2.LIZIZ.putIfAbsent(str2, Boolean.FALSE);
                        return this;
                    }

                    @Override // X.InterfaceC1664506fT
                    public final InterfaceC1664506fT LIZIZ(String str, String str2, C0Z38 c0z38, boolean z2) {
                        Object objPutIfAbsent;
                        if (LJII(str)) {
                            return this;
                        }
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZ.getValue();
                        Object c893420Z3c = concurrentHashMap2.get(str);
                        if (c893420Z3c == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c893420Z3c = new C893420Z3c(str)))) != null) {
                            c893420Z3c = objPutIfAbsent;
                        }
                        C893420Z3c c893420Z3c2 = (C893420Z3c) c893420Z3c;
                        if (c893420Z3c2.LIZJ.get()) {
                            return this;
                        }
                        int i2 = C0Z39.LIZ[c0z38.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ConcurrentHashMap<String, Boolean> concurrentHashMap3 = c893420Z3c2.LIZIZ;
                                if (str2 == null) {
                                    return this;
                                }
                                concurrentHashMap3.putIfAbsent(str2, Boolean.valueOf(z2));
                                return this;
                            }
                            throw new C1954807lC();
                        }
                        c893420Z3c2.LIZIZ.put(String.valueOf(((AtomicLong) this.LIZLLL.getValue()).incrementAndGet()), Boolean.valueOf(z2));
                        return this;
                    }
                }))) != null) {
                    interfaceC1664506fT = interfaceC1664506fTPutIfAbsent;
                }
                return interfaceC1664506fT;
            }
            return new InterfaceC1664506fT() { // from class: X.0Z3b
                public final C01GW LIZ = C452501pT.LIZIZ(new C1093004Pg());
                public final C01GW LIZIZ = C452501pT.LIZIZ(new C1093104Ph());
                public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
                public final C01GW LIZLLL = C452501pT.LIZIZ(new C893440Z3e());

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LIZJ(String str) {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap2;
                    AtomicBoolean atomicBoolean;
                    C893420Z3c c893420Z3c = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
                    if (c893420Z3c != null && (atomicBoolean = c893420Z3c.LIZJ) != null) {
                        atomicBoolean.compareAndSet(false, true);
                    }
                    C893420Z3c c893420Z3c2 = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
                    if (c893420Z3c2 != null && (concurrentHashMap2 = c893420Z3c2.LIZIZ) != null) {
                        concurrentHashMap2.clear();
                    }
                    return this;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LIZLLL(String str) {
                    C893430Z3d c893430Z3d;
                    Map mapLJIIIIZZ;
                    if (LJII(str) || (c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str)) == null || c893430Z3d.LIZJ.get()) {
                        return this;
                    }
                    int size = c893430Z3d.LIZIZ.size();
                    ConcurrentHashMap<String, Boolean> concurrentHashMap2 = c893430Z3d.LIZIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Boolean> entry : concurrentHashMap2.entrySet()) {
                        if (entry.getValue().booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    int size2 = linkedHashMap.size();
                    if (size != 0 && (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("resource_scene", c893430Z3d.LIZ), new Pair("load_count", String.valueOf(size)), new Pair("use_count", String.valueOf(size2)), new Pair("rate", String.valueOf(size2 / size)))) != null) {
                        C0I0B.LJFF.LIZIZ();
                        C20684815ws.LJIILLIIL("dm_resource_aggregated_use_rate", mapLJIIIIZZ);
                        return this;
                    }
                    return this;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LJ(String str) {
                    C893420Z3c c893420Z3c;
                    Map mapLJIIIIZZ;
                    if (LJII(str) || (c893420Z3c = (C893420Z3c) ((ConcurrentHashMap) this.LIZ.getValue()).get(str)) == null || c893420Z3c.LIZJ.get()) {
                        return this;
                    }
                    int size = c893420Z3c.LIZIZ.size();
                    ConcurrentHashMap<String, Boolean> concurrentHashMap2 = c893420Z3c.LIZIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Boolean> entry : concurrentHashMap2.entrySet()) {
                        if (entry.getValue().booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    int size2 = linkedHashMap.size();
                    if (size != 0 && (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("resource_scene", c893420Z3c.LIZ), new Pair("get_count", String.valueOf(size)), new Pair("hit_count", String.valueOf(size2)), new Pair("rate", String.valueOf(size2 / size)))) != null) {
                        C0I0B.LJFF.LIZIZ();
                        C20684815ws.LJIILLIIL("dm_resource_aggregated_hit_rate", mapLJIIIIZZ);
                        return this;
                    }
                    return this;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LJFF(String str) {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap2;
                    AtomicBoolean atomicBoolean;
                    C893430Z3d c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
                    if (c893430Z3d != null && (atomicBoolean = c893430Z3d.LIZJ) != null) {
                        atomicBoolean.compareAndSet(false, true);
                    }
                    C893430Z3d c893430Z3d2 = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
                    if (c893430Z3d2 != null && (concurrentHashMap2 = c893430Z3d2.LIZIZ) != null) {
                        concurrentHashMap2.clear();
                    }
                    return this;
                }

                public final boolean LJII(String str) {
                    double dDoubleValue;
                    Map<String, Double> map;
                    Double d;
                    Boolean bool = this.LIZJ.get(str);
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    C0Z3X c0z3x = C0Z3X.LIZ;
                    DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData = C1844007Kc.LIZ;
                    DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData2 = C1844007Kc.LIZ;
                    if (dMResourceSampleRateSettingsData2 != null && (map = dMResourceSampleRateSettingsData2.aggregateSampleData) != null && (d = map.get(str)) != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    boolean z2 = !c0z3x.LIZ(dDoubleValue);
                    this.LIZJ.put(str, Boolean.valueOf(z2));
                    return z2;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LIZ(String str, String str2) {
                    C893430Z3d c893430Z3d;
                    Boolean bool;
                    if (str2 != null && !LJII(str) && (c893430Z3d = (C893430Z3d) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str)) != null && !c893430Z3d.LIZJ.get() && (bool = c893430Z3d.LIZIZ.get(str2)) != null) {
                        bool.booleanValue();
                        c893430Z3d.LIZIZ.put(str2, Boolean.TRUE);
                    }
                    return this;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LJI(String str, String str2) {
                    Object objPutIfAbsent;
                    if (str2 == null || LJII(str)) {
                        return this;
                    }
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZIZ.getValue();
                    Object c893430Z3d = concurrentHashMap2.get(str);
                    if (c893430Z3d == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c893430Z3d = new C893430Z3d(str)))) != null) {
                        c893430Z3d = objPutIfAbsent;
                    }
                    C893430Z3d c893430Z3d2 = (C893430Z3d) c893430Z3d;
                    if (c893430Z3d2.LIZJ.get()) {
                        return this;
                    }
                    c893430Z3d2.LIZIZ.putIfAbsent(str2, Boolean.FALSE);
                    return this;
                }

                @Override // X.InterfaceC1664506fT
                public final InterfaceC1664506fT LIZIZ(String str, String str2, C0Z38 c0z38, boolean z2) {
                    Object objPutIfAbsent;
                    if (LJII(str)) {
                        return this;
                    }
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZ.getValue();
                    Object c893420Z3c = concurrentHashMap2.get(str);
                    if (c893420Z3c == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c893420Z3c = new C893420Z3c(str)))) != null) {
                        c893420Z3c = objPutIfAbsent;
                    }
                    C893420Z3c c893420Z3c2 = (C893420Z3c) c893420Z3c;
                    if (c893420Z3c2.LIZJ.get()) {
                        return this;
                    }
                    int i2 = C0Z39.LIZ[c0z38.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ConcurrentHashMap<String, Boolean> concurrentHashMap3 = c893420Z3c2.LIZIZ;
                            if (str2 == null) {
                                return this;
                            }
                            concurrentHashMap3.putIfAbsent(str2, Boolean.valueOf(z2));
                            return this;
                        }
                        throw new C1954807lC();
                    }
                    c893420Z3c2.LIZIZ.put(String.valueOf(((AtomicLong) this.LIZLLL.getValue()).incrementAndGet()), Boolean.valueOf(z2));
                    return this;
                }
            };
        }
        return new InterfaceC1664506fT() { // from class: X.0Z3Z
            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LIZ(String str, String str2) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LIZIZ(String str, String str2, C0Z38 c0z38, boolean z2) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LIZJ(String str) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LIZLLL(String str) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LJ(String str) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LJFF(String str) {
                return this;
            }

            @Override // X.InterfaceC1664506fT
            public final InterfaceC1664506fT LJI(String str, String str2) {
                return this;
            }
        };
    }
}
