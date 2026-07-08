package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0mqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411880mqQ extends C138F {
    public static final C1411880mqQ LIZIZ = new C1411880mqQ();

    @Override // X.C138F
    public final long LIZ() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
    }
}
