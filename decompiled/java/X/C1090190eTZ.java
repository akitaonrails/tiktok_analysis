package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090190eTZ extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ InterfaceC1100800ekg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090190eTZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        super(1);
        this.LL = interfaceC1100800ekg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("memory: JVM occupy: ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(", max: ");
        sbLIZ.append(this.LL.LJIIJ().LIZ());
        sbLIZ.append(", getJVMOccupyRate: ");
        sbLIZ.append(this.LL.LJIIJ().LJFF());
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
