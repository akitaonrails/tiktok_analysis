package X;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0B4A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0B4A extends C09AY implements Function0<Boolean> {
    public C0B4A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        double dNextDouble = new SecureRandom().nextDouble();
        return Boolean.valueOf(!C286850BMd.LIZ() ? dNextDouble > ((Number) C0B48.LIZ.getValue()).doubleValue() : dNextDouble > Math.max(((Number) C0B49.LIZ.getValue()).doubleValue(), ((Number) C0B48.LIZ.getValue()).doubleValue()));
    }
}
