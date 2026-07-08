package X;

import java.util.Calendar;
import java.util.Set;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS13S1000100_28;

/* JADX INFO: renamed from: X.10IG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IG {
    public static final C10IG LIZ = new C10IG();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_S3Trigger");
    public static final Set<EnumC325100Com> LIZJ = C13LQ.LJLIIL(new EnumC325100Com[]{EnumC325100Com.WEAK, EnumC325100Com.NOT_AVAILABLE, EnumC325100Com.FAKE});

    public static void LIZ(String str) {
        long j;
        long j2;
        if (!C0BZR.LIZIZ(3)) {
            return;
        }
        if (C10ID.LJFF() && !C10ID.LIZJ().getBoolean("debug.ignore_frequency", false)) {
            LIZIZ.LJIIJJI(new AwS112S1000000_28(str, 7));
            return;
        }
        C1575100r5g.LIZ.getClass();
        if (!C1575100r5g.LIZJ() && !C1575100r5g.LIZIZ()) {
            LIZIZ.LJIIJJI(new AwS112S1000000_28(str, 8));
            return;
        }
        if (C1575100r5g.LIZ().isEmpty()) {
            LIZIZ.LJIIJJI(new AwS112S1000000_28(str, 9));
            return;
        }
        long j3 = C10ID.LIZJ().getLong("last_foreground_ts", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1575430r6D.LIZ.getClass();
        int i = C1575430r6D.LIZ().strategy3InactiveMinutes;
        if (i < 0) {
            i = 0;
        }
        long j4 = ((long) i) * 60000;
        if (j3 > 0) {
            j = j3 + j4;
        } else {
            j = jCurrentTimeMillis;
        }
        long jMax = Math.max(j, jCurrentTimeMillis);
        Set setLIZ = C1575100r5g.LIZ();
        int i2 = 1;
        long j5 = -1;
        if (!setLIZ.isEmpty()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMax);
            int i3 = 0;
            while (true) {
                if (setLIZ.contains(Integer.valueOf(calendar.get(11)))) {
                    long timeInMillis = calendar.getTimeInMillis();
                    if (timeInMillis != -1) {
                        j5 = timeInMillis - jCurrentTimeMillis;
                        C1575430r6D.LIZ.getClass();
                        int i4 = C1575430r6D.LIZ().strategy3MinCheckIntervalMin;
                        if (i4 >= 1) {
                            i2 = i4;
                        }
                        j2 = ((long) i2) * 60000;
                        if (j5 >= j2) {
                            break;
                        }
                    }
                } else {
                    calendar.add(11, 1);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    i3++;
                    if (i3 >= 24) {
                        break;
                    }
                }
            }
            j2 = j5;
        } else {
            j2 = j5;
        }
        if (j2 < 0) {
            LIZIZ.LJIIJJI(new AwS13S1000100_28(str, j2, 0));
            return;
        }
        C0VQ7.LIZ.getClass();
        C0VQ7.LIZIZ(3, j2, str);
        LIZIZ.LJIIJJI(new AwS13S1000100_28(str, j2, 1));
    }
}
