package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0efV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097590efV extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C1097650efb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097590efV(C1097650efb c1097650efb) {
        super(1);
        this.LL = c1097650efb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        C1097650efb c1097650efb = this.LL;
        int iLIZ = C512240K7a.LIZ(th2);
        String message = th2.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        c1097650efb.getClass();
        C1097450efH.LIZ(c1097650efb, false, Integer.valueOf(iLIZ), message, System.currentTimeMillis() - c1097650efb.LIZLLL);
        return Unit.LIZ;
    }
}
