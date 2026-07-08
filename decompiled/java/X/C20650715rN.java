package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20650715rN extends C09AY implements Function0<Long> {
    public C20650715rN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        C20648715r3.LIZ.getClass();
        long jCurrentTimeMillis = C20648715r3.LIZIZ().getLong("first_record_time", 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            C20648715r3.LIZIZ().storeLong("first_record_time", jCurrentTimeMillis);
        }
        return Long.valueOf(jCurrentTimeMillis);
    }
}
