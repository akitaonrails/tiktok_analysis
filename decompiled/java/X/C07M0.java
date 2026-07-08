package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07M0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07M0 extends C09AY implements Function0<Boolean> {
    public C07M0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLIZ;
        if (C104100aN.LIZ().isNewUser()) {
            zLIZ = C1848707Lx.LIZ();
        } else {
            int iLIZ = C07M1.LIZ();
            C07M5.LIZ.getClass();
            int i = C07M5.LJ;
            zLIZ = (iLIZ & i) == i;
        }
        return Boolean.valueOf(zLIZ);
    }
}
