package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VWZ(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        if (Intrinsics.LJFF(str, "metric_type_default")) {
            C799020VWa.LIZJ(((InterfaceC799110VWj) C0VWW.LIZIZ.getValue()).LIZ(this.LLILLJJLI));
        } else if (Intrinsics.LJFF(str, "metric_type_latency_common")) {
            C799020VWa.LIZJ(((InterfaceC799110VWj) C0VWW.LIZJ.getValue()).LIZ(this.LLILLJJLI));
        } else {
            C799020VWa.LIZJ(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
