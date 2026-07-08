package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741970T8p extends C09AY implements Function1<Boolean, Unit> {
    public C741970T8p() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gecko_9patch message_right success=");
        sbLIZ.append(zBooleanValue ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
