package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261961DgA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261961DgA(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j;
        String str;
        if (C2261941Dg8.LIZIZ) {
            j = C2261941Dg8.LJIILIIL;
            C2261941Dg8.LJIILIIL = 0L;
            str = "background_close_time";
        } else {
            j = C2261941Dg8.LJIIL;
            C2261941Dg8.LJIIL = 0L;
            str = "foreground_close_time";
        }
        if (j != 0) {
            long j2 = this.LL - j;
            C2261941Dg8.LIZ.getClass();
            C2261941Dg8.LJIIL(j2, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[recordStartConnection], eventName = ");
            sbLIZ.append(str);
            sbLIZ.append(", currentTime = ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", startTime = ");
            sbLIZ.append(j);
            sbLIZ.append(", duration = ");
            sbLIZ.append(j2);
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C2261941Dg8.LJIIIIZZ(this.LL, j, str);
        }
        return Unit.LIZ;
    }
}
