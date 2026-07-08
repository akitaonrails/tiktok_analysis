package X;

import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592690NMl extends C09AY implements InterfaceC1631620sYq<Long, Integer, Long, Unit> {
    public final /* synthetic */ WeakReference<C1310900kDY> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592690NMl(int i, WeakReference weakReference) {
        super(3);
        this.LL = weakReference;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Integer num, Long l2) {
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        long jLongValue2 = l2.longValue();
        C1310900kDY c1310900kDY = this.LL.get();
        if (c1310900kDY != null) {
            c1310900kDY.LIZLLL(this.LLILLJJLI, "timer", C2097608Jq.LJIIIIZZ(new Pair("lynxViewSurvivalDurationSec", Long.valueOf(jLongValue2)), new Pair("timerReportIntervalSec", Long.valueOf(jLongValue)), new Pair("timerTriggerCount", Integer.valueOf(iIntValue))));
        }
        return Unit.LIZ;
    }
}
