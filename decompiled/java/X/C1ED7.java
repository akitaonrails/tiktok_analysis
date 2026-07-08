package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ED7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ED7 extends C09AY implements Function0<Boolean> {
    public C1ED7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1ED8.LIZ.getClass();
        return Boolean.valueOf(((Boolean) C1ED8.LJFF.getValue()).booleanValue() && (C1ED8.LIZ().featureFlag & 64) != 0);
    }
}
