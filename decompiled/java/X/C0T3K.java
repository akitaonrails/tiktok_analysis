package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T3K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3K extends C09AY implements Function0<Unit> {
    public C0T3K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C0T3N.LIZ.getClass();
        if (C0T3N.LIZIZ) {
            C0T3N.LIZIZ = false;
            C0T3N.LJIIIZ.removeCallbacks(C0T3N.LJIIJJI);
        }
        C0T3N.LIZIZ();
        final long j = C0T3N.LJFF;
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0T3J
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoConsumeAttribution@55c9.timerReducer$1$onPausePlay$1$1");
                try {
                    C0T3N.LJ.storeLong("video_consume_time_name", j);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoConsumeAttribution@55c9.timerReducer$1$onPausePlay$1$1");
            }
        });
        C0T3N.LIZ();
        return Unit.LIZ;
    }
}
