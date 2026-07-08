package X;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701530uNb {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicInteger> LIZLLL = new ConcurrentHashMap<>();
    public static final Object LJ = new Object();
    public static long LJFF;

    public static int LIZ(String str) {
        AtomicInteger atomicInteger;
        if (str != null && (atomicInteger = LIZLLL.get(str)) != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public static long LIZIZ(String str, boolean z) {
        long j;
        long jLongValue;
        if (str != null) {
            long jLongValue2 = 0;
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l = LIZ.get(str);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                j = jCurrentTimeMillis - jLongValue;
            } else {
                j = 0;
            }
            Long l2 = LIZIZ.get(str);
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            return jLongValue2 + j;
        }
        return -1L;
    }

    public static void LIZJ(Lifecycle lifecycle, final String str) {
        if (str != null) {
            LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
            final AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            C1906580ziK.LIZJ().LIZ().LJLLLL(lifecycle, new C09JN() { // from class: X.0uNZ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    long jLongValue;
                    C1C7U.LIZ("TakoMessageMobCollect@3a69.initSessionCreatedAndSubscribeBackground$2$1");
                    C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
                    if (Intrinsics.LJFF(c606810Nr5.LIZ, abstractC1387200mCcLJ)) {
                        if (c606810Nr5.LIZIZ) {
                            String str2 = str;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C1701530uNb.LJFF > 300) {
                                C1701530uNb.LJFF = jCurrentTimeMillis;
                                Long l = C1701530uNb.LIZ.get(str2);
                                long jLongValue2 = 0;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                long j = jCurrentTimeMillis - jLongValue;
                                ConcurrentHashMap<String, Long> concurrentHashMap = C1701530uNb.LIZIZ;
                                Long l2 = concurrentHashMap.get(str2);
                                if (l2 != null) {
                                    jLongValue2 = l2.longValue();
                                }
                                concurrentHashMap.put(str2, Long.valueOf(jLongValue2 + j));
                            }
                        } else {
                            C1701530uNb.LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                    C1C7U.LIZIZ("TakoMessageMobCollect@3a69.initSessionCreatedAndSubscribeBackground$2$1");
                }
            });
        }
    }

    public static String LIZLLL(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
