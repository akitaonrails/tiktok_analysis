package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VWU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VWU(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        C0VWW.LJFF(str, new C0VWY("metric_type_latency_specific", str));
        return Unit.LIZ;
    }
}
