package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CFR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFR extends C09AY implements Function0<String> {
    public final /* synthetic */ C259800zU<C0CFS> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CFR(C259800zU c259800zU, long j) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current process ");
        sbLIZ.append(this.LL.element.LIZ);
        sbLIZ.append(" tasks, totalCost=");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.LLILLJJLI);
        sbLIZ.append("ms, fromAggregator: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
