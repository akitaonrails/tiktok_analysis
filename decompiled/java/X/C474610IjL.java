package X;

import android.os.Handler;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0IjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474610IjL {
    public static void LIZIZ() {
        if (!C486790J7d.LIZIZ) {
            LinkedBlockingQueue<Map<String, String>> linkedBlockingQueue = C474560IjG.LJIJ;
            if (linkedBlockingQueue.size() != 0) {
                C474560IjG.LJIJI = true;
                Map<String, String> mapPoll = linkedBlockingQueue.poll();
                if (mapPoll != null) {
                    LIZ(mapPoll);
                }
                C786410Ut5.LJLIIL(50L, C474560IjG.LJIILL.getValue(), new Runnable() { // from class: X.0IjK
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AppLogServiceImpl$Companion@a594.sendCachedLog$2");
                        try {
                            C01GW<Handler> c01gw = C474560IjG.LJIILL;
                            C474610IjL.LIZIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AppLogServiceImpl$Companion@a594.sendCachedLog$2");
                    }
                });
                return;
            }
        }
        C474560IjG.LJIJI = false;
    }

    public static void LIZ(Map map) {
        final String str = (String) map.get("event_name");
        if (str != null) {
            ExecutorService executorService = AnonymousClass1584.LIZ;
            if (AnonymousClass1584.LIZIZ && ((Boolean) AnonymousClass1584.LIZJ.getValue()).booleanValue()) {
                AnonymousClass1584.LIZ.execute(new Runnable() { // from class: X.0IjU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveLogDensityMonitor@b08.onAppLogSend$1");
                        try {
                            ((C1097220eeu) AnonymousClass1584.LJ.getValue()).LIZ(str);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveLogDensityMonitor@b08.onAppLogSend$1");
                    }
                });
            }
        }
        IHostMonitorAndLog iHostMonitorAndLog = (IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class);
        if (iHostMonitorAndLog != null) {
            iHostMonitorAndLog.GC1(str, map, C474560IjG.LJIJJ);
        }
    }
}
