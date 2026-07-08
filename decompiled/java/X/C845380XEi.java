package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C845380XEi extends C2217421BqW implements Function0<Long> {
    public static final C845380XEi LL = new C845380XEi();

    public C845380XEi() {
        super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
