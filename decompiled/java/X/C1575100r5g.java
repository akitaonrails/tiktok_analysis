package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS61S0010000_18;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0r5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575100r5g {
    public static final C1575100r5g LIZ = new C1575100r5g();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Portrait");

    public static Set LIZ() {
        Set setLIZLLL;
        int iLJJIZ;
        Long lLJIILIIL;
        int iIntValue;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "offline_feed_user_high_active_time_local", true, false)) {
            C0VUQ c0vuq = C0VUQ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0vuq.getClass();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "offline_feed_local_active_stats_enabled", true, true)) {
                long j = C10ID.LIZJ().getLong("local_high_active_compute_ts", 0L);
                C1575430r6D.LIZ.getClass();
                int i = C1575430r6D.LIZ().localActiveRecomputeIntervalDays;
                if (i < 0) {
                    i = 0;
                }
                long j2 = ((long) i) * 86400000;
                if (j <= 0 || jCurrentTimeMillis - j >= j2) {
                    long jLIZ = C0VUQ.LIZ(jCurrentTimeMillis);
                    long j3 = jLIZ - ((long) 29);
                    int[] iArr = new int[24];
                    int[] iArr2 = new int[24];
                    int i2 = 0;
                    do {
                        String strLIZ = C10ID.LIZ(i2);
                        if (strLIZ.length() != 0 && (iLJJIZ = a0.LJJIZ(strLIZ, '|', 0, false, 6)) > 0 && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ.substring(0, iLJJIZ))) != null) {
                            long jLongValue = lLJIILIIL.longValue();
                            if (jLongValue >= j3 && jLongValue <= jLIZ) {
                                int[] iArrLIZIZ = C0VUQ.LIZIZ(strLIZ.substring(iLJJIZ + 1));
                                int i3 = 0;
                                do {
                                    int i4 = iArrLIZIZ[i3];
                                    if (i4 > 0) {
                                        iArr[i3] = iArr[i3] + 1;
                                        iArr2[i3] = iArr2[i3] + i4;
                                    }
                                    i3++;
                                } while (i3 < 24);
                            }
                        }
                        i2++;
                    } while (i2 < 30);
                    C1575430r6D.LIZ.getClass();
                    int i5 = C1575430r6D.LIZ().localActiveMinDays;
                    if (i5 < 1) {
                        i5 = 1;
                    }
                    int i6 = C1575430r6D.LIZ().localActiveTopN;
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, 24);
                    ArrayList arrayList = new ArrayList();
                    C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                    while (it2.LLILLL) {
                        Object next = it2.next();
                        if (iArr[((Number) next).intValue()] >= i5) {
                            arrayList.add(next);
                        }
                    }
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(C13LP.LJLLLL(new C512301z7(new C512501z9(iArr, 0), iArr2, 0), arrayList), i6), ",", null, null, 0, null, null, 62);
                    C10ID.LIZJ().LIZIZ("local_high_active_result", strLJJLIIIJ);
                    C10ID.LIZJ().LJIIIIZZ("local_high_active_compute_ts", jCurrentTimeMillis);
                    C0VUQ.LIZIZ.LJIIJJI(new C006I(strLJJLIIIJ, i5, i6, jLIZ));
                }
                String string = C10ID.LIZJ().getString("local_high_active_result", "");
                if (string == null) {
                    string = "";
                }
                if (a0.LJJJIL(string)) {
                    setLIZLLL = C08CX.INSTANCE;
                } else {
                    List listLJJLIIIJ = a0.LJJLIIIJ(string, new char[]{','}, false, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listLJJLIIIJ.iterator();
                    while (it3.hasNext()) {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it3.next()).toString());
                        if (numLJIIJJI != null && (iIntValue = numLJIIJJI.intValue()) >= 0 && iIntValue < 24) {
                            arrayList2.add(numLJIIJJI);
                        }
                    }
                    setLIZLLL = C13LP.LLIIJI(arrayList2);
                }
            } else {
                setLIZLLL = C08CX.INSTANCE;
            }
        } else {
            String string2 = C10ID.LIZJ().getString("user_high_active_time", "");
            if (string2 == null) {
                string2 = "";
            }
            setLIZLLL = LIZLLL(string2);
        }
        String string3 = C10ID.LIZJ().getString("region_high_active_time", "");
        Set setLIZLLL2 = LIZLLL(string3 != null ? string3 : "");
        Set setLJIIIZ = C15442062u.LJIIIZ(setLIZLLL, setLIZLLL2);
        LIZIZ.LIZIZ(new AwS262S0300000_18(setLIZLLL, (Set<Integer>) setLIZLLL2, (Set<Integer>) setLJIIIZ, (Set<Integer>) 10));
        return setLJIIIZ;
    }

    public static boolean LIZIZ() {
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "hit_offline_feed_cellular_sensitive_user", true, false);
        LIZIZ.LIZIZ(new AwS61S0010000_18(zLJIIIZ, 8));
        return zLJIIIZ;
    }

    public static boolean LIZJ() {
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "hit_offline_feed_weak_disconnect_net_user", true, false);
        LIZIZ.LIZIZ(new AwS61S0010000_18(zLJIIIZ, 9));
        return zLJIIIZ;
    }

    public static Set LIZLLL(String str) {
        int iIntValue;
        if (a0.LJJJIL(str)) {
            return C08CX.INSTANCE;
        }
        List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
            if (numLJIIJJI != null && (iIntValue = numLJIIJJI.intValue()) >= 0 && iIntValue < 24) {
                arrayList.add(numLJIIJJI);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }
}
