package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0olT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485690olT extends C09AY implements Function2<Boolean, Object, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485690olT(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Object obj) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z = C15BC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryLoadAvatar success:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(" id:");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("GuestShowdownAnimationConfig", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
