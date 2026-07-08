package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407880mjy extends C09AY implements Function0<Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407880mjy(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadFont cost ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
