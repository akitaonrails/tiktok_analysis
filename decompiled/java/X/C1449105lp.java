package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1449105lp extends C2217421BqW implements Function0<Long> {
    public static final C1449105lp LL = new C1449105lp();

    public C1449105lp() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
