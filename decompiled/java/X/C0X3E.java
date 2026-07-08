package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X3E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X3E extends C09AY implements Function0<Boolean> {
    public C0X3E() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C0X3B.LIZ.getValue()).intValue() & 1) != 0);
    }
}
