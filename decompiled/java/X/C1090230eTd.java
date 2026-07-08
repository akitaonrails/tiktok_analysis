package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090230eTd extends C09AY implements Function1<Float, Unit> {
    public C1090230eTd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("total qps: ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
