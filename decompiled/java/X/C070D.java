package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.070D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C070D extends C09AY implements Function0<Long> {
    public C070D() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((Boolean) C070C.LJ.getValue()).booleanValue() ? ((long) ((((Number) C070C.LIZIZ.getValue()).intValue() & 124) >> 2)) * 1000 : 0L);
    }
}
