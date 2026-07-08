package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264670j0z extends C09AY implements Function1<Boolean, Unit> {
    public C1264670j0z() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            C0XHY.LIZ.getClass();
            C1264660j0y.LIZJ = SystemClock.uptimeMillis();
        }
        return Unit.LIZ;
    }
}
