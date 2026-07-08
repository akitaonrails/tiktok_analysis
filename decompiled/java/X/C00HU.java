package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00HU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HU extends C09AY implements Function1<Double, Boolean> {
    public final /* synthetic */ double LL = 2.0d;
    public final /* synthetic */ double LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00HU(double d) {
        super(1);
        this.LLILLJJLI = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Double d) {
        boolean z;
        double dDoubleValue = d.doubleValue();
        double d2 = this.LL;
        if (dDoubleValue > d2 && dDoubleValue < this.LLILLJJLI - d2) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
