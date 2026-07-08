package X;

import com.bytedance.otis.resource.cpu.CpuNative;
import com.bytedance.otis.resource.cpu.OtisCPUTime;
import com.bytedance.otis.resource.util.EnsureLoad;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798360VTm {
    public static Map<Integer, Long> LJII;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public int[] LIZLLL;
    public final boolean LJ;
    public OtisCPUTime LJFF;
    public final C798350VTl LJI;

    public C798360VTm() {
        this(false, null, 31);
    }

    public final void LIZ() {
        Map<Integer, Map<Integer, Long>> threadCpuPolicyMap;
        Map<Integer, Long> threadCpuMap;
        Map<Integer, Map<Long, Long>> map;
        Long l;
        Map<Integer, Map<Long, Long>> devCpuFreqMap;
        int[] iArr;
        EnsureLoad.LIZ.getClass();
        if (EnsureLoad.LIZIZ) {
            if (this.LIZ || !((iArr = this.LIZLLL) == null || iArr.length == 0)) {
                C798350VTl c798350VTl = this.LJI;
                c798350VTl.LIZ = 0.0d;
                c798350VTl.LIZIZ = 0.0d;
                c798350VTl.LIZJ = 0.0d;
                c798350VTl.LIZLLL = 0.0d;
                c798350VTl.LJ = 0L;
                Map<Integer, Map<Long, Long>> map2 = c798350VTl.LJFF;
                if (map2 != null) {
                    map2.clear();
                }
                c798350VTl.LJI = 0L;
                c798350VTl.LJII = 0L;
                Map<Integer, Long> map3 = c798350VTl.LJIIIIZZ;
                if (map3 != null) {
                    map3.clear();
                }
                Map<Integer, Map<Integer, Long>> map4 = c798350VTl.LJIIIZ;
                if (map4 != null) {
                    map4.clear();
                }
                boolean z = this.LIZ;
                boolean z2 = this.LJ;
                int[] iArr2 = this.LIZLLL;
                boolean z3 = this.LIZIZ;
                CpuNative cpuNative = CpuNative.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                OtisCPUTime otisCPUTimeDumpOtisCpuTime = CpuNative.dumpOtisCpuTime(z, z2, z, iArr2, z3, z3);
                otisCPUTimeDumpOtisCpuTime.setRefreshTime(jCurrentTimeMillis);
                OtisCPUTime otisCPUTime = this.LJFF;
                if (otisCPUTime != null) {
                    this.LJI.LJII = System.currentTimeMillis() - otisCPUTime.getRefreshTime();
                    long procCpu = otisCPUTimeDumpOtisCpuTime.getProcCpu() - otisCPUTime.getProcCpu();
                    if (procCpu > 0) {
                        C798350VTl c798350VTl2 = this.LJI;
                        c798350VTl2.LJI = procCpu;
                        c798350VTl2.LIZIZ = procCpu / c798350VTl2.LJII;
                        long devCpu = otisCPUTimeDumpOtisCpuTime.getDevCpu() - otisCPUTime.getDevCpu();
                        if (devCpu > 0) {
                            C798350VTl c798350VTl3 = this.LJI;
                            c798350VTl3.LJ = devCpu;
                            c798350VTl3.LIZ = c798350VTl3.LJI / devCpu;
                            long devIdle = otisCPUTimeDumpOtisCpuTime.getDevIdle() - otisCPUTime.getDevIdle();
                            if (1 <= devIdle && devIdle <= devCpu) {
                                C798350VTl c798350VTl4 = this.LJI;
                                c798350VTl4.getClass();
                                c798350VTl4.LIZLLL = ((double) 1) - (devIdle / c798350VTl4.LJ);
                            }
                        }
                    }
                    Map<Integer, Map<Long, Long>> devCpuFreqMap2 = otisCPUTimeDumpOtisCpuTime.getDevCpuFreqMap();
                    if (devCpuFreqMap2 != null && (devCpuFreqMap = otisCPUTime.getDevCpuFreqMap()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<Integer, Map<Long, Long>> entry : devCpuFreqMap2.entrySet()) {
                            int iIntValue = entry.getKey().intValue();
                            Map<Long, Long> value = entry.getValue();
                            Map<Long, Long> map5 = devCpuFreqMap.get(Integer.valueOf(iIntValue));
                            if (map5 != null) {
                                Integer numValueOf = Integer.valueOf(iIntValue);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry<Long, Long> entry2 : value.entrySet()) {
                                    long jLongValue = entry2.getKey().longValue();
                                    long jLongValue2 = entry2.getValue().longValue();
                                    Long l2 = map5.get(Long.valueOf(jLongValue));
                                    if (l2 != null) {
                                        linkedHashMap2.put(Long.valueOf(jLongValue), Long.valueOf(jLongValue2 - l2.longValue()));
                                    }
                                }
                                linkedHashMap.put(numValueOf, linkedHashMap2);
                            }
                        }
                        this.LJI.LJFF = linkedHashMap;
                    }
                    if (this.LIZJ && (map = this.LJI.LJFF) != null) {
                        if (LJII == null) {
                            synchronized (new C2217381BqS() { // from class: X.0X0G
                                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                public final Object get(Object obj) {
                                    return obj.getClass();
                                }
                            }) {
                                try {
                                    if (LJII == null) {
                                        LJII = new LinkedHashMap();
                                        Map<Integer, Integer> mapLIZ = CpuNative.LIZ.LIZ();
                                        if (mapLIZ != null) {
                                            for (Map.Entry<Integer, Integer> entry3 : mapLIZ.entrySet()) {
                                                int iIntValue2 = entry3.getKey().intValue();
                                                int iIntValue3 = entry3.getValue().intValue();
                                                Map<Long, Long> map6 = map.get(Integer.valueOf(iIntValue2));
                                                if (map6 != null) {
                                                    Iterator<T> it2 = map6.entrySet().iterator();
                                                    Object next = null;
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (it2.hasNext()) {
                                                            long jLongValue3 = ((Number) ((Map.Entry) next).getKey()).longValue();
                                                            do {
                                                                Object next2 = it2.next();
                                                                long jLongValue4 = ((Number) ((Map.Entry) next2).getKey()).longValue();
                                                                if (jLongValue3 < jLongValue4) {
                                                                    next = next2;
                                                                    jLongValue3 = jLongValue4;
                                                                }
                                                            } while (it2.hasNext());
                                                        }
                                                    }
                                                    Map.Entry entry4 = (Map.Entry) next;
                                                    if (entry4 != null && (l = (Long) entry4.getKey()) != null) {
                                                        LJII.put(Integer.valueOf(iIntValue2), Long.valueOf(((long) iIntValue3) * l.longValue()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        double d = 0.0d;
                        for (Map.Entry<Integer, Map<Long, Long>> entry5 : map.entrySet()) {
                            int iIntValue4 = entry5.getKey().intValue();
                            Map<Long, Long> value2 = entry5.getValue();
                            Long l3 = (Long) ((LinkedHashMap) LJII).get(Integer.valueOf(iIntValue4));
                            if (l3 != null) {
                                long jLongValue5 = l3.longValue();
                                long jLongValue6 = 0;
                                for (Map.Entry<Long, Long> entry6 : value2.entrySet()) {
                                    jLongValue6 += entry6.getKey().longValue() * entry6.getValue().longValue();
                                }
                                double d2 = jLongValue6 / (jLongValue5 * this.LJI.LJII);
                                if (d2 > 1.0d) {
                                    d2 = 1.0d;
                                }
                                d += d2;
                            }
                        }
                        double size = d / ((double) map.size());
                        C798350VTl c798350VTl5 = this.LJI;
                        c798350VTl5.LIZJ = c798350VTl5.LIZ * size;
                    }
                    Map<Integer, Long> threadCpuMap2 = otisCPUTimeDumpOtisCpuTime.getThreadCpuMap();
                    if (threadCpuMap2 != null && (threadCpuMap = otisCPUTime.getThreadCpuMap()) != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry<Integer, Long> entry7 : threadCpuMap2.entrySet()) {
                            int iIntValue5 = entry7.getKey().intValue();
                            long jLongValue7 = entry7.getValue().longValue();
                            Long l4 = threadCpuMap.get(Integer.valueOf(iIntValue5));
                            if (l4 != null) {
                                long jLongValue8 = jLongValue7 - l4.longValue();
                                if (jLongValue8 >= 0) {
                                    linkedHashMap3.put(Integer.valueOf(iIntValue5), Long.valueOf(jLongValue8));
                                }
                            }
                        }
                        this.LJI.LJIIIIZZ = linkedHashMap3;
                    }
                    Map<Integer, Map<Integer, Long>> threadCpuPolicyMap2 = otisCPUTimeDumpOtisCpuTime.getThreadCpuPolicyMap();
                    if (threadCpuPolicyMap2 != null && (threadCpuPolicyMap = otisCPUTime.getThreadCpuPolicyMap()) != null) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry<Integer, Map<Integer, Long>> entry8 : threadCpuPolicyMap2.entrySet()) {
                            int iIntValue6 = entry8.getKey().intValue();
                            Map<Integer, Long> value3 = entry8.getValue();
                            Map<Integer, Long> map7 = threadCpuPolicyMap.get(Integer.valueOf(iIntValue6));
                            if (map7 != null) {
                                Integer numValueOf2 = Integer.valueOf(iIntValue6);
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                for (Map.Entry<Integer, Long> entry9 : value3.entrySet()) {
                                    int iIntValue7 = entry9.getKey().intValue();
                                    long jLongValue9 = entry9.getValue().longValue();
                                    Long l5 = map7.get(Integer.valueOf(iIntValue7));
                                    if (l5 != null) {
                                        linkedHashMap5.put(Integer.valueOf(iIntValue7), Long.valueOf(jLongValue9 - l5.longValue()));
                                    }
                                }
                                linkedHashMap4.put(numValueOf2, linkedHashMap5);
                            }
                        }
                        this.LJI.LJIIIZ = linkedHashMap4;
                    }
                }
                this.LJFF = otisCPUTimeDumpOtisCpuTime;
            }
        }
    }

    public /* synthetic */ C798360VTm(boolean z, int[] iArr, int i) {
        this((i & 1) != 0 ? true : z, false, false, (i & 8) != 0 ? null : iArr, false);
    }

    public C798360VTm(boolean z, boolean z2, boolean z3, int[] iArr, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = iArr;
        this.LJ = z4;
        this.LJI = new C798350VTl(0);
    }
}
