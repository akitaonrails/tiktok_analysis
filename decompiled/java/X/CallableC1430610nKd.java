package X;

import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0nKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class CallableC1430610nKd<V> implements Callable {
    public static final CallableC1430610nKd<V> LL = new CallableC1430610nKd<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("LiveEventModel@52c5.fetchList$1");
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        C1433010nOV.LIZ.getClass();
        LiveEventResponse liveEventResponseLIZ = C1433010nOV.LIZ(curUserId);
        C1C7U.LIZIZ("LiveEventModel@52c5.fetchList$1");
        return liveEventResponseLIZ;
    }
}
