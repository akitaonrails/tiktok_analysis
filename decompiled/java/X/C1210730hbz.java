package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210730hbz extends C09AY implements Function0<Unit> {
    public C1210730hbz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CN5.LIZIZ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new Runnable() { // from class: X.0hby
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BackgroundRequestFilter@d48.mustAndOnlyRunOnce$2$1");
                try {
                    C1210740hc0.LIZ = true;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BackgroundRequestFilter@d48.mustAndOnlyRunOnce$2$1");
            }
        });
        return Unit.LIZ;
    }
}
