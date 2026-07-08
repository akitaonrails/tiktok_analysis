package X;

import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19282010c6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, 1);
        final long jAbs = Math.abs(calendar.getTimeInMillis() - j);
        C19282310c9.LIZIZ("DelayTask", new Function0() { // from class: X.0NPD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long j2 = jAbs;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create task, delay ");
                sbLIZ.append(j2);
                sbLIZ.append(" ms");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C19281910c5(jAbs, null), 3);
    }
}
