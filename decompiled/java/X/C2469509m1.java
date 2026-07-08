package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2469509m1 extends C09AY implements Function0<Boolean> {
    public C2469509m1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII <= 60000);
    }
}
