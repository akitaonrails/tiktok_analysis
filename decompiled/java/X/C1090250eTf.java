package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090250eTf extends C09AY implements Function1<Double, Unit> {
    public C1090250eTf() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpu: ");
        sbLIZ.append(dDoubleValue);
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
