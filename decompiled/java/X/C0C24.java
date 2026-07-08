package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C24, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C24 extends C09AY implements Function0<Boolean> {
    public C0C24() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C0C25.LIZ.getValue()).intValue() & 1) == 1);
    }
}
