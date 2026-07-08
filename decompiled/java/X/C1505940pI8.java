package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505940pI8 {
    public static long LIZIZ;
    public static Integer LIZLLL;
    public static EnumC1486630omz LJ;
    public static Integer LJFF;
    public static int LJI;
    public static EnumC1486630omz LJII;
    public static int LJIIIIZZ;
    public static volatile C1505990pID LJIIJ;
    public static final C01GW LJIILJJIL;
    public static final C01GW LJIILL;
    public static final C01GW LJIILLIIL;
    public static final C1505940pI8 LIZ = new C1505940pI8();
    public static volatile EnumC1486630omz LIZJ = EnumC1486630omz.LLILLJJLI;
    public static volatile C1504230pFN LJIIIZ = new C1504230pFN("unknown", null);
    public static final ArrayDeque<C1506000pIE> LJIIJJI = new ArrayDeque<>();
    public static final ArrayDeque<C1506000pIE> LJIIL = new ArrayDeque<>();
    public static final ArrayDeque<C1506000pIE> LJIILIIL = new ArrayDeque<>();

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LJIILJJIL = C452501pT.LIZ(enumC452301pR, AFwS214S0000000_25.get$arr$(95));
        LJIILL = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(43));
        LJIILLIIL = C452501pT.LIZ(enumC452301pR, AFwS201S0000000_14.get$arr$(70));
    }

    public static Long LIZJ(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIILIIL((String) obj);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0222, code lost:
    
        if (r5 != 8) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5 != 8) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C877950YcL LIZLLL(X.InterfaceC1506010pIF r28) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1505940pI8.LIZLLL(X.0pIF):X.0YcL");
    }

    public static void LJ(Map map) {
        String str;
        if (!C1506020pIG.LIZ()) {
            return;
        }
        LJIILLIIL.getValue();
        AnonymousClass0955 anonymousClass0955 = (AnonymousClass0955) LJIILJJIL.getValue();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("path");
        Integer numLJIIJJI = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Long lLIZJ = LIZJ(linkedHashMap.get("ttfb_cost"));
        Long lLIZJ2 = LIZJ(linkedHashMap.get("pending_requests"));
        Object obj2 = linkedHashMap.get("network_type");
        if (obj2 instanceof Number) {
            numLJIIJJI = Integer.valueOf(((Number) obj2).intValue());
        } else if (obj2 instanceof String) {
            numLJIIJJI = C2095008Iq.LJIIJJI((String) obj2);
        }
        anonymousClass0955.LJIIIIZZ(new C1505920pI6(jElapsedRealtime, str, numLJIIJJI, lLIZJ2, lLIZJ));
    }

    public static void LJFF(Map map) {
        Long lValueOf;
        String str;
        if (!C1506020pIG.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Long lLIZJ = LIZJ(linkedHashMap.get("net_receive_duration"));
        Long lLIZJ2 = LIZJ(linkedHashMap.get("image_size"));
        Integer numLJIIJJI = null;
        if (lLIZJ != null && lLIZJ2 != null && lLIZJ.longValue() > 0 && lLIZJ2.longValue() > 0) {
            lValueOf = Long.valueOf((lLIZJ2.longValue() * 8) / lLIZJ.longValue());
        } else {
            lValueOf = null;
        }
        LJIILLIIL.getValue();
        AnonymousClass0955 anonymousClass0955 = (AnonymousClass0955) LJIILJJIL.getValue();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = linkedHashMap.get("path");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Long lLIZJ3 = LIZJ(linkedHashMap.get("net_pending_requests"));
        if (lLIZJ3 == null) {
            lLIZJ3 = LIZJ(linkedHashMap.get("pending_requests"));
        }
        Object obj2 = linkedHashMap.get("network_type");
        if (obj2 instanceof Number) {
            numLJIIJJI = Integer.valueOf(((Number) obj2).intValue());
        } else if (obj2 instanceof String) {
            numLJIIJJI = C2095008Iq.LJIIJJI((String) obj2);
        }
        anonymousClass0955.LJIIIIZZ(new C1505930pI7(jElapsedRealtime, str, numLJIIJJI, lLIZJ3, lValueOf));
    }

    public static void LIZIZ(String str, Map map) {
        if (!C1505970pIB.LIZ().enable) {
            return;
        }
        C1504230pFN c1504230pFN = LJIIIZ;
        LIZ.getClass();
        if (str != null && (!a0.LJJJIL(str))) {
            map.put("network_category_v2_start", str);
        }
        map.put("network_category_v2_end", c1504230pFN.LIZ);
        Integer num = c1504230pFN.LIZIZ;
        if (num != null) {
            map.put("connectivity_type", Integer.valueOf(num.intValue()));
        }
        C1505990pID c1505990pID = LJIIJ;
        if (c1505990pID != null) {
            map.put("img_tput_metric", Long.valueOf(c1505990pID.LIZ));
            map.put("api_ttfb_metric", Long.valueOf(c1505990pID.LIZIZ));
            map.put("pending_metric", Long.valueOf(c1505990pID.LIZJ));
        }
    }

    public static void LIZ(ArrayDeque arrayDeque, long j, long j2) {
        arrayDeque.addLast(new C1506000pIE(j, j2));
        while (arrayDeque.size() > 200) {
            arrayDeque.removeFirst();
        }
    }

    public static C1488190opV LJI(ArrayDeque arrayDeque, long j, long j2) {
        long j3 = j - j2;
        while ((!arrayDeque.isEmpty()) && ((C1506000pIE) arrayDeque.getFirst()).LIZ < j3) {
            arrayDeque.removeFirst();
        }
        if (arrayDeque.isEmpty()) {
            return new C1488190opV(0, 0L, -1L, -1L);
        }
        int size = arrayDeque.size();
        long[] jArr = new long[size];
        Iterator it2 = arrayDeque.iterator();
        long j4 = 0;
        int i = 0;
        while (it2.hasNext()) {
            long j5 = ((C1506000pIE) it2.next()).LIZIZ;
            jArr[i] = j5;
            j4 += j5;
            i++;
        }
        if (size > 1) {
            Arrays.sort(jArr);
        }
        long j6 = size;
        long j7 = 100;
        return new C1488190opV(size, j4, j4 / j6, jArr[C13LZ.LJ((int) ((((((long) 50) * j6) + (j7 - 1)) / j7) - 1), 0, size - 1)]);
    }

    public static C877950YcL LJII(String str, EnumC1486630omz enumC1486630omz, C1505960pIA c1505960pIA) {
        Object c098200Yq;
        EnumC1486630omz enumC1486630omz2 = LJ;
        if (enumC1486630omz2 == null) {
            enumC1486630omz2 = LIZJ;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("connectivity_changed_");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZJ = enumC1486630omz;
        Object obj = null;
        LJ = null;
        LJIIIZ = new C1504230pFN(LIZJ.LL, LIZLLL);
        if (enumC1486630omz2 == enumC1486630omz) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = LIZLLL;
        if (num != null) {
            linkedHashMap.put("connectivity_type", Integer.valueOf(num.intValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("previous_category", enumC1486630omz2.LL);
        linkedHashMap2.put("new_category", enumC1486630omz.LL);
        linkedHashMap2.put("change_reason", str);
        LIZ.getClass();
        try {
            c098200Yq = Integer.valueOf(TTNetInit.getEffectiveConnectionType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            linkedHashMap2.put("old_network_score", Integer.valueOf(num2.intValue()));
        }
        LIZ.getClass();
        long j = c1505960pIA.LJFF.LIZIZ;
        long j2 = c1505960pIA.LJI.LIZIZ;
        long j3 = c1505960pIA.LJII.LIZIZ;
        linkedHashMap2.put("img_tput_metric", Long.valueOf(j));
        linkedHashMap2.put("api_ttfb_metric", Long.valueOf(j2));
        linkedHashMap2.put("pending_metric", Long.valueOf(j3));
        return new C877950YcL(linkedHashMap2);
    }
}
