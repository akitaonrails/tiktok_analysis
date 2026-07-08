package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07FL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07FL extends C09AY implements Function0<Boolean> {
    public C07FL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C07FM.LIZ.getClass();
        return Boolean.valueOf((((Number) C07FM.LIZIZ.getValue()).intValue() & 1) == 1);
    }
}
