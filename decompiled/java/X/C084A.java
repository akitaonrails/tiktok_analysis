package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.084A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C084A extends C09AY implements Function0<Long> {
    public C084A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
