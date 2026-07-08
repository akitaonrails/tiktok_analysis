package X;

import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.081y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20516081y implements Runnable {
    public final Aweme LL;
    public final Map<String, Object> LLILLJJLI;
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        IFullScreenLandingPageLogger iFullScreenLandingPageLogger;
        C1C7U.LIZ("EmbeddedLandingPageProfilePageScrollObserver$RealtimeClickOnceRunnable@52e7.run");
        try {
            if (this.LLILLL.compareAndSet(false, true)) {
                String strLIZ = C1017290cZz.LIZ();
                if (Intrinsics.LJFF(strLIZ, "slide") && (iFullScreenLandingPageLogger = (IFullScreenLandingPageLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageLogger.class, false, false, false, 14, null)) != null) {
                    iFullScreenLandingPageLogger.LIZIZ(this.LL, strLIZ, this.LLILLJJLI);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EmbeddedLandingPageProfilePageScrollObserver$RealtimeClickOnceRunnable@52e7.run");
    }

    public RunnableC20516081y(Aweme aweme, Map<String, ? extends Object> map) {
        this.LL = aweme;
        this.LLILLJJLI = map;
    }
}
