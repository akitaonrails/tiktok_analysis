package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N35, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N35 extends C09AY implements Function0<Long> {
    public C0N35() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
