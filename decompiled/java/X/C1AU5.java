package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TryCatchMonitorSetting;
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1AU5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AU5 {
    public static final Random LIZ = new SecureRandom();
    public static final Set<Long> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final AtomicLong LIZLLL = new AtomicLong(0);

    public static void LIZJ() {
        try {
            boolean zBooleanValue = ((Boolean) C1866750yg5.LIZ.getValue()).booleanValue();
            final TryCatchMonitorSetting.Config config = (TryCatchMonitorSetting.Config) TryCatchMonitorSetting.LIZJ.getValue();
            if (zBooleanValue && ((Boolean) C2277581ECu.LJFF.getValue()).booleanValue()) {
                TryCatchGuardChecker.monitor(true, new TryCatchGuardChecker.EnterTryCatchBlockListener() { // from class: X.1AU6
                    @Override // com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.EnterTryCatchBlockListener
                    public final void onCatch(Throwable th) {
                        try {
                            TryCatchMonitorSetting.Config config2 = config;
                            C1AU5.LIZ(th, config2.list, config2.rate);
                            if (((Boolean) C1866750yg5.LIZIZ.getValue()).booleanValue()) {
                                PrintStream printStream = System.err;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("CaughtExceptionBlock ");
                                sbLIZ.append(th.toString());
                                sbLIZ.append("\n");
                                sbLIZ.append(Log.getStackTraceString(th));
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZLLL(double d) {
        if (d <= 0.0d) {
            return false;
        }
        if (d < 1.0d && LIZ.nextDouble() >= d) {
            return false;
        }
        return true;
    }

    public static void LIZ(Throwable th, TryCatchMonitorSetting.TryCatchConfigList tryCatchConfigList, TryCatchMonitorSetting.RateConfig rateConfig) {
        int iHashCode;
        int iHashCode2;
        if (th == null) {
            return;
        }
        if (rateConfig == null) {
            rateConfig = TryCatchMonitorSetting.LIZIZ;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        String name = th.getClass().getName();
        long jHashCode = ((long) name.hashCode()) + 34902897112120507L;
        if (stackTrace != null && stackTrace.length != 0) {
            int iMin = Math.min(8, stackTrace.length);
            for (int i = 0; i < iMin; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    String methodName = stackTraceElement.getMethodName();
                    long j = jHashCode * 31;
                    if (className == null) {
                        iHashCode = 0;
                    } else {
                        iHashCode = className.hashCode();
                    }
                    long j2 = (j + ((long) iHashCode)) * 31;
                    if (methodName == null) {
                        iHashCode2 = 0;
                    } else {
                        iHashCode2 = methodName.hashCode();
                    }
                    jHashCode = j2 + ((long) iHashCode2);
                }
            }
        }
        Set<Long> set = LIZIZ;
        if (!set.contains(Long.valueOf(jHashCode))) {
            if (set.size() >= 5000) {
                int iIncrementAndGet = LIZJ.incrementAndGet();
                long jUptimeMillis = SystemClock.uptimeMillis();
                AtomicLong atomicLong = LIZLLL;
                long j3 = atomicLong.get();
                if ((j3 != 0 && jUptimeMillis - j3 < 600000) || !atomicLong.compareAndSet(j3, jUptimeMillis)) {
                    return;
                }
                try {
                    HashMap map = new HashMap();
                    map.put("max_fp", String.valueOf(5000));
                    map.put("dropped_count", String.valueOf(iIncrementAndGet));
                    C20684815ws.LJIILLIIL("try_catch_drop_event", map);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
            if (!set.add(Long.valueOf(jHashCode))) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            Throwable th3 = th;
            int i2 = 0;
            do {
                if (th3.getMessage() != null) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append(th3.getMessage());
                }
                Throwable cause = th3.getCause();
                if (cause == th3) {
                    break;
                }
                i2++;
                th3 = cause;
                if (cause == null) {
                    break;
                }
            } while (i2 < 8);
            String string = sb.toString();
            String stackTraceString = Log.getStackTraceString(th);
            if (tryCatchConfigList != null && LIZIZ(name, string, stackTraceString, tryCatchConfigList.ignoreList)) {
                return;
            }
            if (tryCatchConfigList != null) {
                if (LIZIZ(name, string, stackTraceString, tryCatchConfigList.highPriorityList)) {
                    if (LIZLLL(rateConfig.highPrioritySamplingRate)) {
                        Npth.reportBizException("TryCatchHighPriorityException", (Throwable) new RuntimeException("TryCatchMonitorReporter", th), "TryCatchMonitorReporter", (Map<String, String>) new HashMap(), true);
                        return;
                    }
                    return;
                } else if (LIZIZ(name, string, stackTraceString, tryCatchConfigList.lowPriorityList)) {
                    if (LIZLLL(rateConfig.lowPrioritySamplingRate)) {
                        Npth.reportBizException("TryCatchLowPriorityException", (Throwable) new RuntimeException("TryCatchMonitorReporter", th), "TryCatchMonitorReporter", (Map<String, String>) new HashMap(), true);
                        return;
                    }
                    return;
                }
            }
            if (LIZLLL(rateConfig.defaultSamplingRate)) {
                Npth.reportBizException("TryCatchException", (Throwable) new RuntimeException("TryCatchMonitorReporter", th), "TryCatchMonitorReporter", (Map<String, String>) new HashMap(), true);
            }
        }
    }

    public static boolean LIZIZ(String str, String str2, String str3, List list) {
        String str4;
        boolean z;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TryCatchMonitorSetting.TryCatchRule tryCatchRule = (TryCatchMonitorSetting.TryCatchRule) it2.next();
                if (tryCatchRule != null && ((str4 = tryCatchRule.exceptionType) == null || str4.length() <= 0 || str4.equals(str))) {
                    String str5 = tryCatchRule.exceptionMessage;
                    if (str5 == null || str5.length() <= 0 || (str2 != null && str2.contains(str5))) {
                        String str6 = tryCatchRule.stackClassName;
                        if (str6 != null && str6.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z || "*".equals(str6) || (str3 != null && str3.contains(str6))) {
                            String str7 = tryCatchRule.stackMethodName;
                            if (str7 == null || str7.length() <= 0 || "*".equals(str7) || (str3 != null && str3.contains(str7))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
