package X;

import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class CallableC805760VjC<V> implements Callable {
    public final /* synthetic */ boolean LL;

    public CallableC805760VjC(boolean z) {
        this.LL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("NonPersonalizedManager@60cd.setNonPersonalizedCustomParam$1");
        Bundle bundle = new Bundle();
        bundle.putInt("is_non_personalized", this.LL ? 1 : 0);
        AppLog.setCustomerHeader(bundle);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NonPersonalizedManager@60cd.setNonPersonalizedCustomParam$1");
        return unit;
    }
}
