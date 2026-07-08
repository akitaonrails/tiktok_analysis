package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07M3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07M3 extends C09AY implements Function0<Boolean> {
    public C07M3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iLIZ = C07M1.LIZ();
        C07M5.LIZ.getClass();
        int i = C07M5.LIZIZ;
        return Boolean.valueOf((iLIZ & i) == i);
    }
}
