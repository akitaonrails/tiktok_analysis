package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ED5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ED5 extends C09AY implements Function0<Long> {
    public C1ED5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        C1ED8.LIZ.getClass();
        return Long.valueOf(((Boolean) C1ED8.LJ.getValue()).booleanValue() ? C1ED8.LIZ().longerScheduleSaveDuration : C1ED8.LIZ().normalScheduleSaveDuration);
    }
}
