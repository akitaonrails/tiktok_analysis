package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.162G, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162G extends C09AY implements Function0<Long> {
    public C162G() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
