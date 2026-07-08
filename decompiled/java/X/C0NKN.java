package X;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NKN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NKN {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS195S0000000_9.get$arr$(399));

    public static final boolean LIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }
}
