package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0WAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAQ {
    public static final Pattern LIZ = PatternProtector.compile("\\s+");

    public static C0WAR LIZ(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.isEmpty() && !CardStruct.IStatusCode.DEFAULT.equals(lowerCase)) {
            if (LIZIZ(lowerCase, "ext4", "f2fs", "blk", "bio", "jbd", "nfs", "btrfs", "xfs", "iomap", "read_cache")) {
                return C0WAR.DISK_IO;
            }
            if (LIZIZ(lowerCase, "sock", "tcp", "udp", "sk_", "inet", "unix_stream", "unix_dgram")) {
                return C0WAR.NET_IO;
            }
            if (LIZIZ(lowerCase, "ep_poll", "epoll", "do_select", "poll", "select")) {
                return C0WAR.POLL_WAIT;
            }
            if (lowerCase.contains("futex")) {
                return C0WAR.FUTEX_WAIT;
            }
            if (LIZIZ(lowerCase, "nanosleep", "hrtimer", "schedule_timeout")) {
                return C0WAR.SLEEP;
            }
            return C0WAR.OTHER;
        }
        return C0WAR.OTHER;
    }

    public static C0WAJ LIZJ(String str) {
        int iLastIndexOf;
        Long lLIZLLL;
        String[] strArrSplit = str.split("\n", -1);
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        boolean z = false;
        for (String str2 : strArrSplit) {
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf >= 0) {
                String strTrim = str2.substring(0, iIndexOf).trim();
                Long lLIZLLL2 = LIZLLL(str2.substring(iIndexOf + 1));
                if (lLIZLLL2 != null) {
                    if (strTrim.contains("iowait_sum")) {
                        jLongValue2 = lLIZLLL2.longValue();
                    } else if (strTrim.contains("wait_sum") && !strTrim.contains("iowait")) {
                        jLongValue4 = lLIZLLL2.longValue();
                    } else if (strTrim.contains("sum_sleep_runtime")) {
                        jLongValue3 = lLIZLLL2.longValue();
                    } else if (strTrim.contains("sum_exec_runtime")) {
                        jLongValue = lLIZLLL2.longValue();
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            String[] strArrSplit2 = str.split("\n", -1);
            int length = strArrSplit2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = strArrSplit2[i];
                if (str3.contains("sum_exec_runtime") && (iLastIndexOf = str3.lastIndexOf(58)) >= 0 && (lLIZLLL = LIZLLL(str3.substring(iLastIndexOf + 1))) != null) {
                    jLongValue = lLIZLLL.longValue();
                    z = true;
                    break;
                }
                i++;
            }
        }
        return new C0WAJ(jLongValue, jLongValue2, jLongValue3, jLongValue4, z);
    }

    public static Long LIZLLL(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        String str2 = LIZ.split(strTrim)[0];
        if (str2.indexOf(46) >= 0) {
            try {
                double d = CastDoubleProtector.parseDouble(str2);
                if (Double.isNaN(d) || Double.isInfinite(d)) {
                    return null;
                }
                return Long.valueOf(Math.round(d * 1000000.0d));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return Long.valueOf(CastLongProtector.parseLong(str2));
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static boolean LIZIZ(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
