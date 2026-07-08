package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.runnable.SlideRunnableBlockConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19297110eX {
    public static Function0<Long> LIZJ;
    public static final ConcurrentHashMap<String, CountDownLatch> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();

    public static final void LIZLLL(String str) {
        long jLongValue;
        C01GW c01gw = C1867920yhy.LJII;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            ConcurrentHashMap<String, CountDownLatch> concurrentHashMap = LIZ;
            if (concurrentHashMap.size() > ((Number) c01gw.getValue()).intValue()) {
                Iterator it2 = C13LP.LLIIJI(concurrentHashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    CountDownLatch countDownLatchRemove = LIZ.remove(it2.next());
                    if (countDownLatchRemove != null) {
                        countDownLatchRemove.countDown();
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Try to suspend, runnableLockMapSize is ");
                sbLIZ.append(concurrentHashMap.size());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        String name = C786410Ut5.u3().getName();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(name);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LIZ.put(strLIZIZ, countDownLatch);
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZ = C0CME.SCROLL_END;
        c0cm3.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        c0cm3.LIZIZ = true;
        c0cm3.LJI = new AwS112S1000000_28(strLIZIZ, str, 10);
        C312240CLu.LIZ(c0cm3);
        Long l = LIZIZ.get(str);
        if (l != null && l.longValue() != 0) {
            jLongValue = l.longValue();
        } else {
            jLongValue = ((Number) C1867920yhy.LJI.getValue()).longValue();
        }
        try {
            countDownLatch.await(jLongValue, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
    }

    public static boolean LIZ(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(SlideRunnableBlockConfig slideRunnableBlockConfig, String str) {
        long j = slideRunnableBlockConfig.blockRuleTimeout;
        if (j > 0 && str != null && str.length() > 0) {
            LIZIZ.put(str, Long.valueOf(j));
        }
    }

    public static boolean LIZJ(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (((Boolean) C1867920yhy.LIZLLL.getValue()).booleanValue() && str != null && str2 != null) {
            ((Boolean) C1867920yhy.LJ.getValue()).booleanValue();
            for (SlideRunnableBlockConfig slideRunnableBlockConfig : (List) C1867920yhy.LJFF.getValue()) {
                if (((Boolean) slideRunnableBlockConfig.LJ.getValue()).booleanValue()) {
                    if (Intrinsics.LJFF(LJ.get(String.valueOf(slideRunnableBlockConfig.hashCode())), Boolean.TRUE)) {
                        ((Boolean) C1867920yhy.LJ.getValue()).booleanValue();
                    } else if ((!slideRunnableBlockConfig.LIZLLL().isEmpty()) && slideRunnableBlockConfig.LIZIZ().isEmpty() && slideRunnableBlockConfig.LIZ().isEmpty()) {
                        if (Boolean.valueOf(LIZ(str, slideRunnableBlockConfig.LIZLLL())).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZJ().isEmpty()) && slideRunnableBlockConfig.LIZIZ().isEmpty() && slideRunnableBlockConfig.LIZ().isEmpty()) {
                        if (Boolean.valueOf(!LIZ(str, slideRunnableBlockConfig.LIZJ())).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZIZ().isEmpty()) && slideRunnableBlockConfig.LIZLLL().isEmpty() && slideRunnableBlockConfig.LIZJ().isEmpty()) {
                        if (Boolean.valueOf(LIZ(str2, slideRunnableBlockConfig.LIZIZ())).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZ().isEmpty()) && slideRunnableBlockConfig.LIZLLL().isEmpty() && slideRunnableBlockConfig.LIZJ().isEmpty()) {
                        if (Boolean.valueOf(!LIZ(str2, slideRunnableBlockConfig.LIZ())).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZLLL().isEmpty()) && (!slideRunnableBlockConfig.LIZ().isEmpty())) {
                        if (LIZ(str, slideRunnableBlockConfig.LIZLLL()) && !LIZ(str2, slideRunnableBlockConfig.LIZ())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (Boolean.valueOf(z4).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZLLL().isEmpty()) && (!slideRunnableBlockConfig.LIZIZ().isEmpty())) {
                        if (!LIZ(str, slideRunnableBlockConfig.LIZLLL()) && !LIZ(str2, slideRunnableBlockConfig.LIZIZ())) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (Boolean.valueOf(z3).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZJ().isEmpty()) && (!slideRunnableBlockConfig.LIZIZ().isEmpty())) {
                        if (LIZ(str, slideRunnableBlockConfig.LIZJ()) && !LIZ(str2, slideRunnableBlockConfig.LIZIZ())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (Boolean.valueOf(z2).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    } else if ((!slideRunnableBlockConfig.LIZJ().isEmpty()) && (!slideRunnableBlockConfig.LIZ().isEmpty())) {
                        if (!LIZ(str, slideRunnableBlockConfig.LIZJ()) && !LIZ(str2, slideRunnableBlockConfig.LIZ())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Boolean.valueOf(z).booleanValue()) {
                            LIZIZ(slideRunnableBlockConfig, str2);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
