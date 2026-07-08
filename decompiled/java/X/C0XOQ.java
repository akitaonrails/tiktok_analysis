package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XOQ extends C09AY implements Function0<Boolean> {
    public C0XOQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C0XOO.LIZ.getClass();
        int iLIZ = C0XOO.LIZ();
        int i = C0XOO.LIZIZ;
        return Boolean.valueOf((iLIZ & i) == i);
    }
}
