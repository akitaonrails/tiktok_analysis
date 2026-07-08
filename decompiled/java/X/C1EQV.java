package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EQV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EQV extends C09AY implements Function0<Boolean> {
    public C1EQV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1EQW.LIZ.getClass();
        int iLIZ = C1EQW.LIZ();
        int i = C1EQW.LIZIZ;
        return Boolean.valueOf((iLIZ & i) == i);
    }
}
