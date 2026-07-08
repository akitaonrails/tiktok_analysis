package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090220eTc extends C09AY implements Function1<Integer, Unit> {
    public C1090220eTc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network quality: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
