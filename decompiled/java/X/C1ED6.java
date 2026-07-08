package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ED6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ED6 extends C09AY implements Function0<Boolean> {
    public C1ED6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1ED8.LIZ.getClass();
        return Boolean.valueOf((C1ED8.LIZ().featureFlag & 1) != 0);
    }
}
