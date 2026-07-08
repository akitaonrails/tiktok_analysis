package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0opx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488470opx implements InterfaceC1488400opq {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final Map<String, InterfaceC332330D1b> LIZ;
    public final Map<Object, Object> LIZIZ;
    public C1488430opt LIZJ;
    public C1488420ops LIZLLL;
    public C1488450opv LJ;
    public C1488460opw LJFF;
    public C1488480opy LJI;
    public C1488500oq0 LJII;
    public C1488510oq1 LJIIIIZZ;
    public C1488490opz LJIIIZ;
    public C826670Wbp LJIIJ;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0D1b, X.0ops] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0D1b, X.0opv] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0D1b, X.0oq1] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0D1b, X.0opz] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0D1b, X.0oq0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0D1b, X.0Wbp] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0D1b, X.0opy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0D1b, X.0opw] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0D1b, X.0opt] */
    @Override // X.InterfaceC1488400opq
    public final InterfaceC332330D1b LIZ(String str) {
        switch (str.hashCode()) {
            case -1733354757:
                if (str.equals("hoursWithoutDayUntil")) {
                    C1488480opy c1488480opy = this.LJI;
                    if (c1488480opy != null) {
                        return c1488480opy;
                    }
                    ?? r0 = new InterfaceC332330D1b() { // from class: X.0opy
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(2, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            boolean zLIZ = C1337850kv1.LIZ(C13LP.LJJJLZIJ(1, list));
                            int iLJ = C1337850kv1.LJ(2, C13LP.LJJJLZIJ(2, list));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            if (jLJII2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            long j = jLJII2 / 3600000;
                            if (zLIZ && jLJII2 % 3600000 > 0) {
                                j++;
                            }
                            return C788310Uw9.LIZ(iLJ, j);
                        }
                    };
                    this.LJI = r0;
                    return r0;
                }
                break;
            case -1484286466:
                if (str.equals("__i18n")) {
                    C826670Wbp c826670Wbp = this.LJIIJ;
                    if (c826670Wbp != null) {
                        return c826670Wbp;
                    }
                    ?? r02 = new InterfaceC332330D1b() { // from class: X.0Wbp
                        /* JADX WARN: Removed duplicated region for block: B:173:0x0265  */
                        /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
                        /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
                        @Override // X.InterfaceC332330D1b
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object LIZ(X.InterfaceC1488400opq r17, java.util.List<? extends java.lang.Object> r18) {
                            /*
                                Method dump skipped, instruction units count: 626
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C826670Wbp.LIZ(X.0opq, java.util.List):java.lang.Object");
                        }
                    };
                    this.LJIIJ = r02;
                    return r02;
                }
                break;
            case -851270209:
                if (str.equals("minutesUntil")) {
                    C1488500oq0 c1488500oq0 = this.LJII;
                    if (c1488500oq0 != null) {
                        return c1488500oq0;
                    }
                    ?? r03 = new InterfaceC332330D1b() { // from class: X.0oq0
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(2, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            boolean zLIZ = C1337850kv1.LIZ(C13LP.LJJJLZIJ(1, list));
                            int iLJ = C1337850kv1.LJ(2, C13LP.LJJJLZIJ(2, list));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            if (jLJII2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            long j = (jLJII2 % 3600000) / 60000;
                            if (zLIZ && jLJII2 % 60000 > 0) {
                                j++;
                            }
                            return C788310Uw9.LIZ(iLJ, j);
                        }
                    };
                    this.LJII = r03;
                    return r03;
                }
                break;
            case -302968724:
                if (str.equals("millisecondsUntil")) {
                    C1488490opz c1488490opz = this.LJIIIZ;
                    if (c1488490opz != null) {
                        return c1488490opz;
                    }
                    ?? r04 = new InterfaceC332330D1b() { // from class: X.0opz
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(1, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            int iLJ = C1337850kv1.LJ(0, C13LP.LJJJLZIJ(1, list));
                            if (iLJ <= 0 || iLJ > 3) {
                                iLJ = 1;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = C1337850kv1.LJII(0L, objLIZIZ);
                            long j = LSPassThroughRecordSizeConfig.DEFAULT;
                            long j2 = jLJII - (jCurrentTimeMillis - (jLJII2 * j));
                            if (j2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            if (iLJ != 1) {
                                if (iLJ != 2) {
                                    return C788310Uw9.LIZ(iLJ, j2 % j);
                                }
                                return C788310Uw9.LIZ(iLJ, (j2 % j) / ((long) 10));
                            }
                            return String.valueOf((j2 % j) / ((long) 100));
                        }
                    };
                    this.LJIIIZ = r04;
                    return r04;
                }
                break;
            case 183106591:
                if (str.equals("secondsUntil")) {
                    C1488510oq1 c1488510oq1 = this.LJIIIIZZ;
                    if (c1488510oq1 != null) {
                        return c1488510oq1;
                    }
                    ?? r05 = new InterfaceC332330D1b() { // from class: X.0oq1
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(2, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            int iLJ = C1337850kv1.LJ(2, C13LP.LJJJLZIJ(2, list));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            if (jLJII2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            return C788310Uw9.LIZ(iLJ, (jLJII2 % 60000) / 1000);
                        }
                    };
                    this.LJIIIIZZ = r05;
                    return r05;
                }
                break;
            case 285097287:
                if (str.equals("daysUntil")) {
                    C1488450opv c1488450opv = this.LJ;
                    if (c1488450opv != null) {
                        return c1488450opv;
                    }
                    ?? r06 = new InterfaceC332330D1b() { // from class: X.0opv
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(0, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            boolean zLIZ = C1337850kv1.LIZ(C13LP.LJJJLZIJ(1, list));
                            int iLJ = C1337850kv1.LJ(0, C13LP.LJJJLZIJ(2, list));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            if (jLJII2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            long j = jLJII2 / 86400000;
                            if (zLIZ && jLJII2 % 86400000 > 0) {
                                j++;
                            }
                            return C788310Uw9.LIZ(iLJ, j);
                        }
                    };
                    this.LJ = r06;
                    return r06;
                }
                break;
            case 460098019:
                if (str.equals("remainingTime")) {
                    C1488420ops c1488420ops = this.LIZLLL;
                    if (c1488420ops != null) {
                        return c1488420ops;
                    }
                    ?? r07 = new InterfaceC332330D1b() { // from class: X.0ops
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return 0L;
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            return Long.valueOf(jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                        }
                    };
                    this.LIZLLL = r07;
                    return r07;
                }
                break;
            case 1126050093:
                if (str.equals("curTime")) {
                    C1488430opt c1488430opt = this.LIZJ;
                    if (c1488430opt != null) {
                        return c1488430opt;
                    }
                    ?? r08 = new InterfaceC332330D1b() { // from class: X.0opt
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            Object objLIZIZ;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            return Long.valueOf(jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                        }
                    };
                    this.LIZJ = r08;
                    return r08;
                }
                break;
            case 1494276495:
                if (str.equals("hoursUntil")) {
                    C1488460opw c1488460opw = this.LJFF;
                    if (c1488460opw != null) {
                        return c1488460opw;
                    }
                    ?? r09 = new InterfaceC332330D1b() { // from class: X.0opw
                        @Override // X.InterfaceC332330D1b
                        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                            boolean z;
                            Object objLIZIZ;
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return C788310Uw9.LIZ(2, 0L);
                            }
                            long jLJII = C1337850kv1.LJII(0L, ListProtector.get(list, 0));
                            boolean zLIZ = C1337850kv1.LIZ(C13LP.LJJJLZIJ(1, list));
                            int iLJ = C1337850kv1.LJ(2, C13LP.LJJJLZIJ(2, list));
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (interfaceC1488400opq != null) {
                                objLIZIZ = interfaceC1488400opq.LIZIZ("myna_server_time");
                            } else {
                                objLIZIZ = null;
                            }
                            long jLJII2 = jLJII - (jCurrentTimeMillis - (C1337850kv1.LJII(0L, objLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            if (jLJII2 <= 0) {
                                return C788310Uw9.LIZ(iLJ, 0L);
                            }
                            long j = (jLJII2 % 86400000) / 3600000;
                            if (zLIZ && jLJII2 % 3600000 > 0) {
                                j++;
                            }
                            return C788310Uw9.LIZ(iLJ, j);
                        }
                    };
                    this.LJFF = r09;
                    return r09;
                }
                break;
        }
        Map<String, InterfaceC332330D1b> map = this.LIZ;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // X.InterfaceC1488400opq
    public final Object LIZIZ(Object obj) {
        return this.LIZIZ.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1488470opx(Map<String, ? extends InterfaceC332330D1b> map, Map<Object, ? extends Object> map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
    }
}
