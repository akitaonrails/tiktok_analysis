package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256011DRv extends C09AY implements Function0<Boolean> {
    public C2256011DRv() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C1DS1.LIZJ().fypFpsMonitorJankPercentOpen || C1DS1.LIZJ().fypFpsMonitorBigJankOpen);
    }
}
