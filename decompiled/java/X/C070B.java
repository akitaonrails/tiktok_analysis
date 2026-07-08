package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.070B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C070B extends C09AY implements Function0<Boolean> {
    public C070B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C070C.LIZIZ.getValue()).intValue() & 2) == 2);
    }
}
