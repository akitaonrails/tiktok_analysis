package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KB6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KB6 extends C09AY implements Function1<C512220K6y, Unit> {
    public final /* synthetic */ C0K77 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KB6(C0K77 c0k77) {
        super(1);
        this.LL = c0k77;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512220K6y c512220K6y) {
        C512220K6y c512220K6y2 = c512220K6y;
        C0K77 c0k77 = this.LL;
        if (c0k77 != null) {
            c0k77.LJJII(c512220K6y2);
        }
        return Unit.LIZ;
    }
}
