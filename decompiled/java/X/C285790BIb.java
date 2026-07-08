package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C285790BIb extends C09AY implements Function0<Long> {
    public C285790BIb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        C01GW c01gw = C285780BIa.LIZ;
        return Long.valueOf(((Number) c01gw.getValue()).longValue() > 0 ? ((Number) c01gw.getValue()).longValue() : 30000L);
    }
}
