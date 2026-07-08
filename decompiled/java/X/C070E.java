package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.070E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C070E extends C09AY implements Function0<Boolean> {
    public C070E() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C070C.LIZIZ.getValue()).intValue() & 1) == 1);
    }
}
