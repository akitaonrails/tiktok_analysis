package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755550vmj extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755550vmj(boolean z, long j) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerBridgeModuleForCard isGlobal ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" cost ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
