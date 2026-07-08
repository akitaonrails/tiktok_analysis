package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1446105lL extends C2217421BqW implements Function0<Long> {
    public static final C1446105lL LL = new C1446105lL();

    public C1446105lL() {
        super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
