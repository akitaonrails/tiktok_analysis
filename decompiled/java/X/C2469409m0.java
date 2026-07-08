package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2469409m0 extends C09AY implements Function0<Long> {
    public C2469409m0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII);
    }
}
