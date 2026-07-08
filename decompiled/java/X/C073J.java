package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.073J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C073J extends C09AY implements Function0<Boolean> {
    public C073J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C073I.LIZ.getClass();
        return Boolean.valueOf((((Number) C073I.LIZIZ.getValue()).intValue() & 1) == 1);
    }
}
