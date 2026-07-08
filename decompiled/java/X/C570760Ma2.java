package X;

import Y.AObjectS389S0100000_14;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ma2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570760Ma2<TTaskResult, TContinuationResult> implements InterfaceC2385309Wh {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C19EG LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;

    public C570760Ma2(long j, C19EG c19eg, AObjectS389S0100000_14 aObjectS389S0100000_14) {
        this.LIZ = j;
        this.LIZIZ = c19eg;
        this.LIZJ = aObjectS389S0100000_14;
    }

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        C1C7U.LIZ("DraftToEdit@dfa4.prepareEffects$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublish finish prepareEffectPlatform, cost: ");
        sbLIZ.append(System.currentTimeMillis() - this.LIZ);
        sbLIZ.append("ms.");
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C570750Ma1 c570750Ma1 = C570750Ma1.LIZ;
        C19EG c19eg = this.LIZIZ;
        c570750Ma1.getClass();
        C570750Ma1.LIZ(c19eg);
        this.LIZJ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftToEdit@dfa4.prepareEffects$2");
        return unit;
    }
}
