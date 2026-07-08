package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.074Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C074Y extends C09AY implements Function0<Boolean> {
    public C074Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C074V.LIZ.getClass();
        return Boolean.valueOf((((Number) C074V.LIZIZ.getValue()).intValue() & 1) == 1);
    }
}
