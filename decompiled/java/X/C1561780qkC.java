package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561780qkC {
    public static void LIZ(Function0 function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LandscapeFeedMonitorImpl.LJIILJJIL, new ARunnableS124S0100000_24(function0, 27));
        }
    }
}
