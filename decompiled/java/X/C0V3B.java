package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0V3B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3B extends C09AY implements Function0<C0V3D> {
    public C0V3B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0V3D invoke() {
        Integer num = C0VGA.LIZ().logPrefOptFlag;
        return (num == null || (num.intValue() & 4) == 0) ? new C0V3A() : new C0V39();
    }
}
